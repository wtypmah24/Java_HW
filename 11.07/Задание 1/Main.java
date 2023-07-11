import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String firstWord;
        int l;
        do {
            System.out.println("Write a first word with even number of the letters: ");
            firstWord = scanner.nextLine();
            l = firstWord.length();
        }
        while (l % 2 != 0 & l > 0);


        String secondWord;
        int l2;
        do {
            System.out.println("Write a second word with even number of the letters: ");
            secondWord = scanner.nextLine();
            l2 = secondWord.length();
        }
        while (l2 % 2 != 0 & l2 > 0);

        String together = firstWord.substring(0, l/2) + secondWord.substring(l2 / 2, l2);

        System.out.println(together);
    }
}
