import java.util.*;

public class Account{
	private static List<String> firstNameList = new ArrayList<>();
	private static List<String> lastNameList = new ArrayList<>();
	private static List<String> accountTypeList = new ArrayList<>();
	private static List<Double> balanceList = new ArrayList<>();
	private static List<Integer> bankPinList = new ArrayList<>();
	public static void main(String...args){
	Scanner input = new Scanner(System.in);

	System.out.println("=".repeat(100));
	System.out.println("Smart investors Banking App");
	System.out.println("=".repeat(100));
	
	String PickOptions = """
		WELCOME.....	
	1. SIGN UP FOR AN ACCOUNT..
	2. LOGIN TO YOUR EXISING ACCOUNT..
	3. CLOSE ACCOUNT..
		""";
	System.out.println("=".repeat(100));
	System.out.print(PickOptions);
	int bankOptions = input.nextInt();
	System.out.println("=".repeat(100));
	switch(bankOptions){
	
	case 1:  System.out.print("Enter Your First Name:");
	             String firstName = input.next();
	             firstNameList.add(firstName);

	case 2: System.out.print("Enter your Last Name:");
	            String  lastName = input.next();
	            lastNameList.add(lastName);

	case 4: System.out.print("Create your transfer pin:");
	              int  bankPin = input.nextInt();
	              bankPinList.add(bankPin);

		if(bankPin == 6){
		         System.out.println("Your transfer pin was succesfully created");
			}
	                   if(bankPin != 6){
		        System.out.println("Please enter a valid pin, and pin must be up to 6");

		   System.out.println("Was your pin creation succesful? ");
		   String response = input.nextLine();

	while(response.equals("yes") || response.equals("YES") || response.equals("Yes")){
		 System.out.print("Create your transfer pin:");
	                    int  bankPin = input.nextInt();
	                    bankPinList.add(bankPin);
		System.out.println("=".repeat(100));
		System.out.println("NOTICE.... TO ALL OUR CUSTOMERS AND USERS");
		System.out.println("Please do not share your pin as we will not ask for it");
		
	System.out.println("=".repeat(100));
	System.out.println("""
		You are almost done creating  
		your account just pick the kind 
		of account you want""");
	System.out.println("=".repeat(100));

	String PickAccount = """
	           ACCOUNTS...
	          1. SAVINGS
	          2. CORRENT
	          3. CREDIT
	          4. INVESTING ACCOUNT
	                 """;
	System.out.println("=".repeat(100));
	System.out.print(PickAccount);
	int accountOptions = input.nextInt();
	System.out.println("=".repeat(100));
	switch(accountOptions){
	

			    }
		   }
	     }
         }
  }

}