package kr.or.dgit.erp.dto;

import java.util.ArrayList;
import java.util.Date;

public class Employee {
	private String eNo;		//번호	
	private String eName;	//사원명
	private Title title;	//직책	
	private int salary;		//급여
	private boolean gender;	//성별
	private Department dNo;	//부서	
	private Date joinDate;	//입사일

	public Employee(String eNo) {
		this.eNo = eNo;
	}
	
	public Employee(String eNo, String eName, Title title, int salary, boolean gender, Department dNo, Date joinDate) {
		this.eNo = eNo;
		this.eName = eName;
		this.title = title;
		this.salary = salary;
		this.gender = gender;
		this.dNo = dNo;
		this.joinDate = joinDate;
	}
	
	public String geteNo() {
		return eNo;
	}

	public void seteNo(String eNo) {
		this.eNo = eNo;
	}

	public String geteName() {
		return eName;
	}

	public void seteName(String eName) {
		this.eName = eName;
	}

	public Title getTitle() {
		return title;
	}

	public void setTitle(Title title) {
		this.title = title;
	}

	public int getSalary() {
		return salary;
	}

	public void setSalary(int salary) {
		this.salary = salary;
	}

	public boolean isGender() {
		return gender;
	}

	public void setGender(boolean gender) {
		this.gender = gender;
	}

	public Department getdNo() {
		return dNo;
	}

	public void setdNo(Department dNo) {
		this.dNo = dNo;
	}

	public Date getJoinDate() {
		return joinDate;
	}

	public void setJoinDate(Date joinDate) {
		this.joinDate = joinDate;
	}
	
	
	@Override
	public String toString() {
		return String.format("Employee [eNo=%s, eName=%s, title=%s, salary=%s, gender=%s, dNo=%s, joinDate=%s]",
							eNo, eName, title, salary, gender, dNo, joinDate);
	}

	public Object[] toArray() {
		return new Object[] {eNo, eName, title, String.format("%,d",salary), gender? "남":"여", dNo, String.format("%tF",joinDate)}; 
	}	
}
