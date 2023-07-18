package task_1;

import java.util.Scanner;

public class Supermarkt2 {
    public static void main(String[] args) {
        System.out.print("What is the time now? (24-hour format): ");
        Scanner scanner = new Scanner(System.in);
        int time = scanner.nextInt();

        boolean canBuyEdeka = canBuyEdeka(time);
        boolean canBuyRewe = canBuyRewe(time);

        System.out.println("You can buy in Edeka: " + canBuyEdeka);
        System.out.println("You can buy in Rewe: " + canBuyRewe);
    }

    public static boolean canBuyEdeka(int time) {
        // Магазин Edeka работает с 8:00 до 17:00 (включительно)
        return time >= 8 && time <= 17;
    }

    public static boolean canBuyRewe(int time) {
        // Магазин Rewe работает с 12:00 до 22:00 (включительно)
        return time >= 12 && time <= 22;
    }
}
