public class Avenue {
	
	Location location1;
	Location location2;
	Location outside;

	public Avenue(Location loc1, Location loc2, Location o) {
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
}