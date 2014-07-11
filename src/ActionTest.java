import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class ActionTest {

	public ActionTest() {
		super();
	}

	@Before
	public void openBrowser() {
		start.open();
		
	}
	
//	@Test
	public void moveKeys() {
		start.keyUp();
		start.keyDown();
		start.keyLeft();
		start.keyRight();
	}

//	@Test
	public void getResult() {
		actions.getResult();
	}

//	@Test
	public void getBest() {
		actions.getBest();
	}

//	@Test
	public void assertResultBest() {
		assertEquals(actions.getBest(), actions.getResult());
	}

//	@Test
	public void checkRecord() {
		actions.isNewRecord();
	}

//	@Test
	public void startGame() {
		actions.newGame();
	}

	@After
	public void finish() {
		start.driver.quit();
	}

}