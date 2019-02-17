package com.anurag.controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.anurag.beans.Customer;
import com.anurag.service.CustomerService;

/**
 * Servlet implementation class CustomerController
 */
@WebServlet("/CustomerController")
public class CustomerController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public CustomerController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String action = request.getParameter("action");
		CustomerService service = new CustomerService();
		RequestDispatcher rd = null;
		if ("list".equals(action)) {
			ArrayList<Customer> customerList = service.getAllCustomers();
			rd = request.getRequestDispatcher("DisplayCustomer.jsp");
			request.setAttribute("customerList", customerList);
			rd.forward(request, response);
		} else if ("Delete".equals(action)) {
			String empNo = request.getParameter("customerNo");
			long customerId = 0;
			if (empNo != null) {
				customerId = Long.parseLong(empNo);
			}
			boolean result = service.deleteCustomer(customerId);
			if (result == true) {
				rd = request.getRequestDispatcher("Success.jsp");
				request.setAttribute("message", "Employee deleted succesfully");
			} else {
				rd = request.getRequestDispatcher("Failure.jsp");
				request.setAttribute("message", "Employee deletion failed");
			}
			rd.forward(request, response);
		} else if ("update".equals(action)) {
			String empNo = request.getParameter("customerNo");
			long customerId = 0;
			if (empNo != null) {
				customerId = Long.parseLong(empNo);
			}
			Customer result = service.getOneCustomers(customerId);
			if (result != null) {
				rd = request.getRequestDispatcher("UpdateCustomer.jsp");
				request.setAttribute("customer", result);
			}
			rd.forward(request, response);
		}

	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String action = request.getParameter("action");
		CustomerService service = new CustomerService();
		RequestDispatcher rd = null;

		if ("add".equals(action)) {
			String customerNo = request.getParameter("customerNo");
			String customerType = request.getParameter("customerType");
			String occupation = request.getParameter("customerOccupation");
			String name = request.getParameter("customerName");
			String gender = request.getParameter("customerGender");
			String address = request.getParameter("customerAddress");
			long customerId = 0;
			if (customerNo != null) {
				customerId = Long.parseLong(customerNo);
			}
			String age1 = request.getParameter("customerAge");
			int age = 0;
			if (age1 != null) {
				age = Integer.parseInt(age1);
			}
			Customer customer = new Customer(customerId, customerType, occupation, name, gender, age, address);
			boolean result = service.addCustomer(customer);
			if (result == true) {
				rd = request.getRequestDispatcher("Success.jsp");
				request.setAttribute("message", "Customer Addition successfull");
			} else {
				rd = request.getRequestDispatcher("Failure.jsp");
				request.setAttribute("message", "Customer Addition failed...");
			}
			rd.forward(request, response);
		}

		else if ("home".equals(action)) {
			String name = (request.getParameter("search"));
			name.trim();
			long customerId = 0;
			if (name != null) {
				try {
					customerId = Long.parseLong(name.replaceAll(" ", ""));
					ArrayList<Customer> cust = service.getCustomer(name, customerId);
					rd = request.getRequestDispatcher("SearchCustomer.jsp");
					request.setAttribute("customerList", cust);
					if(cust==null) {
						rd = request.getRequestDispatcher("Failure.jsp");
						request.setAttribute("message", "Customer not found...!!");
					}

				} catch (Exception e) {
					System.out.println(e.getMessage());
				}
			}
			ArrayList<Customer> cust = service.getCustomer(name, customerId);
			rd = request.getRequestDispatcher("SearchCustomer.jsp");
			request.setAttribute("customerList", cust);
			if(cust==null) {
				rd = request.getRequestDispatcher("Failure.jsp");
				request.setAttribute("message", "Customer not found...!!");
			}
			rd.forward(request, response);

		}else if("UpdateFinal".equals(action)) {
			
			String customerNo = request.getParameter("customerNo");
			String customerType = request.getParameter("customerType");
			String occupation = request.getParameter("customerOccupation");
			String name = request.getParameter("customerName");
			String gender = request.getParameter("customerGender");
			String address = request.getParameter("customerAddress");
			long customerId = 0;
			if (customerNo != null) {
				customerId = Long.parseLong(customerNo);
			}
			String age1 = request.getParameter("customerAge");
			int age = 0;
			if (age1 != null) {
				age = Integer.parseInt(age1);
			}
			Customer customer = new Customer(customerId, customerType, occupation, name, gender, age, address);
			boolean result = service.updateCustomer(customer);
			if (result == true) {
				rd = request.getRequestDispatcher("Success.jsp");
				request.setAttribute("message", "Customer Updation successfull");
			} else {
				rd = request.getRequestDispatcher("Failure.jsp");
				request.setAttribute("message", "Customer Updation failed...");
			}
			rd.forward(request, response);
		}
		
	}

}
