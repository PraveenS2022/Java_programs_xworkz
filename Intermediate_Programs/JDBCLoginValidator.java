import java.sql.*;
public class JDBCLoginValidator {
    public static void main(String[] args) {
        String url = "jdbc:mysql://localhost:3306/testdb";
        String user = "root";
        String pass = "password";
        String uname = "admin";
        String upass = "admin123";
        try {
            Connection con = DriverManager.getConnection(url, user, pass);
            PreparedStatement stmt = con.prepareStatement("SELECT * FROM users WHERE username=? AND password=?");
            stmt.setString(1, uname);
            stmt.setString(2, upass);
            ResultSet rs = stmt.executeQuery();
            if (rs.next()) {
                System.out.println("Login successful");
            } else {
                System.out.println("Invalid credentials");
            }
            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}