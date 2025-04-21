import java.util.Scanner;

public class Digit_Sum {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a[] = new int[n];
        for (int i = 0; i < n; i++)
            a[i] = sc.nextInt();

        int sum = 0;
        for (int i = 0; i < n; i++)
            sum += a[i];

        // int rev = 0;
        int digit_sum = 0;
        int r;

        for (int i = 0; i < n; i++) {
            int temp = a[i];
            while (temp != 0) {
                r = temp % 10;
                temp = temp / 10;
                digit_sum = digit_sum + r;
            }
        }
        System.out.println("sum = " + sum);
        System.out.println("digit sum = " + digit_sum);

        sc.close();
    }
}