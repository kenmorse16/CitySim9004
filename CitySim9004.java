import java.util.Random;

public class CitySim9004 {

	Random rand;
	
	public CitySim9004(long s){
		rand = new Random(s);
	}

	public int randomNum(int max) {
		int answer = rand.nextInt(max);
		return answer;
	}
	
	public Location[] createLocations() {
		Location Presby = new Location("Presby");
		Location Union = new Location("Union");
		Location Sennott = new Location("Sennott");
		Location Hillman = new Location("Hillman");
		Location Outside = new Location("Outside City");
		Location[] locs = {Presby, Union, Sennott, Hillman, Outside};
		return locs;
	}
	
	public boolean connectStreet(Street s, Location one, Location two) {
		one.addStreet(s);
		two.addStreet(s);
		return(one.getStreet().equals(two.getStreet()));
	}
	
	public boolean connectAvenue(Avenue a, Location one, Location two) {
		one.addAvenue(a);
		two.addAvenue(a);
		return(one.getAvenue().equals(two.getAvenue()));
	}

	public String specialMessage(int num) {
		if(num == 0) {
			return "That student missed out!\n";
		}
		else if(num >= 3) {
			return "That driver needed lots of CS help!\n";
		}
		else {
			return "";
		}
	}
	public static void main(String[] args) {
		long seed = Long.parseLong(args[0]);
		
		CitySim9004 c = new CitySim9004(seed);
		
		Location[] locations = c.createLocations();
		
		Street Bill = new Street("Bill St.", locations[0], locations[2]);
		c.connectStreet(Bill, locations[0], locations[2]);
		Street Phil = new Street("Phil St.", locations[1], locations[3]);
		c.connectStreet(Phil, locations[1], locations[3]);
		
		Avenue Forth = new Avenue("Forth Ave.", locations[0], locations[1], locations[4]);
		c.connectAvenue(Forth, locations[0], locations[1]);
		Avenue Fifth = new Avenue("Fifth Ave.", locations[3], locations[2], locations[4]);
		c.connectAvenue(Fifth, locations[3], locations[2]);
		
		for(int i = 1; i < 6; i++) {
			Location current = locations[c.randomNum(4)];
			Car car = new Car(i, current);
			Location next;
			Avenue currAve = current.getAvenue();
			while(!(current.equals(locations[4]))) {
				int decision = c.randomNum(2);
				String road = "";
				if(current.getName().equals("Sennott")) {
					car.passSennott();
				}
				if(decision == 0) {
					next = current.moveAvenue();
					car.updateLocation(next);
					road = currAve.getName();
				} else {
					next = current.moveStreet();
					car.updateLocation(next);
					road = current.getStreet().getName();
					currAve = next.getAvenue();
				}
				System.out.println("Driver " + car.getNum() + " heading from " + current.getName() + " to " + next.getName() + " via " + road);
				current = next;
			}
			if(currAve.equals(Forth)) {
				System.out.println("Driver " + car.getNum() + " has gone to Philadelphia!");
			} else {
				System.out.println("Driver " + car.getNum() + " has gone to Cleveland!");
			}
			
			System.out.println("Driver " + car.getNum() + " met with Professor Laboon " + car.getVisits() + " time(s).");
			System.out.print(c.specialMessage(car.getVisits()));
			System.out.println("-----");
		}
	}
}