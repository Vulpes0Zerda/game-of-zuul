/**
 *  This class is the main class of the "World of Zuul" application. 
 *  "World of Zuul" is a very simple, text based adventure game.  Users 
 *  can walk around some scenery. That's all. It should really be extended 
 *  to make it more interesting!
 * 
 *  To play this game, create an instance of this class and call the "play"
 *  method.
 * 
 *  This main class creates and initialises all the others: it creates all
 *  rooms, creates the parser and starts the game.  It also evaluates and
 *  executes the commands that the parser returns.
 * 
 * @author  Michael Kölling and David J. Barnes
 * @version 2016.02.29
 */

public class Game 
{
    private Parser parser;
    private Room currentRoom;
    // stores Rooms in a 2d Array, relative to where the rooms actually are
    // for the sake of simplicity, I'd say you should keep the rooms at equal size
    private Room[][] rooms;

    /**
     * Create the game and initialise its internal map.
     */
    public Game() 
    {
        createRooms();
        parser = new Parser();
    }

    /**
     * Create all the rooms and link their exits together.
     */
    private void createRooms()
    {
      
        // create the rooms
        rooms[1][1] = new Room(1,1 ,"outside the main entrance of the university");
        
        // initialise rooms and place them on the array
        

        // start game at a certain point (probably in the future
        // we are gonna use int pairs to identify the point on the
        // array on the array)
        currentRoom = rooms[1][1];  
    }

    /**
     *  Main play routine. Uses a Scanner till it detects a word, then executes the command
     */
    public void play() 
    {            
        printWelcome();
                
        //Use a scanner to check the input or use async for it
    }

    /**
     * Print out the opening message for the player.
     */
    private void printWelcome()
    {
        System.out.println();
        System.out.println("Welcome to the World of Zuul!");
        System.out.println("World of Zuul is a new, incredibly boring adventure game.");
        System.out.println("Type 'help' if you need help.");
    }

    /**
     * Given a command, process (that is: execute) the command.
     * @param command The command to be processed.
     * @return true If the command ends the game, false otherwise.
     */
    private boolean processCommand(Command command) 
    {
        return true;
    }

    // implementations of user commands:

    /**
     * Print out some help information.
     * Here we print some stupid, cryptic message and a list of the 
     * command words.
     */
    private void printHelp() 
    {
        System.out.println("You are lost. You are alone. You wander");
        System.out.println("around at the university.");
        System.out.println();
        System.out.println("Your command words are:");
        // TODO: get the Command words via CommandWord and print them into this output
        System.out.println("");
    }

    /** 
     * TODO: take the command word and process it here with the help
     * TODO: of the parser output and the CommandWord Enum
     */
    private void goRoom(Command command) 
    {
        
    }
}
