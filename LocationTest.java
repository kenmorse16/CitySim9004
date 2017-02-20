import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.*;

public class LocationTest {

	@Test
	//Tests that the name of the Location is given
	public void TestName() {
		Location newLoc = new Location("Name");
		assertEquals("Name", newLoc.getName());
	}
	
	@Test
	//Tests that getStreet() returns nothing if addStreet() isn't called
	public void TestGetStreetNull() {
		Location newLoc = new Location("Name");
		assertEquals(null, newLoc.getStreet());
	}
	
	@Test
	//Tests that getStreet() returns the Street added by addStreet()
	public void TestAddStreet() {
		Location newLoc = new Location("Name");
		Street mockS = Mockito.mock(Street.class);
		newLoc.addStreet(mockS);
		assertEquals(mockS, newLoc.getStreet());
	}
	
	@Test
	//Tests that moveStreet() returns a Location
	public void TestMoveStreet() {
		Location oldLoc = new Location("Name");
		Street mockS = Mockito.mock(Street.class);
		Location newLoc = new Location("Name2");
		Mockito.when(mockS.move(oldLoc)).thenReturn(newLoc);
		oldLoc.addStreet(mockS);
		assertEquals(newLoc, oldLoc.moveStreet());
	}
	
	@Test
	//Tests that moveStreet() returns null if no street is added
	public void TestNullStreet() {
		Location oldLoc = new Location("Name");
		assertEquals(null, oldLoc.moveStreet());
	}
	
	@Test
	//Tests that getAvenue() returns nothing if addAvenue() isn't called
	public void TestGetAvenueNull() {
		Location newLoc = new Location("Name");
		assertEquals(null, newLoc.getAvenue());
	}
	
	@Test
	//Tests that getAvenue() returns the Street added by addAvenue()
	public void TestAddAvenue() {
		Location newLoc = new Location("Name");
		Avenue mockA = Mockito.mock(Avenue.class);
		newLoc.addAvenue(mockA);
		assertEquals(mockA, newLoc.getAvenue());
	}
	
	@Test
	//Tests that moveAvenue() returns a Location
	public void TestMoveAvenue() {
		Location oldLoc = new Location("Name");
		Avenue mockA = Mockito.mock(Avenue.class);
		Location newLoc = new Location("Name2");
		Mockito.when(mockA.move(oldLoc)).thenReturn(newLoc);
		oldLoc.addAvenue(mockA);
		assertEquals(newLoc, oldLoc.moveAvenue());
	}
	
	@Test
	//Tests that moveAvenue() returns null if no avenue is added
	public void TestNullAvenue() {
		Location oldLoc = new Location("Name");
		assertEquals(null, oldLoc.moveAvenue());
	}
}