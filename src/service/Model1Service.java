package service;

import entity.Model1;

public class Model1Service {
	public void create(Model1 model) {
		String name = model.getName();
		String age = model.getAge();
		System.out.println("name is "+ name);
		System.out.println("age is "+age);
	}
}
