package General;

import Commons.SwapTheElementsInArray;

import java.util.Arrays;

public class QuickSort {
    public static void quick(Integer[] nums, int i, int j) {
        int pivot = (i + j)/2;
        int left = 0;
        int right = j;

        while(left <= right) {
            if(nums[left] >= nums[pivot] && nums[right] < nums[pivot]) {
                SwapTheElementsInArray.swapTheElements(nums, left, right);
                left++;
                right--;
            } else if (nums[left] < nums[pivot]) {
                left++;
            } else if (nums[right] >= nums[pivot]) {
                right--;
            }
        }
    }

    public static void quicksort(Integer[] nums, int i, int j) {
        if(i >= j) {
            return;
        }
        int pivot = (i + j)/2;
        quicksort(nums, i, pivot - 1);
        quicksort(nums, pivot + 1, j);
        quick(nums, i, j);
    }

    public static void main(String[] args) {
        Integer[] nums = new Integer[]{7, 2, 1, 6, 8, 5, 3, 4, 4};
        int count = 0;
        while(count < nums.length) {
            quicksort(nums, 0, nums.length - 1);
            count++;
        }
        Arrays.stream(nums).forEach(System.out::println);
    }
}
