import core.Game;
import ui.ConsoleIO;
            // 0:58min 
public class App {
    public static void main(String[] args) {
        ConsoleIO consoleIO = new ConsoleIO();
        Game minesweeperGame = new Game(10, 10, 10);

        do{
            consoleIO.showBoard(minesweeperGame.getBoard());
            //get input from user
            consoleIO.getUserInput(minesweeperGame);
            //play move
        } while(minesweeperGame.isActive());
        consoleIO.showResult(minesweeperGame.getResult());

    }

}
