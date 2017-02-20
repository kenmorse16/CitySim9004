
public class CitySim9004 {

	private int seed;
	
	public CitySim9004(int s){
		seed = s;
	}

	public Location[] createLocations() {
		Location Presby = new Location("Presby");
		Location Union = new Location("Union");
		Location Sennott = new Location("Sennott");
		Location Hillman = new Location("Hillman");
		Location Outside = new Location("Outside");
		Location[] locs = {Presby, Union, Sennott, Hillman, Outside};
		return locs;
	}
	//working later
	/*public boolean createCity(Location[] locs) {
		if(locs.length != 5) {
			return false;
		}
		Avenue forth = new Avenue(locs[0], locs[1], locs[4]);
		locs[0].addAvenue(forth);
		locs[1].addAvenue(forth);
		Avenue fifth = new Avenue(locs[3], locs[2], locs[4]);
		locs[2].addAvenue(fifth);
		locs[3].addAvenue(fifth);
		
		

		
	}*/
	
	public static void main(String[] args) {
		
		
	
	}
}