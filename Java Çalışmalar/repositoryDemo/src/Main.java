public class Main {

    //Repository genel olarak veri tabanı işlemleri için kullanılır.Crud vs vs.
    public static void main(String[] args) {
	// write your code here

        Validator validator = new Validator();
        Customer customer = new Customer();
        validator.validate(customer);
    }
}
