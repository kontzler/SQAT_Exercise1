public class Frame extends BowlingException{

	private int firstThrow;
	private int secondThrow;
	
	public Frame(int firstThrow, int secondThrow){
		this.firstThrow = firstThrow;
		this.secondThrow = secondThrow;
	}
	
	public int getFirstThrow() {
		return firstThrow;
	}

	public int getSecondThrow() {
		return secondThrow;
	}

	//returns the score of a single frame
	public int score() {
		if (this.firstThrow+this.secondThrow>10)return 10;
		if (this.isStrike()==true)return 10;
		if (this.isSpare()==true)return 10;
		return this.firstThrow+this.secondThrow;
	}

	//returns whether the frame is a strike or not
	public boolean isStrike(){
		if(this.firstThrow==10)return true;
		return false;
	}
	
	//return whether a frame is a spare or not
	public boolean isSpare(){
		if (this.firstThrow+this.secondThrow==10&&this.firstThrow!=10)return true;
		return false;
	}
}
