import java.util.*;

public class Main {

    static void changeList(List<String> list) {
        int Len = 0;
        String first = null;
        for (String i : list) {
            if (i.length() > Len) {
                Len = i.length();
                first = i;
            }
        }
        Collections.fill(list, first);
    }

    /* Do not change code below */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String s = scanner.nextLine();
        List<String> lst = Arrays.asList(s.split(" "));
        changeList(lst);
        lst.forEach(e -> System.out.print(e + " "));
    }
}