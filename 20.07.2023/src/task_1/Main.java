package task_1;

import java.util.Scanner;

import static task_1.Bulbs.checkTemperature;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type a first bulb's temperature: ");
        int firstTemp = scanner.nextInt();
        System.out.print("Type a second bulb's temperature: ");
        int secondTemp = scanner.nextInt();

        if (checkTemperature(firstTemp, secondTemp)) {
            System.out.println("Device is gonna work properly");
        } else {
            System.out.println("You can't rely on the device's results");
        }
    }
}
