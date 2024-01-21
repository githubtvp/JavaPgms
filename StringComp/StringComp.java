import java.util.*;

public class StringComp {
    public static void main(String[] args) {
        String name1, name2;
        Scanner kb = new Scanner(System.in);
        pr("Enter name 1 : ");
        name1 = kb.nextLine();

        pr("Enter name 2 : ");
        name2 = kb.nextLine();

        String msg;
        msg = "Name 1 : " + name1 + "\nName 2 : " + name2;
        pr(msg);

        int res = name1.compareTo(name2);
        // Compare name1 and name2 and print results
        if (res < 0) {
            msg = "\nName 1 : " + name1 + " is greater than Name 2 : " + name2;
        } else if (res > 0) {
            msg = "\nName 1 : " + name1 + " is less than Name 2 : " + name2;
        } else {
            msg = "\nName 1 : " + name1 + " is same as Name 2 : " + name2;
        }
        pr(msg);

        boolean resB = name1.equalsIgnoreCase(name2);
        if (resB) {
            msg = "\nIgnoreCase : Name 1 : " + name1 + " is same as Name 2 : " + name2;
        } else {
            msg = "\nIgnore Case : Name 1 : " + name1 + " is Not same as Name 2 : " + name2;

        }
        pr(msg);
    }

    static void pr(String msg) {
        System.out.print(msg);
    };

}
