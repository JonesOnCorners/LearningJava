package com.footballworld.service;

import java.util.List;
import java.util.Optional;

import javax.transaction.Transactional;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import com.footballworld.dao.ManagerDao;
import com.footballworld.entities.Managers;


@Service
public class ManagerServiceImpl implements ManagerService{

private ManagerDao managerDAO;

public void setManagerDAO(ManagerDao managerDao) {
	this.managerDAO = managerDao;
}
	
    private static final Logger logger =  LoggerFactory.getLogger(ManagerServiceImpl.class);

    
    
	@Override
	@Transactional
	public void addManager(Managers m) {
		// TODO Auto-generated method stub
		logger.info("Now proceeding to add manager-->"+m);
		this.managerDAO.addManager(m);
		
	}
 
	@Override
	@Transactional
	public void deleteManager(int id) {
		// TODO Auto-generated method stub
		this.managerDAO.deleteManager(id);
		
	}

	@Override
	@Transactional
	public List<Managers> getAllManagers() {
		// TODO Auto-generated method stub
		logger.info("Retreived list-->");
		return this.managerDAO.getAllManagers();
	}

	@Override
	@Transactional
	public Managers getManagerById(int id) {
		// TODO Auto-generated method stub
		return this.managerDAO.getManagerById(id);
	}

	
	

}
