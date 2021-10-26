public class Main {
//Statik yapılar
    //Statik yapılar Uygulamada utility araç yazarken kullanılabilir.
    //Statik yapılar program kapatılana kadar bellekte tutulur. Manager sınıflar statik yapılmaz.
    //c# da statik yapının constructoru çalışırken javada çalışmaz.
    public static void main(String[] args) {

        ProductManager productManager = new ProductManager();
        Product product = new Product();
        product.price = 10;
        product.name = "Mouse";

        productManager.Add(product);
    }
}
