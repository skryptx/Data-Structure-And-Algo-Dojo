// Parity of number is:
// 1: if bit 1 is occurring odd number of times
// 0: if bit 1 is occuring even number of time or not at all

package EPIForJava;

public class ParityOfANumber {
    public static long getParityOfNumber(long num) {
        short result = 0;
        while (num > 0) {
            result  ^= (short) (num & 1); // XOR operation
            num >>=1;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(getParityOfNumber(9));
    }
}
