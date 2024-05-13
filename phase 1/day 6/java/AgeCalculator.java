import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

public class AgeCalculator{
	public static void main(String...args){
	String date = "11 - 12 -2021";

	String[]  formats = {"dd-MMM-yyyy",   "dd-MM-yyyy",   "dd-mm-yyyy",   "dd/mm/yy"};
	LocalDate dob = null;
	
	for(String format : formats){
	  try{
	     dob = LocalDate.parse(date,  DateTimeFormatter.ofPattern(format));
	       break;
	   }catch (Exception e) {
	            System.out.println(e.getMessage());
	    }
  }


	if(dob != null){
	     LocalDate currentDate = LocalDate.now();

	int age = currentDate.minusYears(dob.getYear()).getYear();
	System.out.println( age);
		}

	}

}


	



	



	
        
   