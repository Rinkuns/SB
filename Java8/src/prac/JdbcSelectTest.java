package prac;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class JdbcSelectTest {

	public static void main(String[] args) {
		try (
			Connection conn=DriverManager.getConnection("jdbc:nysql:/localhost:3306/ebookshop?allowPublicKeyRetrival=trur&useSSl=false&server=UTC",
					"myuser", "XXXX");
			Statement stmt=conn.createStatement();
			
		){
			String strSelect="selece price,qty from books";
			System.out.println("The statement is"+strSelect + "\n");
			ResultSet rest=stmt.executeQuery(strSelect);
			System.out.println("The records selected are ");
			int rowCount=0;

			while(rest.next()) {
				String title=rest.getString("title");
				double price=rest.getDouble("price");
				int qty=rest.getInt("qty");
				System.out.println(title +","+ price +","+ qty);
				++rowCount;
			}
			System.out.println("Totla number of records"+rowCount);
		}
		
		
		catch (SQLException ex) {
			// TODO: handle exception
			ex.printStackTrace();
		}

	}

}
