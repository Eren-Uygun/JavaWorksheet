//Built-in : Java'nın içinde var. örneğin , Paketler arası iletişim import ile oluyor.
import Matematik.*;//Matematik içindeki tüm paketleri getirir.
//import Matematik.DortIslem;
//import Matematik.Logaritma;

import java.util.Scanner; /* Kullanıcıdan veri alır.*/
public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner data = new Scanner(System.in);
        System.out.println("Adınız: ");

        String isim = data.nextLine();

        System.out.println("Merhaba: "+isim);

        DortIslem dortIslem = new DortIslem();
        dortIslem.topla(2,3);

        Logaritma logaritma = new Logaritma();
        logaritma.logaritmaHesapla();





    }
}
