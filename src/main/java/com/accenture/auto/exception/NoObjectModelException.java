package com.accenture.auto.exception;

/**
 * Custom exception that identifies when an object being read
 * from a JSON file has no corresponding object model defined.
 * 
 * @author J.W.Scorfield
 *
 */

public class NoObjectModelException extends Exception{
	public static final long serialVersionUID = 15234L;
	
	NoObjectModelException(String message){
		super(message);
	}
	
	@Override
	public String getMessage() {
		return "The file you are reading from contains an object with no model, "
				+ "please review the file contents and add the required model and try again.";
	}
}

