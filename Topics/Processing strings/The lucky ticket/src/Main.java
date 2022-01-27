import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String N = s.next();
        int n = 0;
        for (int i = 0; i < N.length(); i++) {
            if (i < 3) {
                n += N.charAt(i) - '0';
            } else {
                n -= N.charAt(i) - '0';
            }
        }
        if (n == 0) {
            System.out.print("Lucky");
        } else {
            System.out.print("Regular");
        }
    }
}