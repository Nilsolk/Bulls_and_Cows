import java.util.Scanner;

public class Main {

    public static long factorial(long n) {
        long x = 1;
        for (int i = 1; i < n + 1; i++) {
            x = x * i;
        }
        if (n == 0) {
            x = 1;
        }
        return x;
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        long n = Integer.parseInt(scanner.nextLine().trim());
        System.out.println(factorial(n));
    }
}