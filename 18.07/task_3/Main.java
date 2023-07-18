package task_3;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type three digits");
        System.out.print("Digit one: ");
        int firstDigit = scanner.nextInt();
        System.out.print("Second digit: ");
        int secondDigit = scanner.nextInt();
        System.out.print("Third digit: ");
        int thirdDigit = scanner.nextInt();
        getMaxNum(firstDigit, secondDigit, thirdDigit);
    }

    public static void getMaxNum(int a, int b, int c){
        int max = a;
        if (b > max){
            max = b;
        }
        else if (c > max){
            max = c;
        }
        System.out.println("the biggest digit is " + max);
    }
}
