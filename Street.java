public class Street{

	String name;
	Location location1;
	Location location2;

	public Street(String n, Location loc1, Location loc2) {
		name = n;
		location1 = loc1;
		location2 = loc2;
	}

	public Location move(Location old) {
		if(old.equals(location1)) {
			return location2;
		}
		else if(old.equals(location2)) {
			return location1;
		}
		return null;
	}
	
	public Location[] getLocations() {
		Location[] locs = {location1, location2};
		return locs;
	}
	
	public String getName() {
		return name;
	}
}