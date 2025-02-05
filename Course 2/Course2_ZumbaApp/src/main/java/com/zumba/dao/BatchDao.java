package com.zumba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import com.zumba.bean.Batch;
import com.zumba.resource.DatabaseResource;

public class BatchDao {
	
	public List<Batch> viewAllBatch() {
		List<Batch> listOfBatch = new ArrayList<Batch>();
		try {
			Connection con = DatabaseResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from batch");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Batch bb = new Batch();
				bb.setBid(rs.getInt("bid"));
				bb.setTypeofbatch(rs.getString("typeofbatch"));
				bb.setTime(rs.getString("time"));
				listOfBatch.add(bb);
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return listOfBatch;
	}
	
	public void addBatch(Batch ba) {
		try {
			Connection con = DatabaseResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into batch(bid, typeofbatch, time) values (?,?,?)");
			pstmt.setInt(1, ba.getBid());
			pstmt.setString(2, ba.getTypeofbatch());
			pstmt.setString(3, ba.getTime());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}
	
}
