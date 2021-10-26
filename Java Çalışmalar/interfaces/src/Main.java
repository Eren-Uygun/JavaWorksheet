public class Main {

    public static void main(String[] args) {
	// write your code here
        //interface onu implement eden class'ın referansını tutabilir.(Polymorphism çok biçimlilik)

        CustomerManager customerManager = new CustomerManager(new MySqlCustomerDal());
        customerManager.add();


    }
}
