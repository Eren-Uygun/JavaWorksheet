public class Main {

    public static void main(String[] args) {
	// write your code here

        Product product = new Product(1,"Laptop","AsusLaptop",1000.00,5);
        product.setId(1); // ürün id si 1 e settlendi.
        product.set_Name("Laptop");
        product.set_Description("Asus Laptop");
        product.set_Price(5000.00);
        product.set_StockAmount(3);

        ProductManager pmanager = new ProductManager();
        pmanager.Add(product);
    }
}
