package HW;

import java.util.Scanner;

import static HW.Summ.Summa;
import static HW.Deviding.Dev;
import static HW.Minus.Dedaction;
import static HW.Multipliing.Mult;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Write your first number: ");
        int firstNum = scanner.nextInt();

        System.out.print("Write your second number: ");
        int secondNum = scanner.nextInt();

        int sumResult = Summa(firstNum, secondNum);

        System.out.println("Sum result ist " + sumResult);

        System.out.println("Deviding result is " + Dev(firstNum, secondNum));

        System.out.println("Dedacting result is " + Dedaction(firstNum, secondNum));

        System.out.println("Multipliing result is " + Mult(firstNum, secondNum));
    }

}
