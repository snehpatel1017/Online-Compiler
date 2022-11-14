package com.runlanguages;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Python {
	  public void run(String code) throws IOException, InterruptedException{
		   BufferedWriter bw;
		   bw = new BufferedWriter(new FileWriter("C:/Users/snehp/eclipse-2020/Servers/pythonfile.py"));
		   bw.write(code);
	       bw.close();
		  Runtime.getRuntime().exec(
	               new String[] { "cmd", "/c", "cd C:/Users/snehp/eclipse-2020/Servers && pythonfile.py < input.txt > output.txt" });
	      
	  }	  
	  
}
