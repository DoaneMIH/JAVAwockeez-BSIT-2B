import java.util.Scanner;
public class QuestionNo9 {
		public static void main(String[] args) {
			int year;
			
			Scanner sc = new Scanner(System.in);
			
		      System.out.print("Input the year: ");
		      year = sc.nextInt();

		      if (((year % 4 == 0) && (year % 100!= 0)) || (year%400 == 0))
		         System.out.println(year + " is a leap year");
		      else
		         System.out.println(year + " is not a leap year");
		      
		      sc.close();
		}
}

/*Write a Java program that takes a year from the user and prints whether it is a leap year or not. 
Test Data
Input the year: 2016
Expected Output :
2016 is a leap year */