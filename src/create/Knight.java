package create;

public class Knight {
	public int health;
	public int defense;
	public int attack;
	public String rank;
    public String tribe;


 public Knight(int health, int defense, int attack, String rank, String tribe) {
		super();
		this.health = health;
		this.defense = defense;
		this.attack = attack;
		this.rank = rank;
		this.tribe = tribe;
	}


public int getHealth() {
		return health;
	}


	public void setHealth(int health) {
		this.health = health;
	}


	public int getDefense() {
		return defense;
	}


	public void setDefense(int defense) {
		this.defense = defense;
	}


	public int getAttack() {
		return attack;
	}


	public void setAttack(int attack) {
		this.attack = attack;
	}


	public String getRank() {
		return rank;
	}


	public void setRank(String rank) {
		this.rank = rank;
	}


	public String getTribe() {
		return tribe;
	}


	public void setTribe(String tribe) {
		this.tribe = tribe;
	}







}