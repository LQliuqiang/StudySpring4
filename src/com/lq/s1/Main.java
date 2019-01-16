package com.lq.s1;

import com.lq.s1.s2.MyPerson;
import com.lq.s1.s2.NewPerson;
import com.lq.s1.s2.Person;
import com.lq.s1.s3.DataSource;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

    /**
     * IOC容器:其实就是依赖注入
     */
    public static void main(String[] args){

        /**
         * 1.ConfigurableApplicationContext是ApplicationContext的子类
         * 新增了refresh()刷新与关闭close()的功能，主要用来管理bean的生命周期。
         *
         * 2.ApplicationContext的两个实现类
         * ClassPathXmlApplicationContext：从类路径下加载配置文件；
         * FileSystemXmlApplicationContext: 从文件系统中加载配置文件
         */

        /**
         * 基本使用 -- 没有有参的构造方法
         */
        //1.创建Spring的IOC容器对象
        ApplicationContext ac = new ClassPathXmlApplicationContext("spring-config.xml");
        //2.从IOC容器中回去bean实例
         HollowWord hollowWord = (HollowWord) ac.getBean("hollowWord");
        //3.调用方法
        hollowWord.display();

        System.out.println("--------------------------------------------------");

        /**
         * 配置bean的详细
         */
//        使用构造方法配置----带有形参的构造方法
        User user = (User) ac.getBean("user");
        System.out.println(user.toString());

        System.out.println("--------------------------------------------------");

//        区分--构造重载
        user = (User) ac.getBean("user2");
        System.out.println(user.toString());

        System.out.println("--------------------------------------------------");

//        字面值里面含有特殊字符 可以使用<![CDATA[字面值]]>
        user = (User) ac.getBean("user3");
        System.out.println(user.toString());

        System.out.println("--------------------------------------------------");

//        Person类中嵌套Car属性
        Person person = (Person) ac.getBean("person");
        System.out.println(person.toString());
        //修改设置car中的值
        person = (Person) ac.getBean("person2");
        System.out.println(person.toString());

        System.out.println("--------------------------------------------------");

//         Person类中嵌套List<Car>属性
        MyPerson myPerson = (MyPerson) ac.getBean("myPerson");
        System.out.println(myPerson.toString());

        System.out.println("--------------------------------------------------");

//         06.NewPerson类中嵌套Map<String,Car>属性
        NewPerson newPerson = (NewPerson) ac.getBean("newPerson");
        System.out.println(newPerson);

        System.out.println("--------------------------------------------------");

//        07.Properties属性的配置
        DataSource dataSource = ac.getBean(DataSource.class);
        System.out.println(dataSource.getProperties());

        System.out.println("--------------------------------------------------");

//        08.使用Spring-util的配置
        myPerson = (MyPerson) ac.getBean("myPerson2");
        System.out.println("测试spring-utils:"+myPerson.toString());

        System.out.println("--------------------------------------------------");

//         09.使用p命名空间给bean的属性赋值
        myPerson = (MyPerson) ac.getBean("myPerson3");
        System.out.println("测试p命名空间:"+myPerson.toString());
    }

}
