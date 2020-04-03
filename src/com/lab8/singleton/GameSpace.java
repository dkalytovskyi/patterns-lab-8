package com.lab8.singleton;

public class GameSpace {
	private String game;
	private double price;
	private int amountOfPlayers;
	
	public GameSpace() {}
	
	public GameSpace(String game, double price, int amountOfPlayers) {
		this.game = game;
		this.price = price;
		this.amountOfPlayers = amountOfPlayers;
	}
	
	public String getGame() {
		return game;
	}
	public void setGame(String game) {
		this.game = game;
	}
	public double getPrice() {
		return price;
	}
	public void setPrice(double price) {
		this.price = price;
	}
	public int getAmountOfPlayers() {
		return amountOfPlayers;
	}
	public void setAmountOfPlayers(int amountOfPlayers) {
		this.amountOfPlayers = amountOfPlayers;
	}

	@Override
	public String toString() {
		return "Game: " + game + "\nPrice = " + price + ", Amount Of Players = " + amountOfPlayers;
	}
	
	
}
