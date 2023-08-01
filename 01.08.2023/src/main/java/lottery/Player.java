package lottery;

import java.util.Scanner;

public class Player implements Arrays {
    private final int size;

    public Player(int size) {
        this.size = size;
    }

    Scanner scanner = new Scanner(System.in);

    @Override
    public int[] getNumbers() {
        int[] customNum = new int[size];
        for (int i = 0; i < size; i++) {
            System.out.print("Type your " + (i+1) + " number: ");
            customNum[i] = scanner.nextInt();
        }
        return customNum;
    }
}
