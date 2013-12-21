package monsters;

public interface Monster {
	int getHealth();
	int getStrength();
	int getDefence();
	void deductHealth(int d);
	String getName();
}
