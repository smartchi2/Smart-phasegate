import java.util.*;
import java.util.Random;

public class Account{
	public static void main(String...a){
	Scanner input = new Scanner(System.in);
	ArrayList<String> firstNameList = new ArrayList<>();
	ArrayList<String> lastNameList = new ArrayList<>();
	ArrayList<String> userName1List = new ArrayList<>();
	ArrayList<Double> depositList = new ArrayList<>();
	ArrayList<Double> balanceList = new ArrayList<>();
	ArrayList<String> bankPinList = new ArrayList<>();
	
	
	 String userName1 = "";
	String bankPin = "";
	String Yes = "";
	double balance = 0;
	printHeader();
	pickOption();
                 // accountManu();
	System.out.print("choose an option..");
	int bankOptions = input.nextInt();
	//System.out.print("Get started..");
	//int Manu = input.nextInt();
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
		bankPin = input.nextLine();
		input.nextLine();
		bankPinList.add(bankPin);

		while(bankPin.length() !=  6){
		System.out.println("Please enter a valid pin, and pin must be up to 6");
		System.out.println("Create your transfer pin:");
		bankPin = input.nextLine();
			}
		  System.out.println("Your transfer pin was succesfully created");
		 System.out.println("=".repeat(50));
		 System.out.println("Please wait as we procces your request for you to get your account number!!!!");

		 System.out.print("""
		 Account Number Section:
		1 -> Nigeria Account No.
			""");
	int generateYourAccountNo = input.nextInt();
	switch(generateYourAccountNo){
	case 1:
		System.out.println("Your new Naira  account is  number ID54671" + Math.random());  
		System.out.println("*************************\n" +
		  "--------------------------------USER INFO\n" +
		      "***************  First Name is: " +  firstName + "\n" +
		                 "*************  Last Name is: " +  lastName + "\n" +
		                        " **********  UserName is: " + userName1 + "\n" +
		                                           "*******  Bank Pin is: " + bankPin + "\n" +
		                   "***************************************");
		break;
	   default:	System.out.println("Invalid selection Exiting now as we are still working on it!!!");
			}
		System.out.print("""
                              	        Manu
		1 ->Deposit money.
		2 ->Withdraw money.
		3 -> Check Account  balance
		4 ->Transfer from one account to another.
		5 -> Change Pin
                           	    """);
	int accountManu = input.nextInt();
	switch(accountManu){
	   case 1:
		  double deposit;
      		  System.out.println("Enter the amount you want to deposit: ");  
      		  deposit = input.nextDouble();  
        		  balance = balance + deposit; 
		
		   double withdrawal;  
       		  System.out.println("Enter the amount you want to withdraw: ");  
      		  withdrawal = input.nextLong();  
       		 if (balance >= withdrawal) {  
           		 balance = balance - withdrawal ;  
        	                   System.out.println("Balance after withdrawal: " + balance);  
       		 } else {  
          		  System.out.println("Your balance is less than " + withdrawal + "\tTransaction failed...!!" );  
          			 }  
			break;
   		   }   	
    	case 3:
		System.out.println("Are you sure you want to delete your account?:");
		String closeAccount = input.nextLine();
		while(closeAccount != Yes){
		System.out.println("Are you sure you want to delete your account?:");
		System.out.println("Account was successfully deleted");
		if(closeAccount == Yes){
	                   	System.out.println("You can continue using our great App");
		break;
		}
		 System.out.println("Seems like we are having issues with our internet please hold on......");	  
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
public static void deposit() {
}
public static void withdrawal() { 
}
public static void printHeader(){
String header = """
===========================
Smart investors Banking App
=========================== """;
System.out.println(header);
}
    

}
