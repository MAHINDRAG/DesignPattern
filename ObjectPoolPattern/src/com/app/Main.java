package com.app;

import java.sql.Connection;

public class Main {

	public static void main(String[] args) {
		JDBCConnectionPool pool = new JDBCConnectionPool("oracle.jdbc.driver.OracleDriver", "jdbc:oracle:thin:@localhost:1521:xe", "Mahindra", "Mahi");
		Connection con = pool.checkOut();
		pool.checkIn(con);
		System.out.println("Object Pool Design Pattern Executed Successfully ");
	}
}
