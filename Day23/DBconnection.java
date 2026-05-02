package Day23;

/*
    -> conection to DB
    -> insert data into DB
    -> retrieve data from DB
*/
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBconnection {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/students", "root", "garcia786");
            System.out.println("Connection successful!");
            PreparedStatement ps = conn.prepareStatement(
                    "INSERT INTO stud VALUES (?, ?, ?, ?)");
            ps.setInt(1, 1);
            ps.setString(2, "Garcia");
            ps.setInt(3, 20);
            ps.setString(4, "garcia@gmail.com");
            ps.executeUpdate();
            Statement st = conn.createStatement();
            ResultSet rs = st.executeQuery("SELECT * FROM stud");

            while (rs.next()) {
                System.out.println(
                        rs.getInt("id") + " " +
                                rs.getString("name") + " " +
                                rs.getInt("age") + " " +
                                rs.getString("email"));
            }
            conn.close();
            /*
             * op:
             * Connection successful!
             * 1 Garcia 20 garcia@gmail.com
             */
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
