package com.vitasoft;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.vitasoft.bean.StudentVita;
import com.vitasoft.dao.DataAccess;

/**
 * Servlet implementation class MyServelet
 */
@WebServlet("/Hello")
public class MyServelet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public MyServelet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
		
		//out.println("name"+first);

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		//doGet(request, response);
		String first= request.getParameter("First Name");
		String last= request.getParameter("Last Name");
		String  middle= request.getParameter("Middle Name");
		
		String  address= request.getParameter("Address");
		String  email= request.getParameter("Emailid");
		String  mobile= request.getParameter("Mobile Number");
		
		String  height= request.getParameter("Height");
		String  weight= request.getParameter("Weight");
        
		DataAccess d=new DataAccess();
		StudentVita s1= new StudentVita();
		d.insert(s1);
	}

}
