package Commons;
public class SwapTheElementsInArray {

    public static <T> void swapTheElements(T[] elements, int index1, int index2) {
        T temp = elements[index1];
        elements[index1] = elements[index2];
        elements[index2] = temp;
    }
}
