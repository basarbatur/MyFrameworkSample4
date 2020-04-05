package com.hrm.steps;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import org.junit.Test;

import com.hrm.utils.DbUtils;

public class DbTest1 extends DbUtils {
	String dbUrl="jdbc:oracle:thin:@syntaxdatabase.cdjflmucstpo.us-east-1.rds.amazonaws.com:1521:orcl";
	String dbUsername="Syntax";
	String dbPassword="syntax123";
	String sqlQuery="select * from employees";
	@Test
	public void dbTest() throws SQLException{
	Connection conn=DriverManager.getConnection(dbUrl, dbUsername, dbPassword);	
	Statement st=conn.createStatement();
	ResultSet rs=st.executeQuery(sqlQuery);
	String columData;
	String columData1;
	
//	rs.next();
//	columData=rs.getString("first_name");
	
	while(rs.next()) {
		columData=rs.getString("first_name");
		System.out.println(columData);
	}
	
	
	
	rs.close();
	st.close();
	conn.close();
	
	}
}
