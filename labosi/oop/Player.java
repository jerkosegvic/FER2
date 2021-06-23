package tomin_labos;


import java.util.Comparator;

class Player implements Comparable<Player>{
	
	public int rating;
	public String lastName;
	public String firstName;
	public String playerID;
	
	public Player(String ime, String prezime, String pID, int r) {
		this.firstName = ime;
		this.lastName = prezime;
		this.playerID = pID;
		this.rating = r;
	}
	
	public int getRating() {
		return this.rating;
	}
	
	public String getLastName() {
		return this.lastName;
	}
	
	public String getFirstName() {
		return this.firstName;
	}
	
	public String getPlayerID() {
		return this.playerID;
	}

	@Override
	public int hashCode() {
		return this.playerID.hashCode();
	}
	
	@Override
	public boolean equals(Object obj) {
		if(!(obj instanceof Player)) return false;
		Player other = (Player) obj;
		return this.playerID.equals(other.playerID);
	}
   
   @Override
      public int compareTo(Player other){
      	return this.playerID.compareTo(other.playerID);
   }
	
	public static final Comparator<Player> COMPARE_BY_NAME = Comparator.comparing(Player::getLastName).
      thenComparing(Comparator.comparing(Player::getFirstName));
}
