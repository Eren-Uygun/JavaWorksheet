import java.util.ArrayList;

public class Main {

    //Birbirine benzeyen operayonları typesafe olarak kullanmış oluyoruz genericlerle
    //Array list default olarak object nesnesi olarak çalışır yani içine ne koysarsak object tipindedir.
    public static void main(String[] args) {
	// write your code here
        //ArrayList sehirler = new ArrayList();
      //  ArrayList<String> sehirler = new ArrayList(); //Arraylist bi class dır. New'leyebiliyoruz.
      //  sehirler.add("Ankara");
       // sehirler.add("İstanbul");
       // sehirler.add(1); string olunca bu çalışmaz
      //  sehirler.add("İzmir");
        MyList<Customer> sehirler = new MyList<Customer>();//
        //sehirler.add("Ankara");
        //sehirler.add(1); yapılamaz string değil
        sehirler.add(new Customer());
        sehirler.add(new Customer());





    }
}
