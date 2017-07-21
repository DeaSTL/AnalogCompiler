package com.beyond.analog.parse;

import java.util.ArrayList;

import com.beyond.analog.filehandling.File;

public class Parser {
	private File file;
	private String fileContents;
	
	public Parser(File file_){
		file = file_;
		fileContents = file.getFileWithoutBreaks();
	}
	@Deprecated
	public String generateBodyContents(int start_index){
		String temp_output = "";
		for(int i = start_index;i<fileContents.length();i++){
			boolean reading = false;
			if(fileContents.substring(i,i+1).equalsIgnoreCase("{")){
				reading = true;
			}
			if(reading){
				temp_output += fileContents.substring(i);			
			}
			if(fileContents.substring(i,i+1).equalsIgnoreCase("}")){
				reading = false;
				break;
			}
			
		}
		return temp_output;
	}
	@Deprecated
	public int getBodyAmount(){
		int amount = 0;
	
		for(int i = 0;i<fileContents.length();i++){
			System.out.println(fileContents.substring(i,i+1));
			if(fileContents.substring(i,i+1).equalsIgnoreCase("}")){
				amount += 1;
				
			}
		}
		return amount;
	}
	public Body[] generateBodyObjects(){
		return null;
	}
}
