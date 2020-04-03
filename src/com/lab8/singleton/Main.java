package com.lab8.singleton;

import java.util.Arrays;

/*	
 *  №4
 *	Визначити специфікації класів для подання розпорядника гри, 
 *	який складається з ігрового простору та списку ігрових фішок. 
 *	Забезпечити можливість створення тільки одного примірника розпорядника
 */

public class Main {

	public static void main(String[] args) {
		
		GameSteward first = GameSteward.getInstance(
				new GameSpace("Poker", 45.23, 4),
				Arrays.asList(new Token(1), new Token(2), new Token(1))
				);
		
		GameSteward second = GameSteward.getInstance(
				new GameSpace("Monopoly", 102.00, 3),
				Arrays.asList(new Token(6), new Token(4))
				);
		 
		System.out.println(first == second);

	    System.out.println(first);
	    System.out.println();
	    System.out.println(second);
	}

}
