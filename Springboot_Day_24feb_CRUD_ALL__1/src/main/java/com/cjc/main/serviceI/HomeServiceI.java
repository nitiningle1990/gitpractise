package com.cjc.main.serviceI;

import java.util.List;

import com.cjc.main.model.Student;

public interface HomeServiceI {

	public void savedata(Student s);
	
	List<Student>showall();

	public List<Student> showone(String username, String password);
	
	void delete(int sid);
	
	Student edit(int sid);
	
	
}
