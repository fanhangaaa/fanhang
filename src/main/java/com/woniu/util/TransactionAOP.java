package com.woniu.util;

import org.aspectj.lang.ProceedingJoinPoint;

public class TransactionAOP {
	public Object around(ProceedingJoinPoint pjp){
		System.out.println("====");
		Object obj = null;
		try {
			obj = pjp.proceed();
		} catch (Throwable e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally{
		}
		return obj;
	}
}
