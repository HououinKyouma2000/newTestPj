import java.util.Scanner;

public class MainCoins {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int n = sc.nextInt();
        {
            int count = 0;
            int count2 = 0;
            for (int i = 0; i < n; i++) {
                if (sc.nextInt() == 0)
                    count++;
                else count2++;
            }
            System.out.println(Math.min(count, count2));
        }
    }
}
