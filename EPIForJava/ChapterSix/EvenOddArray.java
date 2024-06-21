/*
Re-arrange array: Evn first then odd numbers
*/
package EPIForJava.ChapterSix;

import java.util.Arrays;

public class EvenOddArray {
    public static void swapTheNumbers(int[] numbers, int i, int j) {
        numbers[i] += numbers[j];
        numbers[j] = numbers[i] - numbers[j];
        numbers[i] = numbers[i] - numbers[j];
    }
    public static int[] reArrangeArray(int[] numbers) {
        int evenIndex = 0;
        int oddIndex = 0;

        while(evenIndex < numbers.length) {
            if(numbers[evenIndex] % 2 == 0) {
                swapTheNumbers(numbers, evenIndex, oddIndex);
            }

            while(numbers[oddIndex] % 2 == 0) {
                oddIndex++;
            }
            evenIndex++;
        }

        return numbers;
    }

    public static void main(String[] args) {
        int[] nums = new int[]{1,2,3,4,5,6,7,8};
        Arrays.stream(reArrangeArray(nums)).forEach(System.out::println);
    }
}
