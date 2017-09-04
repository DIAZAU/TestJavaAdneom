package com.adneom.exception;

/**
 * Build list exception class using to throw functional exception.
 * @author diazau
 *
 */
public class BuildListException extends Exception{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	public BuildListException(String msg){
		super(msg);
	}
	
	public String getmessage(){
		return super.getMessage();
	}

}
