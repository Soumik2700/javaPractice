import java.util.Scanner;

public class circumOfCircle {
    public static double findCircum(float redius) {
        double circum = 2 * 3.143 * redius;

        return circum;
    }

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Enter the redius:");
        float redius = sc.nextFloat();

        System.out.println("Circumference of circle : " + findCircum(redius));
    }
}
