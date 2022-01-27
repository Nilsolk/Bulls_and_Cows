package bullscows;

import java.util.Random;
import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;


public class Main {
    static Scanner sc = new Scanner(System.in);
    static boolean flag = false;
    static StringBuilder strinBuild;
    static String alph = "0123456789abcdefghijklmnopqrstuvwxyz";
    static StringBuilder alth = new StringBuilder(alph);

    public static StringBuilder randomGeneration(String len, StringBuilder alth, int min, int max) {
        int t = 0;
        Random random = new Random();
        StringBuilder sb = new StringBuilder();
        if (Integer.parseInt(len) > 36) {
            System.out.println("Error: can't generate a secret number with a length of " + len + " because there aren't enough unique digits.");
        } else {
            while (t != Integer.parseInt(len)) {
                int randomNum = ThreadLocalRandom.current().nextInt(min, max + 1);
                char k = alth.charAt(randomNum);
                if (sb.indexOf(String.valueOf(k)) == -1) {
                    sb.append(k);
                    t++;
                }
            }
        }
        return sb;
    }

    public static void vivod(String charLen, StringBuilder alth, String len) {
        int k = 0;
        System.out.println("Secret code: ");
        while (k != Integer.parseInt(len)) {
            System.out.print("*");
            k++;
        }
        System.out.print(" ");

        if (Integer.parseInt(charLen) < 9) {
            System.out.print("(0-" + alth.charAt(Integer.parseInt(charLen) - 1) + ").");
        } else if (Integer.parseInt(charLen) >= 9) {
            System.out.print("(0-9, a-" + alth.charAt(Integer.parseInt(charLen) - 1) + ").");
        }
        System.out.println(" ");
    }

    public static void main(String[] args) {

        System.out.println("Введите длину числа");
        String len = sc.nextLine();
        try {
            int x;
            x = Integer.parseInt(len);
        } catch (Exception e){
            System.out.println("Error ++");
            System.exit(0);
        }
        System.out.println("Введите количество возможных символов в коде");
        String charLen = sc.nextLine();
        if (Integer.valueOf(len) == 0 || Integer.valueOf(charLen) > 36 ) {
            System.out.println("error");
        } else {

            if ((Integer.parseInt(charLen) > Integer.parseInt(len))) {

                vivod(charLen, alth, len);

                strinBuild = new StringBuilder(randomGeneration(len, alth, 0, Integer.parseInt(charLen)));

                while (!flag) {
                    System.out.println("Введите code");
                    String x = sc.nextLine();
                    Number number = new Number(x);
                    number.proverka(strinBuild, len);

                    int bulls = number.getBulls();
                    int cows = number.getCows();
                    StringBuilder sb2 = new StringBuilder(x);
                    if (bulls == Integer.parseInt(len)) {
                        System.out.println("Grade: " + bulls + " bulls");
                        flag = true;
                        break;
                    } else {
                        System.out.println("Grade: " + bulls + " bulls " + cows + " cow");
                    }

                }

            } else {
                System.out.println("Error");
            }
        }
    }
}
