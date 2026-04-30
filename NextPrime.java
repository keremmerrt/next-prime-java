import java.util.Scanner;

public class NextPrime {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        int x = input.nextInt();

        if (x < 1 || x > 1000000000) {
            input.close();
            return;
        }

        int p = x;

        if (p == 1) {
            p++;
        }

        while (true) {
            boolean isPrime = true;

            for (int i = 2; i * i <= p; i++) {
                if (p % i == 0) {
                    isPrime = false;
                    break;
                }
            }

            if (isPrime) {
                System.out.println(p);
                break;
            }

            p++;
        }

        input.close();
    }
}