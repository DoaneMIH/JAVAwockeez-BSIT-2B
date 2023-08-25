import java.util.Scanner;
public class ExerciseNo4 {
	public static void main (String[]args){
		Scanner scanner = new Scanner(System.in);
		String Name, Roll, Interest;
		
		System.out.print("Name : ");
		Name = scanner.nextLine();
		
		System.out.print("Roll number : ");
		Roll = scanner.nextLine();
		
		System.out.print("Field of Interest : ");
		Interest = scanner.nextLine();
		
		System.out.print("Hey, my name is " + Name + " and my roll number is " + Roll + ". My field of interest are " + Interest + ".");
	}
}

//4. Take name, roll number and field of interest from user and print in the format below :
//Hey, my name is xyz and my roll number is xyz. My field of interest are xyz.