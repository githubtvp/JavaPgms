import java.util.Scanner;//needed for Scanner
import java.io.*;//needed for Printwriter and IO exceptions

public class FileWr {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        String fileName, frName;;
        int nFr;
        pr("\nEnter number of friends to be appended :");
        nFr = kb.nextInt();
        kb.nextLine();//consume the newline char
        pr("\nEnter the file name : ");
        fileName = kb.nextLine();
        FileWriter fwr = new FileWriter(fileName, true);
        PrintWriter pw = new PrintWriter(fwr);
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