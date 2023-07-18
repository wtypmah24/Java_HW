package task_1;

import java.util.Scanner;

public class Supermarkt {
    static boolean isEdekaOpen = false;
    static boolean isReweOpen = false;

    public static void main(String[] args) {
        System.out.print("What is the time now? (24-hour format): ");
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();
        canBuy(time);

        System.out.println("You can buy in Edeka: " + isEdekaOpen);
        System.out.println("You can buy in Rewe: " + isReweOpen);
    }

    public static void canBuy(int time) {
        // Магазин Edeka работает с 8:00 до 17:00 (включительно)
        if (time >= 8 && time <= 17) {
            isEdekaOpen = true;
        } else {
            isEdekaOpen = false;
        }

        // Магазин Rewe работает с 12:00 до 22:00 (включительно)
        if (time >= 12 && time <= 22) {
            isReweOpen = true;
        } else {
            isReweOpen = false;
        }
    }
}
