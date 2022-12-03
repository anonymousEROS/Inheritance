package Inheritance;

public class Paladin extends Character {

	
	public Paladin(String name, int health) {
		super(name, health);
		//this.name = name;
		rollStandard();
	    orderStats();
		
	}
	
	public void orderStats() {
		orderWis();
		orderConst();
		orderCharisma();
		orderDex();
		orderStrength();
		
	}
	
	
	public void orderStrength() {
		
		if(strength < wisdom) {
			temp = strength;
			strength = wisdom;
			wisdom = temp;
		}
		if(strength < intel) {
			temp = strength;
			strength = intel;
			intel = temp;
		}
		if(strength < constitution) {
			temp = strength;
			strength = constitution;
			constitution = temp;
		}
		if(strength < charisma) {
			temp = strength;
			strength = charisma;
			charisma = temp;
		}
		if(strength < dex) {
			temp = strength;
			strength = dex;
			dex = temp;
		}
		
		
	}
	public void orderConst() {
		if (constitution < wisdom) {
			temp = constitution;
			constitution = wisdom;
			wisdom = temp;
			
		}
		if (constitution < intel) {
			temp = constitution;
			constitution = intel;
			intel = temp;
			
		}
		if (constitution < charisma) {
			temp = constitution;
			constitution = charisma;
			charisma = temp;
			
		}
		if (constitution < dex) {
			temp = constitution;
			constitution = dex;
			dex = temp;
			
		}
		
	}
	
	public void orderCharisma(){
		if (charisma <dex) {
			temp = charisma;
			charisma = dex;
			dex = temp;
		}
		if (charisma < intel) {
			temp = charisma;
			charisma = intel;
			intel = temp;
		}
		if (charisma < wisdom) {
			temp = charisma;
			charisma = wisdom;
			wisdom = temp;
		}
	
	}
	public void orderDex() {
		if(dex < wisdom) {
			temp = dex;
			dex = wisdom;
			wisdom = temp;
		
		}
		if (dex < intel) {
			temp = dex;
			dex = intel;
			intel = temp;
		}
	}
	public void orderWis() {
		if (wisdom < intel) {
			temp = intel;
			wisdom = intel;
			intel = temp;
		}
			
	}
		
	
	
	public String toString() {
		return super.toString();
		
	}
	
	
}


