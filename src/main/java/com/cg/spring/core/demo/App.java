package com.cg.spring.core.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.cg.spring.core.demo.model.Employee;

/**
 * @author swpeddan
 *
 *
 */
//xml configuratoin
public class App 
{
    public static void main( String[] args  )
    {
    	
		System.out.println("Start");


	//"	Employee emp = new Employee(101, "Sonu", 10.6);
		ApplicationContext ctx = new ClassPathXmlApplicationContext("SpringConfig.xml");

//		Employee emp = new Employee(101, "Sonu", 10.6);

		Employee emp = ctx.getBean("employee",Employee.class);
        System.out.println(emp.toString());
        
        Employee emp2 = ctx.getBean("employee2",Employee.class);
        System.out.println(emp2.toString());
               
        Department dept = ctx.getBean("department", Department.class);
        System.out.println(dept.toString());
        //innerbeam
       Employee emp3 = ctx.getBean("employee3", Employee.class);
        System.out.println(emp3.toString());

        Employee emp4 = ctx.getBean("employee4", Employee.class);
        System.out.println(emp4.toString());
       
       
    ((AbstractApplicationContext)ctx).close();
		System.out.println("End");
    }
}
