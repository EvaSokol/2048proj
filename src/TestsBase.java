import static org.junit.Assert.assertEquals;

import org.junit.After;
import org.junit.Before;

public class TestsBase {

	public TestsBase() {
		super();
	}

	@Before
	public void openBrowser() {
		Start.open();
		
	}
	
	public void moveKeysOnce() {
		Actions.moveKeysOnce();
	}
	
	public void playGame() {
		Actions.playGame();
	}
	
	public void getResult() {
		Pobj.getResult();
	}

	public void getBest() {
		Pobj.getBest();
	}

	public void assertResultBest() {
		assertEquals(Pobj.getBest(), Pobj.getResult());
	}

	public void checkRecord() {
		Actions.isNewRecord();
	}

	public void startGame() {
		Actions.newGame();
	}

	@After
	public void finish() {
		Start.finish();
	}

}