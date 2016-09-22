import static org.junit.Assert.*;

import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
	@Test
	public void Score_firstthrow1_secondthrow4() {
		//BowlingGame BowlingGame =new BowlingGame();
		Frame frame =new Frame(1, 4);
		assertEquals("The socre is not correct, expected 5", 5, frame.score());
		
		
	}
}
