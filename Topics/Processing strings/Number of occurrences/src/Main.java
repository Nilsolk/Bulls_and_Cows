import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String string = " " + scanner.nextLine() + " ";
        String substring = scanner.nextLine();

        System.out.println(string.split(substring).length - 1);
    }
}