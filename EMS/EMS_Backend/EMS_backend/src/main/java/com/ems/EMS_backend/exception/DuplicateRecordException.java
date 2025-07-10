package com.ems.EMS_backend.exception;

/**
 * DuplicateRecordException thrown when a duplicate record occurred
 * 
 * @author Niraj Chopra
 */
public class DuplicateRecordException extends RuntimeException {

	/**
	 * @param msg error message
	 */
	public DuplicateRecordException(String msg) {
		super(msg);
	}

}