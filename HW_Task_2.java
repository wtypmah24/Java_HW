package task_2;

public class HW_Task_2 {
    public static void main(String[] args) {
        int i = 345; //Declare the number

        int firstdigit = i / 100; //Separate first digit by dividing by 100
        int seconddigit = i % 100 / 10; //Separate second digit by mod 100 (=45) and dividing by 10
        int thirddigit = i % 10; //Separate third digit by only mod 10

        System.out.println(firstdigit + ", " + seconddigit + ", " + thirddigit); //Printout the digits one by one
    }
}
