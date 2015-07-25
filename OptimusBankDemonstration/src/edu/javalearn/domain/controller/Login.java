package edu.javalearn.domain.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import edu.javalearn.domain.dataaccessobject.CustomerDataAccess;

/**
 * Servlet implementation class Login
 */
@WebServlet("/login")
public class Login extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Login() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int status;
		String customerName = request.getParameter("CustomerName");
		String dateOfBirth = request.getParameter("DateOfBirth");
		try {
			CustomerDataAccess customerDataAccess = new CustomerDataAccess();
			status=customerDataAccess.validateCustomer(customerName,dateOfBirth);
			if(status==1)
			{
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("/Welcome");
				requestDispatcher.forward(request, response);
			}
			else
			{
				RequestDispatcher requestDispatcher = request
						.getRequestDispatcher("/index.jsp");
				requestDispatcher.forward(request, response);	
			}
	}
		catch (Exception e) {
			e.printStackTrace();
		}

}
}