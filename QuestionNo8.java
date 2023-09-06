import java.util.Scanner;
public class QuestionNo8 {
	public static void main(String [] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input an Alphabet: ");
		char c = scan.next().charAt(0);
		
		//if the character is a letter
		if (Character.isLetter(c)) {
			//VOWELS
			if ((c == 'A') || (c == 'a') || (c == 'E') || (c == 'e') || (c == 'O') || (c == 'o') 
					|| (c == 'I') || (c == 'i') || (c == 'U') || (c == 'u')){
				
				System.out.print("Input letter is Vowel");
			//CONSONANT	
			} else {
				
				System.out.print("Input letter is Consonant");
				
			}
		// if the character is not a letter	
		} else {
			System.out.println("Error");
		}
		scan.close();
	}
}

/*8. Write a Java program that requires the user to enter a single character from the alphabet.
 *  Print Vowel or Consonant, depending on user input. If the user input is not a letter
 * (between a and z or A and Z), or is a string of length > 1, print an error message. 
Test Data
Input an alphabet: p
Expected Output :
Input letter is Consonant */