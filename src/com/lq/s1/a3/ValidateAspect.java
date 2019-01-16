package com.lq.s1.a3;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 验证的切面 @Order指定切面执行顺序的优先级 值越小，优先级就越高
 */
public class ValidateAspect {

    public void beforeMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("验证的切面------" + Arrays.asList(args));
    }

}
