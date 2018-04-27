package dao;

import java.io.IOException;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import entity.Person;

public class ShuJu extends HttpServlet {
	String driver = "com.mysql.jdbc.Driver";
	String url = "jdbc:mysql://localhost:3306/db_lt?useUnicode=true&characterEncoding=utf-8";
	String username = "root";
	String password = "root";
	String selectSql = "select * from users";
	String selectSql1 = "select * from users where user_account = ?";
	String insertSql = "insert users values(?,?,?,?,?,?,?)";
	String updateSql = "update users set ? = ? where ? = ?";
	String updateSql1 = "update users set ? = ? where ? = ?";
	String deleteSql = "delete from ruanjian where student_id = ?";
	Connection con = null;

	public void main(String args[]) {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			Statement stmt = con.createStatement();
			ResultSet rs = stmt.executeQuery("select * from nssp");
			while (rs.next()) {
				System.out.println(rs.getString("name"));
			}
		} catch (Exception e) {
			// TODO: handle exception
		}

	}

	// 链接数据库
	public void MyDb() {
		try {
			Class.forName(driver);
			con = DriverManager.getConnection(url, username, password);
			System.out.println(con);

		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	
	// 查询用户
	public ArrayList selectUser1(String user) {
		ArrayList<String> userList = new ArrayList<String>();
		ArrayList<Person> person_list = new ArrayList<Person>();
		System.out.println(con);
		try {
			PreparedStatement pstat = con.prepareStatement(selectSql1);
			pstat.setString(1, user);
			System.out.println("------------"+user);
			ResultSet set = pstat.executeQuery();
			System.out.println("-------skl"+selectSql1);
			System.out.println("-------123131");
			while (set.next()) {
				System.out.println("-------"+"abcd");
				Person per = new Person();
				String name = set.getString(1);
				String password = set.getString(2);
				String email = set.getString(3);
				String type = set.getString(4);
				String phone = set.getString(5);
				String birth = set.getString(6);
				String age = set.getString(7);
				
				per.setName(name);
				per.setPassword(password);
				per.setEmail(email);
				per.setType(type);
				per.setPhone(phone);
				per.setBirth(birth);
				per.setAge(age);
				
				person_list.add(per);
				userList.add(name);
				userList.add(password);
				userList.add(email);
				userList.add(type);
				userList.add(phone);
				userList.add(birth);
				userList.add(age);
				System.out.println("        "+person_list.size());
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(userList.get(0));
		return person_list;
	}

	// 查询用户
	public ArrayList selectUser() {
		ArrayList<String> userList = new ArrayList<String>();
		ArrayList<Person> person_list = new ArrayList<Person>();
		System.out.println(con);
		try {
			Statement stat = con.createStatement();
			ResultSet set = stat.executeQuery(selectSql);
			while (set.next()) {
				Person per = new Person();
				String name = set.getString(1);
				String password = set.getString(2);
				String email = set.getString(3);
				String type = set.getString(4);
				String phone = set.getString(5);
				String birth = set.getString(6);
				String age = set.getString(7);
				
				per.setName(name);
				per.setPassword(password);
				per.setEmail(email);
				per.setType(type);
				per.setPhone(phone);
				per.setBirth(birth);
				per.setAge(age);
				
				person_list.add(per);
				userList.add(name);
				userList.add(password);
				userList.add(email);
				userList.add(type);
				userList.add(phone);
				userList.add(birth);
				userList.add(age);
				System.out.println("传销");
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(userList.get(1));
		return person_list;
	}

	// 添加学生
	public void insertUser() {
		try {
			PreparedStatement pstat = con.prepareStatement(insertSql);
			pstat.setString(1, "");
			pstat.setString(2, "");
			pstat.setString(3, "");
			pstat.setString(4, "");
			pstat.setString(5, "");
			pstat.setString(6, "");
			pstat.setString(7, "");
			pstat.execute();
			System.out.println("添加成功");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	public void insertUserNull(String name,String password,String email,String type,String phone,String birth,String age) {
		try {
			String insertS = "insert users values(?,?,?,?,?,?,?)";
			PreparedStatement pstat = con.prepareStatement(insertS);
			pstat.setString(1,name);
			pstat.setString(2,password);
			pstat.setString(3,email);
			pstat.setString(4,type);
			pstat.setString(5,phone);
			pstat.setString(6,birth);
			pstat.setString(7,age);
			pstat.execute();
			System.out.println("添加成功");

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	// 修改信息
	public void updateStudent() {
		try {
			PreparedStatement pstat = con.prepareStatement(updateSql);
			pstat.setString(1, "a");
			pstat.setString(2, "b");
			pstat.execute();
			System.out.println("修改成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

	// 删除学生
	public void deleteStudent() {
		try {
			PreparedStatement pstat = con.prepareStatement(deleteSql);
			pstat.setInt(1, 1605);
			pstat.execute();
			System.out.println("删除成功");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

	@Override
	protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doGet(req, resp);

	}

	@Override
	protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
		// TODO Auto-generated method stub
		super.doPost(req, resp);
	}
}
