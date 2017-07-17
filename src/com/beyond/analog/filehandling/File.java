package com.beyond.analog.filehandling;

import java.io.BufferedReader;
import java.io.FileInputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

public class File {
	public String[] FileLines;
	public File(String filename_){
		FileLines = getLines(filename_);
	}
	private String[] getLines(String filename){
		BufferedReader buffer_reader;
		FileReader file_input;
		ArrayList <String>file_lines = new ArrayList();
		try{
			file_input = new FileReader(filename);
			buffer_reader = new BufferedReader(file_input);
			String current_line;
			while((current_line = buffer_reader.readLine()) != null){
				file_lines.add(current_line);
			}
		}catch(IOException e){
			
		}
		
		return (String[])file_lines.toArray();
	}
	public String getFileContents(){
		String string_output = "";
		for(String line:FileLines){
			string_output +=line +'\n';
		}
		return string_output;
	}
}
