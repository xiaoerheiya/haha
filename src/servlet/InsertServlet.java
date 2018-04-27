package servlet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Person;
import service.UserService;

public class InsertServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);
		
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		String password = req.getParameter("password");
		String email = req.getParameter("email");
		String type = req.getParameter("type");
		String phone = req.getParameter("phone");
		String birth = req.getParameter("birth");
		String age = req.getParameter("age");
		Person p = new Person();
		p.setName(name);
		p.setPassword(password);
		p.setEmail(email);
		p.setType(type);
		p.setPhone(phone);
		p.setBirth(birth);
		p.setAge(age);
		System.out.println(name+" "+password+" "+email+" "+type+" "+phone+" "+birth+" "+age);
		UserService u = new UserService();
		u.insertALL(p);
	}
}
