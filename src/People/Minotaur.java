package People;

public class Minotaur implements Entity {
    private double charge;
    private double turn;
    private int reach;
    private int xloc;
    private int yloc;
    private String direction;


    public Minotaur(double charge, double turn, int reach,int xloc,int yloc, String direction){
        this.charge = charge;
        this.turn = turn;
        this.reach = reach;
        this.xloc =  xloc;
        this.yloc = yloc;
        this.direction = direction;
    }
    public void turn(Player hero)
    {
        double choice = Math.random();
        if(choice <= charge)
        {
            move(reach);
        }
        if(choice <= turn)
        {
            changeDir(direction, hero);
        }
    }
    public void move(int reach)
    {
        if (direction.equalsIgnoreCase("v"))
            upDown(1,reach);
        else if(direction.equalsIgnoreCase("^"))
            upDown(-1,reach);
        else if (direction.equalsIgnoreCase(">"))
            leftRight(-1,reach);
        else if (direction.equalsIgnoreCase("<"))
            leftRight(1,reach);
    }
    public void changeDir(String direction,Player hero)
    {
        int Xabs = xloc - hero.getXloc();
        int Yabs = yloc - hero.getYloc();
        if(  Xabs < 0)
        {
            direction = " <";
            if(Xabs > Yabs)
            {
                direction = " ^";
            }
        }
        if( Xabs > 0)
        {

        }
        if((xloc - hero.getXloc()) <= (yloc - hero.getYloc()))
        {
            direction = " <";
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
    public int getXloc() {
        return xloc;
    }
    public int getYloc() {
        return yloc;
    }
}
