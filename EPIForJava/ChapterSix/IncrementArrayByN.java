package EPIForJava.ChapterSix;

import java.util.Arrays;

public class IncrementArrayByN {
    public static int[] incrementByN(int[] nums, int n) {
        int[] numsCopy = Arrays.copyOf(nums, nums.length + 1);
        int index = numsCopy.length - 2;
        int sum;
        while(index >= 0) {
            sum = n + numsCopy[index];
            numsCopy[index + 1] = sum % 10;
            n = sum / 10;
            index--;
        }
        numsCopy[0] = n;
        return numsCopy;
    }

    public static void main(String[] args) {
        Arrays.stream(incrementByN(new int[]{9, 9, 9}, 1))
                .forEach(System.out::println);
    }
}
