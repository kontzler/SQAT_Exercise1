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
	
	@Test
	public void add_frame(){
		 BowlingGame BowlingGame = new BowlingGame();
		 BowlingGame.addFrame(new Frame(1,2));
		 assertEquals("The frame wasn't implemented right",3,BowlingGame.score());
		 
	 }
	
	@Test
	public void frames_score_toohigh(){
		 BowlingGame BowlingGame = new BowlingGame();
		 BowlingGame.addFrame(new Frame(10,2));
		 assertEquals("The frame wasn't implemented right",12,BowlingGame.score());
		 
	 }
	
	@Test
	public void add_2frames(){
		BowlingGame BowlingGame = new BowlingGame();
		
		BowlingGame.addFrame(new Frame(9,0));
		BowlingGame.addFrame(new Frame(8,1));
		assertEquals("The frames didn't get implemented correctly",18, BowlingGame.score());
		
	}
	
	@Test
	public void strike_score_28(){
		BowlingGame BowlingGame= new BowlingGame();
		BowlingGame.addFrame(new Frame(10,0));
		BowlingGame.addFrame(new Frame(3,3));
		assertEquals("The score is not correctly calculated, should be 22",22,BowlingGame.score());
		
	}
	
	@Test
	public void bonus_score_strike_16(){
		BowlingGame BowlingGame= new BowlingGame();
		BowlingGame.addFrame(new Frame(0,0));//0
		BowlingGame.addFrame(new Frame(0,0));//1
		BowlingGame.addFrame(new Frame(0,0));//2
		BowlingGame.addFrame(new Frame(0,0));//3
		BowlingGame.addFrame(new Frame(0,0));//4
		BowlingGame.addFrame(new Frame(0,0));//5
		BowlingGame.addFrame(new Frame(0,0));//6
		BowlingGame.addFrame(new Frame(0,0));//7
		BowlingGame.addFrame(new Frame(0,0));//8
		BowlingGame.addFrame(new Frame(10,0));//9
		BowlingGame.setBonus(3,3);//bonus
		assertEquals("The score is not correctly calculated, should be 16",16,BowlingGame.score());}
	
	@Test
	public void bonus_score_spare_16(){
		BowlingGame BowlingGame= new BowlingGame();
		BowlingGame.addFrame(new Frame(0,0));//0
		BowlingGame.addFrame(new Frame(0,0));//1
		BowlingGame.addFrame(new Frame(0,0));//2
		BowlingGame.addFrame(new Frame(0,0));//3
		BowlingGame.addFrame(new Frame(0,0));//4
		BowlingGame.addFrame(new Frame(0,0));//5
		BowlingGame.addFrame(new Frame(0,0));//6
		BowlingGame.addFrame(new Frame(0,0));//7
		BowlingGame.addFrame(new Frame(0,0));//8
		BowlingGame.addFrame(new Frame(9,1));//9
		BowlingGame.setBonus(6,3);//bonus
		assertEquals("The score is not correctly calculated, should be 16",16,BowlingGame.score());}
	


	@Test
	public void Test_game_score133(){
		BowlingGame BowlingGame= new BowlingGame();
		BowlingGame.addFrame(new Frame(1,4));//0
		BowlingGame.addFrame(new Frame(4,5));//1
		BowlingGame.addFrame(new Frame(6,4));//2
		BowlingGame.addFrame(new Frame(5,5));//3
		BowlingGame.addFrame(new Frame(10,0));//4
		BowlingGame.addFrame(new Frame(0,1));//5
		BowlingGame.addFrame(new Frame(7,3));//6
		BowlingGame.addFrame(new Frame(6,4));//7
		BowlingGame.addFrame(new Frame(10,0));//8
		BowlingGame.addFrame(new Frame(2,8));//9
		BowlingGame.setBonus(6,0);//bonus
		assertEquals("The score is not correctly calculated, should be 133",133,BowlingGame.score());}}


	




