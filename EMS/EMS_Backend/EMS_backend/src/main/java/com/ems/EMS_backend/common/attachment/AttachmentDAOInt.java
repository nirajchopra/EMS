package com.ems.EMS_backend.common.attachment;

import java.util.List;

import com.ems.EMS_backend.common.BaseDAOInt;
import com.ems.EMS_backend.common.UserContext;

/**
 * Role DAO interface.
 * 
 * @author Niraj Chopra
 */
public interface AttachmentDAOInt extends BaseDAOInt<AttachmentDTO> {

	public List<AttachmentSummaryDTO> search(AttachmentSummaryDTO dto, int pageNo, int pageSize,
			UserContext userContext);

	public List<AttachmentSummaryDTO> search(AttachmentSummaryDTO dto, UserContext userContext);

}
