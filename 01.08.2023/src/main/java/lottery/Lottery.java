package lottery;

import java.util.Random;
import java.util.Scanner;

public class Lottery {
    private final int[] winningNumbers = new int[5];
    private int[] customerNumbers1;

    //This getter used for tests only
    public int[] getWinningNumbers() {
        return winningNumbers;
    }

    private int[] customerNumbers2;
    private int[] customerNumbers3;

    Player player1 = new Player(5);
    Player player2 = new Player(5);
    Player player3 = new Player(5);

    public void run() {
        initializeWinningNumbers();
        setCustomerNumbers();
        printWinningAndCustomerNumbers();
        isWin();
    }

    private void setCustomerNumbers() {
        System.out.println("Player 1: ");
        customerNumbers1 = player1.getNumbers();
        System.out.println("Player 2: ");
        customerNumbers2 = player2.getNumbers();
        System.out.println("Player 3: ");
        customerNumbers3 = player3.getNumbers();
    }

    //"Public" for test only
    public void initializeWinningNumbers() {
        Random random = new Random();
        for (int i = 0; i < winningNumbers.length; i++) {
            winningNumbers[i] = random.nextInt(1, 51);
        }
    }

    private void printWinningAndCustomerNumbers() {
        System.out.println("------------------------------------------------");
        for (int i = 0; i < winningNumbers.length; i++) {
            System.out.print("Player1 Customer number: " + customerNumbers1[i]);
            System.out.println(", Winning number: " + winningNumbers[i]);
        }
        System.out.println("------------------------------------------------");
        for (int i = 0; i < winningNumbers.length; i++) {
            System.out.print("Player2 Customer number: " + customerNumbers2[i]);
            System.out.println(", Winning number: " + winningNumbers[i]);
        }
        System.out.println("------------------------------------------------");
        for (int i = 0; i < winningNumbers.length; i++) {
            System.out.print("Player3 Customer number: " + customerNumbers3[i]);
            System.out.println(", Winning number: " + winningNumbers[i]);
        }
        System.out.println("------------------------------------------------");
    }

    private void isWin() {
        int count1 = 0;
        int count2 = 0;
        int count3 = 0;
        for (int customerNumber1 : customerNumbers1) {
            for (int winningNumber : winningNumbers) {
                if (customerNumber1 == winningNumber) {
                    count1++;
                }
            }
        }
        System.out.println("Match: " + count1);
        if (count1 > 2) {
            System.out.println("Player1 won!");
        } else {
            System.out.println("Player1 loose!");
        }
        System.out.println("------------------------------------------------");

        for (int customerNumber2 : customerNumbers2) {
            for (int winningNumber : winningNumbers) {
                if (customerNumber2 == winningNumber) {
                    count2++;
                }
            }
        }
        System.out.println("Match: " + count2);
        if (count2 > 2) {
            System.out.println("Player2 won!");
        } else {
            System.out.println("Player2 loose!");
        }
        System.out.println("------------------------------------------------");

        for (int customerNumber3 : customerNumbers3) {
            for (int winningNumber : winningNumbers) {
                if (customerNumber3 == winningNumber) {
                    count3++;
                }
            }
        }
        System.out.println("Match: " + count3);
        if (count3 > 2) {
            System.out.println("Player3 won!");
        } else {
            System.out.println("Player3 loose!");
        }
        System.out.println("------------------------------------------------");
    }
}

