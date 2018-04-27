package servlet;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Person;
import service.UserService;

public class chaxunServlet extends HttpServlet{
	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String name = req.getParameter("name");
		System.out.println(name);
		Person person = new Person();
		person.setName(name);
		UserService userService = new UserService();
		ArrayList<Person> personList = userService.selectUsers(person);
		req.setAttribute("personList", personList);
		req.getRequestDispatcher("JSP/update.jsp").forward(req, resp);
	}
	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
	}
}
