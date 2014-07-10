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
	
	@Test
	public void test2() {
		actions.getResult();
	}
	
	@Test
	public void test3() {
		actions.getBest();
	}
	
	@Test
	public void test4() {
		assertEquals(actions.getBest(), actions.getResult());
	}
	
	@Test
	public void test9() {
		start.driver.quit();
	}

}
