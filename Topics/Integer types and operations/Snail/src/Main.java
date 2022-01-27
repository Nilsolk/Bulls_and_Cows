import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        int res = (a-b)/(b-c) + ((b-c)-1+(a-b)%(b-c))/(b-c)+1;


        System.out.println(res);
    }
}
