package game;

public class Main {

	public static void main(String[] args) {

 Gamer gamer= new Gamer (1," Ceren"," Özgün ","15496523654");
 Game game = new Game(1," Crossword ");
 Campaign campaign = new Campaign (1," Legend Campaign "," 50% discounted ");


	
 GamerManager gamerManager = new GamerManager();
 
 gamerManager.add(gamer);
 
 GameSellingManager gameSellingManager = new GameSellingManager();
	gameSellingManager.sellGame(gamer,game,campaign);
	}

}
