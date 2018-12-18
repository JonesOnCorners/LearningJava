package com.netbanking.dao;

import java.util.ArrayList;
import java.util.List;

import org.springframework.orm.hibernate5.HibernateTemplate;
import org.springframework.transaction.annotation.EnableTransactionManagement;
import org.springframework.transaction.annotation.Transactional;

import com.netbanking.people.People;

@EnableTransactionManagement
public class PeopleDao {
	
	HibernateTemplate template;
    
	public PeopleDao() {
		
	}
	public void setTemplate(HibernateTemplate template) {
		this.template = template;
	}
	
	//method to save People
	
	@Transactional(readOnly = false)
	public void savePeople(People e){  
	    template.save(e);  
	}  
	//method to update People  
	public void updatePeople(People e){  
	    template.update(e);  
	}  
	//method to delete People  
	public void deletePeople(People e){  
	    template.delete(e);  
	}  
	//method to return one People of given id  
	public People getById(int id){  
	    People e=(People)template.get(People.class,id);  
	    return e;  
	}  
	//method to return all Peoples  
	public List<People> getPeoples(){  
	    List<People> list=new ArrayList<People>();  
	    list=template.loadAll(People.class);  
	    return list;  
	}  

}
