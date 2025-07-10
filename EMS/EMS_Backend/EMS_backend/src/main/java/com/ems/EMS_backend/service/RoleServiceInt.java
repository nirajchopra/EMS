package com.ems.EMS_backend.service;

import com.ems.EMS_backend.common.BaseServiceInt;
import com.ems.EMS_backend.common.UserContext;
import com.ems.EMS_backend.dto.RoleDTO;

/**
 * College Service interface.
 * 
 * @author Niraj Chopra
 * 
 */

public interface RoleServiceInt extends BaseServiceInt<RoleDTO> {

	/**
	 * Finds Role by name.
	 * 
	 * @param name
	 * @return
	 */
	public RoleDTO findByName(String name, UserContext userContext);

}