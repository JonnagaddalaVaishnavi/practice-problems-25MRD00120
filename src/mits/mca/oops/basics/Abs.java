package mits.mca.oops.basics;


abstract class Payment {
    private String name;
    private int amount;

    public Payment(String name, int amount) {
        this.name = name;
        this.amount = amount;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
    public abstract void pay();
    public void display(){
        System.out.println(name);
        System.out.println(amount);
    }
}

class PhonePay extends Payment {
    public PhonePay(String name, int amount) {
        super(name, amount);
    }

    @Override
    public void pay() {
        System.out.println("Payment done through phonepay");
    }
}

public class Abs {
    public static void main(String[] args) {
        Payment pp  = new PhonePay("Vaishnavi", 5000);
        pp.display();
    }
}
