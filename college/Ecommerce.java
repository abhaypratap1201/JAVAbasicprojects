interface PaymentMethod {

    void pay(double amount);
}

class CreditCard implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Credit Card");
    }
}

class UPI implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using UPI");
    }
}

class NetBanking implements PaymentMethod {

    public void pay(double amount) {
        System.out.println("Payment of ₹" + amount + " made using Net Banking");
    }
}

public class Ecommerce {

    public static void main(String[] args) {

        PaymentMethod payment;

        payment = new CreditCard();
        payment.pay(5000);

        payment = new UPI();
        payment.pay(2000);

        payment = new NetBanking();
        payment.pay(3000);
    }
}