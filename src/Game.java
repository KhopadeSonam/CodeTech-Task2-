import java.util.Random;
import java.util.Scanner;

public class Game {
	public static void main(String[] args) {
		int answer,guess;
		final int max=100;
		
		Scanner sc=new Scanner(System.in);
		
		Random rd=new Random();
		
		boolean correct=false;
		answer=rd.nextInt(max)+1;
		
		while(!correct) {
			System.out.println("Guess the number between 1 and 100: ");
			guess=sc.nextInt();
			
			if(guess>answer) {
				System.out.println("Too high. Try again");
			}
			else if(guess<answer) {
				System.out.println("Too low. Try again");
			}
			else {
				System.out.println("Yes, you guessed the number.");
				correct=true;
			}
		}
		System.exit(0);
	}

}
