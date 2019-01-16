package com.lq.s1.a1;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.Arrays;

public class ArithmeticCalculatorLoggingProxy {


	private ArithmeticCalculator target;

	public ArithmeticCalculatorLoggingProxy(ArithmeticCalculator target) {
		this.target = target;
	}

	public ArithmeticCalculator getTarget(){
		ArithmeticCalculator proxy = null;

		//代理对象是由那个类加载器负责加载的
        ClassLoader classLoader = target.getClass().getClassLoader();
        //代理对象的类型，即其中有那些方法
		Class[] interfaces = new Class[]{ArithmeticCalculator.class};
		//当调用代理对象其中的方法时，该执行的代码
		InvocationHandler handler = new InvocationHandler() {
			/**
			 * @param proxy  正在返回的那个代理对象，一般情况下在invoke方法中不使用该对象，因为在invoke中使用proxy会陷入死循环。
			 * @param method 正在被调用的方法
			 * @param args  调用方法时传入的参数
			 * @return
			 * @throws Throwable
			 */
			@Override
			public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
				String methodName = method.getName();
				System.out.println("The method "+methodName+" begins with "+ Arrays.asList(args));
				Object result = method.invoke(target, args);
				System.out.println("The method "+methodName+" ends with " + result);


				/**
				 * 此处为a2包下的APO所执行的一些通知的原理结构
				 Object result  = null;
				 try {
				 //前置通知
				 result	= method.invoke(target, args);
				 //返回通知 在方法返回结果之后执行
				 }catch (Exception e){
				 //异常通知
				 }
				 //后置通知 [因为执行的方法可能会出异常 得不到结果]
				 */


				return result;
			}
		};
		proxy = (ArithmeticCalculator) Proxy.newProxyInstance(classLoader,interfaces,handler);
		return proxy;
	}

}
