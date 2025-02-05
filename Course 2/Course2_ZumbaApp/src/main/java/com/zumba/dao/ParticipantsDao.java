package com.zumba.dao;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;


import com.zumba.bean.Participants;
import com.zumba.resource.DatabaseResource;

public class ParticipantsDao {

	public List<Participants> viewAllParticipants() {
		List<Participants> listOfParticipants = new ArrayList<Participants>();
		try {
			Connection con = DatabaseResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("select * from participants");
			ResultSet rs = pstmt.executeQuery();
			while(rs.next()) {
				Participants pp = new Participants();
				pp.setPid(rs.getInt("pid"));
				pp.setName(rs.getString("name"));
				pp.setAge(rs.getInt("age"));
				pp.setBid(rs.getInt("bid"));
				listOfParticipants.add(pp);
				
			}
		} catch (Exception e) {
			System.err.println(e.toString());
		}
		return listOfParticipants;
	}
	
	public void addParticipant(Participants pa) {
		try {
			Connection con = DatabaseResource.getDbConnection();
			PreparedStatement pstmt = con.prepareStatement("insert into participants(name, age, bid) values (?,?,?)");
			pstmt.setInt(3, pa.getBid());
			pstmt.setString(1, pa.getName());
			pstmt.setInt(2, pa.getAge());
			pstmt.executeUpdate();
		} catch (Exception e) {
			System.err.println(e.toString());
		}
	}
	
}
