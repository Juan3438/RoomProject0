package Room;
import java.lang.String;

public class room {
    private String character;
    private String occupant;
    public room(String character, String occupant)
    {
        this.character = character;
        this.occupant = occupant;
    }
    public String toString()
    {
            return character;
    }
}
