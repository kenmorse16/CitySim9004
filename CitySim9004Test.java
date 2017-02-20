import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.*;

public class CitySim9004Test {

	@Test
	//Tests that createLocations() returns 5 Locations
	public void TestCreateLocationsLength() {
		CitySim9004 c = new CitySim9004(0);
		Location[] loc = c.createLocations();
		assertEquals(5, loc.length);
	}
	
}