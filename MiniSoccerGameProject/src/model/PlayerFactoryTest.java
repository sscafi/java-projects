package model;

import static org.junit.jupiter.api.Assertions.*;

import java.awt.Color;

import org.junit.jupiter.api.Test;


class PlayerFactoryTest {

	@Test
	void getPlayerFactoryTest() {
		PlayerFactory test = new PlayerFactory();
			
		GamePlayer gotStriker = new Striker("Striker", Color.RED);
		GamePlayer gotGoalkeeper = new Goalkeeper("Goalkeeper", Color.BLACK);
		
		//Check if the Classes are equal
		assertEquals(test.getPlayer("Striker").getClass(), gotStriker.getClass());
		assertEquals(test.getPlayer("Goalkeeper").getClass(), gotGoalkeeper.getClass());
		
		//Check if the playerNames are equal
		assertEquals(test.getPlayer("Striker").getPlayerName(), gotStriker.getPlayerName());
		assertEquals(test.getPlayer("Goalkeeper").getPlayerName(), gotGoalkeeper.getPlayerName());

		//Check if the playerColours are equal
		assertEquals(test.getPlayer("Striker").getPlayerColor(), gotStriker.getPlayerColor());
		assertEquals(test.getPlayer("Goalkeeper").getPlayerColor(), gotGoalkeeper.getPlayerColor());

		
	}

}