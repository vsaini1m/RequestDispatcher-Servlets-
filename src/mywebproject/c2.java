package mywebproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class c2  extends HttpServlet{

	public void doGet(HttpServletRequest req,HttpServletResponse res)throws IOException {
		
		
		double result=(int) req.getAttribute("result");
		
		PrintWriter w=res.getWriter();
		w.println("Squere  is  "+(result*result));
		
	}
	
}
