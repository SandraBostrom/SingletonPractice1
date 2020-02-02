import java.sql.*;

public class searchAll {

    public static Connection myConn;
    public static PreparedStatement ps;

    public static void searchAll ()throws SQLException {
        ResultSet myRes;
        Statement myStat;

        Connection conn = MySqlSingletonConnector.getConn();
        myStat = conn.createStatement();

        try{
        myRes = myStat.executeQuery("select * from breakers");
        System.out.println();

        //4 processa resultatsettet
        while (myRes.next() == true) {
            System.out.println(myRes.getInt("ID") + ", " + myRes.getString("Type") + ", "
                    + myRes.getInt("Rated_current_kA") + ", " + myRes.getString("Status_"));

        }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}
