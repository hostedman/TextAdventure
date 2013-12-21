package text.adventure;

import monsters.*;

//Min + (int)(Math.random() * ((Max - Min) + 1))
public class EventHandler {
	final int ENCOUNTER_CHANCE = 2;//chance of encounter
	static boolean realEvent = false;
	public void checkRandom()
	{
		//Random encounters
		
		int rand;
		rand = 0 + (int)(Math.random() * ((ENCOUNTER_CHANCE - 0) + 1)); //wild encounters
		if(rand == 1)
		{
			wildEncounter();
		}
	}
	public void checkEvent()
	{
		
	}
	public void wildEncounter()
	{
		if(Player.roomID == 0)
		{
			Monster monster = null;
			int f = 0 + (int)(Math.random() * ((0 - 1) + 1));
			if(f == 0)
				monster = new Fedora();
			else if(f == 1)
				monster = new Dragon();
			else
				System.out.println("ERROR");
			System.out.println(monster.getName()+ " has appeared.");
			BattleSequence b = new BattleSequence();
			b.battle(monster);
			
		}
	}
}
