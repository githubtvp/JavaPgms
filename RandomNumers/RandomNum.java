import java.util.Random;
public class RandomNum {
    public static void main(String[] args) {
        Random rn = new Random();
        int rno = rn.nextInt(100); // 0 - 99
        pr("\nRandom number : " + rno);

        rno = rn.nextInt(10) + 1; // 1 - 10
        pr("\nRandom number : " + rno);

        rno = rn.nextInt(100) - 50; // -50 - 49
        pr("\nRandom number : " + rno);

        double rnoD = rn.nextDouble(); // 0.0 - 1.0
        pr("\nRandom number : " + rnoD);

        float rnoF = rn.nextFloat(); // 0.0 - 1.0
        pr("\nRandom number : " + rnoF);
    }
    static void pr(String msg)
    {
        System.out.print(msg);
    }
}
