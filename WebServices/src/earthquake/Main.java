package earthquake;

import java.util.*;
import java.text.*;
import java.net.*;
import java.io.*;
import javax.xml.parsers.*;
import org.w3c.dom.*;
import org.xml.sax.SAXException;

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
        ArrayList<Data> earthquakes = new ArrayList<Data>();
        
        try {
			URL quakeurl = new URL(url); //ref to url
			URLConnection connect = quakeurl.openConnection(); //connect to url
			HttpURLConnection httpcon = (HttpURLConnection) connect; //treat connection as http
			
			int respcode = httpcon.getResponseCode();
			if (respcode == HttpURLConnection.HTTP_OK) {
				InputStream instr = httpcon.getInputStream();
				
				DocumentBuilderFactory docbuildfac = DocumentBuilderFactory.newInstance();
				DocumentBuilder docbuild = docbuildfac.newDocumentBuilder();
				
				Document dom = docbuild.parse(instr); //parse xml
				Element docele = dom.getDocumentElement();
				
				NodeList nl = docele.getElementsByTagName("entry"); //get all earthquakes
				if (nl != null && nl.getLength() > 0) {
					//iterate over all entries/earthquakes
					for (int i = 0; i < nl.getLength(); i++) {
						Element entry = (Element) nl.item(i);
                        Element title = (Element) entry.getElementsByTagName("title").item(0);
                        Element g = (Element) entry.getElementsByTagName("georss:point").item(0); //coordinates/location
                        Element when = (Element) entry.getElementsByTagName("updated").item(0); //date
                        Element link = (Element) entry.getElementsByTagName("link").item(0);
                        String details = title.getFirstChild().getNodeValue();
                        String hostname = "http://earthquake.usgs.gov";
                        String linkString = hostname + link.getAttribute("href");

                        String point = g.getFirstChild().getNodeValue();
                        String dt = when.getFirstChild().getNodeValue();
                        SimpleDateFormat sdformat = new SimpleDateFormat("yyyy-MM-dd'T'hh:mm:ss.SSS'Z'");
                        Date qdate = new GregorianCalendar(0, 0, 0).getTime();
                        qdate = sdformat.parse(dt);

                        String[] locationPair = point.split(" ");
                        String location = "Lat: " + locationPair[0] + " Lng: " + locationPair[1];

                        String magnitudeString = details.split(" ")[1];
                        double magnitude = Double.parseDouble(magnitudeString);

                        details = details.split("-")[1].trim();

                        //put all the earthquake info into a Data structure
                        Data quake = new Data(qdate, details, location, magnitude, linkString);

                        //add the quake to the ArrayList Data
                        earthquakes.add(quake);
					}
				}
			}
		}
        catch (MalformedURLException e) {
			System.out.printf("%s", e);
		}
        catch (IOException e) {
        	System.out.printf("%s", e);
        }
        catch (ParserConfigurationException e) {
        	System.out.printf("%s", e);
        }
        catch (SAXException e) {
        	System.out.printf("%s", e);
        }
        catch (ParseException e) {
        	System.out.printf("%s", e);
        }
        
        return earthquakes;
    }
}
