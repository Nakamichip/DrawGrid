import java.util.Arrays;

public class ArrayExersise {

    public static void main(String[] args) {

        findSecondLargestElementInArray(new Integer[]{1, 2, 3, 40, 25, 7, 19, 2, 4});
        findSecondSmallestInArray(new Integer[]{22, 99, 48, 12, 63, 1, 31, 98, 65, 15});
    }

    public static void findSecondLargestElementInArray(Integer[] array) {
        Arrays.sort(array);
        int maxValue = array[0];
        int secondLargest = 0;
        for (int element : array) {
            if (maxValue < element){
            secondLargest = maxValue;
             maxValue = element;
            }
        }
        System.out.println("Second largest element is: " + secondLargest);
    }
    public static void findSecondSmallestInArray(Integer[] array){
        int smallestValue = Integer.MAX_VALUE;
        int secondSmallest = Integer.MAX_VALUE;
        for (int element : array) {
            if (smallestValue > element){
                secondSmallest = smallestValue;
                smallestValue = element;
            }
        }
        System.out.println("Second smallest element is: " + secondSmallest);
    }
}