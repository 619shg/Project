package com.cg.dao;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import com.cg.entity.Guest;

@Repository
public class GuestDAOImpl implements GuestDAO {

	@Autowired
	private JdbcTemplate jdbcTemplate;

	private final String SQL_INSERT_GUEST = "INSERT INTO guest_profile(email, first_name, last_name, address, phone, password, created_date, updated_date) values (?, ?, ?, ?, ?, ?, ?, ?)";

	@Override
	public void registerGuest(Guest guest) {
		Object[] params = { guest.getEmail(), guest.getFirstName(), guest.getLastName(),
				guest.getAddress(), guest.getPhone(), guest.getPassword(), guest.getCreatedDate(),
				guest.getUpdatedDate() };
		jdbcTemplate.update(SQL_INSERT_GUEST, params);

		// Fetch guest id
		String sql = "SELECT guest_id FROM guest_profile WHERE email=? and first_name=? and last_name=? and address=? and phone=? and password=? and created_date=? and updated_date=?";
		int id = jdbcTemplate.queryForObject(sql, Integer.class, params);

		// Set guest id
		guest.setGuestID(id);
	}

	@Override
	public void loginGuest(Guest guest) {
	
	}
}