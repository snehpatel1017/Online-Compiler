package com.servlets;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.daoclass.FetchOutput;
import com.daoclass.UpdateInput;
import com.runlanguages.Cpp;
import com.runlanguages.Java;
import com.runlanguages.Python;

@WebServlet("/ChekServlet")
public class SecondChekServlet extends HttpServlet {
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException , IOException {
		    String code = request.getParameter("code").toString();
		    String lan = request.getParameter("language").toString();
		    String msg = request.getParameter("msg").toString();
		    int se;
//		    System.out.println(lan+"-----------------");
		    UpdateInput up = new UpdateInput();
		    up.update(msg);
		   
		    try{
		    	String ans=null;
		    	if(lan.equals("c") || lan.equals("cpp")){
		    		Cpp cp = new Cpp();
		    		cp.run(code);
		    	}
		    	else if(lan.equals("java")){
		    		Java jv = new Java();
		    		jv.run(code);
		    	}
		    	else{
		    		Python py = new Python();
		    		py.run(code);
		    	}
		    	Thread.sleep(2500);
		    	FetchOutput ot = new FetchOutput();
		    	ans = ot.fetch();
//		    	System.out.println(ans);
		    	response.setHeader("Content-Type", "text/html");
		        response.setHeader("success", "yes");
		        PrintWriter writer = response.getWriter();
		        writer.write(ans);
		        writer.close();
		    }
		    catch(Exception e){
		    	e.printStackTrace();
		    }
		    
	}

	

}
