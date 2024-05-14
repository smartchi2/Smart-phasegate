import java.util.Scanner;

public class Account{
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
	case 2: System.out.print("Enter your Second Name:");
	              String secondName = input.next();
                   case 3: System.out.print("Enter Your Last Name:");
	              String lastName = input.next();
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
	                 """;

	//Account giveAccount1 = new Account("Smart Sunday", 10.000);
	//Account giveAccount2 = new Account("Mr chi",  -1.500);

	//System.out.printf("%s balance: $%.2f%n",  givenAccount1(), giveAccount.getBalance());
	//System.out.printf("%s balance: $%.2f%n%n",givenAccount2.getName//(),giveAccount2.getBalnce());

	///System.out.println("Enter the account you wish to deposit:");
	//double deposit = input.nextDouble();

	//System.out.printf(%nadding %2.f to account balance%n%n", deposit);

	}
}
}