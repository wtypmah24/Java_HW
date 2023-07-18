package task_1;

import java.util.Scanner;

public class Supermarkt3 {
    static boolean isEdekaOpen = true;
    static boolean isReweOpen = true;


    public static void main(String[] args) {


        System.out.print("What is the time now? ");
        Scanner scanner = new Scanner(System.in);

        int time = scanner.nextInt();
        boolean[] isOpenSupermarkt = canBuy(time);
        System.out.println("you can buy in Edeka: " + isOpenSupermarkt[0]);
        System.out.println("you can buy in Rewe: " + isOpenSupermarkt[1]);

    }

    public static boolean[] canBuy(int time) {
        boolean[] arr = {isEdekaOpen, isReweOpen};
        if (time > 8 && time < 12) {
            return new boolean[]{isEdekaOpen, false};
        } else if (time > 17 && time < 22) {
            return new boolean[]{false, isReweOpen};
        } else if (time > 12 && time < 17) {
            return new boolean[]{isEdekaOpen, isReweOpen};
        } else {
            return new boolean[]{false, false};
        }
    }

}