package com.ems.EMS_backend.common.message;

import com.ems.EMS_backend.common.BaseServiceInt;
import com.ems.EMS_backend.common.UserContext;

/**
 * College Service interface.
 * 
 * @author Niraj Chopra
 */

public interface MessageServiceInt extends BaseServiceInt<MessageDTO> {

	/**
	 * Finds Role by name.
	 * 
	 * @param name
	 * @return
	 * 
	 */
	public MessageDTO findByTitle(String name, UserContext userContext);

	public MessageDTO findByCode(String code, UserContext userContext);

}
