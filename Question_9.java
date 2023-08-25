import java.util.Scanner;
public class ExerciseNo9 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int a, b;
		
		System.out.print("Enter the value of a : ");
		a = scanner.nextInt();
		
		System.out.print("Enter the value of b : ");
		b = scanner.nextInt();
		
		System.out.print((a < 50) && (a < b) );

	}

}

/* 9. Write a program to enter the values of two variables 'a' and 'b' from keyboard and then check if both the conditions 'a < 50' and 'a < b' are true.*/
