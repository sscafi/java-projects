import java.util.Random;

public class RollingDice {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Random ricoDude = new Random();
		int x = ricoDude.nextInt(20) + 1;
		// the dice will have arange of 0-5 to make it 1-6 , + 1 to the end of it
		
		System.out.println("You rolled a: " + x);
		int a = 1, b= 2,k;
		k = a + b + a++ + b++;
		System.out.println(k);
		
	}

}
 
