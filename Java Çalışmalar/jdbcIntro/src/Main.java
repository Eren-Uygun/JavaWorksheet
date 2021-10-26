import java.sql.*;
import java.util.ArrayList;

public class Main {


    //connection stringde zaman sorununu çözen kod mevcuttur.
    public static void main(String[] args) {
        // write your code here
        //Jdbc ile java üzerinden veri tabanlarına bağlantı sağlıyoruz.

        Connection connection = null;
       // PreparedStatement :
        //Statement statement = null;
        PreparedStatement statement = null;
        ResultSet resultSet;
        DbHelper helper = new DbHelper();
        try {

            connection = helper.getConnection();
            String sql = "delete from city where id=? ";
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4081);
           int result =  statement.executeUpdate(); //result Rows affected verir.
            System.out.println("Kayıt silindi");


        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException exception) {
                helper.showErrorMessage(exception);
            }
        }

    }

    public static void selectDemo(){
        Connection connection = null;
        Statement statement = null;
        ResultSet resultSet;
        DbHelper helper = new DbHelper();
        try {

            connection = helper.getConnection();
            statement = connection.createStatement();
            resultSet = statement.executeQuery("select Code,Name,Continent,Region from country");
            ArrayList<Country> countries = new ArrayList<Country>();
            while (resultSet.next()){
                countries.add(new Country(resultSet.getString("Code"),resultSet.getString("Name"),resultSet.getString("Continent"),resultSet.getString("Region")));
            }
            System.out.println(countries.size());


        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                connection.close();
            } catch (SQLException exception) {
                helper.showErrorMessage(exception);
            }
        }
    }

    public static void insertDemo(){
        //Jdbc ile java üzerinden veri tabanlarına bağlantı sağlıyoruz.

        Connection connection = null;
        // PreparedStatement :
        //Statement statement = null;
        PreparedStatement statement = null;
        ResultSet resultSet;
        DbHelper helper = new DbHelper();
        try {

            connection = helper.getConnection();
            String sql = "insert into city(Name,CountryCode,District,Population)values(?,?,?,?)";
            //statement = connection.createStatement();
            //resultSet = statement.executeQuery("insert into city(Name,CountryCode,District,Population)values('Düzce','TUR','Düzce',50000)");
            // statement = connection.prepareStatement("insert into city(Name,CountryCode,District,Population)values('Düzce','TUR','Düzce',50000)");
            // statement = connection.prepareStatement("insert into city(Name,CountryCode,District,Population)values(?,?,?,?)"); // Soru işaretleri parametre yani kullanıcı gönderecek
            statement = connection.prepareStatement(sql);
            statement.setString(1,"Düzce2");
            statement.setString(2,"TUR");
            statement.setString(3,"Turkey");
            statement.setInt(4,80000);

            int result =  statement.executeUpdate(); //result Rows affected verir.
            System.out.println("Kayıt Eklendi");


        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException exception) {
                helper.showErrorMessage(exception);
            }
        }
    }

    public static void updateDemo(){
        // write your code here
        //Jdbc ile java üzerinden veri tabanlarına bağlantı sağlıyoruz.

        Connection connection = null;
        // PreparedStatement :
        //Statement statement = null;
        PreparedStatement statement = null;
        ResultSet resultSet;
        DbHelper helper = new DbHelper();
        try {

            connection = helper.getConnection();
            String sql = "update city set population=80000,district='Turkey' where id=? ";
            //statement = connection.createStatement();
            //resultSet = statement.executeQuery("insert into city(Name,CountryCode,District,Population)values('Düzce','TUR','Düzce',50000)");
            // statement = connection.prepareStatement("insert into city(Name,CountryCode,District,Population)values('Düzce','TUR','Düzce',50000)");
            // statement = connection.prepareStatement("insert into city(Name,CountryCode,District,Population)values(?,?,?,?)"); // Soru işaretleri parametre yani kullanıcı gönderecek
            statement = connection.prepareStatement(sql);
            statement.setInt(1,4081);
            int result =  statement.executeUpdate(); //result Rows affected verir.
            System.out.println("Kayıt güncellendi");


        } catch (SQLException exception) {
            helper.showErrorMessage(exception);
        } finally {
            try {
                statement.close();
                connection.close();
            } catch (SQLException exception) {
                helper.showErrorMessage(exception);
            }
        }

    }
}
