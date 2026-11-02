package deptService.com.pojo;

import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Component
@Entity
@Table(name="Dept")
public class Department {
	@Id
	private int deptid;
	private String dname;
	public Department(int deptid, String dname) {
		super();
		this.deptid = deptid;
		this.dname = dname;
	}
	public Department() {
		super();
		// TODO Auto-generated constructor stub
	}
	public int getDeptid() {
		return deptid;
	}
	public void setDeptid(int deptid) {
		this.deptid = deptid;
	}
	public String getDname() {
		return dname;
	}
	public void setDname(String dname) {
		this.dname = dname;
	}
	
}
