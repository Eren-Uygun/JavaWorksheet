public class Main {

    public static void main(String[] args) {
        int sayi=23;
        boolean Asalmi = true;

        if (sayi<1)
        {
            System.out.println("Geçersiz Sayı");
            return;

        }else if(sayi==1)
        {
            System.out.println("Sayı Asal Değildir.");
            return;
        }

        else {


            for (int j = 2; j < sayi; j++) {
                if (sayi % j == 0) {
                    Asalmi = false;
                }
            }

            if (Asalmi)
            {
                System.out.println("Bu sayi Asaldir");
            }
            else{
                System.out.println("Bu Sayi asal değildir.");
            }

        }


    }
}
