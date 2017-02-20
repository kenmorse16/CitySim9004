import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.*;

public class CitySim9004Test {

	@Test
	//Tests that createLocations() returns 5 Locations
	public void TestCreateLocations() {
		CitySim9004 c = new CitySim9004(0);
		Location[] loc = c.createLocations();
		assertEquals(5, loc.length);
	}
	
	@Test
	//Random should return 0 if given a max of 1
	public void TestRand1() {
		CitySim9004 c = new CitySim9004(0);
		assertEquals(0, c.randomNum(1));
	}
	@Test
	//Tests that Locations attach Street
	public void TestConnectStreet() {
		CitySim9004 c = new CitySim9004(0);
		Location mock1 = Mockito.mock(Location.class);
		Location mock2 = Mockito.mock(Location.class);
		Street mockS = Mockito.mock(Street.class);
		Mockito.doNothing().when(mock1).addStreet(mockS);
		Mockito.doNothing().when(mock2).addStreet(mockS);
		Mockito.when(mock1.getStreet()).thenReturn(mockS);
		Mockito.when(mock2.getStreet()).thenReturn(mockS);
		assertTrue(c.connectStreet(mockS, mock1, mock2));
	}
	
	@Test
	//Tests that Locations attach Avenue
	public void TestConnectAvenue() {
		CitySim9004 c = new CitySim9004(0);
		Location mock1 = Mockito.mock(Location.class);
		Location mock2 = Mockito.mock(Location.class);
		Avenue mockA = Mockito.mock(Avenue.class);
		Mockito.doNothing().when(mock1).addAvenue(mockA);
		Mockito.doNothing().when(mock2).addAvenue(mockA);
		Mockito.when(mock1.getAvenue()).thenReturn(mockA);
		Mockito.when(mock2.getAvenue()).thenReturn(mockA);
		assertTrue(c.connectAvenue(mockA, mock1, mock2));
	}
	
	@Test
	//Test the 0 option for specialMessage
	public void TestSpecialMessage0() {
		CitySim9004 c = new CitySim9004(0);
		String zeroMessage = "That student missed out!\n";
		assertEquals(zeroMessage, c.specialMessage(0));
	}
	
	@Test
	//Test the >= 3 option for special Message
	public void TestSpecialMessge10() {
		CitySim9004 c = new CitySim9004(0);
		String lotMessage = "That driver needed lots of CS help!\n";
		assertEquals(lotMessage, c.specialMessage(10));
	}
	
	@Test
	//Test the normal option for special Message
	public void TestNoMessage() {
		CitySim9004 c = new CitySim9004(0);
		String noMessage = "";
		assertEquals(noMessage, c.specialMessage(1));
	}
	
}