import java.util.Scanner;//needed for Scanner
import java.io.*;//needed for Printwriter and IO exceptions

public class FileRead {
    public static void main(String[] args) throws IOException {
        Scanner kb = new Scanner(System.in);
        String fileName, frName;;
        int nFr = 5;
        pr("\nEnter the file name : ");
        // fileName = kb.nextLine();
        fileName = "friends.txt";

        File myFile = new File(fileName);
        Scanner readF = new Scanner(myFile);
        for(int i = 0; i < nFr; i++)
        {
           pr("\n" + readF.nextLine());
        }
        readF.close();
    }

    static void pr(String msg) {
        System.out.print(msg);

    }

}