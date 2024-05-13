import java.util.Arrays;
public class SwappArrays1{
	public static void main(String...args){
	int[] numbers = {7, 10, 11, 5, 6};
	
	
	for(int index = 0; index < numbers.length / 2;){
	int temp = numbers[index];
	numbers[index] = numbers[index +1];
	numbers[index +1] = temp;
	 index++;
			}
	System.out.print(Arrays.toString(numbers));
		}
	}