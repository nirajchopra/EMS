package com.ems.EMS_backend.service;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ems.EMS_backend.common.BaseServiceImpl;
import com.ems.EMS_backend.common.UserContext;
import com.ems.EMS_backend.dao.StaffDAOInt;
import com.ems.EMS_backend.dto.StaffDTO;

@Service
@Transactional
public class StaffServiceImpl extends BaseServiceImpl<StaffDTO, StaffDAOInt> implements StaffServiceInt {

	@Override
	public StaffDTO findByEmail(String email, UserContext context) {
		// TODO Auto-generated method stub
		return null;
	}

}
