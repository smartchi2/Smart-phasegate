			console.log("""
			Welcome to Smart Female Health central..
			we will be asking you to enter some input,
			concerning how your menstruation starts,
			and ends for us to be able to continue with you request..
							""" );

			let cycleLength = 0;
			let periodLength = 0;
			

			console.log("=".repeat(100));
			console.log("""
				Please enter some info about your menstrual 
		              		cycle, the lenght, the period duration and it 
				Should be entered in  days.Check below to 
				see options.
					""");
			console.log("=".repeat(100));

			console.log("""
			Please enter the average length of your menstrual 
			cycle that you can remember in days: """);
			

			console.log("""
				Please Enter the average duration
				 of your period that you can remember in days:""");
	

			console.log("=".repeat(100));
			console.log("""
				We at  Smart Female Health central says 
				Thank you for completing the steps provided by us. 
				Hold on as we process your result
						""");
			int cycleDuration = cycleLength - periodLength;
			int fertilePhaseStart = cycleDuration / 14;

			console.log("=".repeat(100));
			console.log("the fertile phase starts 14 days before the next period");
			int fertilePhaseEnd = cycleDuration - 10;

			console.log("=".repeat(100));
			console.log("fertile phase ends 10 days before the next period");
			
			console.log("=".repeat(100));
			console.log("""
			From our research at Smart Female Health Central.
			Here are your menstrual cycle statistic:""");
			console.log("Average length of menstrual cycle:\t" +cycleLength   + "\tdays\t");
			console.log("Average duration of period:\t" +periodLength   + " \tdays\t");
			console.log("Average length of cycle excluding period:\t " + cycleDuration   + "\tdays\t");
			console.log("Fertile phase (potential ovulation period) starts on day \t" + fertilePhaseStart + fertilePhaseEnd);
			
			
		}

	}
