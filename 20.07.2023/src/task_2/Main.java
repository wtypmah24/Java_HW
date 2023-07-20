package task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type your current balance: ");
        int currentBalance = scanner.nextInt();

        int days = 0;

        while (currentBalance > 1) {
            int max = 0;
            for (int i = 1; i < currentBalance; i++) {
                if (currentBalance % i == 0) {
                    max = i;
                }
            }
            currentBalance = currentBalance - max;
            days++;
            if (currentBalance == 1) {
                days++;
            }
        }
        System.out.println(days);
    }
}
