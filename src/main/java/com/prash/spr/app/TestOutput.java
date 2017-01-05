package com.prash.spr.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prash.spr.core.OutputHelper;
import com.prash.spr.util.OutputUtils;

public class TestOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springTest.xml");
		OutputUtils outputUtils = (OutputUtils) context.getBean("util");
		OutputHelper helper = outputUtils.getHelper();
		helper.output();

	}

}
