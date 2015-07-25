package edu.javalearn.domain.controller;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import edu.javalearn.domain.dataaccessobject.CustomerDataAccess;

/**
 * Servlet implementation class Register
 */
@WebServlet("/register")
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
   

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		System.out.println("hi");
		HttpSession session = request.getSession(true);
		String customerName = request.getParameter("customerName");
		String gender= request.getParameter("gender");
		String dateOfBirth=request.getParameter("dateOfBirth");
		String address=request.getParameter("address");
		String city=request.getParameter("city");
		String state=request.getParameter("state");
		String pin=request.getParameter("pin");
		String telephoneNo=request.getParameter("telephoneNo");
		String fax=request.getParameter("fax");
		String email=request.getParameter("email");
		System.out.println(customerName);
		try {
			System.out.println(customerName);
			CustomerDataAccess customerDataAccess = new CustomerDataAccess();
			
			customerDataAccess.addCustomerDetails(customerName,gender,dateOfBirth,address,city,state,pin,telephoneNo,fax,email);
			RequestDispatcher requestDispatcher = request
					.getRequestDispatcher("/index.jsp");
			requestDispatcher.forward(request, response);
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

}
