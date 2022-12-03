package Inheritance;

import java.util.Random;

public class Character {
	protected int strength;
	protected int dex;
	protected int constitution;
	protected int intel;
	protected int wisdom ;
	protected int charisma;
	protected int temp;
	private String name;
	private int health;
	private boolean dead;
	
	
	protected Random rand = new Random();
	
	protected void rollStats() {
		strength = rand.nextInt(12)+7;
		dex = rand.nextInt(12)+7;
		constitution = rand.nextInt(12)+7;
		intel = rand.nextInt(12)+7;
		wisdom = rand.nextInt(12)+7;
		charisma = rand.nextInt(12)+7;
		
		
		
	}
	
	protected void rollStandard() {
		strength = rand.nextInt(8)+8;
		dex = rand.nextInt(8)+8;
		constitution = rand.nextInt(8)+8;
		intel = rand.nextInt(8)+8;
		wisdom = rand.nextInt(8)+8;
		charisma = rand.nextInt(8)+8;
		
		
		
	}
	
	

	
	public Character(String name, int health) {
		super();
		this.name = name;
		this.health = health;
	}
	
	public void hit(Character opponent) {
		
		
		opponent.determinehealth(strength);
		System.out.println(opponent.getName() + " has taken a hit of: " + strength + " health is now: " + opponent.getHealth());
	}
	

	public void determinehealth(int damage) {
		if(this.getHealth() - damage <=0) {
			this.setHealth(0);
			this.setDead(true);
		}
		else {
			this.setHealth(this.health - damage);
		}
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getHealth() {
		return health;
	}

	public void setHealth(int health) {
		this.health = health;
	}

	public boolean isDead() {
		return dead;
	}

	public void setDead(boolean dead) {
		this.dead = dead;
	}

	
	
	public String toString() {
		return "\n" + "Name: " + name + "\nStrength: " + strength + "\nDex: " + dex + "\nConst: " + constitution + 
				"\nIntel: " + intel + "\nWisdom: " + wisdom + "\nCharisma: " + charisma;
	}

	
}
