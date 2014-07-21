import org.junit.Test;

public class BotTests extends TestsBase {
	
	@Test
	public void baseSimpleKeysTest() {
		startGame();
		moveKeysOnce();
		checkRecord();
		startGame();
		moveKeysOnce();
		checkRecord();
	}
	
	@Test
	public void randomMovesTest() {
		startGame();
		playGame();
		checkRecord();
		startGame();
		playGame();
		checkRecord();
	}
	
}
