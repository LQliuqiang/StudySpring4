package com.lq.s1.jdbc2;

import com.mchange.v2.c3p0.ComboPooledDataSource;

import java.beans.PropertyVetoException;

public class DataSourceUtil {

    private static volatile ComboPooledDataSource dataSource = null;

    private DataSourceUtil(){}

    public static ComboPooledDataSource getDataSource(){
        if (dataSource==null){
            synchronized (DataSourceUtil.class){
                if (dataSource==null){
                    dataSource = new ComboPooledDataSource();
                    dataSource.setUser("root");
                    dataSource.setPassword("123456");
                    try {
                        dataSource.setDriverClass("com.mysql.jdbc.Driver");
                    } catch (PropertyVetoException e) {
                        dataSource = null;
                    }
                }
            }
        }
        return dataSource;
    }


}
