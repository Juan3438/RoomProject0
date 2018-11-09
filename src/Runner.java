import People.Minotaur;
import People.Player;
import Room.Board;


import java.util.Scanner;

public class Runner {

    private static boolean gameStatus = true;

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Hello, the minotaur is chasing you! Careful, he can jump tiles, Make sure you can reach the exit before he reaches you!");
        System.out.println("But wait before we begin, what difficulty do you want? (1)Easy, (2)Medium, or (3)Hard?");
        int diff = input.nextInt();
        getDiff(diff);

    }

    public static void getDiff(int num) {
        Board newRoom = new  Board(4,4);
        Minotaur monster = new Minotaur(.9,.1,3,4,4,"up");
        Player player1 = new Player(3,1, 0, 0);

        if(num == 2) {
            newRoom = new Board(6,6);
            monster = new Minotaur(.75,.25,3,4,4,"up");
            player1 = new Player(2,1, 0, 0);
        }
        if(num == 3) {
            newRoom = new Board(8,8);
            monster = new Minotaur(.5,.5,3,5,5,"up");
            player1 = new Player(1,1, 0, 0);
            newRoom.setupBlocks();
        }
        gameLoop(newRoom,monster,player1);
    }

    public static void gameLoop(Board newRoom, Minotaur monster,Player player1) {
        Scanner input = new Scanner(System.in);
        System.out.println(newRoom.setupBoard());
        while(gameStatus)
        {
            String choice = input.nextLine();
            player1.execute(choice);
            monster.turn(player1);
            display();
        }
    }
    public static void display()
    {

    }
}
