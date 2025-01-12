
public class Room 
{
    private String description;
    private int xCoordinate;
    private int yCoordinate;
    private Enemy[] enemys;
    private Loot[] roomLoot;

    /**
     * Create a room described "description". Initially, it has
     * no exits. "description" is something like "a kitchen" or
     * "an open court yard".
     * @param description The room's description.
     */
    public Room(int xCoordinate, int yCoordinate,String description) 
    {
        this.description = description;
    }

    /**
     * @return The description of the room.
     */
    public String getDescription()
    {
        return description;
    }

}
