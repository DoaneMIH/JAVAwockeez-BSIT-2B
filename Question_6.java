import java.util.Scanner;
public class ExerciseNo6 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int Number;
		
		System.out.print("INPUT : ");
		Number = scan.nextInt();
		
		System.out.print("OUTPUT : " + (int) Math.pow(Number, 2));

	}

}

/*6. Write a program to find square of a number.
E.g.-
INPUT : 2        OUTPUT : 4
INPUT : 5        OUTPUT : 25 */