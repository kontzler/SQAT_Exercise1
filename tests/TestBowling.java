import static org.junit.Assert.*;



import org.junit.Test;

public class TestBowling {

	@Test
	public void test() {
		fail("Not yet implemented");
	}

	
	@Test
	public void Score_firstthrow1_secondthrow4() {;
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
	@Test
	public void Strike_istrue() {
		Frame frame = new Frame(10,0);
		assertEquals("The strike is not correctly detected", true, frame.isStrike());
	}
	@Test
	public void Strike_isFalse() {
		Frame frame = new Frame(4,1);
		assertEquals("The shot is not a strike but get detected as one", false, frame.isStrike());
	}
	 public void add_frame(){
		 BowlingGame BowlingGame = new BowlingGame();
		 BowlingGame.addFrame(new Frame(1,2));
		 assertEquals("The frame wasn't implemented right",3,BowlingGame.score());
		 
	 }
	
	
	@Test
	public void add_2frames(){
		BowlingGame BowlingGame = new BowlingGame();
		
		BowlingGame.addFrame(new Frame(9,0));
		BowlingGame.addFrame(new Frame(8,1));
		System.out.print(BowlingGame.score());
		assertEquals("The frames didn't get implemented correctly",18, BowlingGame.score());
		
	}

}
