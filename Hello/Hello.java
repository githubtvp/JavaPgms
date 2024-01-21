import java.util.Scanner;
import javax.swing.JOptionPane;

public class Hello {
    public static void main(String[] args) {

    	Scanner kb = new Scanner(System.in);
        String name;
        String msg;
        msg = "Enter your name : "; // Use prW instead of pr
        //pr(msg); // Use prW instead of pr
        //name = kb.nextLine();
        name =prG(msg);
        char yNChar;
        String inputYorN;
        msg = "Enter 'y' for yes or 'n' for no : "; // Use prW instead of pr
        //pr(msg); // Use prW instead of pr
        //inputYorN = kb.nextLine();
        inputYorN = prG(msg);
        yNChar = inputYorN.charAt(0);
        prW("Hello " + name); // Use prW instead of pr
        prW("You entered : " + yNChar); // Use prW instead of pr
        System.exit(0);
    }

    static void pr(String msg) {
        System.out.println(msg);
    }

    static void prW(String msg) {
        JOptionPane.showMessageDialog(null, msg);
    }
    
    static String prG(String msg) {
        String str = JOptionPane.showInputDialog(msg);
        return str;        
    }
}
