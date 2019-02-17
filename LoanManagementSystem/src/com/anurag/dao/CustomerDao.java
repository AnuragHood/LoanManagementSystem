package com.anurag.dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import com.anurag.beans.Customer;
import com.anurag.util.DatabaseUtil;
import com.sun.corba.se.pept.transport.Connection;

public class CustomerDao {
	public ArrayList<Customer> getAllCustomers() {
		ArrayList<Customer> customerList = null;
		java.sql.Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = DatabaseUtil.getConnection();
			pst = con.prepareStatement("select * from Customer");
			rs = pst.executeQuery();
			while (rs.next()) {
				Customer cust = new Customer();
				cust.setCustomerId(rs.getLong("Customer_Id"));
				cust.setCustomerType(rs.getString("Customer_Type"));
				cust.setOccupation(rs.getString("Occupation"));
				cust.setName(rs.getString("Customer_Name"));
				cust.setGender(rs.getString("gender"));
				cust.setAge(rs.getInt("age"));
				cust.setAddress(rs.getString("address"));
				if (customerList == null) {
					customerList = new ArrayList<Customer>();
				}
				customerList.add(cust);
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DatabaseUtil.closeResultSet(rs);
			DatabaseUtil.closePreparedStatement(pst);
			DatabaseUtil.closeConnection(con);
		}

		return customerList;

	}

	public boolean deleteCustomer(long customerId) {
		boolean result = false;
		java.sql.Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DatabaseUtil.getConnection();
			pst = con.prepareStatement("DELETE FROM Customer WHERE Customer_Id=?");
			pst.setLong(1, customerId);
			int t = pst.executeUpdate();
			if (t > 0) {
				result = true;
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DatabaseUtil.closePreparedStatement(pst);
			DatabaseUtil.closeConnection(con);
		}
		return result;
	}

	public boolean addCustomer(Customer customer) {
		boolean result = false;
		java.sql.Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DatabaseUtil.getConnection();
			pst = con.prepareStatement("insert into Customer values(?,?,?,?,?,?,?)");
			pst.setLong(1, customer.getCustomerId());
			pst.setString(2, customer.getCustomerType());
			pst.setString(3, customer.getOccupation());
			pst.setString(4, customer.getName());
			pst.setString(5, customer.getGender());
			pst.setInt(6, customer.getAge());
			pst.setString(7, customer.getAddress());
			int result1 = pst.executeUpdate();
			if (result1 > 0) {
				result = true;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DatabaseUtil.closePreparedStatement(pst);
			DatabaseUtil.closeConnection(con);
		}

		return result;

	}

	public ArrayList<Customer> getCustomer(String name, long customerId) {
		ArrayList<Customer> customerList = null;
		java.sql.Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		Customer customer = new Customer();
		try {
			con = DatabaseUtil.getConnection();
			pst = con.prepareStatement("select * from Customer where Customer_Name like ? OR Customer_Id like ?");
			pst.setString(1, "%"+name+"%");
			pst.setLong(2, customerId);
			rs = pst.executeQuery();
			while (rs.next()) {

				customer.setCustomerId(rs.getLong("Customer_Id"));
				customer.setCustomerType(rs.getString("Customer_Type"));
				customer.setOccupation(rs.getString("Occupation"));
				customer.setName(rs.getString("Customer_Name"));
				customer.setGender(rs.getString("gender"));
				customer.setAge(rs.getInt("age"));
				customer.setAddress(rs.getString("address"));
				if (customerList == null) {
					customerList = new ArrayList<Customer>();
				}
				customerList.add(customer);

			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DatabaseUtil.closeResultSet(rs);
			DatabaseUtil.closePreparedStatement(pst);
			DatabaseUtil.closeConnection(con);
		}

		return customerList;

	}
	
	public boolean updateCustomer(Customer customer) {
		boolean result = false;
		java.sql.Connection con = null;
		PreparedStatement pst = null;
		try {
			con = DatabaseUtil.getConnection();
			pst = con.prepareStatement("update Customer set Customer_Type=?,Occupation=?,Customer_Name=?,gender=?, age=?,address=? where Customer_Id=?");
			pst.setString(1, customer.getCustomerType());
			pst.setString(2, customer.getOccupation());
			pst.setString(3, customer.getName());
			pst.setString(4, customer.getGender());
			pst.setInt(5, customer.getAge());
			pst.setString(6, customer.getAddress());
			pst.setLong(7, customer.getCustomerId());
			int result1 = pst.executeUpdate();
			if (result1 > 0) {
				result = true;
			}

		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DatabaseUtil.closePreparedStatement(pst);
			DatabaseUtil.closeConnection(con);
		}

		return result;

	}

	public Customer getOneCustomers(long id) {
		
		Customer cust=null;
		java.sql.Connection con = null;
		PreparedStatement pst = null;
		ResultSet rs = null;
		try {
			con = DatabaseUtil.getConnection();
			pst = con.prepareStatement("select * from Customer where Customer_Id=?");
			pst.setLong(1, id);
			rs = pst.executeQuery();
			while (rs.next()) {
				if(cust==null)
					cust= new Customer();
				cust.setCustomerId(rs.getLong("Customer_Id"));
				cust.setCustomerType(rs.getString("Customer_Type"));
				cust.setOccupation(rs.getString("Occupation"));
				cust.setName(rs.getString("Customer_Name"));
				cust.setGender(rs.getString("gender"));
				cust.setAge(rs.getInt("age"));
				cust.setAddress(rs.getString("address"));
			}
		} catch (SQLException e) {
			System.out.println(e.getMessage());
		} finally {
			DatabaseUtil.closeResultSet(rs);
			DatabaseUtil.closePreparedStatement(pst);
			DatabaseUtil.closeConnection(con);
		}

		return cust;

	}

}
