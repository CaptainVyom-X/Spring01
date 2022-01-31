package com.nt.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

import javax.sql.DataSource;

import com.nt.bo.CustomerBO;

public class CustomerOracleDAOImpl implements ICustomerDAO {

	private static final String CUSTOMER_INSERT_QUERY = "INSERT INTO LOAN_INFO (CUSTOMER_ID, CUSTOMER_NAME, CUSTOMER_ADDR, PAMT, TIME, RATE, INTEREST_AMT) VALUES(LOANID_SEQ.NEXTVAL, ?, ?, ?, ?, ?, ?)";
	private DataSource ds;

	public CustomerOracleDAOImpl(DataSource ds) {
		System.out.println("CustomerDAOOracleImpl : 1-param constructor");
		this.ds = ds;
	}

	@Override
	public int insert(CustomerBO bo) throws Exception {
		Connection con = null;
		PreparedStatement ps = null;
		int count = 0;
		try {
			// get pooled jdbc connection object
			con = ds.getConnection();
			// get prepared stmt object having pre-compiled sql query
			ps = con.prepareStatement(CUSTOMER_INSERT_QUERY);
			// set values to query params
			ps.setString(1, bo.getCustomerName());
			ps.setString(2, bo.getCustomerAddr());
			ps.setFloat(3, bo.getPrincipalAmt());
			ps.setFloat(4, bo.getTime());
			ps.setFloat(5, bo.getRateOfInterest());
			ps.setFloat(6, bo.getInterestAmt());
			// send & execute the query
			count = ps.executeUpdate();
		} catch (SQLException se) {
			se.printStackTrace();
			throw se; // exception rethrowing
		} catch (Exception e) {
			e.printStackTrace();
			throw e; // exception rethrowing
		} finally {
			// close JDBC objects
			try {
				if (con != null)
					con.close();
			} catch (SQLException se) {
				se.printStackTrace();
				throw se;
			}
			try {
				if (ps != null)
					ps.close();
			} catch (SQLException se) {
				se.printStackTrace();
				throw se;
			}
		} // finally
		return count;
	}// insert(-)

}// class
