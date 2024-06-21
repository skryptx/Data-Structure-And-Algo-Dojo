package EPIForJava.ChapterFive;

import java.util.Scanner;

public class IsDecimalPalindrome {
    public static long getReverseOfNumber(long num) {
        long result = 0;

        while(num != 0) {
            result = result * 10 + (num % 10) ;
            num = num/10;
        }

        return result;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long num = scanner.nextLong();
        long reverseNum = getReverseOfNumber(num);
        System.out.println(reverseNum);
        if(num == reverseNum) {
            System.out.println("Provided number is a palindrome!");
            return;
        }

        System.out.println("Provided number is not a palindrome!");
    }
}
