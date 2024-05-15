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
	
	
	 String userName1 = "";
	String bankPin1 = "";
	String response ="";
	String Yes = "";
	int nigeriaAccountNumber = 0;
	int dollarAccountNumber = 0;
	printHeader();
	pickOption();
                     
                  //accountType();
	System.out.print("choose an option  ");
	int bankOptions = input.nextInt();
	System.out.println("=".repeat(20));
          
	
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
		while(bankPin1.length() !=  6){
		System.out.println("Please enter a valid pin, and pin must be up to 6");
		System.out.println("Create your transfer pin:");
		bankPin1 = input.nextLine();
			}
		  System.out.println("Your transfer pin was succesfully created");
		 System.out.println("=".repeat(50));
		 System.out.println("Please wait as we procces your request for you to get your account number!!!!");
		 System.out.print("""
		 Account Number Section:
		1 -> Nigeria Account No.
		2 -> Dollar Accoun No. 
			""");
	int generateYourAccountNo = input.nextInt();
	switch(generateYourAccountNo){
		case 1:
			System.out.println("Your new Naira  account is  number ID54671" + Math.random());  
			nigeriaAccountNumber = input.nextInt();
			
		
			System.out.println("Your new Dollar account number is ID6789" + Math.random());  
			dollarAccountNumber = input.nextInt();
	                   		break;
		
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
		}
	          defualt: System.out.println("You have entered an invalid Bank Pin");
		
	case 3:
		System.out.println("Are you sure you want to delete your account?:");
		String closeAccount = input.nextLine();
		while(closeAccount != Yes){
		System.out.println("Are you sure you want to delete your account?:");
		System.out.println("Account was successfully deleted");
		//}else{
	                   // System.out.println("You can continue using our great App");
		break;
		}
		defualt: System.out.println("Seems like we are having issues with our internet please hold on......");
		return;	  
                     	   }
		}
	
		}
		System.out.println("Enter continue to see your registed info: ");
		String response = input.nextLine();
		while(response == continue){
		System.out.println("Your new Naira  account is ID54671" + Math.random());  
		System.out.println("Your new Dollar account number is ID6789" + Math.random());  
		System.out.println("*************************\n" +
		  "--------------------------------USER INFO\n" +
		      "***************  First Name is: " +  firstName + "\n" +
		                 "*************  Last Name is: " +  lastName + "\n" +
		                        " **********  UserName is: " + userName1 + "\n" +
		                                           "*******  Bank Pin is: " + bankPin1 + "\n" +
				  //"******** Account Number is: " + 
		                   "***************************************");
			break;
			}
	   defual:	System.out.println("Invalid selection Exiting now as we are still working on it!!!");
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
