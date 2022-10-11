package com.example.demo.repos;
import java.util.*;

import com.example.demo.entity.Fee;
import com.example.demo.utils.ConnectionFactory;

import jakarta.ws.rs.WebApplicationException;
import jakarta.ws.rs.core.Response;
import jakarta.ws.rs.core.Response.Status;

import java.sql.*;
public class FeeRepository {

	Connection con =null;
	
	private final String  insertSql = "insert into tieto_fee values(?,?,?,?)";
	private final  String findAllSql = "select * from tieto_fee";
	private final String  findByIdSql = "select * from tieto_fee where id =?";
	private final String  deleteByIdSql = "delete from tieto_fee where id =?";
	
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
	
	public Optional<Fee> findById(int key) {
		
		Optional<Fee> found = Optional.empty();
		
		try(PreparedStatement pstmt = con.prepareStatement(findByIdSql)){
			
			   pstmt.setInt(1,key);
			   
			  ResultSet rs = pstmt.executeQuery();
			  
			  if(rs.next()) {
					int id =rs.getInt("id");
					String branch =rs.getString("branch");
					String year = rs.getString("year");
					double amount =rs.getDouble("amount");
				
					Fee foundObject = new Fee(id, branch, year, amount);
					
					found =Optional.of(foundObject);
				
			  }
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

		
		return found;
	}
	

public int deleteById(int key) {
		
		
	int rowDeleted=0;
		try(PreparedStatement pstmt = con.prepareStatement(deleteByIdSql)){
			
			   pstmt.setInt(1,key);
			   
			   rowDeleted = pstmt.executeUpdate();
			  
			
			
		}catch(SQLException e) {
			e.printStackTrace();
		}

		
		return rowDeleted;
	}

	
}
