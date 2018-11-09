package People;

import java.util.Scanner;

public class Player implements Entity{
    private int health;
    private int jumps;
    private int xloc;
    private int yloc;

    public Player( int health ,int jumps, int xloc, int yloc ){
        this.health = health;
        this.jumps = jumps;
        this.xloc = xloc;
        this.yloc = yloc;
    }
    public void execute(String choice) {
        Scanner retry = new Scanner(System.in);

        if (choice.equalsIgnoreCase("w"))
            upDown(1,jumps);
        else if(choice.equalsIgnoreCase("s"))
            upDown(-1,jumps);
        else if (choice.equalsIgnoreCase("a"))
            leftRight(-1,jumps);
        else if (choice.equalsIgnoreCase("d"))
            leftRight(1,jumps);
        else {
            System.out.println("Wait, use the WASD keys to move!");
            String reTry = retry.nextLine();
            execute(reTry);
        }
    }
    public void upDown(int dir,int jumps)
    {
        if(dir < 0)
        {
            yloc = yloc - jumps;
            if(yloc < 0)
            {
                yloc = 0;
            }
        }
        if(dir > 0 )
        {
            yloc += jumps;
        }
    }
    public void leftRight(int dir,int jumps)
    {
        if(dir < 0)
        {
            xloc = xloc - jumps;
            if(xloc < 0)
            {
                xloc = 0;
            }
        }
        if(dir > 0 )
        {
            xloc += jumps;
        }
    }
    public int getHealth()
    {
        return health;
    }
    public int getXloc()
    {
        return xloc;
    }
    public int getYloc()
    {
        return yloc;
    }
}
