package task_1;

public class Task_1 {
    public static void main(String[] args) {
        int [] arr1 = {1,2,3,5};
        int [] arr2 = {6,1,2,8,3,4,7,10,5};
        System.out.println("Missing element of the first array: " + findMissingNum(arr1));
        System.out.println("Missing element of the first array: " + findMissingNum(arr2));
    }
    private static int findMissingNum (int[] arr){
        int n = arr.length + 1;
        int sumOfArrN = n * (n + 1) / 2;
        int sumCustomArr = 0;

        for(int num : arr){
            sumCustomArr += num;
        }
        return sumOfArrN - sumCustomArr;
    }
}
