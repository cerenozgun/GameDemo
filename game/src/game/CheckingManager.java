package game;

public class CheckingManager implements CheckingService{

	@Override
	public boolean checkIfRealPerson(Gamer gamer) {
		System.out.println("Gamer" + gamer.getGamerName() + gamer.getGamerLastName()+" verified successfully.");
		return false;
	}

	
}
