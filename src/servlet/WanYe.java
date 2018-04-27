package servlet;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class WanYe extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String txt = this.getServletContext().getRealPath("12.txt");//иообнд 
		System.out.println(txt);
		String tx = txt.substring(txt.lastIndexOf("\\"));
		System.out.println(tx);
		resp.setHeader("content-Disposition","attachment;fileName="+"12.txt");
		InputStream in = new FileInputStream(txt);
		OutputStream out = resp.getOutputStream();
		byte[] buf = new byte[1024];
		int len = 0;
		while((len = in.read(buf)) != -1) {
			out.write(buf,0,len);
		}
		in.close();
		out.close();
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}
