import java.util.Scanner;
	public class QuestionNo6 {
		public static void main (String [] args) {
			Scanner scan = new Scanner (System.in);
			
			System.out.print("Input floating point number : ");
			float inputNum1 = scan.nextFloat();
			
			System.out.print("Input floating-point another number: ");
			float inputNum2 = scan.nextFloat();
			
			float roundNum1 = Math.round (inputNum1 * 1000 / 1000);
			float roundNum2 = Math.round (inputNum2 * 1000 / 1000);
			
			if (roundNum1 == roundNum2) {
	            System.out.println("They are the same up to three decimal places");
	        } else {
	            System.out.println("They are different");
	        }
		}
	}

/*  Write a Java program that reads two floating-point numbers and tests
*  whether they are the same up to three decimal places. 

Test Data
Input floating-point number: 25.586
Input floating-point another number: 25.589
Expected Output :
They are different */