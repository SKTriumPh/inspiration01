package com.utils;

import java.io.IOException;
import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Properties;

public class DButil {
	//µ¥ÀýÄ£Ê½--ÀÁºº
	private static DButil db;
	private String driver;
	private String url;
	private String username;
	private String password;
	private DButil(){
		Properties property=new Properties();
		try {
			property.load(this.getClass().getClassLoader().getResourceAsStream("oracledb.properties"));
			driver = property.getProperty("driver");
			url = property.getProperty("url");
			username = property.getProperty("username");
			password = property.getProperty("password");
			System.out.println(driver);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}
	public static DButil getinstance(){
		if(db==null){
			db=new DButil();
		}
		return db;		
	}
	public  Connection getconnection() throws SQLException, ClassNotFoundException{
		Class.forName(driver);
		Connection connection=DriverManager.getConnection(url, username, password);		
		return connection ;
	}
	
	public void  close(Connection conn){
		if(conn!=null){
			try {
				conn.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void  close(ResultSet rs){
		if(rs!=null){
			try {
				rs.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	public void  close(PreparedStatement ps){
		if(ps!=null){
			try {
				ps.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
	}
	
}
