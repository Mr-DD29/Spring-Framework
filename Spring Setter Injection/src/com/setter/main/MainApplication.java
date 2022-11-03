package com.setter.main;

import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.setter.injection.Employee;

public class MainApplication {
	
	public static void main(String[] args) {
		
		Resource xmlResource = new ClassPathResource("/Spring.xml");
		BeanFactory beanFactory = new XmlBeanFactory(xmlResource);
		
		Employee emp = (Employee) beanFactory.getBean("employee");
		
		System.out.println(emp.getName());
		System.out.println(emp.getMail());
		System.out.println(emp.getSalary());
		System.out.println(emp.getAddress());
		System.out.println();
		
		Employee emp1 = (Employee) beanFactory.getBean("employee1");
		
		System.out.println(emp1.getName());
		System.out.println(emp1.getMail());
		System.out.println(emp1.getSalary());
		System.out.println(emp1.getAddress());
		System.out.println();
		
	}

}
