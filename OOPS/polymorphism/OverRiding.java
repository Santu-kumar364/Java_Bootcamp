package Java_Bootcamp.OOPS.polymorphism;


abstract class Payment{
    abstract void pay(double amount);
}

class CreditCard extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using credit card");
    }

}

class PayPal extends Payment {
    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using payPal");
    }

}

class UPI extends Payment {

    @Override
    void pay(double amount) {
        System.out.println("Paid " + amount + " using UPI");
    }

}

public class OverRiding{
    public static void main(String[] args) {
        Payment p;
        
        p = new CreditCard();
        p.pay(25000);
    
        p = new PayPal();
        p.pay(4000);
    
        p = new UPI();
        p.pay(50000);
    }

}





