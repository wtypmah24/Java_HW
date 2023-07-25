package task_2;

import java.util.Random;

public class Main {
    public static void main(String[] args) {
        int[] randomArray = generateRandomArray(5);

        System.out.println("Random array: ");
        for(int num : randomArray){
            System.out.println(num);
        }

        System.out.println("Array increasing? - " + checkIncreasing(randomArray));
    }
    private static int[] generateRandomArray(int size){
        Random random = new Random();
        int[] randomNum = new int[size];

        for (int i = 0; i < size; i++) {
            randomNum[i] = random.nextInt(90) + 10;
        }
        return randomNum;
    }

    private static boolean checkIncreasing(int[] arr){
        for (int i = 0; i < arr.length; i++){
            if(arr[i+1] < arr[i]){
                return false;
            }
        }
        return true;
    }
}
