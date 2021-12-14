package model;

import static org.junit.jupiter.api.Assertions.*;

import java.util.Random;

import org.junit.jupiter.api.Test;


class PlayerStatisticsTest {

	@Test
	void testGetStatistic() {
		PlayerStatistics testGetStat = new PlayerStatistics();
		
		Random rand = new Random();
		int min = 0;
		int max = 31;
		int testPoint = rand.nextInt(max - min + min);
		
		testGetStat.setStatistics(testPoint);
		assertTrue(testGetStat.getStatistics() == testPoint);
	}
	
	@Test
	void testToString() {
		PlayerStatistics testGetStat = new PlayerStatistics();
		
		Random rand = new Random();
		int min = 0;
		int max = 31;
		Integer testPoint = rand.nextInt(max - min + min);
		testGetStat.setStatistics(testPoint);

		String stringTestPoint = testPoint.toString();	
		
		assertEquals(stringTestPoint, testGetStat.toString());
	}


}