package com.lab8.singleton;

import java.util.List;

public class GameSteward {
	private static GameSteward instance;
	private GameSpace space;
	private List<Token> tokens;
	
	private GameSteward(GameSpace space, List<Token> tokens) {
		this.space = space;
		this.tokens = tokens;
	}
	
	public static GameSteward getInstance(GameSpace space, List<Token> tokens) {
		if (instance == null) {
			instance = new GameSteward(space, tokens); 
		}
		
		return instance;
	}

	public GameSpace getSpace() {
		return space;
	}

	public void setSpace(GameSpace space) {
		this.space = space;
	}

	public List<Token> getTokens() {
		return tokens;
	}

	public void setTokens(List<Token> tokens) {
		this.tokens = tokens;
	}

	@Override
	public String toString() {
		return "GameSteward\nSpace for " + space + "\ntokens:\n" + tokens;
	}
}
