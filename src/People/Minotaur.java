package People;

import Room.room;

public class Minotaur {
    private double charge;
    private double turn;
    private int reach;
    private room location;

    public Minotaur(double x, double y, int z){
        charge = x;
        turn = y;
        reach = z;
    }
    public void turn()
    {
        double choice = Math.random();
        if(choice > charge)
        {

        }
    }
}
