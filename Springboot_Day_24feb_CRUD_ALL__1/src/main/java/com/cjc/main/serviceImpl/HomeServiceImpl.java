package com.cjc.main.serviceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cjc.main.Repository.HomeRepository;
import com.cjc.main.model.Student;
import com.cjc.main.serviceI.HomeServiceI;

@Service
public class HomeServiceImpl implements HomeServiceI {

	@Autowired
	HomeRepository reo;
	
	@Override
	public void savedata(Student s) {
		
		reo.save(s);
		
	}

	@Override
	public List<Student> showall() {
	List<Student>stu=reo.findAll();
		return stu;
	}

	@Override
	public List<Student> showone(String username, String password) {
		reo.findAllByUsernameAndPassword(username, password);
		return null;
	}

	@Override
	public void delete(int sid) {
		
		reo.deleteById(sid);
		
	}

	@Override
	public Student edit(int sid) {
		
	Student stu	=reo.getById(sid);
		
		return stu;
	}

	

	
}
