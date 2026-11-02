package deptService.com.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import deptService.com.pojo.Department;
import deptService.com.repository.DeptRepository;

@Service
public class DeptService {
	@Autowired
	private DeptRepository dRepo;
	
	public Department saveDept(Department dept) {
		return dRepo.save(dept);
	}
	public Department getDept(int d_id) {
		return dRepo.findById(d_id).orElseThrow();
	}
}
