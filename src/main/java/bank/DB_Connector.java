package bank;

import java.sql.Connection;
import java.sql.DriverManager;

public class DB_Connector {

	public DB_Connector() {
		// TODO Auto-generated constructor stub
	}

	Connection conn;
	/**
	 * initiate connection with sql server
	 * */
	 Connection getConnection() {
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			conn = DriverManager.getConnection("jdbc:mysql://localhost/bank", "root", "123456");
			System.out.println("Connected to DB!!!");

		} catch (Exception e) {
			System.out.println("In Class DB_Connector Error occured" + e);
		}
		return conn;
	}

}
