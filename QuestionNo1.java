import java.util.Scanner;
public class QuestionNo1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int input;
		
		System.out.print("input number : ");
		input = scan.nextInt();
		
		if (input > 0 ) {
			System.out.println("Number is positive");
			return;
		}
		
		if (input < 0) {
			System.out.println("Number is negative");
			return;
		}
		
		System.out.println("It is neither positive nor negative");
		
		
	}

}

/* 1.Write a Java program to get a number from the user and print whether it is positive or negative.
Test Data
Input number: 35
Expected Output :
Number is positive */