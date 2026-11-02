package deptService.com.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import deptService.com.pojo.Department;

@Repository
public interface DeptRepository extends JpaRepository<Department, Integer>{
	
}
