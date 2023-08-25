import java.util.Scanner;
public class ExerciseNo7 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String FirstWord, SecondWord;
		
		System.out.print("INPUT First Word : ");
		FirstWord = scan.nextLine();
		
		System.out.print("INPUT Second Word : ");
		SecondWord = scan.nextLine();
		
		System.out.print("OUTPUT : " + FirstWord + SecondWord);

	}

}

/*7. Take two different string input and print them in same line. E.g.-
INPUT : Codes
Dope
OUTPUT : CodesDope */