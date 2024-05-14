import java.util.*;

public class Account{
	public static void main(String...a){
	Scanner input = new Scanner(System.in);
	ArrayList<String> firstNameList = new ArrayList<>();
	ArrayList<String> lastNameList = new ArrayList<>();
	ArrayList<String> accountTypeList = new ArrayList<>();
	ArrayList<Double> balanceList = new ArrayList<>();
	ArrayList<String> bankPinList = new ArrayList<>();
	
	

	printHeader();
	pickOption();
	accountType();
	System.out.print("choose an option  ");
	int bankOptions = input.nextInt();
	System.out.println("=================");

	switch(bankOptions){
	
	case 1: 
		 System.out.print("Enter Your First Name: ");
	 	String firstName = input.next();
		firstNameList.add(firstName);
	
		System.out.print("Enter your Last Name:");
		String  lastName = input.next();
		lastNameList.add(lastName);

		System.out.println("Create your transfer pin:");
		String  bankPin = input.nextLine();
		input.nextLine();
		bankPinList.add(bankPin);
		if(bankPin.length() >  6 || bankPin.length() < 6){
		System.out.println("Please enter a valid pin, and pin must be up to 6");
		} else {
		System.out.println("Your transfer pin was succesfully created");
		}
			break;
	default:
		System.out.print("Invalid selection Exiting now!!!");
		return;
	

			    }
         }
  public static void pickOption(){

	String PickOptions = """
		WELCOME.....	
	1. SIGN UP FOR AN ACCOUNT..
	2. LOGIN TO YOUR EXISING ACCOUNT..
	3. CLOSE ACCOUNT..
		""";
System.out.print(PickOptions);
}

public static void accountType(){

               String pickType = """
	1. Savings
	2. Corrent
	3. Credit
	4. Investor Account..
	             """;
System.out.print(accountType);
	
    }

public static void printHeader(){
String header = """
===========================
Smart investors Banking App
=========================== """;
System.out.println(header);

    }

  }
