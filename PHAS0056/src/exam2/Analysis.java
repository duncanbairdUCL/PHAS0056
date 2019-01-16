package exam2;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.ArrayList;
import java.util.HashMap;

public class Analysis {

	/**
	 * Returns HashMap of locations from URL input
	 * 
	 * @param url
	 * @return airports
	 * @throws IOException
	 */
	public static HashMap<Integer, Location> locationsFromURL(String url) throws IOException {
		HashMap<Integer, Location> locations = new HashMap<Integer, Location>();
		URL u = new URL(url);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line = "";
		while ((line = br.readLine()) != null) {
			Location l = Location.parseLine(line);
			locations.put(l.getImageUUID(), l);
		}
		return locations;

	}

	public static ArrayList<Classification> classificationsFromURL(String url) throws IOException {
		ArrayList<Classification> classifications = new ArrayList<Classification>();
		URL u = new URL(url);
		InputStream is = u.openStream();
		InputStreamReader isr = new InputStreamReader(is);
		BufferedReader br = new BufferedReader(isr);
		String line = "";
		while ((line = br.readLine()) != null) {
			Classification c = Classification.parseLine(line);
			classifications.add(c);

		}
		return classifications;

	}

	public static HashMap<Integer, Integer> classificationFrequency(int limit, HashMap<Integer, Location> locations,
			ArrayList<Classification> classifications) {
		HashMap<Integer, Integer> classificationFrequency = new HashMap<Integer, Integer>();

		for (int i = 0; i < locations.size(); i++) {
			int j = 0;
			for (Classification classification : classifications) {

				if (classification.getImageUUID() == i) {
					j++;

				}
				if (j > limit) {
					classificationFrequency.put(i, j);
				}
			}
		}
		return classificationFrequency;
	}

}
