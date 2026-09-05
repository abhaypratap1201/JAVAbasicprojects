import java.util.Scanner;
public class OnlineShopping {
    int productId;
    String productName;
    double Price;
    int quantity;
    public OnlineShopping(int productId, String productName, double Price, int quantity) {
        this.productId = productId;
        this.productName = productName;
        this.Price = Price;
        this.quantity = quantity;
    }
    public void calculate(){
        double totalprice=Price*quantity;
        System.out.println("Total Price: " + totalprice);
        if(totalprice>5000){
            double discount=totalprice*0.1;
            System.out.println("Discount: " + discount);
            totalprice=totalprice-discount;
        }
        System.out.println("Final Price: " + totalprice);
    }
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter Product ID: ");
        int productId=sc.nextInt();
        sc.nextLine(); 
        System.out.print("Enter Product Name: ");
        String productName=sc.nextLine();
        System.out.print("Enter Price: ");
        double Price=sc.nextDouble();
        System.out.print("Enter Quantity: ");
        int quantity=sc.nextInt();
        OnlineShopping o1=new OnlineShopping(productId, productName, Price, quantity);
        o1.calculate();
    }
    
}
