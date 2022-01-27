import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String x = sc.nextLine();
        String[] mass = x.split("-");
        System.out.println(mass[1] + "/" + mass[2] + "/" + mass[0]);

    }
}