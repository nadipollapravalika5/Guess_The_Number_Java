package guess;
import java.util.Random;
import java.util.Scanner;

public class guessnumberproject {
	public static void main(String args[]) {
		Random rnd=new Random();
		int target=rnd.nextInt(100)+1;
		Scanner sc=new Scanner(System.in);
		System.out.println("Guess the number(1-100 . Type 0 to quit");
		int attempts=0;
		while(true) {
			System.out.print("Your guess: ");
			if(!sc.hasNextInt()) {
				System.out.println("pLease enter an integer");
				sc.next();
				continue;
			}
			int guess=sc.nextInt();
			attempts++;
			if(guess == 0) {
				System.out.println("Quit- the number was "+ target);
				break;
			}
			if(guess == target) {
				System.out.printf("Correct! You guessed it in %d attempts.%n", attempts);
				break;
			}
			int diff = Math.abs(guess - target);
			if (diff <= 10) {
			System.out.println("Hot");
			} else {
			System.out.println("Cold");
			}
			
		}
		sc.close();
	}

}
