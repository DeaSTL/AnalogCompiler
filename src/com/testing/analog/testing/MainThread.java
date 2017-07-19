package com.testing.analog.testing;

import com.beyond.analog.filehandling.File;

public class MainThread implements Runnable {
	Thread runner;
	public MainThread(){
		runner = new Thread(this,"MainThread");
		
	}
	@Override
	public void run() {
		File file = new File("test.txt");
		System.out.println(file.getFileContents());
	}

}
