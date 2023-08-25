import java.util.Scanner;
public class ExerciseNo5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		int SquareSize;
		
		System.out.print("Enter the side of the Square : ");
		SquareSize = scanner.nextInt();
		
		System.out.println("Perimeter of Square : " + (4*SquareSize));
		System.out.print("Area of Square : " + (int) (Math.pow(SquareSize,2)));

	}

}//5. Take side of a square from user and print area and perimeter of it.