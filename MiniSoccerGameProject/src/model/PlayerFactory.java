package model;


import java.awt.Color;

public class PlayerFactory {
			
		
	final private Color Striker = Color.BLUE;
	final private Color goalKeeper = Color.MAGENTA;


	
	
		public  GamePlayer getPlayer(String stringp) {	
			
			if (stringp == null){
				return null;
			}
		//	
		//	if (stringp.equals("Striker")) {
		//		return new Striker("Striker", Strikerr);
		//	} else {
		//		return new Goalkeeper("GoalKeeper" , goalKeeperr);
		//	}
			
			if(stringp.equalsIgnoreCase("Striker")) {
				return new 	Striker("Striker", Striker );
			}else if (stringp.equalsIgnoreCase("goalkeeper")) {
				return new Goalkeeper("GoalKeeper", goalKeeper );
			}
			return null;
		
}
}
