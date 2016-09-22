import java.util.ArrayList;
import java.util.List;

//Finish time: 16:25
//ID: 125

public class BowlingGame {
	//a bowling game is made of (at least) 10 frames
	private List<Frame> frames = new ArrayList<Frame>();
	private Frame bonus= new Frame(0,0);
	
	public BowlingGame(){}
	
	// adds a frame to the game
	public void addFrame(Frame frame){
		frames.add(frame);
	}
	
	// Sets the bonus throws at the end of the game
	public void setBonus(int firstThrow, int secondThrow) {
		if(frames.get(9).isSpare()) bonus= new Frame(firstThrow, 0);
		else 
			if(frames.get(9).isStrike()) bonus = new Frame(firstThrow,secondThrow);
			else bonus = new Frame (0,0);
	}
	
	// Returns the game score
	public int score() {
		int score = 0;
		int i =0;
		for(i=0;i<frames.size();i++){
			if(i>0&&frames.get(i-1).isStrike())score=score+frames.get(i).score();
			if(i>0&&frames.get(i-1).isSpare())score=score+frames.get(i).getFirstThrow();
			score=frames.get(i).score()+score;	
		}
		return score+bonus.score();
	}
}
