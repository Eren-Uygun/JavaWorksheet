import java.io.*;
import java.net.PortUnreachableException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
     //   File file  = new File("filepath");
       //createFile();
        //getFileInfo();
        readFile();
        writeFile();
        readFile();

    }

    public static void createFile()
    {
        File file  = new File("C:\\Users\\LornV\\Desktop\\Java Çalışmalar\\workingWithFiles\\Files\\Students.txt");
        try {
            if (file.createNewFile()) //Dosya oluşturulmasına göre true yada false döner;
            {
                System.out.println("Dosya oluşturuldu.");
            }
            else{
                System.out.println("Dosya zaten mevcut.");
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void getFileInfo()
    {
        File file  = new File("C:\\Users\\LornV\\Desktop\\Java Çalışmalar\\workingWithFiles\\Files\\Students.txt");
        //file.exists(); Böyle bir dosya varsa true döner yoksa false döner.

        if (file.exists())
        {
            System.out.println("Dosya adı: "+ file.getName());
            System.out.println("Dosya yolu: "+file.getAbsolutePath());
            System.out.println("Dosya yazılabilir mi?: "+file.canWrite());
            System.out.println("Dosya okunabilir mi?: "+file.canRead());
            System.out.println("Dosya boyutu : "+file.length()); //byte cinsinden dosya boyutu verir.
        }
    }

    public static void readFile()
    {
        File file  = new File("C:\\Users\\LornV\\Desktop\\Java Çalışmalar\\workingWithFiles\\Files\\Students.txt");
        try {
            Scanner reader = new Scanner(file);
            while (reader.hasNextLine()) // readline işlemini yapabildiği sürece yani okuyabildiği sürece
            {
                String line = reader.nextLine();
                System.out.println(line);


            }
            reader.close();
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }

    public static void writeFile()
    {
        try {
           // FileWriter file  = new FileWriter("C:\\Users\\LornV\\Desktop\\Java Çalışmalar\\workingWithFiles\\Files\\Students.txt");
            //Efektif olarak kullanabilmek için bufferedWriter yazabiliriz.
            BufferedWriter file  = new BufferedWriter(new FileWriter("C:\\Users\\LornV\\Desktop\\Java Çalışmalar\\workingWithFiles\\Files\\Students.txt",true)); // Sonuna ekleme şekline çalışır yani son satıra direkt ekler.
            file.newLine(); // Bitişik yazma sorununu çözmek için satır atlatıyoruz.
            file.write("Ahmet"); // Bu şekilde yazarsak dosyamızın içine siler ve ahmet yazar.
            System.out.println("Dosyaya yazıldı.");
            file.close();



        } catch (IOException e) {
            e.printStackTrace();
        }
    }



}
