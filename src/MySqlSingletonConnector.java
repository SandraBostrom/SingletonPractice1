import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class MySqlSingletonConnector {

    //create an object of SingleObject
    private static Connection conn;

    static {
        try {
//            Class.forName("com.mysql.jdbc.Driver");
             conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/powersystem", "student", "Kirre940217");
            System.out.println("Connected");
        } catch (SQLException e) {
            e.printStackTrace();
        }
        /*catch (ClassNotFoundException e){
            e.printStackTrace();
        }*/
    }


    //make the constructor private so that this class cannot be
    //instantiated
   /* private MySql() throws SQLException {
        System.out.println("Först");
        System.out.println("Hej");

    }
*/
    //Get the only object available
    public static Connection getConn(){
        return conn;
    }


}