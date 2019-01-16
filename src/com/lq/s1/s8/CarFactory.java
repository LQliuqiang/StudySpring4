package com.lq.s1.s8;

import org.springframework.beans.factory.FactoryBean;

/**
 * 使用spring提供的FactoryBean接口
 */
public class CarFactory implements FactoryBean<Car> {

    private String type;

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public Car getObject() throws Exception {
        return new Car(type,50000);
    }

    /**
     * 返回的类型
     * @return
     */
    @Override
    public Class<?> getObjectType() {
        return Car.class;
    }

    /**
     * 是否是单例的
     * @return
     */
    @Override
    public boolean isSingleton() {
        return false;
    }
}
