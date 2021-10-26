public class Main {

    public static void main(String[] args) {
	// write your code here

       // String sehir = "Ankara";
      //  int sayi = sehir; Çalışmaz çünkü int sayısal değer , string metinsel değerdir.


     //   try
      //  {
       //     int sayilar[] = new int[]{1,2,3};
      //      System.out.println(sayilar[5]);

      //  }
       // catch (Exception ex)
        //{
          //  System.out.println("Abi bir hata var ama çözemedik "+ex);
       // }
       // finally { //Hata da olsa çalışır. Normalde olsa çalışır.
       //     System.out.println("Finally çalıştı.");
        //}

        //Exceptionlar throwable dan inherit edilir. //Exception bizim uygulamamızda uygulamada yazdıgımız kodlara yönelik olan hatalardır.
        //Error ise kodlarla müdehale edemeyeceğimiz hatalardır.
        //checked exception = bu hataların oluşabileceği noktalarda metodu kullanan kişilere bu metod hata fırlatır şeklinde uyarı vermemiz gerekiyor.

        try
        {
            int sayilar[] = new int[]{1,2,3};
            System.out.println(sayilar[5]);

        }
        catch (StringIndexOutOfBoundsException ex)
        {
            System.out.println("Abi bir hata var ama çözemedik "+ex);
        }
        catch (ArrayIndexOutOfBoundsException ex)
        {
            System.out.println("Abi bir hata var ama çözemedik "+ex);
        }
        catch (Exception ex)
        {
            System.out.println("Loglandı: "+ex);
        }
        finally { //Hata da olsa çalışır. Normalde olsa çalışır.
            System.out.println("Finally çalıştı.");
        }

    }
}
