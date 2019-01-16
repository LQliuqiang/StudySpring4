package com.lq.s1.s8;

import java.util.HashMap;
import java.util.Map;

/**
 * 实例工厂方法
 */
public class InstanceCarFactory {

    private Map<String,Car> carMap = null;

    public InstanceCarFactory() {
        carMap = new HashMap<>();
        carMap.put("baoMa",new Car("宝马",800000));
        carMap.put("benChi",new Car("奔驰",500000));
    }

    public Car getCar(String name){
        return carMap.get(name);
    }
}
