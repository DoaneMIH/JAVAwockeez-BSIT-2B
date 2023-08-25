import java.util.Scanner;
public class ExerciseNo2 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
	
		int InputNo1;
		int InputNo2;
		
		System.out.print("Enter the first integer : ");
		InputNo1 = scanner.nextInt();
		
		System.out.print("Enter the second integer : ");
		InputNo2 = scanner.nextInt();
		
		System.out.println("Total Sum : " + (InputNo1 + InputNo2));
		System.out.print("Total Product : " + (InputNo1 * InputNo2));
		
	}
}

/* 2. Take two integer inputs from user. First calculate the sum of two then product of two.
  Finally, print the sum and product of both obtained results.
 */
