package task_2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a year: ");
        int year = scanner.nextInt();
        boolean isLeap = isLeapYear(year);
        System.out.println(year + " is leap: " + isLeap);
    }

    public static boolean isLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            return true;
        } else {
            return false;
        }
    }
}
