package BitManipulation;

public class checkBit {
    public static void main(String[] args) {
        int num = 9;
        int pos = 2;
        int bitMask = 1 << pos;

        if ((bitMask & num) == 0) {
            System.out.print("Bit was 0");
        } else {
            System.out.print("Bit was 1");
        }
    }
}
