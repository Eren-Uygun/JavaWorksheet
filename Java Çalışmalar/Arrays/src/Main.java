public class Main {

    public static void main(String[] args) {
	// write your code here

        String ogrenci1 = "David";
        String ogrenci2 = "Jacob";
        String ogrenci3 = "Gwen";

        System.out.println(ogrenci1);
        System.out.println(ogrenci2);
        System.out.println(ogrenci3);

        String[] ogrenciler = new String[3]; // 3 Elemanlı bir dizi tanımladık. indexler 0 dan başlar.

        ogrenciler[0] = "Darius";
        ogrenciler[1] = "Attila";
        ogrenciler[2] = "Sun Tsu";

        for (int i=0; i< ogrenciler.length;i++)
        {
            System.out.println(ogrenciler[i]);
        }

        for (String ogrenci:ogrenciler){ //Ogrenciler dizisindeki herbir elemanı gez erişimi ogrenci degiskeni ile saglayacağız
System.out.println(ogrenci);
        }


    }
}
