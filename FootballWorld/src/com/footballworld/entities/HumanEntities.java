package com.footballworld.entities;

import java.util.Collection;

public interface HumanEntities {
	
	public void insertEntity(Collection humanEntityData);
	
	public void deleteEntity(int id);
	
	public void updateEntity(Collection humanEntity);
	
	public Collection selectPlayer(int id);
	

}
