import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.*;

public class StreetTest {

	@Test
	//Test that move() gives us a new location
	public void TestMove() {
		Location oldLoc = Mockito.mock(Location.class);
		Location newLoc = Mockito.mock(Location.class);
		Street street = new Street(oldLoc, newLoc);
		assertEquals(newLoc, street.move(oldLoc));
	}
	
	//Test that using move() twice returns original position 
	public void TestDoubleMove() {
		Location oldLoc = Mockito.mock(Location.class);
		Location newLoc = Mockito.mock(Location.class);
		Street street = new Street(oldLoc, newLoc);
		assertEquals(oldLoc, street.move(street.move(oldLoc)));
	}
	
	@Test
	//Test that move() returns null if invalid location is given
	public void TestMoveNull() {
		Location oldLoc = Mockito.mock(Location.class);
		Location newLoc = Mockito.mock(Location.class);
		Location thirdLoc = Mockito.mock(Location.class);
		Street street = new Street(oldLoc, newLoc);
		assertEquals(null, street.move(thirdLoc));
	}
	
	@Test
	//Tests that getLocations returns the correct Locations
	public void TestGetLocations() {
		Location oldLoc = Mockito.mock(Location.class);
		Location newLoc = Mockito.mock(Location.class);
		Street street = new Street(oldLoc, newLoc);
		Location[] testArr = {oldLoc, newLoc};
		assertArrayEquals(testArr, street.getLocations());
	}
}