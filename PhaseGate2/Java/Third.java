import java.util.*;
public class Third{
	public static void main(String...phasegate){
		Scanner input = new Scanner(System.in);
		int[] numbers = new int [10];
		
		for(int index = 1; index < numbers.length; index++){
			System.out.print("Enter score: " );
			numbers[index] = input.nextInt();
			}
			System.out.printf(" %n%s",Arrays.toString(numbers));
		}

	}