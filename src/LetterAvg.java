import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class LetterAvg {

	char letterAvgOfStation= '_';
	ArrayList<String> stIDHolder = new ArrayList<String>();
	ArrayList<String> stIDLetterMatchHolder = new ArrayList<String>();

	public LetterAvg(char letterAverage) 
	{
		letterAvgOfStation = letterAverage;
		try {
			  int counter = 0;
			  
		      File myObj = new File("Mesonet.txt");
		      Scanner myReader = new Scanner(myObj);
		      while (myReader.hasNextLine())
		      {
			     String data = myReader.nextLine();
			     data = data.trim();
			     if (counter > 2)
			    	 stIDHolder.add(data.split(" ")[0]);
			     ++counter;
			    
		      }
		      myReader.close();
		  }  
		catch (FileNotFoundException e) 
		{
		    System.out.println("An error occurred.");
		    e.printStackTrace();
		}
	}

	public int numberOfStationWithLetterAvg() 
	{
		char stIDCharPlaceholder = '_';
		int firstCharCounter = 0;
		for (int x = 0; x < stIDHolder.size(); ++x)
		{
			stIDCharPlaceholder = stIDHolder.get(x).charAt(0);
			if (letterAvgOfStation == stIDCharPlaceholder)
			{
				++firstCharCounter;
			}
		}
		return firstCharCounter;
	}
	public ArrayList<String> stationsWithLetter()
	{
		for(int x = 0; x < stIDHolder.size(); ++x)
		{
			if (letterAvgOfStation == stIDHolder.get(x).charAt(0))
			{
				stIDLetterMatchHolder.add(stIDHolder.get(x));
			}
		}
		return stIDLetterMatchHolder;
	}
	
	public String toString()
	
	{
		ArrayList<String> stations = stationsWithLetter(); 
		String holder = "";
		for (int x = 0; x < stations.size(); ++x)
		{
			holder += stations.get(x)+ " ";
		}
		return "These stations are: " + holder;
	}
	
	

}
