package com.prash.spr.app;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.prash.spr.core.OutputHelper;
import com.prash.spr.util.OutputConstrctor;
import com.prash.spr.util.OutputUtils;

public class TestOutput {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ApplicationContext context = new ClassPathXmlApplicationContext("springTest.xml");
		OutputUtils outputUtils = (OutputUtils) context.getBean("helper");
		OutputHelper helper = outputUtils.getHelper();
		helper.output();
		System.out.println("--------------------------");
		OutputConstrctor constrctor = (OutputConstrctor) context.getBean("conUtil");
		helper = constrctor.getBean();
		helper.output();
		System.out.println("--------------------------");
		context = new ClassPathXmlApplicationContext("springTest.xml");
		outputUtils = (OutputUtils) context.getBean("utilP");
		helper = outputUtils.getHelper();
		helper.output();
		
		

	}

}
