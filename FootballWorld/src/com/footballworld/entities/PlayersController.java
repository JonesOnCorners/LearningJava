package com.footballworld.entities;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

import com.footballworld.entities.dao.PlayersDao;

import sun.print.resources.serviceui;

public class PlayersController implements HumanEntities {
	public Collection<PlayersModel> playerModelCollection  = new ArrayList<>();;

	public void insertEntity(PlayersModel pModel) {
		// TODO Auto-generated method stub
		
	    
		
		playerModelCollection.add(pModel);
		
		/*Iterator<PlayersModel> itr = playerModelCollection.iterator();
		while(itr.hasNext()) {
			System.out.println(itr.next().getPlayerName()+ " "+ itr.next().getNationality() );
		}*/
		
		for (PlayersModel pMod : playerModelCollection) {
			System.out.println(pMod);
		}
		
		//PlayersDao.insertPlayer(humanEntityData);
		
	}

	@Override
	public void deleteEntity(int id) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateEntity(Collection humanEntity) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public Collection selectPlayer(int id) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void insertEntity(Collection humanEntityData) {
		// TODO Auto-generated method stub
		
	}

	

}
