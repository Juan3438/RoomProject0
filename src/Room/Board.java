package Room;

public class Board {
    private int width;
    private int length;
    private boolean blocks;
    private int[] entry = new int[2];
    private int[] exit = new int[2];

    public Board(int x, int y, boolean blck)
    {
        width = x;
        length = y;
        blocks = blck;
    }
    public void setupBoard()
    {
        room[] hallLength = new room[width];
        room[] halls = new room[length];
        if(blocks)
            setupBlocks();
    }
    public room playerMove(int x, int y)
    {
        room newRoom = new room(x,y);
        return newRoom;
    }
    public void setupBlocks()
    {

    }
}
