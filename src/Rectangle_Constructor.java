
class Rectangle2
{
    private double length;
    private double breadth;

    public Rectangle2()
    {
        length = 1;
        breadth = 1;
    }

    public Rectangle2(double l, double b)
    {
        setLength(l);
        setBreadth(b);
    }

    public Rectangle2(double s)
    {
        length = breadth = s;
    }

    public double getLength()
    {
        return length;
    }

    public double getBreadth()
    {
        return breadth;
    }

    public void setLength(double l)
    {
        if (l >= 0)
            length = l;
        else
            length = 0;
    }

    public void setBreadth(double b)
    {
        if(b >= 0)
            breadth = b;
        else
            breadth = 0;
    }

    public double area()
    {
        return getLength() * getBreadth();
    }

    public double perimeter()
    {
        return 2*(length+breadth);
    }

    public boolean isSquare()
    {
        return length == breadth;
    }
}


public class Rectangle_Constructor {
    public static void main(String[] args) {

        Rectangle2 r = new Rectangle2(10,5);
        System.out.println("Area: " + r.area());
        System.out.println("Perimeter: " + r.perimeter());
        System.out.println("Is it a square? : " + r.isSquare());

    }
}
