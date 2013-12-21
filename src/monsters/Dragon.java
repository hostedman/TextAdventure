package monsters;

public class Dragon implements Monster {
	private int health, maxHealth;
	private int strength;
	private int defence;
	public Dragon()
	{
		maxHealth = 100;
		health = maxHealth;
		strength = 50;
		defence = 20;
	}
	@Override
	public int getHealth() {
		return health;
	}

	@Override
	public int getStrength() {
		return strength;
	}

	@Override
	public int getDefence() {
		return defence;
	}
	@Override
	public void deductHealth(int d) {
		health = health - d;
		
	}
	@Override
	public String getName() {
		return "Dragon";
	}

}
