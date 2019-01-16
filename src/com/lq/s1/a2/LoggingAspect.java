package com.lq.s1.a2;

import org.aspectj.lang.JoinPoint;
import org.aspectj.lang.annotation.*;
import org.springframework.core.annotation.Order;
import org.springframework.stereotype.Component;

import java.util.Arrays;

//把这个类申明为切面 需要先将这个类放入IOC容器中，再申明为切面

/**
 * 日志的切面
 */
@Aspect
@Component
public class LoggingAspect {

    //申明该方法的前置通知：指定该方法之前，执行该方法
//    @Before("execution(public int ArithmeticCalculator.add(int , int))")
//    public void beforeMethod(){
//        System.out.println("执行在add方法之前");
//    }

    //申明该方法的前置通知：指定该方法之前，执行该方法  [还可以使用JoinPoint获取指定方法的一些属性与参数]
//    @Before("execution(public int ArithmeticCalculator.add(int , int))") 指定在add方法上 只在add方法上起作用
    @Before("execution(public int ArithmeticCalculator.*(int , int))") //在ArithmeticCalculator中的所有方法上起作用
    public void beforeMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        Object[] args = joinPoint.getArgs();
        System.out.println("前置通知--------The method " + methodName + " begins with " + Arrays.asList(args));
    }

    //后置通知：无论执行的方法是否发生异常，该方法都会被执行
    //后置通知还无法访问目标方法执行的结果，
    @After("execution(public int ArithmeticCalculator.*(int , int))")
    public void afterMethod(JoinPoint joinPoint) {
        String methodName = joinPoint.getSignature().getName();
        System.out.println("后置通知-------The method " + methodName + " ends ");
    }

    //返回通知, 在方法返回结果之后执行
    @AfterReturning(value = "execution(public int ArithmeticCalculator.*(int ,int))",returning = "result")
    public void afterReturningMethod(JoinPoint joinPoint,Object result){
        System.out.println("返回通知-------得到的值为："+result);
    }

    //异常通知, 在方法返回结果之后执行 ArithmeticCalculator.*(int ,int)可以用ArithmeticCalculator.*(..)表示
    @AfterThrowing(value = "execution(public int ArithmeticCalculator.*(..))",throwing = "ex")
    public void afterThrowingMethod(JoinPoint joinPoint,Exception ex){
        System.out.println("异常通知-------："+ex.toString());
    }

    //环绕通知 就是动态代理的写法全过程 （功能最强大，但不常用）

}
