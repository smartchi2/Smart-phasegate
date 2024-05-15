import java.util.*;
public class MenstrualApp{
	public  static void main(String...App){
	Scanner input = new Scanner(System.in);
		System.out.printf("""
			Welcome to Smart Female Health central..
			we will be asking you to enter some input,
			concerning how your menstruation starts,
			and ends for us to be able to continue with you request..
							""" );

			int cycleLength = 0;
			int periodLength = 0;
			

			System.out.println("=".repeat(100));
			System.out.println("""
				Please enter some info about your menstrual 
		              		cycle, the lenght, the period duration and it 
				Should be entered in  days.Check below to 
				see options.""");
			System.out.println("=".repeat(100));

			System.out.println("Please Enter  when you  had  your last period, that you can remember in days:");
			cycleLength = input.nextInt();

			System.out.println("How many days does it last:");
  				periodLength = input.nextInt();

  			System.out.println("=".repeat(100));
			System.out.printf("""
				We at  Smart Female Health central says 
				Thank you for completing the steps provided by us. 
  				Hold on as we process your result
						""");
			int cycleDuration = cycleLength - periodLength;
			int fertilePhaseStart = cycleDuration / 14;

			System.out.println("=".repeat(100));
			System.out.println("the fertile phase starts 14 days before the next period");
			int fertilePhaseEnd = cycleDuration - 10;

			System.out.println("=".repeat(100));
			System.out.println("fertile phase ends 10 days before the next period");
			
			System.out.println("=".repeat(100));
			System.out.println("""
			From our research at Smart Female Health Central.
			Here are your menstrual cycle statistic:""");
			System.out.println("Average length of menstrual cycle:\t" +cycleLength   + "\tdays\t");
			System.out.println("Average duration of period:\t" +periodLength   + " \tdays\t");
			System.out.println("Average length of cycle excluding period:\t " + cycleDuration   + "\tdays\t");
			System.out.println("Fertile phase (potential ovulation period) starts on day \t" + fertilePhaseStart + fertilePhaseEnd);
			
			
		}

	}
