package roulette;

import util.ConsoleReader;

public class Bet_consecutive extends Bet {

	public Bet_consecutive(String description, int odds) {
		super(description, odds);
		// TODO Auto-generated constructor stub
	}
	
	
	public String bet_type(){
		result = "" + ConsoleReader.promptRange("Enter first of three consecutive numbers",
                1, Wheel.NUM_SPOTS - 3);
        result = super.bet_type();
        return result;
	}
	
	public boolean win_loss(String betChoice, Wheel myWheel){
		 int start = Integer.parseInt(betChoice);
         return (start <= myWheel.getNumber() && myWheel.getNumber() < start + 3);
	}
	
	

}
