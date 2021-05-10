package game;

public class GamerManager implements GamerService {

	@Override
	public void add(Gamer gamer) {
	 System.out.println("Gamer"+gamer.getGamerName() + gamer.getGamerLastName()+" added.");
	}

	@Override
	public void update(Gamer gamer) {
		System.out.println("Gamer" + gamer.getGamerName() + gamer.getGamerLastName()+" updated.");
	
		
	}

	@Override
	public void delete(Gamer gamer) {
		System.out.println("Gamer" + gamer.getGamerName() + gamer.getGamerLastName()+" deleted.");
		
	}

	
}
