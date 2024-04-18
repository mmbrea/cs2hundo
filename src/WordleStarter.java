import java.util.Scanner;
public class Wordle {
	public static void main(String[] args) {
		String secretWord = "CRANE";  
		String guess;
		int count = 0;
		int numGuesses = 6;
		Scanner kb = new Scanner(System.in);
		System.out.println("Welcome to Wordle!");
		System.out.println("The goal is to guess a 5-letter word in 6 tries or less.");
		System.out.println("After you guess, I will show the letter if its in the right place");
		System.out.println("... a '_' if the letter is in the word somewhere else.");
		System.out.println(" or a '.' if it's not in the word,");
		System.out.println();
		
		while (true) {

			System.out.print("Enter your guess ");
			guess = kb.next();

			
			// print out the Wordle response using the rules above
			
			
			System.out.println(); // go to a new line

		}// end of while loop
		
		// game over, did you win? 


	}

}
