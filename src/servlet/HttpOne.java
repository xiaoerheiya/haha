package servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import dao.ShuJu;
import entity.Person;
import service.UserService;

public class HttpOne extends HttpServlet{
	@Override
	public void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException{
		// TODO Auto-generated method stub
//		resp.setHeader("Content-type","text/html;charset=UTF-8");
//		resp.setCharacterEncoding("UTF-8");
//		System.out.println("进入了doGet");
//		String test = null;
//		System.out.println(test.toCharArray());
//		String username = "123456";
//		String password = "123";
//		String Username = req.getParameter("username");
//		String Password = req.getParameter("password");
//		String[] courses = req.getParameterValues("course");
//		for(String course: courses) {
//			System.out.println("course id"+course);
//		}
//		System.out.println("您输入的姓名是："+Username);
//		System.out.println("您输入的密码是："+Password);
//		PrintWriter out = resp.getWriter();
//		if(Username.equals(username) && Password.equals(password)) {
//			out.write("哈，您输入的姓名是："+Username+"您输入的密码是："+Password);	
//		}
//		else {
//			out.write("哈，您输入的账号密码有误");
//		}
//		
//		System.out.println("离开了daGet1");
//		resp.sendRedirect("test.jsp");
		UserService s = new UserService();
		ArrayList<Person> list = s.selectAllList();
		try {
			req.setAttribute("person",list);
			req.getRequestDispatcher("JSP/Test.jsp").forward(req, resp);
		} catch (ServletException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}
	@Override
	public void doPost(HttpServletRequest req, HttpServletResponse resp){
		// TODO Auto-generated method stub
//		try {
//			PrintWriter out = resp.getWriter();
//			for(int i = 0;i<5;i++) {
//			out.write("<a href=javascript:history.back()>back</a>");
//			}
//		} catch (Exception e) {
//			// TODO: handle exception
//			e.printStackTrace();
//		}
		try {
			resp.sendRedirect("/wj/hi2.html");
		} catch (Exception e) {
			// TODO: handle exception
			e.printStackTrace();
		}
	}
	@Override
	public void init() throws ServletException {
		// TODO Auto-generated method stub
		System.out.println("开始初始化");
	}
	@Override
	public void service(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		System.out.println("开始服务");
		super.service(request, response);
	}
	@Override
	public void destroy() {
		// TODO Auto-generated method stub
		System.out.println("开始销毁");
	}
}

