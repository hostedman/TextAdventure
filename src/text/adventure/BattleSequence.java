package text.adventure;

import monsters.*;
import java.util.Scanner;
public class BattleSequence {
	Scanner input = new Scanner(System.in);
	//BattleCommands check = new BattleCommands();
	String in;
	void battle(Monster m)//monster
	{			
		int defended = 0;
		boolean run = false;
		while(TextAdventure.player.getHealth() > 0)
		{			
			while(true)
			{

			System.out.print("Enter battle command: ");
			in = input.nextLine();
			in = in.toUpperCase();

				if(in.equalsIgnoreCase("attack"))
				{
					System.out.println("You attack...");
					int x = TextAdventure.player.getAccuracy();
					int y = 0 + (int)(Math.random() * ((TextAdventure.player.getAccuracy() - 0) + 1))*2;
					if(y > x) // if the generated value(a value between your accuracy and 0 multiplied by 2) is less than your accuracy
					{
						System.out.print("You hit for ");
						int h = (5 + (int)(Math.random() * ((TextAdventure.player.getStrength() - 5) + 1)))/(5 + (int)(Math.random() * ((m.getDefence() - 5) + 1)));
						m.deductHealth(h);
						System.out.println(h + " damage.");
						
					}
					
					else 
						System.out.println("You miss");
					break;
				}
				else if(in.equalsIgnoreCase("defend"))
				{
					System.out.println("You try and defend fully from the attack.");
					defended = (0 + (int)(Math.random() * ((10 - 0) + 1)));
					break;
				}
				else if(in.equalsIgnoreCase("Check"))
				{
					System.out.println(TextAdventure.player.getCurrentHealth());
				}
				
				else
					System.out.println("Invalid command");
			}
			System.out.println(m.getName() + " attacks...");
			int monsterHit = (0 + (int)(Math.random() * ((5 - 0) + 1)));
			int monsterCheck = (0 + (int)(Math.random() * ((5 - 0) + 1)));
			if(defended == 5)
			{
				System.out.println("You successfully defended from the attack");
			}
			else if(monsterHit == monsterCheck)
			{
				System.out.print("Hit for ");
				int damage = (0 + (int)(Math.random() * ((m.getStrength() - 0) + 1)));
				TextAdventure.player.deductHealth(damage);
				System.out.println(damage + " damage");
			}
			else
				System.out.println(m.getName() + " missed.");
			if(TextAdventure.player.getHealth() <= 0)
				break;
		
		if(TextAdventure.player.getHealth() <= 0)
		{
			System.out.println("You died!");
			TextAdventure.player.handleDeath();
		}
		else
		{
			System.out.println("Monster defeated");
			//calculate experience
			break;
		}
		}
	}
}
