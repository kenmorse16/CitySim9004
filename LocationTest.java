import org.junit.Test;
import static org.junit.Assert.*;

public class LocationTest {

	@Test
	public void TestName() {
		Location newLoc = new Location("Name");
		assertEquals("Name", newLoc.getName());
	}
	
}