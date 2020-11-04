/**
 * DateTimeInherit is a class that inherits the class named, DateTimeAbstract  
 */
import java.time.*;
public class DateTimeInherit extends DateTimeAbstract {
	public DateTimeInherit()
	{
		
		//int theYear = 0;
		//int monthOfYear = 1;
		//this.daysOfAnyMonth(monthOfYear, theYear );
	}
	@Override
	public void daysOfAnyMonth(int monthOfYear, int theYear) 
	{
		  YearMonth ym = YearMonth.of(theYear, monthOfYear);  
		  //String fortmatedYM = ym.format(DateTimeFormatter.ofPattern("M yyyy")); 
	      LocalDate lastDayofYM = ym.atEndOfMonth();
	      LocalDate firstDayofYM = YearMonth.of(theYear, monthOfYear).atDay( 1 );
	      DayOfWeek lastDayOfWeek = DayOfWeek.from(lastDayofYM); 
	      DayOfWeek firstDayOfWeek = DayOfWeek.from(firstDayofYM);
	      String suffix = "";
	      if (monthOfYear == 1)
	    	  suffix = "st";
	      else if (monthOfYear == 2)
	    	  suffix = "nd";
	      else if(monthOfYear == 3)
	    	  suffix ="rd";
	      else 
	    	  suffix = "th";
	      
	      
	      System.out.println("In the year " +theYear +", for the " + monthOfYear + suffix + " month: the first day is " +
	      firstDayOfWeek + " and the last day is " + lastDayOfWeek);

	}
}