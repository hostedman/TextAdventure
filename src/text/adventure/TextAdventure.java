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
public class TextAdventure {

    /**
     * @param args the command line arguments
     */
    static Player player = new Player();
    public static void main(String[] args) {
        

        Scanner in = new Scanner(System.in);
        Command commandParser = new Command();
        String command;
        
        System.out.println(player.printStats());
        while(true)
        {
            System.out.print("Enter command: ");
            command = in.nextLine();
            commandParser.parseCommand(command);
        }
        
    }
}
