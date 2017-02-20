import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.*;

public class AvenueTest {
	
	@Test
	//Tests that move() moves from first Location to the second
	public void TestMove() {
		Location oldLoc = Mockito.mock(Location.class);
		Location newLoc = Mockito.mock(Location.class);
		Location outside = Mockito.mock(Location.class);
		Avenue avenue = new Avenue(oldLoc, newLoc, outside);
		assertEquals(newLoc, avenue.move(oldLoc));
	}
	
	@Test
	//Tests that calling move() returns outside
	public void TestMoveDouble() {
		Location oldLoc = Mockito.mock(Location.class);
		Location newLoc = Mockito.mock(Location.class);
		Location outside = Mockito.mock(Location.class);
		Avenue avenue = new Avenue(oldLoc, newLoc, outside);
		assertEquals(outside, avenue.move(avenue.move(oldLoc)));
	}
	
	@Test
	//Tests that calling move() with any other location returns null
	public void TestMoveNull() {
		Location oldLoc = Mockito.mock(Location.class);
		Location newLoc = Mockito.mock(Location.class);
		Location outside = Mockito.mock(Location.class);
		Avenue avenue = new Avenue(oldLoc, newLoc, outside);
		assertEquals(null, avenue.move(outside));
	}
}