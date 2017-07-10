package earthquake;

import java.util.*;
import java.text.*;


public class Main {
	//display information about earthquakes
	public static void main(String[] args) {
        ArrayList<Data> earthquakes = getQuakes("https://earthquake.usgs.gov/earthquakes/feed/v1.0/summary/significant_month.atom");

        System.out.println("Significant Earthquakes of the Month");
        SimpleDateFormat df = new SimpleDateFormat("HH:MM");
        System.out.printf("%s\t%-25s\t%s\t%s\n","WHEN","COORDINATES", "MAGNITUDE","DETAILS");
        
        for (Data q : earthquakes)
        {
            System.out.printf("%s\t%-25s\t%f\t%s\n", df.format(q.getDate()),q.getLocation(),q.getMagnitude(),q.getDetails()  );
        }
    }
	
	//method to return ArrayList of earthquakes using URL input argument
	public static ArrayList<Data> getQuakes(String url) {
        ArrayList<Data> quakes = new ArrayList<Data>();
        return quakes;
    }
}
