package EPIForJava;

import java.util.Scanner;

public class SwapTheBits {
    public static long swapTheBits(long num, int index1,  int index2) {
        long a = (num >>> index1) & 1;
        long b = (num >>> index2) & 1;
        if(a != b) {
            return (1 << index1 | 1 << index2) ^ num;
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var num = scanner.nextLong();
        var index1 = scanner.nextShort();
        var index2 = scanner.nextShort();
        System.out.println(swapTheBits(num, index1, index2));
        scanner.close();
    }
}
