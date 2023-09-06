import java.util.Scanner;
public class QuestionNo3 {
	public static void main (String [] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, num3;
		
		System.out.print("Input the 1st number: ");
		num1 = scan.nextInt();
		System.out.print("Input the 2st number: ");
		num2 = scan.nextInt();
		System.out.print("Input the 3st number: ");
		num3 = scan.nextInt();
		
		//Process start
		
		if ((num1 != num2) && (num2 != num3)) {
			
			if ((num1 > num2) && (num1 > num3)) {
				System.out.print("The Greatest Number : " + num1);
				return;
			}
		
			if ((num2 > num1) && (num2 > num3)) {
				System.out.print("The Greatest Number : " + num2);
				return;
			}
			
			System.out.print("The Greatest Number : " + num3);
			
		} else if ((num1 == num2) || (num1 == num3) || (num2 == num3)) {
			
			
			//If both  number is bigger
			
			if ((num1 == num2) && (num3 < num1)) {
				System.out.print("The Greatest Number : " + num1);
				return;
			} 
			
			if ((num1 == num3) && (num2 < num1)) {
				System.out.print("The Greatest Number : " + num1);
				return;
			}
			
			if ((num2 == num3) && (num1 < num2)) {
				System.out.print("The Greatest Number : " + num2);
				return;
			}
			
			//end
			//Start if both number are lesser
			
			if ((num1 == num2) && (num3 > num1)) {
				System.out.print("The Greatest Number : " + num3);
				return;
			}
			
			if ((num1 == num3) && (num2 > num1)) {
				System.out.print("The Greatest Number : " + num2);
				return;
			}
			
			if ((num2 == num3) && (num1 > num2)) {
				System.out.print("The Greatest Number : " + num1);
				return;
			}
			
			//end of lowest
			System.out.print("All numbers are the same");
		} 
		
		
	}
}


/*3. Write a Java program that takes three numbers from the user and prints the greatest number.
Test Data
Input the 1st number: 25
Input the 2nd number: 78
Input the 3rd number: 87
Expected Output :
The greatest: 87 
*/