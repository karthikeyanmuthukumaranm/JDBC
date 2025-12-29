import java.sql.*;

public class JdbcDemo {
    public static void main(String[] args) {
        try {
            // 1. Load Driver
            //Class.forName("com.mysql.cj.jdbc.Driver");

            // 2. Create connection
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost:3306/librarydb",
                "root",
                "Root@1234"
            );

            // 3. Create statement
            Statement st = con.createStatement();

            // 4. Execute query
            ResultSet rs = st.executeQuery("SELECT * FROM books");

            // 5. Process result
            while (rs.next()) {
                System.out.println(rs.getString(1) + "  " + rs.getString(2));
            }

            // 6. Close connection
            con.close();
        }
        catch (Exception e) {
            e.printStackTrace();
        }
    }
}
