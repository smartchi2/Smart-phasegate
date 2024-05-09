
import java.util.Scanner;
public class Characters{
	public static void main(String...plays){
	int[] user_input ={10};
	Scanner input = new Scanner(System.in);
	
	
	
	System.out.println("Welcome below you will see a bar and in it you are only allowed to enter {6 or 10} ");
		int  user = 0;
		int[] box1 = new int[1];
	            	int[] box2 = new int [1];
		int[] box3 = new int[1];
		int[] box4 = new int[1];
		int[] box5 = new int [1];
		int[]box6 = new int [1];
		int[] box7 = new int[1];
		int[] box8 = new int[1];
		int[] box9 = new int[1];
		int[] box10 = new int[1];	
		
		for(int index = 0; index <10; index++){
		System.out.println("Enter 6 or 10:");
		user= input.nextInt();
			}
		while(user != 6 || user != 10){
		System.out.println("Enter boxnumber:");
		int box = input.nextInt();
		if (user == 6 && user == 10){
			System.out.print("valid input");
				break;
		
		if(box == 1){
			box1[0] = user;
			}
		else if(box ==  2 ){
			box2[0] = user;
			}
		else if(user == 3){
			box3[0] = user;
			}
		else if(user == 4){
			box4[0] = user;
			}
		else if(user == 5){
			box5[0] = user;
			}
		else if(user == 6){
			box6[0] = user;
			}
		else if(user == 7){
			box7[0] = user;
			}
		else if(user == 8){
			box8[0] = user;
			}
		else if(user == 9){
			box9[0] = user;
			}
		else if(user == 10){
			box10[0] = user;
			}
	            }	

                 }
}