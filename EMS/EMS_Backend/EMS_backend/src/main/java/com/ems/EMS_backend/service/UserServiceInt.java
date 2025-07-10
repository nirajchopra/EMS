package com.ems.EMS_backend.service;

import com.ems.EMS_backend.common.BaseServiceInt;
import com.ems.EMS_backend.common.UserContext;
import com.ems.EMS_backend.dto.UserDTO;

/**
 * 
 * User Service interface.
 * 
 * @author Niraj Chopra
 * 
 */

public interface UserServiceInt extends BaseServiceInt<UserDTO> {

	/**
	 * Finds User by name.
	 * 
	 * @param name
	 * @return
	 */
	public UserDTO findByLoginId(String name, UserContext userContext);

	public UserDTO findByEmail(String email, UserContext userContext);

	public UserDTO authenticate(String loginId, String password);

	public UserDTO changePassword(String loginId, String oldPassword, String newPassword, UserContext userContext);

	public UserDTO forgotPassword(String loginId);

	public UserDTO register(UserDTO dto);

}
