import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
	// write your code here
       // int[] sayilar=new int[]{1,2,3};
       // sayilar = new int[4];
       // System.out.println(sayilar[0]);

        ArrayList sayilar = new ArrayList();

        sayilar.add(1); //0
        sayilar.add(10); //1
        sayilar.add(100); //2
        sayilar.add("Ankara"); //3
        sayilar.add("İstanbul"); //4
        System.out.println(sayilar.size());
        //System.out.println(sayilar.get(3));
        //sayilar.set(3,"İzmir");
       // System.out.println(sayilar.get(3));
       // System.out.println(sayilar.get(2));
        //sayilar.set(2,50);
        //System.out.println(sayilar.get(2));

       // sayilar.remove(0); // Remove ile indeksi uçuracağımız için 0 ı silersek sonraki indeks 0 a geçer.
        //System.out.println(sayilar.get(2)); //

      //  sayilar.clear(); // Dizinin tüm elemanlarını siler.

        for(Object i:sayilar)
        {
            System.out.println(i);
        }


    }
}
