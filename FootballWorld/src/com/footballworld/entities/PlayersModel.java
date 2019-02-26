package com.footballworld.entities;

import java.util.ArrayList;
import java.util.Collection;

public class PlayersModel {
	
	private int playerId;
	private String playerName;	
	private String nationality;	
	private String placeOfBirth;	
	private String playingPosition;	
	private int transferValue;	
	private int clubAppearances;
	private int internationalAppearances;
	private int clubGoals;
	private int internationalGoals;
	private boolean retired;
	
	public PlayersModel() {
		// TODO Auto-generated constructor stub
	}
	
	public String getPlayerName() {
		return playerName;
	}
	public void setPlayerName(String playerName) {
		this.playerName = playerName;
	}
	public String getNationality() {
		return nationality;
	}
	public void setNationality(String nationality) {
		this.nationality = nationality;
	}
	public String getPlaceOfBirth() {
		return placeOfBirth;
	}
	public void setPlaceOfBirth(String placeOfBirth) {
		this.placeOfBirth = placeOfBirth;
	}
	public String getPlayingPosition() {
		return playingPosition;
	}
	public void setPlayingPosition(String playingPosition) {
		this.playingPosition = playingPosition;
	}
	public int getTransferValue() {
		return transferValue;
	}
	public void setTransferValue(int transferValue) {
		this.transferValue = transferValue;
	}
	public int getClubAppearances() {
		return clubAppearances;
	}
	public void setClubAppearances(int clubAppearances) {
		this.clubAppearances = clubAppearances;
	}
	public int getInternationalAppearances() {
		return internationalAppearances;
	}
	public void setInternationalAppearances(int internationalAppearances) {
		this.internationalAppearances = internationalAppearances;
	}
	public int getClubGoals() {
		return clubGoals;
	}
	public void setClubGoals(int clubGoals) {
		this.clubGoals = clubGoals;
	}
	public int getInternationalGoals() {
		return internationalGoals;
	}
	public void setInternationalGoals(int internationalGoals) {
		this.internationalGoals = internationalGoals;
	}
	public boolean isRetired() {
		return retired;
	}
	public void setRetired(boolean retired) {
		this.retired = retired;
	}
	
	@Override
	public String toString() {
		return "PlayersModel [ playerId="+playerId+ " playerName=" + playerName + ", nationality=" + nationality + ", placeOfBirth="
				+ placeOfBirth + ", playingPosition=" + playingPosition + ", transferValue=" + transferValue
				+ ", clubAppearances=" + clubAppearances + ", internationalAppearances=" + internationalAppearances
				+ ", clubGoals=" + clubGoals + ", internationalGoals=" + internationalGoals + ", retired=" + retired
				+ "]";
	}
	public int getPlayerId() {
		return playerId;
	}
	public void setPlayerId(int playerId) {
		this.playerId = playerId;
	}
	
	

	
}
