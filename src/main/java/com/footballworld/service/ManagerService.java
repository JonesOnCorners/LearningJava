package com.footballworld.service;

import com.footballworld.entities.Managers;

import java.util.Optional;

import java.util.List;



public interface ManagerService {

    public void addManager(Managers m);
	
	public void deleteManager(int id);
	
	public List<Managers> getAllManagers();
	
	public Managers getManagerById(int id);
}
