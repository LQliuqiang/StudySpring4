package com.lq.s1.s3;

import java.util.Properties;

/**
 * *****设置Properties会经常用到 在Spring整合其它框架的时候，并且Properties做数据库链接配置等
 */
public class DataSource {

    /**
     * Properties的关系-------Map->Hashtable<K,V>->Properties
     * 也就是说Properties是Hashtable<K,V>直接实现的子类
     */
    private Properties properties;

    public Properties getProperties() {
        return properties;
    }

    public void setProperties(Properties properties) {
        this.properties = properties;
    }
}
