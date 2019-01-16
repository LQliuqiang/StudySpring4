package com.lq.s1.s8;

import java.util.HashMap;
import java.util.Map;

public class StaticCarFactory {

    private static final Map<String,Car> CAR_MAP = new HashMap<>();

    static {
        CAR_MAP.put("baoMa",new Car("宝马",800000));
        CAR_MAP.put("benChi",new Car("奔驰",500000));
    }

    public static Car getCar(String name){
        return CAR_MAP.get(name);
    }

}
