package com.netbanking.people;

import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.netbanking.dao.PeopleDao;

public class PeopleTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");
		PeopleDao p = (PeopleDao)context.getBean("d");
		People p1 = new People(2,"Jaydeep", "Karale", 29, "F-603, Windwards,Wakad", "8380083371","C");
		p.savePeople(p1);
		

	}

}
