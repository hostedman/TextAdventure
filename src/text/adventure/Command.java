/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package text.adventure;

/**
 *
 * @author Luke
 */
public class Command {
	EventHandler H = new EventHandler();
    public void parseCommand(String s)
    {

        if(s.contains("move"))
        {
        try
        {
            String moveParse[] = s.split("move ");
            moveParse[1] = moveParse[1].toUpperCase();
            moveDirection(moveParse[1]);
            H.checkEvent();  //first see if theres a specific event that supposed to happen
            H.checkRandom(); //then run the random event handler if nothing happens(fix this)
        }catch(Exception e){
            //System.out.println(e);
            System.out.println("Invalid arguments.");
        }   
        }
        else if(s.equalsIgnoreCase("check"))
        {
            System.out.println(TextAdventure.player.getCoords());
        }

    }
    
    public void moveDirection(String direction)
    {
        if(direction.equals("N"))
        {
            TextAdventure.player.move("NORTH");
            System.out.println("Moved north.");
        }
        else if(direction.equals("S"))
        {
            TextAdventure.player.move("SOUTH");
            System.out.println("Moved south.");
        }
        else if(direction.equals("E"))
        {
            TextAdventure.player.move("EAST");
            System.out.println("Moved east.");
        }
        else if(direction.equals("W"))
        {
            TextAdventure.player.move("WEST");
            System.out.println("Moved west.");
        }
        else
            System.out.println("Unknown direction.");
            
    }
}
