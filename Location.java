public class Location {

	private String name;
	private Street street;
	private Avenue avenue;
	
	public Location(String n) {
		name = n;
		street = null;
		avenue = null;
	}
	
	public void addStreet(Street s) {
		street = s;
	}
	
	public Street getStreet() {
		return street;
	}
	
	public void addAvenue(Avenue a) {
		avenue = a;
	}
	
	public Avenue getAvenue() {
		return avenue;
	}
	
	public String getName() {
		return name;
	}
	
	public Location moveStreet() {
		if(street == null) {
			return null;
		}
		return street.move(this);
	}
	
	public Location moveAvenue() {
		if(avenue == null) {
			return null;
		}
		return avenue.move(this);
	}
}