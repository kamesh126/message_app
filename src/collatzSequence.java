import java.util.Scanner;
public class collatzSequence {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        while (n != 1) {
            if (n % 2 == 0) {
                n = n / 2;
            } else if (n % 2 != 0) {
                n = 3 * n + 1;
            }

            System.out.println(n);
        }
    }
}

