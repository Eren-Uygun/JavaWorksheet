public class AccountManager {
   private double balance;

   public void deposite(double amount){
       balance = getBalance() + amount;

   }

   public  void withdraw(double amount) throws BalanceInsufficentException {
       if (balance>=amount) {
           balance = getBalance() - amount;
       }else{
          // System.out.println("Hesapdan para çekilemedi.Bakiye yetersiz.");
           throw new BalanceInsufficentException("Bakiye yetersiz.");
       }
   }

    public double getBalance() {
        return balance;
    }
}
