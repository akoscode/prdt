package com.akoscode.pikojx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.akoscode.pikojx.model.Contact;

@Component
public class ContactDAO extends BaseDao {
	
	public List<Contact> selectAll() {
    	String sql = "SELECT * FROM contact";
    	List<Contact> listContact = super.getJdbcTemplate().query(sql, new RowMapper<Contact>() {
    		 
            @Override
            public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
                Contact aContact = new Contact();
     
                aContact.setId(rs.getInt("contact_id"));
                aContact.setName(rs.getString("name"));
                aContact.setEmail(rs.getString("email"));
                aContact.setAddress(rs.getString("address"));
                aContact.setTelephone(rs.getString("telephone"));
     
                return aContact;
            }
     
        });
     
        return listContact;
    }
    
}
