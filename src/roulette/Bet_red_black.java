package roulette;

import util.ConsoleReader;

public class Bet_red_black extends Bet {

	public Bet_red_black(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	public String bet_type(){
        result = ConsoleReader.promptOneOf("Please bet", Wheel.BLACK, Wheel.RED);
        result = super.bet_type();
        return result;
	}
	
	public boolean win_loss(String betChoice, Wheel myWheel){
		return myWheel.getColor().equals(betChoice);
	}

}
