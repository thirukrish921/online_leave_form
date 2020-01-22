package fsdp.level2.dao;

import java.sql.DriverManager;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

import fsdp.level2.model.Staff;

public class StaffDAO {
	private Connection jdbcConnection;
	public StaffDAO()
	{
	}
	protected void connect() throws SQLException
	{
		if(jdbcConnection==null || jdbcConnection.isClosed())
		{
			try {
				Class.forName("oracle.jdbc.driver.OracleDriver");
			}
			catch(ClassNotFoundException e) {
				throw new SQLException(e);
			}
			jdbcConnection=(Connection) DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe","leave","leave");
		}
		
	}
	protected void disconnect() throws SQLException
	{
		if(jdbcConnection !=null && !jdbcConnection.isClosed())
		{
			jdbcConnection.close();
		}
	}
	
	public boolean insertStaff(Staff staff) throws SQLException {
		String sql="insert into Staff (StaffName,StaffId,StaffPassword,StaffEmail,Staffdepartment,StaffStatus) values (?,?,?,?,?,?)";
		connect();
		PreparedStatement statement =(PreparedStatement) jdbcConnection.prepareStatement(sql);
		statement.setString(1, staff.getStaffName());
		statement.setInt(2, staff.getStaffId());
		statement.setString(3, staff.getStaffPassword());
		statement.setString(4, staff.getStaffEmail());
		statement.setInt(5,staff.getStaffDepartment());
		statement.setInt(6,staff.getStaffStatus());
		boolean rowInserted = statement.executeUpdate()>0;
		statement.close();
		disconnect();
		return rowInserted;
	}
	
	
	public boolean updateStaff(Staff staff) throws SQLException {
		String sql="UPDATE staff SET StaffName=?,StaffId=?,StaffPassword=?,StaffEmail=?,Staffdepartment=?,StaffStatus where StaffId=?";
		 connect();
		 PreparedStatement statement=(PreparedStatement) jdbcConnection.prepareStatement(sql);
		 statement.setString(1, staff.getStaffName());
			statement.setInt(2, staff.getStaffId());
			statement.setString(3, staff.getStaffPassword());
			statement.setString(4, staff.getStaffEmail());
			statement.setInt(5,staff.getStaffDepartment());
			statement.setInt(6,staff.getStaffStatus());
		 boolean rowUpdated =statement.executeUpdate()>0;
		 statement.close();
		 disconnect();
		 return rowUpdated; 	
	}
	
	public boolean deleteStaff(int id) throws SQLException {
		String sql="delete from staff where StaffId=?";
		connect();
		PreparedStatement statement =(PreparedStatement) jdbcConnection.prepareStatement(sql);
		statement.setInt(1,id);
		boolean rowDeleted = statement.executeUpdate() > 0;
		statement.close();
		disconnect();
		return rowDeleted;
	}
}
