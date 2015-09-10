package roulette;

import util.ConsoleReader;

public class Bet_even_odd extends Bet {
	private String game_name;
	
	public Bet_even_odd(String description, int odds){
		super(description, odds);
	}
	
	public String bet_type(){
		result = ConsoleReader.promptOneOf("Please bet", "even", "odd");
        result = super.bet_type();
        return result;
	}
	
	public boolean win_loss(String betChoice, Wheel myWheel){
		return (myWheel.getNumber() % 2 == 0 && betChoice.equals("even")) ||
                (myWheel.getNumber() % 2 == 1 && betChoice.equals("odd"));
	}
	
	
	
	
	
	
	

}
