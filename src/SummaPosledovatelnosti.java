import java.util.Scanner;

public class SummaPosledovatelnosti {
    public static final Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        String[] str = sc.nextLine().split(" ");
        int sum = 0;
        int i = 0;
        while (i < str.length && Integer.parseInt(str[i]) != 0) {
            sum +=Integer.parseInt(str[i]);
            i++;
        }
        System.out.println(sum);
    }
}
