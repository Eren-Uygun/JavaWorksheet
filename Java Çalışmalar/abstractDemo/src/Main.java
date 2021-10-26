public class Main {

    public static void main(String[] args) {
        CustomerManager customerManager = new CustomerManager();
        customerManager.databaseManager = new OracleDatabaseManagere();
//        customerManager.databaseManager = new SqlServerDatabaseManager();
//        customerManager.databaseManager = new MySqlDatabaseManager();


        customerManager.getCustomers();

    }
}
