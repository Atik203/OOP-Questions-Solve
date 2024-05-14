interface Transaction {
    public void give();
    public void receive();
}

abstract class Payment implements Transaction {

    double amount;
    String currency = "BDT";

    public void give() {
        amount += getCharge()+getTax();
        System.out.println("Giving " + amount + " " + currency);
    }

    public void receive() {
        System.out.println("Nothing to receive");
    }

    public abstract double getCharge();

    public double getTax(){
        return amount * 0.156;
    }
}

class CashPay extends Payment {

        public double getCharge() {
          return 0;
        }

}

class CreditCardPay extends Payment {

        public double getCharge() {
         return super.amount * 0.025;
        }


}

class CheckPay extends Payment {

        public double getCharge() {
           return 10;
        }

}