package EPIForJava.ChapterSix;

import java.util.Arrays;

public class MultipleTwoPrecisionNumbersInArrayForm {
    public static int[] num1IntoOneDigit(int[] num1, int multiplier) {
        int[] singleRes = new int[num1.length + 1];
        int remainder = 0, prod;
        for(int i=num1.length - 1; i >= 0; i--) {
            prod = Math.abs(num1[i] * multiplier) + remainder;
            singleRes[i+1] = prod%10;
            remainder = prod/10;
        }
        singleRes[0] = remainder;
        return singleRes;
    }
    public static int[] multiply(int[] num1, int[] num2) {
        int[] result = new int[num1.length + num2.length + 1];
        int tempRemainder = 0;
        int tempSum;
        int calcPos = 0;
        for (int i = num2.length - 1; i >= 0; i--) {
            int threshold = result.length - calcPos - 1;
            int[] singleRes = num1IntoOneDigit(num1, num2[i]);
            for (int k = singleRes.length - 1; k >= 0; threshold--,k--) {
                tempSum = singleRes[k] + result[threshold] + tempRemainder;
                tempRemainder = tempSum/10;
                result[threshold] = tempSum % 10;
            }
            result[threshold] = tempRemainder;
            calcPos++;
        }

        return result;
    }
    public static void main(String[] args) {
        int[] multiplyRes = multiply(new int[]{1,9,3,7,0,7,7,2,1}, new int[]{-7,6,1,8,3,8,2,5,7,2,8,7});

        System.out.println(Arrays.toString(multiplyRes));
    }
}
