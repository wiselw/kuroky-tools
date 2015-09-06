package com.kuroky.unit;

import java.lang.reflect.Method;

import org.junit.Test;

import junit.framework.TestCase;

public class CalculatorTest extends TestCase {
	@Test
	public void testAdd(){
		//
		Calculator cal=new Calculator();
		Class<?> clazz=cal.getClass();
		try{
			Method method =clazz.getDeclaredMethod("add", int.class,int.class);
			method.setAccessible(true);
			Object result=method.invoke(cal, new Object[]{5,6});
			assertEquals(10, result);
		}catch(Exception e){
			e.printStackTrace();
		}
	}
	
	

}
