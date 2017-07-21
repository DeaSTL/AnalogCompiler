package com.beyond.analog.datatypes;

public class FunctionType extends DataType{
	private String functionName;
	private String[] refFunctions;
	private String[] parameters;
	private String functionBody;
	private String functionString;
	
	
	public FunctionType(String functionName,String functionBody,String[] parameters){
		
	}
	private String generateParameters(){
		String tmp_output = "";
		for(String par:parameters){
			tmp_output += par + ",";
		}
		return tmp_output;
		
	}
	private String generateFunctionTemplate(){
		return null;
	}

	public String generateLuaEquivalent(String functionName,String contents,String parameters) {
		
		
		return 
				  "function "+functionName+"("+parameters+") "
				 + contents
				 + " end";
	}
	

}
