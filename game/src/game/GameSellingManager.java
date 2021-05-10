package game;

public class GameSellingManager {
public void sellGame(Gamer gamer, Game game, Campaign campaign) {
		
		System.out.println("campaign: "  + campaign.getName() + "Id no :" + campaign.getId());
		System.out.println("game: "   + game.getName() +"Id no :" + game.getId());
		System.out.println("gamer: "  +gamer.getGamerName() + gamer.getGamerLastName());
	}
}

