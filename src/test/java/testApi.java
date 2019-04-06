import org.junit.Before;
import org.junit.jupiter.api.Test;

import static net.sourceforge.jwebunit.junit.JWebUnit.*;

public class testApi {

	@Before
	public void prepare() {
//		setBaseUrl("http://google.com");
	}

	@Test
	public void test1() {
		beginAt("http://google.com");
		assertTextPresent("I'm Feeling Lucky");
		assertTitleEquals("Google");
	}
}