import People.Player;
import Room.Board;

import java.util.Scanner;

public class Runner {
    public static void main(String[] args)
    {
        // setup player, Difficulty and introduce
        Player player1 = new Player();

        introduce();
    }
    public static void introduce(){
        Scanner input = new Scanner(System.in);
        System.out.println("Hello, the minotaur is chasing you! Careful, he can jump tiles, Make sure you can reach the exit before he reaches you!");
        System.out.println("But wait before we begin, what difficulty do you want? (1)Easy, (2)Medium, or (3)Hard?");
        int diff = input.nextInt();
        getDiff(diff);
    }
    public static void getDiff()
    {

    }
}
