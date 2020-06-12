package io.tarcaye.remote.mob.shodo.trivia.runner.trivia.ugly;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Game {
    private static final int MAX_PLAYERS = 6;
    
    List<String> players = new ArrayList<>();
    
    int[] places = new int[MAX_PLAYERS];
    
    int[] purses  = new int[MAX_PLAYERS];
    
    boolean[] inPenaltyBox  = new boolean[MAX_PLAYERS];
    
    List<String> popQuestions;
    
    List<String> scienceQuestions;
    
    List<String> sportsQuestions;
    
    List<String> rockQuestions;
    
    int currentPlayer = 0;
    
    boolean isGettingOutOfPenaltyBox;
    
    private Game(List<String> popQuestions, List<String> scienceQuestions, List<String> sportsQuestions, List<String> rockQuestions){
		this.popQuestions = popQuestions;
		this.scienceQuestions = scienceQuestions;
		this.sportsQuestions = sportsQuestions;
		this.rockQuestions = rockQuestions;
	}
    
    public static Game createGame(List<String> players){
		LinkedList<String> popQuestions = new LinkedList<>();
		LinkedList<String> scienceQuestions = new LinkedList<>();
		LinkedList<String> sportsQuestions = new LinkedList<>();
		LinkedList<String> rockQuestions = new LinkedList<>();
		for (int i = 0; i < 50; i++) {
			popQuestions.add("Pop Question " + i);
			scienceQuestions.add(("Science Question " + i));
			sportsQuestions.add(("Sports Question " + i));
			rockQuestions.add("Rock Question " + i);
		}

		Game game = new Game(popQuestions, scienceQuestions, sportsQuestions, rockQuestions);
        players.forEach(game::add);
        return game;
    }

	public boolean isPlayable() {
		return (howManyPlayers() >= 2);
	}

	public void add(String playerName) {
		
	    players.add(playerName);
	    places[howManyPlayers()] = 0;
	    purses[howManyPlayers()] = 0;
	    inPenaltyBox[howManyPlayers()] = false;
	    
	    System.out.println(playerName + " was added");
	    System.out.println("They are player number " + players.size());
	}
	
	public int howManyPlayers() {
		return players.size();
	}

	public void roll(int roll) {
		System.out.println(players.get(currentPlayer) + " is the current player");
		System.out.println("They have rolled a " + roll);
		
		if (inPenaltyBox[currentPlayer]) {
			if (roll % 2 != 0) {
				isGettingOutOfPenaltyBox = true;
				
				System.out.println(players.get(currentPlayer) + " is getting out of the penalty box");
				places[currentPlayer] = places[currentPlayer] + roll;
				if (places[currentPlayer] > 11) places[currentPlayer] = places[currentPlayer] - 12;
				
				System.out.println(players.get(currentPlayer) 
						+ "'s new location is " 
						+ places[currentPlayer]);
				System.out.println("The category is " + currentCategory());
				askQuestion();
			} else {
				System.out.println(players.get(currentPlayer) + " is not getting out of the penalty box");
				isGettingOutOfPenaltyBox = false;
				}
			
		} else {
		
			places[currentPlayer] = places[currentPlayer] + roll;
			if (places[currentPlayer] > 11) places[currentPlayer] = places[currentPlayer] - 12;
			
			System.out.println(players.get(currentPlayer) 
					+ "'s new location is " 
					+ places[currentPlayer]);
			System.out.println("The category is " + currentCategory());
			askQuestion();
		}
		
	}

	private void askQuestion() {
		if (currentCategory() == "Pop")
			System.out.println(popQuestions.remove(0));
		if (currentCategory() == "Science")
			System.out.println(scienceQuestions.remove(0));
		if (currentCategory() == "Sports")
			System.out.println(sportsQuestions.remove(0));
		if (currentCategory() == "Rock")
			System.out.println(rockQuestions.remove(0));		
	}
	
	
	private String currentCategory() {
		if (places[currentPlayer] == 0) return "Pop";
		if (places[currentPlayer] == 4) return "Pop";
		if (places[currentPlayer] == 8) return "Pop";
		if (places[currentPlayer] == 1) return "Science";
		if (places[currentPlayer] == 5) return "Science";
		if (places[currentPlayer] == 9) return "Science";
		if (places[currentPlayer] == 2) return "Sports";
		if (places[currentPlayer] == 6) return "Sports";
		if (places[currentPlayer] == 10) return "Sports";
		return "Rock";
	}

	public boolean wasCorrectlyAnswered() {
		if (inPenaltyBox[currentPlayer]){
			if (isGettingOutOfPenaltyBox) {
				System.out.println("Answer was correct!!!!");
				purses[currentPlayer]++;
				System.out.println(players.get(currentPlayer) 
						+ " now has "
						+ purses[currentPlayer]
						+ " Gold Coins.");
				
				boolean winner = didPlayerWin();
				currentPlayer++;
				if (currentPlayer == players.size()) currentPlayer = 0;
				
				return winner;
			} else {
				currentPlayer++;
				if (currentPlayer == players.size()) currentPlayer = 0;
				return true;
			}
			
			
			
		} else {
		
			System.out.println("Answer was corrent!!!!");
			purses[currentPlayer]++;
			System.out.println(players.get(currentPlayer) 
					+ " now has "
					+ purses[currentPlayer]
					+ " Gold Coins.");
			
			boolean winner = didPlayerWin();
			currentPlayer++;
			if (currentPlayer == players.size()) currentPlayer = 0;
			
			return winner;
		}
	}
	
	public boolean wrongAnswer(){
		System.out.println("Question was incorrectly answered");
		System.out.println(players.get(currentPlayer)+ " was sent to the penalty box");
		inPenaltyBox[currentPlayer] = true;
		
		currentPlayer++;
		if (currentPlayer == players.size()) currentPlayer = 0;
		return true;
	}


	private boolean didPlayerWin() {
		return !(purses[currentPlayer] == 6);
	}
}
