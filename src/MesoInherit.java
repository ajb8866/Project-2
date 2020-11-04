import java.lang.Math;
public class MesoInherit extends MesoAbstract
{
	String stID = "";
	public MesoInherit (MesoStation station)
	{
		 this.stID =  station.getStID();
		
	}
	
	@Override
	public int[] calAverage() 
	{
		int floorAverage = 0;
		int ceilingAverage = 0;
		int averagePlaceCounter = 0;
		double totalASCHolder = 0;

		for (int x = 0; x < stID.length(); ++x)
		{
			char placeholder = stID.charAt(x);
			int intPlaceHolder = placeholder;
			totalASCHolder += intPlaceHolder;
		}
		
		floorAverage = (int) Math.floor(totalASCHolder/4);
		ceilingAverage = (int) Math.ceil(totalASCHolder/4);
		if (((totalASCHolder/4) - (int)(totalASCHolder/4)) < .75)
		{
			averagePlaceCounter = floorAverage;
		}
		else if (((totalASCHolder/4) - (int)(totalASCHolder/4)) >= .75)
		{
			averagePlaceCounter = ceilingAverage;
		}
		int[] avgValueHolders = new int[3];
		avgValueHolders[0] = ceilingAverage;
		avgValueHolders[1] = floorAverage;
		avgValueHolders[2] = averagePlaceCounter;
		
		return avgValueHolders;
	
	}
	@Override
	public char letterAverage() 
	{
		char avgLetterIs = (char) calAverage()[2];
		return avgLetterIs;
	}
	
   
}