package dao;

import entity.Person;

public class test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ShuJu sj = new ShuJu();
		sj.MyDb();
		Person p = new Person();
		String na = p.getName();
		sj.selectUser1("kxy");
		System.out.println(sj);
	}

}
