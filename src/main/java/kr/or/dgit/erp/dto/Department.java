package kr.or.dgit.erp.dto;

public class Department {
	private String dCode;	//부서번호
	private String dName;	//부서명
	private int floor;		//위치
	
	public Department(String dCode) {
		this.dCode = dCode;
	}

	public Department(String dCode, String dName, int floor) {
		this.dCode = dCode;
		this.dName = dName;
		this.floor = floor;
	}

	public String getdCode() {
		return dCode;
	}

	public void setdCode(String dCode) {
		this.dCode = dCode;
	}

	public String getdName() {
		return dName;
	}

	public void setdName(String dName) {
		this.dName = dName;
	}

	public int getFloor() {
		return floor;
	}

	public void setFloor(int floor) {
		this.floor = floor;
	}
	
	@Override
	public String toString() {
		return String.format("%s(%s층)", dName, floor);
	}
	
	public Object[] toArray() {
		return new Object[] {dCode, dName, floor};
	}
}
