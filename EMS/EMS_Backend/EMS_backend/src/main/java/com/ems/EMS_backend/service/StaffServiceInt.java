package com.ems.EMS_backend.service;

import com.ems.EMS_backend.common.BaseServiceInt;
import com.ems.EMS_backend.common.UserContext;
import com.ems.EMS_backend.dto.StaffDTO;

public interface StaffServiceInt extends BaseServiceInt<StaffDTO> {

	public StaffDTO findByEmail(String email, UserContext context);
}
