import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();
        double p;
        p = (double) (a + b + c) / 2;
        p = Math.sqrt(p * (p - a) * (p - b) * (p - c));
        System.out.println(p);

    }
}