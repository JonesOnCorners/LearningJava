package com.oracle.classes;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.FlushMode;
import org.springframework.jdbc.support.GeneratedKeyHolder;
import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.Transactional;

import com.localbank.people.People;

public class PeopleDao {
	
	HibernateTemplate template;
	
    public PeopleDao() {
    	
    }
	public PeopleDao(HibernateTemplate template) {
	
		this.template = template;
	}
	
	@SuppressWarnings("deprecation")
	@Transactional(readOnly = false)
	public void savePeople(People p)
	{
		//template.getSessionFactory().getCurrentSession().setFlushMode(FlushMode.AUTO);
		template.save(p);
	}
	
	public void updatePeople(People p)
	{
		template.update(p);
	}
	
	public void deletePeople(People p)
	{
		template.delete(p);
	}
	
	public List<People> getPeople()
	{
		List<People> list = new ArrayList<People>();
		list=template.loadAll(People.class);
		return list;
	}

}
