import java.util.Scanner;

public class Fibonachi {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        if (x == 0) {
            System.out.println(x);
            return;
        }
        int y = 1;
        int y0 = 0;
        for (int i = 1; i < x; i++) {
            int a = y;
            y += y0;
            y0 = a;
        }
        System.out.println(y);
    }
}
