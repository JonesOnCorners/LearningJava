package com.localbank.people;

import org.apache.catalina.core.ApplicationContext;
import org.apache.naming.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

import com.oracle.classes.PeopleDao;

public class PeopleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PeopleDao p =(PeopleDao)context.getBean("d");
		
		People e = new People(1, "Jaydeep", "Karale", 29, "F-603, Windwards,Wakad", 8380, "C");
		
		p.savePeople(e);

	}

}
