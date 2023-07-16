import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the first number");
        float firstNum = scanner.nextFloat();
        System.out.println("Type  the second number");
        float secondNum = scanner.nextFloat();
        System.out.println("Type the reference number");
        float checkedNum = scanner.nextFloat();
        checkDiff(firstNum, secondNum, checkedNum);
    }

    public static void checkDiff(float firstNum, float secondNum, float checkedNum) {
        if (Math.abs(checkedNum - firstNum) > Math.abs(checkedNum - secondNum)) {
            System.out.println("The  second number is closer to the reference number");
        } else if (Math.abs(checkedNum - firstNum) < Math.abs(checkedNum - secondNum)) {
            System.out.println("The  first number is closer to the reference number");
        } else {
            System.out.println("The numbers are equally close to the reference number");
        }
    }
}
