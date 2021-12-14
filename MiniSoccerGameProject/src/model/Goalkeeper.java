package model;

import java.awt.*;
import java.util.Random;

public class Goalkeeper extends GamePlayer {

	public int movementStep;

	public Goalkeeper(String name, Color color) {
		super(name, color);
		movementStep = 10;
	}

	@Override
	public void moveLeft() {
		if (getPlayerPosition().x - 5 - movementStep > 0) {
			setPlayerPosition(new Point(getPlayerPosition().x - movementStep, getPlayerPosition().y));
		}
	}

	@Override
	public void moveRight() {
		if (getPlayerPosition().x + 50 + movementStep < 600) {
			setPlayerPosition(new Point(getPlayerPosition().x + movementStep, getPlayerPosition().y));
		}
	}

	@Override
	public void moveUp() {
		if (getPlayerPosition().y - 5 > 0) {
			setPlayerPosition(new Point(getPlayerPosition().x, getPlayerPosition().y - 5));
		}
	}

	@Override
	public void moveDown() {
		if (getPlayerPosition().y + 50 < 300) {
			setPlayerPosition(new Point(getPlayerPosition().x, getPlayerPosition().y + 5));
		}
	}

	@Override
	public void shootBall() {
		SoccerBall.getSoccerBall().moveBall(-20, -5.0, -0.5);
	}
	
	public void moveRandomly() {
		Random randd = new Random();
		double pcur = (double) getPlayerPosition().x + 10;
		double cmrleft = (pcur - 300) / 100 - (randd.nextDouble());
		movementStep = (int) Math.abs(30 * cmrleft);
		if (cmrleft > 0) {
			moveLeft();
		} else {
			moveRight();
		}
	}

	@Override
	public void setInitialPosition() {
		setPlayerPosition(new Point(280, 80));
	}

	@Override
	public String toString() {
		return playerName + " caught " + playerStatistics.toString() + " balls";
	}
}
