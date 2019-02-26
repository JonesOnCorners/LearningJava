package com.footballworld.dao;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.footballworld.entities.Managers;

@Service
@Transactional
public interface ManagerDao {

public void addManager(Managers m);
	
	public void deleteManager(int id);
	
	public List<Managers> getAllManagers();
	
	public Managers getManagerById(int id);
	
	
}
