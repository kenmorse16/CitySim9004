public class Avenue {
	
	String name;
	Location location1;
	Location location2;
	Location outside;

	public Avenue(String n, Location loc1, Location loc2, Location o) {
		name = n;
		location1 = loc1;
		location2 = loc2;
		outside = o;
	}
	
	public Location move(Location old) {
		if(old.equals(location1)) {
			return location2;
		}
		else if(old.equals(location2)) {
			return outside;
		}
		return null;
	}
	
	public Location[] getLocations() {
		Location[] locs = {location1, location2, outside};
		return locs;
	}
	
	public String getName() {
		return name;
	}
}