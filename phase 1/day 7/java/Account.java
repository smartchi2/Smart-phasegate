import java.util.Scanner;

public class Account{
	public static void main(String...args){
	Scanner input = new Scanner(System.in);
	Account giveAccount1 = new Account("Smart Sunday", 10.000);
	Account giveAccount2 = new Account("Mr chi",  -1.500);

	System.out.printf("%s balance: $%.2f%n",  givenAccount1(); giveAccount.getBalance());
	System.out.printf("%s balance: $%.2f%n%n",givenAccount2.getName(); giveAccount2.getBalnce());

	System.out.println("Enter the account you wish to deposit:");
	double deposit = input.nextDouble();

	System.out.printf(%nadding %2.f to account balance%n%n", deposit);

	}
}