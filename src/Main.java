import java.sql.*;
import java.util.Scanner;

public class Main {
    public static Connection myConn;
    public static PreparedStatement ps;

    public static void main(String[] args) throws SQLException {
        ResultSet myRes;
        Statement myStat;

        Connection conn = MySqlSingletonConnector.getConn();
        //        Connection myConn = DriverManager.getConnection("jdbc:mysql://localhost:3306/powersystem", "student", "Kirre940217");

        myStat = conn.createStatement();

        System.out.println("Dessa system finns för tillfället");
        searchAll.searchAll();

        }

    }


