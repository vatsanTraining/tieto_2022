package com.example.demo.repos;
import java.util.*;

import com.example.demo.entity.Fee;
import com.example.demo.utils.ConnectionFactory;

import java.sql.*;
public class FeeRepository {

	Connection con =null;
	
	private final String  insertSql = "insert into tieto_fee values(?,?,?,?)";
	private final  String findAllSql = "select * from tieto_fee";
	private final String  findByIdSql = "select * from tieto_fee where id =?";
	public FeeRepository() {
		super();
		this.con= ConnectionFactory.getMySqlConnection();
	}

	
	public int add(Fee entity) {
		
		int rowAdded =0;
		
		try(PreparedStatement pstmt = con.prepareStatement(insertSql)){
			
			pstmt.setInt(1, entity.getId());
			pstmt.setString(2, entity.getBranch());
			pstmt.setString(3, entity.getYear());
			pstmt.setDouble(4, entity.getAmount());
			
			rowAdded = pstmt.executeUpdate();
		}catch(SQLException e) {
			e.printStackTrace();
		}
		return rowAdded;
	}
	
	
	public List<Fee> findAll(){
		
		List<Fee> list = new ArrayList<>();
		
		try(PreparedStatement pstmt = con.prepareStatement(findAllSql)){
			
			  ResultSet rs = pstmt.executeQuery();
			  
			  while(rs.next()) {
					int id =rs.getInt("id");
					String branch =rs.getString("branch");
					String year = rs.getString("year");
					double amount =rs.getDouble("amount");
				
					Fee rowRef = new Fee(id, branch, year, amount);
				
					list.add(rowRef);
			  }
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

		return list;
	}
	
	public Fee findById(int id) {
		
		Fee found = null;
		
		
		return found;
	}
	
}
