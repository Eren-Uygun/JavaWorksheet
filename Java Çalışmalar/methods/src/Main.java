public class Main {

    public static void main(String[] args) {
        // write your code here
        sayiBul();
    }
    //Metotlar


    public static void sayiBul() {
        int[] sayilar = new int[]{1, 2, 5, 7, 9, 0};
        int aranacak = 6;
        boolean varMi = false;

        for (int sayi : sayilar) {
            if (sayi == aranacak) {
                varMi = true;
                break;
            }
        }

        if (varMi) {
            mesajVer("Sayı mevcuttur"+aranacak);
        } else {
            mesajVer("Sayı mevcut değildir"+aranacak);
        }
    }


    public static void mesajVer(String aranacak) {

        System.out.println("Sayı mevcuttur" + aranacak);
    }

}
