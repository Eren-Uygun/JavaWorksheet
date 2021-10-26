import java.util.HashMap;

//hashmap yapısı sözlüğe benzer bir yapıdır.
public class Main {

    public static void main(String[] args) {
	// write your code here
                 //T    //T
        HashMap<String,String> sozluk = new HashMap<String,String>();
        sozluk.put("book","kitap");
        sozluk.put("table","masa");
        sozluk.put("computer","bilgisayar");
                    // key        //value
        System.out.println(sozluk.size());
        for(String item:sozluk.keySet()){
            System.out.println("Eleman-"+item+" Değer-"+sozluk.get(item));
        }






        sozluk.remove("table"); //table key olan yeri siler.
        System.out.println(sozluk.size());
        //sozluk.clear(); // tamamen siler.
        System.out.println(sozluk.get("computer"));




    }
}
