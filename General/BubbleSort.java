package General;

import Commons.SwapTheElementsInArray;

import java.util.Arrays;

public class BubbleSort {
    public static Integer[] bubbleSort(Integer[] nums) {
        for(int i = 0; i < nums.length; i++) {
            for(int j = i + 1; j < nums.length; j++) {
                if(nums[i] > nums[j]) {
                    SwapTheElementsInArray.swapTheElements(nums, i, j);
                }
            }
        }

        return nums;
    }
    public static void main(String[] args) {
        Integer[] nums = new Integer[] {1,2,3,12, 5, 54, 32};

        Arrays.stream(bubbleSort(nums)).forEach(System.out::println);
    }
}
