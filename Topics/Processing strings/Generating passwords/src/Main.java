import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        int A = scanner.nextInt();
        int B = scanner.nextInt();
        int C = scanner.nextInt();
        int N = scanner.nextInt();

        char[] uppercase = new char[]{'A', 'B'};
        char[] lowercase = new char[]{'a', 'b'};
        char[] digits = new char[]{'1', '2'};
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < N; i++) {
            if (A > 0) {
                sb.append(uppercase[i % 2]);
                A--;
                continue;
            }
            if (B > 0) {
                sb.append(lowercase[i % 2]);
                B--;
                continue;
            }
            if (C > 0) {
                sb.append(digits[i % 2]);
                C--;
                continue;
            }
            sb.append(lowercase[i % 2]);
        }
        System.out.println(sb.toString());
    }
}