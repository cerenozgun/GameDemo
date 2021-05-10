package game;

public class Gamer {
	int id;
	String gamerName;
	String gamerLastName;
	String nationalIdentity;
	public Gamer(int id, String gamerName, String gamerLastName, String nationalIdentity) {
		super();
		this.id = id;
		this.gamerName = gamerName;
		this.gamerLastName = gamerLastName;
		this.nationalIdentity = nationalIdentity;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getGamerName() {
		return gamerName;
	}
	public void setGamerName(String gamerName) {
		this.gamerName = gamerName;
	}
	public String getGamerLastName() {
		return gamerLastName;
	}
	public void setGamerLastName(String gamerLastName) {
		this.gamerLastName = gamerLastName;
	}
	public String getNationalIdentity() {
		return nationalIdentity;
	}
	public void setNationalIdentity(String nationalIdentity) {
		this.nationalIdentity = nationalIdentity;
	}
	

}
