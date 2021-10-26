import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class Main {

    public static void main(String[] args){
        BufferedReader reader = null;
        int total = 0;

        try {

           // BufferedReader reader = new BufferedReader(new FileReader("C:\\Users\\LornV\\Desktop\\Java Çalışmalar\\readingFileDemo\\src\\sayilar.txt"));
            reader =  new BufferedReader(new FileReader("C:\\Users\\LornV\\Desktop\\Java Çalışmalar\\readingFileDemo\\src\\sayilar.txt"));
            String line =null;
            while ((line =reader.readLine())!=null)
            {
                int sayi = Integer.parseInt(line);
                total  += sayi;

            }
            System.out.println("Toplam = " + total);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            try {
                reader.close();
            } catch (Exception e) {
                e.printStackTrace();
            }

        }


    }
}
