package com.testing.analog.testing;

import com.beyond.analog.datatypes.FunctionType;
import com.beyond.analog.datatypes.StringType;
import com.beyond.analog.filehandling.File;
import com.beyond.analog.parse.Parser;

public class Execute {
	public static void main(String[] args){
		File file = new File("test.txt");
		Parser parser = new Parser(file);
		System.out.print(parser.getBodyAmount());
		
	}
}
