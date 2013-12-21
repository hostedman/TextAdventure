package monsters;

public class Fedora implements Monster {
	int health;
	int maxHealth;
	int strength;
	int defence;
	public Fedora()
	{
		maxHealth = 5;
		health = maxHealth;
		strength = 1;
		defence = 0;
	}
	@Override
	public int getHealth() {
		// TODO Auto-generated method stub
		return health;
	}

	@Override
	public int getStrength() {
		// TODO Auto-generated method stub
		return strength;
	}

	@Override
	public int getDefence() {
		// TODO Auto-generated method stub
		return defence;
	}

	@Override
	public void deductHealth(int d) {
		// TODO Auto-generated method stub
		health = health - d;
	}

	@Override
	public String getName() {
		// TODO Auto-generated method stub
		return "Fedora";
	}

}
