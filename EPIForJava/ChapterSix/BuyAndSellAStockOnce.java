package EPIForJava.ChapterSix;

import java.util.ArrayList;
import java.util.List;

public class BuyAndSellAStockOnce {
    public static Integer getMaxDiffInOrder(List<Integer> nums) {
        int minVal = nums.getFirst();
        int maxDiff = 0;
        for(int i=1; i < nums.size(); i++) {
            if(nums.get(i) < minVal) {
                minVal = nums.get(i);
            } else if(nums.get(i) - minVal > maxDiff) {
                maxDiff = nums.get(i) - minVal;
            }
        }
        return maxDiff;
    }
    public static void main(String[] args) {
        System.out.println(getMaxDiffInOrder(
                new ArrayList<>(
                        List.of(310, 315, 275, 295, 260, 270, 290, 230, 255, 600)
                )
        ));
    }
}
