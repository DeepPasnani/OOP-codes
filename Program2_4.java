class BillGenerator 
{    
    void generateBill(int itemTotal) 
    {
        System.out.println("Regular Customer");
        System.out.println("Item Total: Rs. " + itemTotal);
        System.out.println("Discount: Rs. 0");
        System.out.println("Final Bill: Rs. " + itemTotal);
        System.out.println();
    }
    
    void generateBill(int itemTotal, int discount) 
    {
        int finalBill = itemTotal - discount;
        System.out.println("Privileged Customer");
        System.out.println("Item Total: Rs. " + itemTotal);
        System.out.println("Discount: Rs. " + discount);
        System.out.println("Final Bill: Rs. " + finalBill);
        System.out.println();
    }
    
    void generateBill(int itemTotal, double discountPercent) 
    {
        double discountAmount = itemTotal * discountPercent / 100;
        double finalBill = itemTotal - discountAmount;
        System.out.println("Festive Offer Customer");
        System.out.println("Item Total: Rs. " + itemTotal);
        System.out.println("Discount: " + discountPercent + "% (Rs. " + discountAmount + ")");
        System.out.println("Final Bill: Rs. " + finalBill);
        System.out.println();
    }
}

public class Program2_4
{
    public static void main(String args[]) 
    {
        BillGenerator billing = new BillGenerator();  
        System.out.println("Regular Customer: ");  
        billing.generateBill(5000);
        System.out.println("Privileged Customer: ");
        billing.generateBill(5000, 500);
        System.out.println("Festive Offer Customer: ");
        billing.generateBill(5000, 15.0);
    }
}
