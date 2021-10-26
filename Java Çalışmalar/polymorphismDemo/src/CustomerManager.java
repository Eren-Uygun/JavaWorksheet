public class CustomerManager {
    private BaseLogger _logger;
    public CustomerManager(BaseLogger logger){
        _logger = logger;
    }
    public  void add(){
        System.out.println("Müşteri Eklendi.");
        _logger.log("Loglandı");

    }










}
