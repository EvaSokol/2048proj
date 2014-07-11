import org.junit.Test;

public class KeyboardTest extends ActionTest {
	
	@Test
	public void mainTest() {
		moveKeys();
		checkRecord();
		startGame();
		moveKeys();
		checkRecord();
	}

}
