package mywebproject;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class process  extends HttpServlet{
	
	public void doGet(HttpServletRequest req,HttpServletResponse res) throws IOException, ServletException {
		int i=Integer.parseInt(req.getParameter("num1"));
		int j=Integer.parseInt(req.getParameter("num2"));
		
		int result =i+j;
		
		req.setAttribute("result", result);
		
		RequestDispatcher rd=req.getRequestDispatcher("c2");
		rd.forward(req, res);
		
	}

}
