package com.cg.spring.core.demo;


	import org.springframework.context.ApplicationContext;
	import org.springframework.context.support.AbstractApplicationContext;
	import org.springframework.context.support.ClassPathXmlApplicationContext;
	 
	public class App5 {
	 
	 	public static void main(String[] args) {
	 
	       	ApplicationContext context = new 
	       	ClassPathXmlApplicationContext("SpringConfig2.xml");
	 
	       Person person = context.getBean("employee", Employee.class);
	       person.eat();
	 
	       	((AbstractApplicationContext) context).close();
	 	}
	}



