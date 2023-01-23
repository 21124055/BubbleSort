package net.codejava;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class sud {

	public static void main(String[] args) {
		String databaseURL="jdbc:ucanaccess://thoufee1.accdb";
		try {
			Connection connection = DriverManager.getConnection(databaseURL);
			System.out.println("connected");
		
			String sql = "INSERT INTO thoufee (name,phone) VALUES" +"('thoufee','828726')";
		
		
	 Statement statement = connection.createStatement();
	 int rows= statement.executeUpdate(sql);
	 if (rows>0) {
		System.out.println("update");
	 }
		
		connection.close();
		} catch (SQLException e) {
			
			e.printStackTrace();
		}
		

	}

}
