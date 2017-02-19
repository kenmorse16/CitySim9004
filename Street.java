public class Street{

	Location location1;
	Location location2;

	public Street(Location loc1, Location loc2) {
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
}