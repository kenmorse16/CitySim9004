import org.junit.Test;
import static org.junit.Assert.*;

import org.mockito.*;

public class CarTest {

	@Test
	//Tests that the getNum() method of Car works properly
	public void TestCarNum() {
		Location mockLocation = Mockito.mock(Location.class);
		Car c = new Car(1,mockLocation);
		assertEquals(1,c.getNum());
	}
	
	@Test
	//Tests that the getLocation() method of Car works properly
	public void TestCarLocation() {
		Location mockLocation = Mockito.mock(Location.class);
		Car c = new Car(1,mockLocation);
		assertEquals(mockLocation,c.getLocation());
	}
	
	@Test
	//Tests the updateLocation() method changes the Location
	public void TestCarUpdate() {
		Location oldLoc = Mockito.mock(Location.class);
		Car c = new Car(1,oldLoc);
		Location newLoc = Mockito.mock(Location.class);
		c.updateLocation(newLoc);
		assertEquals(newLoc,c.getLocation());
	}
	
	@Test
	//Tests that getVisits() returns a 0 if passSennott() hasn't been called
	public void TestCarVisits0() {
		Location mockLocation = Mockito.mock(Location.class);
		Car c = new Car(1,mockLocation);
		assertEquals(0,c.getVisits());
	}
	
	@Test
	//Tests that passSennott() correctly increments five times
	public void TestCarVisits5() {
		Location mockLocation = Mockito.mock(Location.class);
		Car c = new Car(1,mockLocation);
		for(int i = 0; i < 5; i++) {
			c.passSennott();
		}
		assertEquals(5,c.getVisits());
	}
}