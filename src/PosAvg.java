import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class PosAvg 
{
	ArrayList<String> stIDHolder = new ArrayList<String>();
	ArrayList<String> avgProximityHolder = new ArrayList<String>();

	
	String stID = "";
	public PosAvg(String station)
	{
		stID = station;
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
	public int indexOfStation() {
		int indexOfSTID = 0;
		for (int x = 0; x < stIDHolder.size(); ++x)
		{
			if (stID.equals(stIDHolder.get(x)))
			{
				indexOfSTID = x + 1;
			}
		}
		;
		return indexOfSTID;
	} 
	public ArrayList<String> stationsNearIndexStation()
	{
		
		int avgIndexOrginal = indexOfStation() - 1;
		if(( avgIndexOrginal != 0)&&(avgIndexOrginal != 1)&&(avgIndexOrginal != stIDHolder.size()- 1)&&(avgIndexOrginal != stIDHolder.size()- 2)) 
		{
			avgProximityHolder.add(stIDHolder.get(avgIndexOrginal - 2));
			avgProximityHolder.add(stIDHolder.get(avgIndexOrginal - 1));
			avgProximityHolder.add(stIDHolder.get(avgIndexOrginal + 1));
			avgProximityHolder.add(stIDHolder.get(avgIndexOrginal + 2));
			
		}
		else
		{
            System.exit(0); 

		}
		return avgProximityHolder;
	}
	public String toString()
	{
		ArrayList<String> stations = stationsNearIndexStation();
		String holder = "";
		for (int x = 0; x < stations.size(); ++x)
		{
			if (x == 0)
				holder += stations.get(x);
			if(x == 1)
				holder += " and " + stations.get(x);
			if (x==2)
				holder += ", " + stations.get(x);
			if (x == 3)
				holder += " and " + stations.get(x) + ", and so on.";
		}

		return "This index is average of  " + holder;
				
	}

}
