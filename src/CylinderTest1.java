class Cylinder1
{
    private int radius;
    private int height;

    public Cylinder1()
    {
        radius = 1;
        height = 1;
    }

    public Cylinder1(int r, int h)
    {
        radius = r;
        height = h;
    }

    public int getRadius()
    {
        return radius;
    }

    public int getHeight()
    {
        return height;
    }

    public void setRadius(int r)
    {
        if(r>=0)
            radius = r;
        else
            radius = 0;
    }

    public void setHeight(int h)
    {
        if(h>=0)
            height = h;
        else
            height = 0;
    }

    public void setDimensions(int r, int h)
    {
        height = h;
        radius = r;
    }

    public double lidArea()
    {
        return Math.PI * radius * radius;
    }

    public double perimeter()
    {
        return 2*Math.PI*radius;
    }

    public double totalSurface()
    {
        return perimeter()*height+2*lidArea();
    }

    public double volume()
    {
        return lidArea()*height;
    }



}


public class CylinderTest1 {
    public static void main(String[] args){

        Cylinder1 c=new Cylinder1();
        c.setHeight(10);
        c.setRadius(7);
        c.setDimensions(10, 7);

        System.out.println("LidArea: "+c.lidArea());
        System.out.println("Perimeter: "+c.perimeter());
        System.out.println("Total area: "+c.perimeter());
        System.out.println("Volume: "+c.volume());
        System.out.println("Height: "+c.getHeight());
        System.out.println("Radius: "+c.getRadius());

    }
}
