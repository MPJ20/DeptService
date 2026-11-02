package deptService.com.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import deptService.com.pojo.Department;
import deptService.com.service.DeptService;

@RestController
@RequestMapping("/dept")
public class DeptController {
		@Autowired
		private DeptService dServ;
	
	@PostMapping("/deptSave")
	public String addDept(@RequestBody Department dept) {
		if(dServ.saveDept(dept)!=null) 
			return "Department added";
		return "Some Error";
	}
	@GetMapping("/{id}")
	public Department getDepartment(@PathVariable int id) {
		return dServ.getDept(id);
	}
}
