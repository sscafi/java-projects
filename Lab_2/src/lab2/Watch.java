package lab2;

/**
 * A simple Watch. A Watch keeps track of a long value in seconds.
 *  Users can change the time value of the Watch through other methods.   
 * A Watch provides a method to get and set the time value of the Watch.
 * 
 * 
 *
 */

public class Watch {
	/* To be able to complete this Class, you need to read  the API of this class
	 * 
	 * Hint: Use the WatchTest class to help you test you work  
	 * 
	 * */
	
	private long startTime;
	
public Watch() {
	startTime = 0;
	return;
}
	

public Watch(long value) {
	startTime = value;
	return;
	
}
	

public long getStartTime() {
	long k = this.startTime;
	return k;
	
	
}

public void setStartTime​(long startTime) {
	this.startTime = startTime;
	
}
public void incrbyHours​(int value) {
	
	if ( value > 0) {
		value *= 3600;
		setStartTime​(value);
		
	}
	
	
}
public void decrbyHours​(int value) {
	if ( value > 0) {
		value *= 3600;
		int val1 = (int) (this.startTime - value);
		setStartTime​(val1);
		
	}
	
	
}

public void incrbyMinutes​(int value) {
	if ( value > 0) {
		value *= 60;
		setStartTime​(value);
		
	}
	
	
}

public void decrbyMinutes​(int value) {
	
}

public int getTimeinHours() {
	int k = (int) (this.startTime / 3600);
	return k;
	
}

public int getTimeinMinutes() {
	int k = (int) (this.startTime / 60);
	return k;
	
	
}

public java.lang.String toString(){
	String k = "'" + "Watch Time" + this.getTimeinHours() + " Hours" + ',' + this.getTimeinMinutes() + " Minutes"  + " and" + this.getStartTime() + "";
	return k;
}
	
}
