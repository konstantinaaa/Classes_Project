class Product
{
    private String itemNo;
    private String name;
    private double price;
    private int quantity;

    public Product(String itemNo)
    {
        this.itemNo = itemNo;
    }

    public Product(String itemNo, String name)
    {
        this.itemNo = itemNo;
        this.name = name;
    }

    public Product(String itemNo, String name, double price, int quantity)
    {
        this.itemNo = itemNo;
        this.name = name;
        setPrice(price);
        setQuantity(quantity);
    }

    public String getItemNo() {return itemNo;}
    public String getName() {return name;}
    public double getPrice() {return price;}
    public int getQuantity() {return quantity;}

    public void setPrice(double price)
    {
        this.price = price;
    }

    public void setQuantity(int quantity)
    {
        this.quantity = quantity;
    }
}

public class Product_Challenge {
    public static void main(String[] args)
    {
        Product p = new Product("005", "PC", 799, 53);
        System.out.println("Item number: " + p.getItemNo());
        System.out.println("Name: " + p.getName());
        System.out.println("Price: " + p.getPrice());
        System.out.println("Quantity: " + p.getQuantity());

    }
}
