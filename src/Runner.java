import People.Minotaur;
import People.Player;
import Room.Board;


import java.util.Scanner;

public class Runner {
    private static boolean gameStatus = true;

    public static void main(String[] args)
    {
        // setup variables, player, Difficulty and introduce
        Player player1 = new Player(2,3,1);

        introduce();
    }
    public static void introduce(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, the minotaur is chasing you! Careful, he can jump tiles, Make sure you can reach the exit before he reaches you!");
        System.out.println("But wait before we begin, what difficulty do you want? (1)Easy, (2)Medium, or (3)Hard?");
        int diff = input.nextInt();
        getDiff(diff);
        gameLoop();
    }
    public static void getDiff(int num)
    {
         if(num == 1)
         {
             Board newRoom = new Board(4,4,false);
             Minotaur monster = new Minotaur(.9,.1,3);
         }
        if(num == 2)
        {
            Board newRoom = new Board(6,6,false);
            Minotaur monster = new Minotaur(.75,.25,3);
        }
        if(num == 3)
        {
            Board newRoom = new Board(8,8,true);
            Minotaur monster = new Minotaur(.5,.5,3);
        }
    }
    public static void gameLoop()
    {
        System.println(Room.Board.setupBoard);
        while(gameStatus)
        {
            Board.update;
        }
    }
}
