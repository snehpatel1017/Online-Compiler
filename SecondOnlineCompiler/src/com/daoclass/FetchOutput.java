package com.daoclass;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class FetchOutput {
	 public String fetch() throws IOException{
    	 File f = new File("C:/Users/snehp/eclipse-2020/Servers/output.txt");
    	 BufferedReader br = new BufferedReader(new FileReader(f));
    	 String line = "";
 		String ans = "";
 		while ((line = br.readLine()) != null) {
			ans += line;
			ans += "<br>";
		}
 		return ans;
     }
}
