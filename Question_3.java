import java.util.Scanner;
public class ExerciseNo3 {
	public static void main (String[]args) {
		Scanner scanner = new Scanner(System.in);
		double length , breadth;
		
		System.out.print("Enter the Length of Rectangle : ");
		length = scanner.nextDouble();
		
		System.out.print("Enter the Breadth of Rectangle : ");
		breadth = scanner.nextDouble();
		
		double total = length * breadth;
		int CastedtoInt = (int) total;
		System.out.print("Area of the Rectangle is : " + (CastedtoInt));
		
	}
}

