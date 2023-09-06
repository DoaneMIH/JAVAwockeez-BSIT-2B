import java.util.Scanner;
public class QuestionNo4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		System.out.print("Input a number : ");
		float input = scan.nextFloat();
		int intInput = (int) input;
		
		if (input == 0) {
			System.out.println("Input Value: " + intInput);
			System.out.print("ZERO");
			return;
		} 
		
		if(input > 0) {
			if(input > 1000000) {
				System.out.println("Input Value: " + intInput);
				System.out.print("Large Number");
				return;
			}
			
			System.out.println("Input Value: " + intInput);
			System.out.print("Positive Number");
			return;
		}
		
		if(input < 0) {
			if (Math.abs(input) < 1) {
				System.out.println("Input Value: " + input);
				System.out.print("SMALL");
				return;
			}
			System.out.println("Input Value: " + intInput);
			System.out.print("Negative Number");
			return;
		}
	}

}

/* 4. Write a Java program that reads a floating-point number and prints 
 * "zero" if the number is zero. Otherwise, print "positive" or "negative".
 *  Add "small" if the absolute value of the number is less than 1, or "large" 
 *  if it exceeds 1,000,000. 
 
Test Data
Input a number: 25
Expected Output :
Input value: 25
Positive number*/