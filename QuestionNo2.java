import java.util.Scanner;
public class QuestionNo2 {
	public static void main (String []args) {
		Scanner scan = new Scanner(System.in);
		int a, b, c;
		double discriminant, root1, root2;
		
		System.out.print("Input a: ");
		a = scan.nextInt();
		System.out.print("Input b: ");
		b = scan.nextInt();
		System.out.print("Input c: ");
		c = scan.nextInt();
		
		discriminant = (b * b ) - (4*a*c);
		
		if (discriminant > 0) {
			root1 = (-b + Math.sqrt(discriminant)) / (2*a);
			root2 = (-b - Math.sqrt(discriminant)) / (2*a);
			System.out.print("The roots are " + (int) root1 + " and " + (int) root2);
		}
		
		
		else if (discriminant == 0) {
			root1 = root2 = (-b) / (2*a);
			System.out.print("The root is " + (int) root1);
		}
		
		
		else {
			double imaginary, real;
			real = -b / (2*a);
			imaginary = Math.sqrt(-discriminant)/ (2*a);
			System.out.print("the real root is " + real + " and the imaginary is " + imaginary);
		}
		scan.close();
	}
}

/*2. Write a Java program to solve quadratic equations (use if, else if and else).
Test Data
Input a: 1
Input b: 5
Input c: 1
Expected Output :
The roots are -0.20871215252208009 and -4.7912878474779195 */