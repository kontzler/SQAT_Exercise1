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
		assertEquals("The score is not correct, expected 5", 5, frame.score());
		
		
	}
	@Test
	public void Spare_istrue() {
		Frame frame = new Frame(5,5);
		assertEquals("The spare is not correctly detected", true, frame.isSpare());
	}
	
	@Test
	public void Spare_isFalse() {
		Frame frame = new Frame(4,5);
		assertEquals("The shot is not spare but get detected as one", false, frame.isSpare());
	}

}
