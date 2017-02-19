import org.junit.Test;
import static org.junit.Assert.*;
import java.util.ArrayList;

public class CityTest {

	@Test
	public void TestInside() {
		City city = new City();
		ArrayList<String> inside = new ArrayList<String>();
		inside.add("Presby");
		inside.add("Union");
		inside.add("Sennott");
		inside.add("Hillman");
		assertEquals(inside, city.getLocations());
	}
	
}
