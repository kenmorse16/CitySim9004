public class Car {

	private int number;
	private Location location;
	private int SennottVisits;
	
	public Car(int num, Location loc) {
		number = num;
		location = loc;
		SennottVisits = 0;
	}
	
	//returns number of car
	public int getNum() {
		return number;
	}
	
	public void updateLocation(Location newLoc) {
		location = newLoc;
	}
	
	//returns location of car
	public Location getLocation() {
		return location;
	}
	
	//increments the number of SennottVisits
	public void passSennott() {
		SennottVisits++;
	}
	
	//returns SennottVisits
	public int getVisits() {
		return SennottVisits;
	}
}