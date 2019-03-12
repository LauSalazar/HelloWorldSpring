package com.slaura.example;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {

	public static void main(String[] args) {
		BeanFactory context = new ClassPathXmlApplicationContext("META-INF/spring/app-context.xml");
		Service service = context.getBean(Service.class);
		System.out.println(service.getMessage());
	}

}
