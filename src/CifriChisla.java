import java.util.Scanner;

public class CifriChisla {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int x = sc.nextInt();
        int a1 = x / 100000;
        int a2 = x / 10000 % 10;
        int a3 = x / 1000 % 10;

        int b1 = x % 10;
        int b2 = x % 100 / 10;
        int b3 = x % 1000 / 100;

        System.out.println(
                a1 + a2 + a3 == b1 + b2 + b3 ? "YES" : "NO"
        );
    }
}
