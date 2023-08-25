import java.util.Scanner;

public class ExerciseNo1 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		int InputNo1;
		int InputNo2;
		
		System.out.print("Enter the first integer : ");
		InputNo1 = scanner.nextInt();
		
		System.out.print("Enter the second integer : ");
		InputNo2 = scanner.nextInt();
		
		System.out.print("Total : " + (InputNo1 + InputNo2));
		
	}
}

/* 1. Write a program to take two integer inputs from user then print the total. */