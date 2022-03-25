package com.codex.lang.java.jdbc;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ResultSetSelect { 
    public static void main(String a[]){
         
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con = DriverManager.getConnection("jdbc:oracle:thin:@10.196.228.181:9090:oracle","tigob_umarketadm", "Utiba99");
			Statement stmt = con.createStatement();
			System.out.println("Created DB Connection....");
			ResultSet rs = stmt.executeQuery("select name, salary from emp");
			while (rs.next()) {
				System.out.println(rs.getString("name"));
				System.out.println(rs.getInt("salary"));
			}
			rs.close();
			con.close();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}
}
