
class Cylinder
{
    public double radius;
    public double height;

    public double lidArea()
    {
        return Math.PI * (radius * radius);
    }

    public double circumference()
    {
        return 2 * Math.PI * radius;
    }

    public double totalSurfaceArea()
    {
        return circumference() * height + 2 * lidArea();
    }

    public double volume()
    {
        return lidArea() * height;
    }
}

public class CylinderTest {
    public static void main(String[] args) {

        Cylinder c = new Cylinder();

        c.height = 10;
        c.radius = 7;

        System.out.print("Lid Area: ");
        System.out.printf("%.2f", c.lidArea());
        System.out.println();
        System.out.print("Total Area: ");
        System.out.printf("%.2f", c.totalSurfaceArea());
        System.out.println();
        System.out.print("Volume: ");
        System.out.printf("%.2f",c.volume());

    }
}
