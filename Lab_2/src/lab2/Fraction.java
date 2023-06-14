package lab2;

/**
 * This class represent fraction of two integer values
 * A fraction consists of two integers, one for numerator 
 *   and one for denominator.  An example fraction is 1/5.
 *   
 *   Note: A valid fraction must not have zero in the denominator.
 *   No need to simplify or reduce the fraction value  * 
 *
 */
public class Fraction {

	/* To be able to complete this Class, you need to read  the API of this class
	 * 
	 * Hint: Use the WatchTest class to help you test you work  
	 * 
	 * */
	private int numerator;
	private int denominator;
	
	public Fraction() {
		numerator = 0;
		denominator = 1;
	}
	
	public Fraction( int numberator, int denominator) {
		if (denominator == 0) {
			denominator = 1;
		} else {
			this.numerator = numberator;
			this.denominator = denominator;
		}
	}
	
	public void setNumerator (int numerator) {
		this.numerator = numerator;
	}
	
	public int getNumerator() {
		return numerator;
	}
	
	public void setDenominator(int denominator) {
		this.denominator = denominator;
		
	}
	
	public int getDenominator() {
		return denominator;
	}
	
	public void setFraction(int numerator, int denominator) {
		if(denominator > 0) {
			this.numerator = numerator;
			this.denominator = denominator;
		}
		
	}
	
	public double getAbsValue() {
		double num = this.getNumerator();
		double den = this.getDenominator();
		double koko = num / den;
		double k = (Math.round(koko * 10000000.0) / 10000000.0);
		return k;
		
	}
	
	public void addFraction( Fraction f) {
	
		 numerator = numerator * f.denominator + f.numerator * denominator;
		    denominator = denominator * f.denominator;
		    
		
	}
	
	@Override
	public java.lang.String toString(){
		String katko = "Fraction" + " " + "(" + this.numerator + " / " + this.denominator + ")";
		return katko;
		
	}
}


 
