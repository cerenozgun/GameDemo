package game;

public class Campaign {
int id;
String name;
String aboutCampaign;


public Campaign(int id, String name, String aboutCampaign) {
	
	this.id = id;
	this.name = name;
	this.aboutCampaign = aboutCampaign;
}


public int getId() {
	return id;
}


public void setId(int id) {
	this.id = id;
}


public String getName() {
	return name;
}


public void setName(String name) {
	this.name = name;
}


public String getAboutCampaign() {
	return aboutCampaign;
}


public void setAboutCampaign(String aboutCampaign) {
	this.aboutCampaign = aboutCampaign;
}
}
