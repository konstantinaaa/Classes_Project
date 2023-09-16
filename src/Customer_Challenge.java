class Customer {
    private String custID; // customer ID
    private String name;
    private String address;
    private String phno; // phone number

    public Customer(String custID, String name)
    {
        this.custID = custID;
        this.name = name;
    }

    public Customer(String custID, String name, String address, String phno)
    {
        this.custID = custID;
        this.name = name;
        setAddress(address);
        setPhno(phno);
    }

    public String getCustID() {return custID;}
    public String getName() {return name;}
    public String getAddress() {return address;}
    public String getPhno() {return phno;}

    public void setAddress(String address)
    {
        this.address = address;
    }

    public void setPhno(String phno)
    {
        this.phno = phno;
    }
}


public class Customer_Challenge {
    public static void main(String[] args) {

        Customer c = new Customer("011", "John", "Athens", "00003365");
        System.out.println("Customer ID: " + c.getCustID());
        System.out.println("Name: " + c.getName());
        System.out.println("Address: " + c.getAddress());
        System.out.println("Phone number: " + c.getPhno());


    }
}
