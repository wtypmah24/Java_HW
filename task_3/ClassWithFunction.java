package task_3;

public class ClassWithFunction {

    public static int sep1(int number) {
        int firstdigit = number / 100; //Separate first digit by dividing by 100

        return firstdigit;
    }

    public static int sep2(int number) {
        int seconddigit = number % 100 / 10; //Separate second digit by mod 100 (=45) and dividing by 10

        return seconddigit;
    }

    public static int sep3(int number) {
        int thirddigit = number % 10; //Separate third digit by only mod 10

        return thirddigit;
    }

}
