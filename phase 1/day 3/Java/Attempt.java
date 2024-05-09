import java.util.*;
public class Attempt{
	public static void main(String...smart){
	Scanner input = new Scanner(System.in);
	Random random  = new Random();
	int numbers = random.nextInt(100);


	for(int index = 1; index <= 10; index++){
	System.out.println("Enter correct answer from 1 - 100: ");
	int answer = integer.parseInt(random.nextLine());

		if(answer > 100){
			System.out.println(" oo shi this numbers entered is too big:\n" + answer);
			}
		else{
		     System.out.println("Let's see the numbers you entered:\n " + answer);
			}
		}
	
	
	
	}
}