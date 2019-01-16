package com.lq.s1.a2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Before;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

/**
 * 验证的切面 @Order指定切面执行顺序的优先级 值越小，优先级就越高
 */
@Order(1)
@Aspect
@Component
public class ValidateAspect {

    @Before("execution(public int ArithmeticCalculator.*(..))") //在ArithmeticCalculator中的所有方法上起作用
    public void beforeMethod(JoinPoint joinPoint) {
        Object[] args = joinPoint.getArgs();
        System.out.println("验证的切面------" + Arrays.asList(args));
    }

}
