import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String string = sc.nextLine();
        String mas[] = string.split(" ");
        int x = 0;
        int y = 0;
        for (int i = 0; i < mas.length; i++) {
            if (x < mas[i].length()) {
                x = mas[i].length();
                y = i;
            }
        }
        System.out.println(mas[y]);
    }
}