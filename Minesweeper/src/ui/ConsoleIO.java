package ui;

import core.Game;

import javax.jws.soap.SOAPBinding;
import java.util.InputMismatchException;
import java.util.Scanner;
import java.util.stream.IntStream;

public class ConsoleIO {
    public void showResult(int minesweeperGameResult) {
        switch (minesweeperGameResult) {
            case Game.GAME_WON:
                System.out.println("Congratulations, You Won !!!");
                break;
            case Game.GAME_LOST:
                System.out.println("Mine Exploded, You Lost !!!");
                break;
            default:
                System.out.println("Unknown state");
        }
    }

    //x, y  -> board[x][y]
    public void showBoard(int[][] board) {
        for (int y = 0; y < board[0].length; y++) {
            for (int x = 0; x < board.length; x++) {
                System.out.print(board[x][y]);
            }
            System.out.println();
        }
    }
    public UserInput getUserInput( Game minesweeperGame) {
        int cellX = getNumberFromuserInrange(0, minesweeperGame.getBoardWidth());
        int cellY = getNumberFromuserInrange(0,minesweeperGame.getBoardHeight());
        //0-pen, f-1-ag
        int action = getNumberFromuserInLIST(UserInput.ACTION_OPEN, UserInput.ACTION_FLAG);
        return new UserInput(cellX,cellY, action);
    }


    /**
     * Gets a number entered in console
     *
     * @param minvalue
     * @param maxvalueExcluded
     * @return
     */
    private int getNumberFromuserInrange(int minvalue, int maxvalueExcluded) {
        int inputNumber;
        do {
            inputNumber = getNumberFromuser();
        } while (inputNumber < minvalue || inputNumber >= maxvalueExcluded);
        return inputNumber;
    }

    private int getNumberFromuserInLIST(int... validValues) {
        int inputNumber;
        do {
            inputNumber = getNumberFromuser();
        } while(isNumberInArray(inputNumber, validValues));
        return inputNumber;
    }

    private boolean isNumberInArray(int number, int[] validValues) {
        return IntStream.of(validValues).anyMatch(x-> x == number);
    }

    public int getNumberFromuser() {
        int input;
        try {
            input = new Scanner(System.in).nextInt();
        } catch (InputMismatchException exception) {
            System.out.println("Please, enter number only.");
            return getNumberFromuser();
        }
        return input;
    }

}
