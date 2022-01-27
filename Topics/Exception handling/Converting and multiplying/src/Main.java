import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int ten = 10;
        while (!scanner.hasNext("0")) {
            String input = scanner.nextLine();
            try {
                System.out.println(Integer.parseInt(input) * ten);
            } catch (Exception e) {
                System.out.println("Invalid user input: " + input);
            }
        }
    }
}