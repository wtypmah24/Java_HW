package task_1;

import java.util.Random;


public class Main {
    private static final int ARRAY_SIZE = 8;

    public static void main(String[] args) {
        int[] randomArray = generateRandomArray();

        System.out.println("Random array: ");
        for (int num : randomArray) {
            System.out.println(num);
        }

        int[] replacedArray = replaceOddsAndZeros(randomArray);

        System.out.println("Same array but with replaced odds and zeroes: ");
        for (int num : replacedArray) {
            System.out.println(num);
        }


    }

    private static int[] generateRandomArray() {
        Random random = new Random();
        int[] randomNum = new int[ARRAY_SIZE];
        for (int i = 0; i < ARRAY_SIZE; i++) {
            randomNum[i] = random.nextInt(50) + 1;
        }
        return randomNum;
    }

    private static int[] replaceOddsAndZeros(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] % 2 != 0) {
                arr[i] = 0;
            }
        }
        return arr;
    }


}
