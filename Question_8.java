import java.util.Scanner;
public class ExerciseNo8 {

	public static void main(String[] args) {
		
				Scanner sc= new Scanner(System.in); 
			      
		        System.out.println("Enter first number: "); 
		        int a = sc.nextInt();
		        
		         System.out.println("Enter second number: "); 
		        int b = sc.nextInt();
		        
		         System.out.println("Enter third number: "); 
		        int c = sc.nextInt();
		        
		          if (a == b && a == c)
		          {
		              System.out.print("All numbers are equal");
		          } 
		          else if ((a == b) || (a == c) || (b == c))
		          
		          { 
		              System.out.print("Any two numbers are equal");
		          } 
		          else 
		          {
		               System.out.println("All numbers are not equal");
		          }
		  }
		
	}
/* 8. Take 3 inputs from user and check :
all are equal
any of two are equal
( use && || ) */


