import java.util.*;
	public class PhaseGateFirstDay2{
	public static void main(String...phasegate){
	Scanner input = new Scanner(System.in);
	int sum = 0;
	for(int index = 0; index < 10; index++){
		System.out.println("Enter you best scores");
		int best = input.nextInt();
	 	    sum += best / 2;
			}
		System.out.println("the average is: " +  sum);
		
		}
	}