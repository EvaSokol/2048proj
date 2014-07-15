import org.junit.Test;

public class BotTests extends TestsBase {
	
	@Test
	public void BaseSimpleKeysTest() {
		startGame();
		moveKeysOnce();
		checkRecord();
		startGame();
		moveKeysOnce();
		checkRecord();
	}
	
	@Test
	public void RandomMovesTest() {
		startGame();
		playGame();
		checkRecord();
		startGame();
		playGame();
		checkRecord();
	}

	@Test
	public void resultTest() {
		
	}
}
