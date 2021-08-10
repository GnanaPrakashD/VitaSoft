package com.vitasoft.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import com.vitasoft.bean.StudentVita;

public class DataAccess {
public void insert(StudentVita s1)
{
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/vitasoft", "root", "admin");
		String query="insert into StudentVita(First Name,Last Name,Middle Name,Address,email,Mobile Number,Height,Weight)values(?,?,?,?,?,?,?,?)";
		
		PreparedStatement s= con.prepareStatement(query);
		s.setString(1,s1.getFirstName());
		s.setString(2,s1.getLastName());
		s.setString(3,s1.getMiddleName());
		s.setString(4,s1.getAddress());
		s.setString(5,s1.getPhoneNumber());
		s.setString(6,s1.getEmail());
		s.setString(7,s1.getHeight());
		s.setString(8, s1.getWeight());
		s.executeUpdate();
		s.close();
		con.close();
	} catch (ClassNotFoundException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
