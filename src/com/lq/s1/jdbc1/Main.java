package com.lq.s1.jdbc1;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import java.util.ArrayList;
import java.util.List;


public class Main {

    private static final String QUERY_USER_SQL = "select * from activemq_user where username=?";
    /**
     * 数据库的操作
     */
    public static void main(String[] args){

        ApplicationContext ac = new ClassPathXmlApplicationContext("Spring-jdbc1.xml");

        //检查是否链接成功
//        DataSource dataSource = (DataSource) ac.getBean("c3dataSource");
//        try {
//            System.out.println(dataSource.getConnection());
//        } catch (SQLException e) {
//            e.printStackTrace();
//        }

        //JdbcTemplate是一个JDBC的小工具，不支持级联属性。（ORM框架支持级联）
        JdbcTemplate jdbcTemplate = (JdbcTemplate) ac.getBean("jdbcTemplate");

        User user = jdbcTemplate.queryForObject(QUERY_USER_SQL, new BeanPropertyRowMapper<>(User.class), "zhengshuang");
        System.out.println(user.toString());

//        insertSingle(jdbcTemplate);
//        insertMultiple(jdbcTemplate);
//        querySingle(jdbcTemplate);
//        queryAll(jdbcTemplate);
//        querySingle2(jdbcTemplate);

//       测试UserInfoDao的使用
//        UserInfoDao userInfoDao = ac.getBean(UserInfoDao.class);
//        UserInfo lq3 = userInfoDao.get("lq3");
//        System.out.println(lq3.toString());
    }

    /**
     * insert单条数据
     */
    private static void insertSingle(JdbcTemplate jdbcTemplate){
        //插入单条数据
        String insertSql = "insert into user_info(username,password,info) values(?,?,?)";
        jdbcTemplate.update(insertSql,"liuqiang","123456","爱好运动");
    }

    /**
     * insert多条数据
     */
    private static void insertMultiple(JdbcTemplate jdbcTemplate){
        //插入多条数据
        String insertSql = "insert into user_info(username,password,info,id) values(?,?,?,?)";
        List<Object[]> lists = new ArrayList<>();
        for (int i=0;i<5;i++){
            lists.add(new Object[]{"lq"+i,"12"+i, "打篮球",i});
        }
        jdbcTemplate.batchUpdate(insertSql,lists);
    }

    /**
     * 查询指定的数据
     * 注意：不是调用的<T> T queryForObject(String var1, Class<T> var2)方法
     */
    private static void querySingle(JdbcTemplate jdbcTemplate){
        String querySql = "select * from user_info where username=?";
        RowMapper<UserInfo> rowMapper = new BeanPropertyRowMapper<>(UserInfo.class);
        UserInfo userInfo = jdbcTemplate.queryForObject(querySql, rowMapper, "lq2");
        System.out.println(userInfo.toString());
    }

    /**
     * 查询所有的数据
     * 注意：不是调用的queryForList()方法
     */
    private static void queryAll(JdbcTemplate jdbcTemplate){
        String querySql = "select * from user_info";
        RowMapper<UserInfo> rowMapper = new BeanPropertyRowMapper<>(UserInfo.class);
        List<UserInfo> userInfos = jdbcTemplate.query(querySql, rowMapper);
        System.out.println(userInfos);
    }


    /**
     * 获取单个列的值或做统计查询
     * @param jdbcTemplate
     */
    private static void querySingle2(JdbcTemplate jdbcTemplate){
        String querySql = "select count(id) from user_info";
        Long count = jdbcTemplate.queryForObject(querySql, Long.class);
        System.out.println(count); //5
    }



}
