package service;

import java.util.ArrayList;

import dao.ShuJu;
import entity.Person;
import servlet.InsertServlet;

public class UserService {
	
	public ArrayList<Person> selectAllList() {
		ShuJu shuju = new ShuJu();
		shuju.MyDb();
		return shuju.selectUser();
	}
	public void insertALL(Person per) {
		ShuJu shuju = new ShuJu();
		shuju.MyDb();
		shuju.insertUserNull(per.getName(), per.getPassword(), per.getEmail(), per.getType(), per.getPhone(), per.getBirth(), per.getAge());
	}
	public ArrayList<Person> selectUsers(Person pp) {
		ShuJu shuju = new ShuJu();
		shuju.MyDb();
		return shuju.selectUser1(pp.getName());
		
	}
}	
