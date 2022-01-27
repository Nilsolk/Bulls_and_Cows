import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = n % 10 * 100;
        int k = n / 10 % 10 * 10;
        int t = n / 100 % 10;

        System.out.println(m + k + t);
    }
}
