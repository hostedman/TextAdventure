/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package text.adventure;

/**
 *
 * @author Luke
 */
import java.util.*;
public class Player {
    
    private String name;
    private int strength;
    private int level;
    private int health, maxHealth;
    private int coordX,coordY;
    static int roomID;
    private int defence;
    private int accuracy;
    boolean debug = true;
    Scanner in = new Scanner(System.in);
    
    public Player()
    {
        System.out.print("What is your name? ");
        name = in.nextLine();
        level = 1;
        strength = 10;
        maxHealth = 100;
        health = maxHealth;
        coordX = 5;
        coordY = 5;
        defence = 10;
        accuracy = 10;
        roomID = 0;
    }
    public String printStats()
    {
        return "Name: "+name+"\nStrength: "+Integer.toString(strength)+"\nMax health: "+Integer.toString(maxHealth)+"\nLevel: "+Integer.toString(level);
    }
    public String getCurrentHealth()
    {
        return "Health: "+Integer.toString(health)+"/"+Integer.toString(maxHealth);
    }
    public void move(String direction)
    {
    	direction = direction.toUpperCase();
    	switch(direction)
    	{
    	case "NORTH":
    		coordX++;
    		break;
    	case "SOUTH":
    		coordX--;
    		break;
    	case "EAST":
    		coordY++;
    		break;
    	case"WEST":
    		coordY--;
    		break;
    	}
    }
    public void levelUp()
    {
    	level++;
    	strength += (int)strength/2;
    	maxHealth += maxHealth/2;
    	defence++;
    	accuracy += 2;
    }
    public String getCoords()
    {
        return "X: "+Integer.toString(coordX)+"\nY: "+Integer.toString(coordY);
    }
    public static int getRoomID()
    {
    	return roomID;
    }
    public int getHealth()
    {
    	return health;
    }
    public int getDefence()
    {
    	return defence;
    }
    public int getStrength()
    {
    	return strength;
    }
    public int getAccuracy()
    {
    	return accuracy;
    }
	public void deductHealth(int d) {
		health = health - d;
		if(health <= 0)
			System.out.println("You died!");
	}
	public void handleDeath()
	{
		System.out.println("You have died, lucky you, you get another life");
		health = maxHealth;
		
	}
}
