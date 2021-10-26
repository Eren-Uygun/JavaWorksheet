public class Product {
//This içerisinde bulunduğumuz classdır.
    //Attribute | field diyebiliriz. // Javada field ler default olarak public tanımlıdır c# dan farkı budur.
    //field lar _ ile yazılır.
   private int _Id;
   private String _Name;
   private String _Description;
   private Double _Price;
   private int _StockAmount;

   public Product(){

   }



   //Overloading parametreli ve parametresiz constructor u var isteyen istediği gibi kullanır.
   public Product(int id,String name,String description,double price,int stockAmount) {
       //Newlerken bu değerleri vermek zorundayız.
       this._Id =  id;
       this._Name = name;
       this._Description = description;
       this._Price = price;
       this._StockAmount = stockAmount;



   }

   //Getter
   public int getId(){ //sadece get veya set de kullanabiliriz.
       return _Id;
   }

   //Setter
   public void setId(int id){ // set edilecek değer parametre olarak verilmelidir.
       _Id = id;
   }


    public String get_name() {
        return _Name;
    }

    public void set_Name(String _Name) {
        this._Name = _Name;
    }

    public String get_description() {
        return _Description;
    }

    public void set_Description(String _Description) {
        this._Description = _Description;
    }

    public Double get_price() {
        return _Price;
    }

    public void set_Price(Double _Price) {
        this._Price = _Price;
    }

    public int get_stockAmount() {
        return _StockAmount;
    }

    public void set_StockAmount(int _StockAmount) {
        this._StockAmount = _StockAmount;
    }
}
