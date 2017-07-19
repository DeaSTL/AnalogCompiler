package com.testing.analog.testing;

import com.beyond.analog.filehandling.File;

public class Execute {
	public static void main(String[] args){
		File file = new File("test.txt");
		System.out.println(file.getFileContents());
	}
}
