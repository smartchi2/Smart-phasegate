import java.util.*;
import java.util.Random;

public class Account{
	public static void main(String...a){
	Scanner input = new Scanner(System.in);
	ArrayList<String> firstNameList = new ArrayList<>();
	ArrayList<String> lastNameList = new ArrayList<>();
	ArrayList<String> userName1List = new ArrayList<>();
	ArrayList<String> accountTypeList = new ArrayList<>();
	ArrayList<Double> balanceList = new ArrayList<>();
	ArrayList<String> bankPin1List = new ArrayList<>();
	
	 String userName1 = null;
	String bankPin1 = null;
	printHeader();
	pickOption();
	//accountType();
	System.out.print("choose agtn option  ");
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
	
		System.out.print("Enter Prefer  User Name:");
		userName1 = input.next();
		userName1List.add(userName1);

		System.out.println("Create your transfer pin:");
		bankPin1 = input.nextLine();
		input.nextLine();
		bankPin1List.add(bankPin1);
		if(bankPin1.length() >  6 || bankPin1.length() < 6){
		System.out.println("Please enter a valid pin, and pin must be up to 6");
		} else {
		System.out.println("Your transfer pin was succesfully created");
		}
			break;
	default:   System.out.println("Invalid selection Exiting now!!!");
		return;
	
	case 2:
		System.out.println("Login.... Enter Details Below:");
		System.out.println("User Name");
		String userName2 = input.next();
		if(userName2 == userName1){
		System.out.println("Hello" + userName2);
		}else{
		System.out.println("User not registered with us please create account");
		}
		System.out.print("Enter Transfer Pin:");
		String accountPin = input.nextLine();
		input.nextLine();
		if(accountPin == bankPin1){
		System.out.println("Login Successful");
	                  }else{
	                 System.out.println("You have entered an invalid Bank Pin");
		}
			break;
	default:   System.out.println("Please wait as we procces your request for you to get your account number!!!!");
		return;
	case 3: System.out.print("""
		generateYourAccountNo:
		1 -> Nigeria Account No.
		2 -> Dollar Accoun No.
			""");
	int generateYourAccountNo = input.nextInt();
	switch(generateYourAccountNo){
		case 1:
			System.out.print("Your new Nigeria  account is 54671" + Math.random());  
		case 2:
			System.out.print("Your new Dollar account number is 6789" + Math.random());  
		default:
			System.out.print("Please hold on as we are having network issue");
			}

	
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
System.out.print(pickType);
	
    }



public static void printHeader(){
String header = """
===========================
Smart investors Banking App
=========================== """;
System.out.println(header);

    }

  }
