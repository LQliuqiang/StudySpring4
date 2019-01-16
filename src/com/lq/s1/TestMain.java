package com.lq.s1;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class TestMain {

    private static final String QUERY_FIRMWARE_BY_PRODUCTID_SQL = "select * from iot_fw where product_id=? and gw_name in";
    public static void main(String[] args){

        List<String> strings = Arrays.asList("1", "3", "4", "9");

        StringBuilder realSql= new StringBuilder();
        realSql.append(QUERY_FIRMWARE_BY_PRODUCTID_SQL).append("(");
        for (String gwName:strings){
            realSql.append(gwName).append(",");
        }
        int length = realSql.length();
        realSql.delete(length-1,length);
        realSql.append(")");

        String s = realSql.toString();
        System.out.println(s);


    }

    private static void display(String... aaa){
        System.out.println(aaa);
    }

}
