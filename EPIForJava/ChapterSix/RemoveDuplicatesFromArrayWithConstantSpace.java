package EPIForJava.ChapterSix;

import java.util.ArrayList;
import java.util.List;

public class RemoveDuplicatesFromArrayWithConstantSpace {
    public static List<Integer> removeDuplicates(List<Integer> nums) {
        int uniqueIdx = 0;
        int index = 1;
        while(index < nums.size()) {
            if(!nums.get(index).equals(nums.get(uniqueIdx))) {
                nums.set(uniqueIdx+1, nums.get(index));
                uniqueIdx++;
            }
            index++;
        }

        while(uniqueIdx < nums.size()) {
            nums.set(uniqueIdx, 0);
            uniqueIdx++;
        }

        return nums;
    }

    public static void main(String[] args) {
        System.out.println(removeDuplicates(new ArrayList<>(List.of(1,2,2,3,4,4,4,4,5,5))));
    }
}
