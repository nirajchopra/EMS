package com.ems.EMS_backend.exception;

/**
 * DatabaseException is propogated by DAO classes when an unhandled Database
 * exception occurred
 * 
 * @author Niraj Chopra
 */
public class DatabaseException extends RuntimeException {

	/**
	 * @param msg : Error message
	 */
	public DatabaseException(String msg) {
		super(msg);
	}

}