package Recursion;

public class moveCharstoEnd {
    public static void moveChars(String strn, int index, int count, String newString) {
        if (index == strn.length()) {
            for (int i = 0; i < count; i++) {
                newString += 'x';
            }
            System.out.print(newString);
            return;
        }
        if (strn.charAt(index) == 'x') {
            count++;
            moveChars(strn, index + 1, count, newString);
        } else {
            newString += strn.charAt(index);
            moveChars(strn, index + 1, count, newString);
        }
    }

    public static void main(String[] args) {
        String strn = "axxbcxde";
        moveChars(strn, 0, 0, "");
    }
}
