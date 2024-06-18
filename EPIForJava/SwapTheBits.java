package EPIForJava;

import java.util.Scanner;

public class SwapTheBits {
    public static long swapTheBits(long num, int index1,  int index2) {
        long mask = 0;
        for(int i=1; i<=64; i++) {
            if(i == index1 || i == index2) {
                mask = (mask >>> 1) ^ 1;
            } else {
                mask <<= 1;
            }
        }
        return mask ^ num;
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
