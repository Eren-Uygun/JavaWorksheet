import java.text.Collator;
import java.util.ArrayList;
import java.util.Collections;

public class Main {

    public static void main(String[] args) {
	// write your code here

        ArrayList<String> sehirler = new ArrayList<String>(); //<> içinde yazılan hangi veri tipiyle çalışacağımız.
        sehirler.add("Ankara");
        sehirler.add("izmir");
        sehirler.add("istanbul");
        sehirler.add("Aydın");
        sehirler.add("Sinop");
        sehirler.add("Kastamonu");
        //sehirler.add(1); yazamayız çünkü int
       // sehirler.remove("İstanbul"); // istanbulu siler.

        Collections.sort(sehirler);


        for (String item:sehirler)
        {
            System.out.println(item);
        }

    }
}
