package MySql;
import java.sql.*;
public class Connection_class {
	public static void main(String[] args) {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost:33306/employee", "root", "");
			System.out.println("Connection done");
		} catch (Exception ex) {
			ex.printStackTrace();
			System.out.println("connection not done");
		}
	}

}
