public class Car {

	private int number;
	private Location location;
	private int SennottVisits;
	
	public Car(int num, Location loc) {
		number = num;
		location = loc;
		SennottVisits = 0;
	}
	
	public int getNum() {
		return number;
	}
	
	public Location getLocation() {
		return location;
	}
	
	public void passSennott() {
		SennottVisits++;
	}
	
	public int getVisits() {
		return SennottVisits;
	}
}