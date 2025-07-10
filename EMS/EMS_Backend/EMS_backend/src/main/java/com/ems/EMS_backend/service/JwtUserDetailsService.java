package com.ems.EMS_backend.service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.ems.EMS_backend.common.BaseServiceImpl;
import com.ems.EMS_backend.dao.UserDAOInt;
import com.ems.EMS_backend.dto.UserDTO;

@Service
public class JwtUserDetailsService extends BaseServiceImpl<UserDTO, UserDAOInt> implements UserDetailsService {

	@Autowired
	private UserDAOInt userDao;

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		System.out.println(username + " --username is in service ");
		UserDTO user = userDao.findByEmail("email", username, null);
		System.out.println("After findByEmail run");
		if (user == null) {
			System.out.println("user found nuulllll");
			throw new UsernameNotFoundException("User not found with username: " + username);
		}
		System.out.println("At return statement");
		return new org.springframework.security.core.userdetails.User(user.getLoginId(), user.getPassword(),
				new ArrayList<>());

	}

}