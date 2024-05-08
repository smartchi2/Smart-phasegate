import java.util.*;
public class First{
	public static void main(String...phasegate){
		Scanner input = new Scanner(System.in);
		int[] numbers = new int [10];
		
		for(int index = 1; index < numbers.length; index++){
			System.out.println("Enter score: " + index);
			numbers[index] = input.nextInt();
			}
			System.out.println(Arrays.toString(numbers));
		}

}