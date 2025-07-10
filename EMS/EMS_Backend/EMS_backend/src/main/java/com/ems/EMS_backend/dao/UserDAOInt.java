package com.ems.EMS_backend.dao;

import com.ems.EMS_backend.common.BaseDAOInt;
import com.ems.EMS_backend.common.UserContext;
import com.ems.EMS_backend.dto.UserDTO;

/**
 * User DAO interface.
 * 
 * @author Niraj Chopra
 */
public interface UserDAOInt extends BaseDAOInt<UserDTO> {

	public UserDTO findByEmail(String attribute, String val, UserContext userContext);

}
