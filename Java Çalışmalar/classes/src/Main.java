

public class Main {
// Classlar(sınıflar) referans tipdir.
    public static void main(String[] args) {
CustomerManager customerManager = new CustomerManager();
CustomerManager customerManager1 = new CustomerManager();
        customerManager = customerManager1; // Bellekte customermanager1 in stackdeki degeri customermanagere geçti.
        //Referansı tutan bir değer kalmaz ise Garbage collector(Java bellek yöneticisi) onu siler.
        customerManager.Add();
        customerManager.Update();
        customerManager.Remove();


        //Value Types(Değer tipler)
        int sayi1=10;
        int sayi2=20;
        sayi2 = sayi1;
        sayi1 = 30;
        System.out.println(sayi2);


        int[] sayilar1 = new int[]{1,2,3};
        int[] sayilar2 = new int[]{4,5,6};
        sayilar2 = sayilar1;//Sayilar 2 nin referans numarası Sayilar 1 in referans numarasına dönüştü.
        sayilar1[0] = 10; // Sayilar2 sayilar1 in referans numarasını aldığı için sayilar1[0] elemanı 10 oldu.
        System.out.println(sayilar2[0]); //Referans değer olduğu için değer 10 olarak gelecektir.



    }
}

