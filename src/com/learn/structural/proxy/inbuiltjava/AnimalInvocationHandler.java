package com.learn.structural.proxy.inbuiltjava;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

public class AnimalInvocationHandler implements InvocationHandler{

	public Object realObject = null;
	
	public  AnimalInvocationHandler(Object realSubject) {
		
		this.realObject = realSubject;
	}
	
	
	@Override
	public Object invoke(Object proxy, Method meth, Object[] argument) throws Throwable {
		Object result = null;
		try {
			
			result = meth.invoke(realObject, argument);
		}
		catch (Exception ex) {
			ex.printStackTrace();
		}
		return result;
	}

}
