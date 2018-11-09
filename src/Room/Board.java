package Room;

public class Board {
    private int width;
    private int length;
    private int[] entry = new int[2];
    private int[] exit = new int[2];

    public Board(int x, int y)
    {
        width = x;
        length = y;
    }
    public String setupBoard()
    {
        room[][] currRoom = new room[length][width];
        String currentRoom = blankRoom(currRoom);

        return currentRoom;
    }
    public String blankRoom(room[][] currRoom)
    {
        String currentRoom = "";
        for(int i = 0 ; i < currRoom.length ; i++)
        {
            for(int j = 0 ; j < currRoom[i].length ; j++)
            {
                currRoom[i][j] = new room(" O","empty");
                currRoom[0][0] = new room(" I","player1");
                currRoom[3][3] = new room(" v", "monster");
                currentRoom += currRoom[i][j].toString();
            }
            currentRoom += "\n";
        }
        return currentRoom;
    }
    public static void test()
    {

    }
    public static String loadEntities(String currentRoom)
    {
        currentRoom = "o";
        return currentRoom;
    }
    public void setupBlocks()
    {

    }
}
