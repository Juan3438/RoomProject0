package People;

public interface Entity {
    int getYloc();
    int getXloc();
    void upDown(int dir,int jumps);
    void leftRight(int dir,int jumps);
}
