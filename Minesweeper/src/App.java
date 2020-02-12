import core.Game;
import ui.ConsoleIO;

public class App {
    public static void main(String[] args) {
        ConsoleIO consoleIO = new ConsoleIO();
        Game minesweeperGame = new Game(10, 10, 10);

        do{
            //draw
            //get input from user
            //play move
        } while(minesweeperGame.isActive());
        consoleIO.showResult(minesweeperGame.getResult()):
        switch (minesweeperGame.getResult()){
            case Game.GAME_WON:
                System.out.println("Congratulations, You Won !!!"); break;
            case Game.GAME_LOST:
                System.out.println("Mine Exploded, You Lost !!!");  break;
                default:
                    System.out.println("Unknown state");
        }
    }
}
