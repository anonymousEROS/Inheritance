package Inheritance;

public class Clerk extends Character {
	
	
	public Clerk(String name, int health) {
		super(name, health);
		//this.name = name;
		rollStats();
	    orderStats();
		
	}
	//public Clerk(String name) {
		
		//rollStats();
		//orderStats();
	//}
	
	
	public void orderStats() {
		orderWis();
		orderIntel();
		orderConst();
		orderCharisma();
		orderDex();
	}
	
	public void orderWis() {
		int temp = 0;
		
		if (wisdom < dex) {
			temp = wisdom;
			wisdom = dex;
			dex = temp;
		}
		if (wisdom < constitution) {
			temp = wisdom;
			wisdom = constitution;
			constitution = temp;
			
		}
		if (wisdom < intel) {
			temp = wisdom;
			wisdom = intel;
			intel = temp;
		}
		if(wisdom < charisma) {
			temp = wisdom;
			wisdom = charisma;
			charisma = temp;
		}
		if (wisdom < strength) {
			temp = wisdom;
			wisdom = strength;
			strength = temp;
		}
	}
	
	public void orderIntel() {
		int temp  = 0;
		
		if (intel < dex) {
			temp = intel;
			intel = dex;
			dex = temp;
		}
		if (intel < constitution) {
			temp = intel;
			intel = constitution;
			constitution = temp;
					
		}
		if(intel < charisma) {
			temp = intel;
			intel = charisma;
			charisma = temp;
		}
		if (intel < strength) {
			temp = intel;
			intel = strength;
			strength = temp;
			
		}
	}
	
	public void orderConst() {
		int temp = 0;
		
		if (constitution < dex) {
			temp = constitution;
			constitution = dex;
			dex = temp;
	}
		if (constitution < charisma) {
			temp = constitution;
			constitution = charisma;
			charisma = temp;
	}
		if (constitution < strength) {
			temp = constitution;
			constitution = strength;
			strength = temp;
	}
		

 }
	public void orderCharisma() {
		int temp = 0;
		
		if (charisma < dex) {
			temp = charisma;
			charisma = dex;
			dex = temp;
	}
	
		if (charisma < strength) {
			temp = charisma;
			charisma = strength;
			strength = temp;
	}
		
 }
	public void orderDex() {
		int temp = 0;
		
		if (dex < strength) {
			temp = dex;
			dex = strength;
			strength = temp;
	}
 }
	
	
	public String toString() {
		return super.toString();
		
	}
	
	
}