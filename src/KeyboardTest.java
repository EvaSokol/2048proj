import static org.junit.Assert.*;

import org.junit.Test;

public class KeyboardTest {

	@Test
	public void test1() {
		start.open();
		start.keyUp();
		start.keyDown();
		start.keyLeft();
		start.keyRight();
	}

}
