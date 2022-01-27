package bullscows;

import static java.lang.String.valueOf;

public class Number {
    String number;
    private int bulls;
    private int cows;


    Number(String number) {
        this.number = number;
    }

    void proverka(StringBuilder str, String x) {
        String first = String.valueOf(str);
        //StringBuilder str=new StringBuilder();
        /*for (int i = 0; i < Integer.valueOf(x); i++) {
            if (number.charAt(i) == str.charAt(i)){
                //str.append(number.charAt(i));
                bulls++;
            } else if (str.indexOf(String.valueOf(number.charAt(i))) != -1) {
                    cows++;


                }
            }

         */
        for (int i = 0; i < number.length(); i++) {
            if (number.charAt(i) == first.charAt(i)) {
                bulls += 1;
            } else if (first.indexOf(number.charAt(i)) != -1) {
                cows += 1;
            }
        }

    }

    public int getBulls() {
        return bulls;
    }

    public int getCows() {
        return cows;
    }
}
