package ui;

public class UserInput {
    public static final int ACTION_OPEN = 0;
    public static final int ACTION_FLAG = 1;
    private int cellx;
    private int cellY;
    private  int action;

    public UserInput(int cellx, int cellY, int action) {
        this.cellx = cellx;
        this.cellY = cellY;
        this.action = action;
    }

    public int getCellx() {
        return cellx;
    }

    public int getCellY() {
        return cellY;
    }

    public int getAction() {
        return action;
    }
}
