public class PhaseGateaDayOne15{
	public static void main(String...phasegate){
		int count = 10;
		String increase =  " ";
		int time = 5;

		for(int counter = 0; counter <= count; counter+=5){
			if(counter % 2 == 0){

				increase = (String)counter;
				System.out.println(increase + time);
			}

			}
		}
	}