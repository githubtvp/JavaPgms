import java.util.Scanner;
import javax.swing.JOptionPane;

class Rectangle// only one class can have public access .. that should be the class having the main()
{
    private double length;
    private double width;

    public Rectangle(double len, double w)
    {
        length = len;
        width = w;            
    }

    public void setLength(double len)
    {
        length = len;
    }
    public void setWidth(double w)
    {
        width = w;
    }

    public double getLength()
    {
        return length;
    }

    public double getWidth()
    {
        return width;
    }

    public double getArea()
    {
        return (length * width);
    }
}

public class RectangleDemo
{
    public static void main(String[] args)
    {
        Rectangle box = new Rectangle(5,5);
        box.setLength(10.0);
        box.setWidth(20.0);
        String msg;
        msg = "The box legth is : " + box.getLength();
        pr(msg);
        msg = "The box width is : " + box.getWidth();
        pr(msg);
        msg = "The box area is : " + box.getArea();
        pr(msg);
    }

    static void pr(String msg) {
        System.out.println(msg);
    }
}