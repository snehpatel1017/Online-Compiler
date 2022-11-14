package com.daoclass;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class UpdateInput {
     public void update(String input) throws IOException{
    	 File f = new File("C:/Users/snehp/eclipse-2020/Servers/input.txt");
    	 BufferedWriter msg;
         msg = new BufferedWriter(new FileWriter(f));
         msg.write(input);
         f.exists();
         msg.close();
     }
}
