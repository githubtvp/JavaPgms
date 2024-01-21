import java.text.DecimalFormat;
import java.util.Scanner;

public class DecimalFormatter {
    public static void main(String[] args) {
       //+ Scanner kb = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("#0.00");//# no leading 0's
        DecimalFormat df1 = new DecimalFormat("#,#0.00");//# no leading 0's
        double num1 = 1000.0;
        double num2 = 3.0;
        int num3 = 3;
        double res = num1 / num2;
        pr("\n1. Result of Double divsion : " + df.format(res));
        res = num1 / num3;
        pr("\n2. Result of Double divsion : " + df1.format(res));
    }

    static void pr(String msg)
    {
        System.out.print(msg);
    }
}
