import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        ArrayList<Customer> customers = new ArrayList<Customer>();
        customers.add(new Customer(1,"Eren","Uyğun"));
        customers.add(new Customer(2,"Mert","Dinç"));
        customers.add(new Customer(3,"Emre","Dedeağaç"));
        Customer firat = new Customer(4,"Firat","Bahadır");

       // customers.remove(new Customer(3,"Emre","Dedeağaç")); //Silmez

        customers.remove(firat);


        for(Customer customer:customers)
        {
            System.out.println(customer.firstName);
        }


    }
}
