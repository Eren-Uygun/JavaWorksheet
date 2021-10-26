public class ProductValidator {
    static {
        System.out.println("Statik yapıcı block çalıştı.");
    }

    public boolean isValid(Product product){
        if (product.price>0 && product.name.isEmpty())
        {
            return true;
        }
        else {
            return false;
        }

    }


//    public static class baskabirclass{
//        public static void sil(){
//            //inner class genellikle gruplandırma amacıyla kullanılabilir.


//        }
//    }
}
