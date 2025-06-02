package com.training.generators;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import org.hibernate.engine.spi.SharedSessionContractImplementor;
import org.hibernate.id.IdentifierGenerator;

public class OrderIdGenerator implements IdentifierGenerator{

	@Override
	public Object generate(SharedSessionContractImplementor session, Object object) {
		// TODO Auto-generated method stub
		String prefix="OD";
		String suffix="";
		try {
			
			Connection con= session.getJdbcConnectionAccess().obtainConnection();
			Statement stmt=con.createStatement();
			String sql="select order_id_seq.nextval from dual";
			 ResultSet rs= stmt.executeQuery(sql);
			 if(rs.next()) {
				 int seqVal=rs.getInt(1);
				 suffix=String.valueOf(seqVal);		 
			 }
			
		}catch(Exception e) {
			e.printStackTrace();
		}
		return prefix + suffix; 
	}

}
