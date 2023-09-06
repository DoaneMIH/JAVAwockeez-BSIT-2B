import java.util.Scanner;
public class QuestionNo7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
			System.out.print ("Input a month number: ");
			int month = scan.nextInt();
			
			System.out.print("Input a year: ");
			int year = scan.nextInt();	
			
			
			switch(month) {
					//Months with 31 days
				case(1):
					System.out.print("January " + year + " has 31 days");
					break;
				case(3):
					System.out.print("March " + year + " has 31 days");
					break;
				case(5):
					System.out.print("May " + year + " has 31 days");
					break;
				case(7):
					System.out.print("July " + year + " has 31 days");
					break;
				case(8):
					System.out.print("August " + year + " has 31 days");
					break;
				case(10):
					System.out.print("October " + year + " has 31 days");
					break;
				case(12):
					System.out.print("December " + year + " has 31 days");
					break;

					//Months with 30 days
				case(4):
					System.out.print("April " + year + " has 30 days");
					break;
				case(6):
					System.out.print("June " + year + " has 30 days");
					break;
				case(9):
					System.out.print("September " + year + " has 30 days");
					break;
				case(11):
					System.out.print("November " + year + " has 30 days");
					break;

					//February 
				case(2):
					if ((year % 4 == 0) && (year % 100 != 0)|| (year % 400 == 0)) {
						System.out.print("February " + year + " has 29 days");
						return;
					} 
						System.out.print("February " + year + " has 28 days");
					break;
			}
			
	}

}

/*7. Write a Java program to find the number of days in a month. 
Test Data
Input a month number: 2
Input a year: 2016
Expected Output :
February 2016 has 29 days */ 
