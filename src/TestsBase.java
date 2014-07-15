import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

public class TestsBase {

	public TestsBase() {
		super();
	}

	@Before
	public void openBrowser() {
		start.open();
		
	}
	
	public void moveKeysOnce() {
		actions.moveKeysOnce();
	}
	
	public void playGame() {
		actions.playGame();
	}
	
	public void getResult() {
		pobj.getResult();
	}

	public void getBest() {
		pobj.getBest();
	}

	public void assertResultBest() {
		assertEquals(pobj.getBest(), pobj.getResult());
	}

	public void checkRecord() {
		actions.isNewRecord();
	}

	public void startGame() {
		actions.newGame();
	}

	@After
	public void finish() {
		start.finish();
	}

}