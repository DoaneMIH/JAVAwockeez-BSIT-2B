package midterm;
import java.util.Scanner;
public class AtmMachine {
	private static final int max_user = 2;					//determine maximum user
	private static int[][] user = new int[max_user][3];		
	private static int userCount = 0;
	//Main Method
	public static void main(String[] args) {
		while(true) {
			mainMenu();
		}
	}
	
	private static void mainMenu() {
		Scanner scan = new Scanner(System.in);		//declaration of scanner
		while(true) {
			System.out.println("----- Welcome to Javawockeez ATM -----\n");
			System.out.println("1. Sign-up");
			System.out.println("2. Login");
			System.out.println("3. Exit");
			System.out.print("Choice: ");
			int choice = scan.nextInt();
			
			switch(choice) {
			case 1: 
				signUp(scan);	//Call the signUp method
			break;
			case 2:
				System.out.println("\nUser Login:");
				
				System.out.print("Enter username: ");
		        int username = scan.nextInt();
		        
				if (isUserthere(username)) {
					System.out.print("Enter password: ");
			        int password = scan.nextInt();
			        int index = UserIndex(username);
			        
					boolean SuccessfulLogin = logIn(username,password);
					
					if (SuccessfulLogin) {
						loginDirect(scan,index);
						return;
					}
				}else {
					System.out.println("User Not Found. Please Try Again\n");
				}
			break;
			case 3:
				System.out.println("\nExiting the system...");
				System.exit(0);
			break;
			default:
				System.out.println("INVALID INPUT. Please try again ");
			}
		}
	}
	private static void signUp(Scanner scan) {
		if (userCount < max_user) {
			System.out.print("Enter username: ");
			int username = scan.nextInt();
				
			if (isUserthere (username)) {	//call the method to check if the user is there
				System.out.println("Username already exist. Use another one\n");
			} else {
				System.out.print("Enter password: ");
				int password = scan.nextInt();	
				System.out.print("Deposit initial balance: ₱");
				int initial = scan.nextInt();
				
				user[userCount][0] = username;
	            user[userCount][1] = password;
	            user[userCount][2] = initial;
	
	            userCount++;
	            System.out.println("Registration successful.\n");
			} 
		} else {
			System.out.println("Maximum number of User reached\n");
		}
	}

	private static boolean isUserthere(int username) {
		for (int i = 0; i < userCount; i++) {
	           if (user[i][0] == username ) {
	               return true;
	           }
	    }
	       return false;
	}
	
	private static int UserIndex (int username) {
		for (int i = 0; i < userCount; i++) {
			if (user[i][0] == username) {
				return i;
			}
		}
		return -1;
	}
	
	private static boolean logIn (int username, int password) {
		 boolean isThere = false;
	        
	        for (int i = 0; i < userCount; i++) {
	            if (user[i][0] == username && user[i][1] == password) {
	                System.out.println("Login successful!\n");
	                isThere = true;
	                return isThere;
	            }
	        }

	    System.out.println("Login failed. Please check your username and password.\n");  
	    return isThere;
	}
	
	private static void loginDirect(Scanner scan, int index) {
		while (true) {
		System.out.println("----- WELCOME -----");
		System.out.println("1. Deposit");
		System.out.println("2. Withdraw");
		System.out.println("3. Send Money");
		System.out.println("4. Check Balance");
		System.out.println("5. Exit");
		System.out.print("Choice: ");
		int choice = scan.nextInt();
		
			switch (choice) {
			case 1:
				deposit(scan, index);
			break;
			case 2:
				withdraw(scan,index);
			break;
			case 3:
				sendMoney(scan, index);
			break;
			case 4: 
				viewBalance(index);
				break;
			case 5:
				mainMenu();
				break;
			default:
				System.out.println("Invalid Input, Please Try Again!\n");
				break;
			}
		}
	}
	
	private static void deposit (Scanner scan, int index) {
		System.out.print("\nDeposit Amount: ₱");
		int deposit = scan.nextInt();
		int minDeposit = 100;
		
		if (deposit > minDeposit) {
			user[index][2] += deposit;
			System.out.println("Deposit Successfully\n");
		} else {
			System.out.println("Insufficient amount deposit\n");
		}
	}
//	System.out.println("New Amount: ₱" + user[index][2]);
	
	private static void withdraw (Scanner scan, int index) {
		int maintainingBalance = 200;
		System.out.print("\nWithdraw Amount: ₱");
		int withdraw = scan.nextInt();
		
		if (user[index][2] > withdraw && user[index][2] != maintainingBalance) {
			user[index][2] -= withdraw;
			System.out.println("Withdraw Successfully!");
		} else {
			System.out.println("You don't have enough balance\n");
		}
	}
//	System.out.println("Current Amount: ₱" + user[index][2] + "\n");
	private static void sendMoney(Scanner scan, int index) {
		System.out.print("Transfer to: ");
		int to = scan.nextInt();
		int TransferTo = UserIndex(to);
			
		if(TransferTo != -1) {
			System.out.print("Enter the amount: ₱");
			int transfer = scan.nextInt();
			
			user[TransferTo][2] += transfer;
			user[index][2] -= transfer;
			System.out.println("Transfer Successfully");
		} else {
			System.out.println("User Not Found\n");
		}
	}
//	System.out.println("Remaining balance: " + user[index][2]);
	private static void viewBalance(int index) {
		System.out.println ("Balance: ₱ " + user[index][2]);
	}

}
