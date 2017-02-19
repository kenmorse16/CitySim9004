import java.util.ArrayList;

public class City {

	private ArrayList<String> locations;
	
	public City() {
		locations = new ArrayList<String>();
		locations.add("Presby");
		locations.add("Union");
		locations.add("Sennott");
		locations.add("Hillman");
	}
	
	public ArrayList<String> getLocations() {
		return locations;
	}
}