package Inheritance;

import java.util.Random;

public class Main {

	public static void main(String[] args) {
		
		
		Random ran = new Random();
		int h1 = ran.nextInt(100);
		int h2 = ran.nextInt(100);
		
		
		
		
	
		Clerk Tommy = new Clerk("Senju Uchiha", h1);
		//Tommy.orderStats();
		System.out.println(Tommy.toString());
		//System.out.println("\n");
		
		Paladin Tom = new Paladin("Tommy", h2);
		System.out.println(Tom.toString());
		
		System.out.println("\n");
		
		while(!Tommy.isDead() && !Tom.isDead()) {
			Tommy.hit(Tom);
			Tom.hit(Tommy);
			
			if(Tommy.isDead()) {
				System.out.println("Senju Uchiha is dead");
				
			}
			if(Tom.isDead()) {
				System.out.println("Tommy is dead");
			}
		}
	}

}
