public class Main {

    public static void main(String[] args) {
	// write your code here
        String[][] Sehirler = new String[3][3]; //3x3 lük bir dizi oluşturuyoruz.
        String[][][] Sehirler1 = new String[3][3][3]; //3x3x3 lük bir dizi oluşturuyoruz.
        Sehirler[0][0]="İstanbul";
        Sehirler[0][1]="Bursa";
        Sehirler[0][2]="Bilecik";
        Sehirler[1][0]="Ankara";
        Sehirler[1][1]="Konya";
        Sehirler[1][2]="Kayseri";
        Sehirler[2][0]="Diyarbakır";
        Sehirler[2][1]="Şanlıurfa";
        Sehirler[2][2]="Gaziantep";

        for (int i = 0; i<=2;i++)
        {
            System.out.println("----------------------------");
            for(int j=0;j<=2;j++){

                System.out.println(Sehirler[i][j]);

            }
        }
        System.out.println("----------------------------");
        System.out.println("For döngüsü bitti");

    }
}
