package com.akoscode.pikojx.dao;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.List;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.stereotype.Component;

import com.akoscode.pikojx.model.Contact;

@Component
public class ContactDAO extends BaseDao {
	
	@Value("${sql.contact.select.all}")
	private String sqlSelectAll;
	
	protected static class ContactMapper implements RowMapper<Contact> {

		public void mapRow(Contact contact, ResultSet rs, int rowNum) throws SQLException {
			contact.setId(rs.getInt("contact_id"));
			contact.setName(rs.getString("name"));
			contact.setEmail(rs.getString("email"));
			contact.setAddress(rs.getString("address"));
			contact.setTelephone(rs.getString("telephone"));
		}
		
		@Override
		public Contact mapRow(ResultSet rs, int rowNum) throws SQLException {
			Contact contact = new Contact();
			mapRow(contact, rs, rowNum);
			return contact;
		}
		
	}
	
	public List<Contact> selectAll() {
    	List<Contact> listContact = super.getJdbcTemplate().query(sqlSelectAll, new ContactMapper());
        return listContact;
    }
    
}
