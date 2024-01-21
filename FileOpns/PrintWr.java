import java.util.Scanner;//needed for Scanner
import java.io.*;//needed for Printwriter and IO exceptions

public class PrintWr {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        String fileName, frName;;
        int nFr;
        pr("\nEnter number of friends :");
        nFr = kb.nextInt();
        kb.nextLine();//consume the newline char
        pr("\nEnter the file name : ");
        fileName = kb.nextLine();
        PrintWriter pw = new PrintWriter(fileName);
        for(int i = 0; i < nFr; i++)
        {
            pr("\nEnter a friend name : ");
            frName = kb.nextLine();
            pw.println(frName);
        }
        pw.close();
    }

    static void pr(String msg) {
        System.out.print(msg);

    }

}