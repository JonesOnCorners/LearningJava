package com.footballworld.driver;

import java.io.IOException;
import java.util.Scanner;

import com.footballworld.entities.PlayersController;
import com.footballworld.entities.PlayersModel;

public class FootballDbDriver {

	private static Scanner s;

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		int choice = 0;
		while(choice !=10) {		
		s = new Scanner(System.in);
		System.out.println("/***********MAIN MENU**********/\n"
				+ "1) View player information.\n"
				+ "2) Insert new player data.\n"
				+ "10) Quit");
		System.out.println("Please select what would you like to do.");
		choice = s.nextInt();
		
		switch(choice) {
		case 1 :
			System.out.println("Welcome to player information page");
			break;
		case 2:
			PlayersModel pModel = new PlayersModel();
			PlayersController pCon = new PlayersController();
						
			System.out.println("Insert new player data");
			System.out.println("Enter player name");
			pModel.setPlayerName(s.next());
			s.nextLine();
			System.out.println("Enter player Nationality");
			pModel.setNationality(s.next());
			s.nextLine();
			System.out.println("Enter Player's Place Of Birth");
			pModel.setPlaceOfBirth(s.next());
			
			pModel.setPlayerId((int) Math.random());
			pCon.insertEntity(pModel);
			break;
			
		case 10:	
			System.exit(0);
			break;
		default:
			System.out.println("Please select a valid choice.");
		    break;
		}
		
		
		}
	}

}
