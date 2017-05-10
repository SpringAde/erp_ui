package kr.or.dgit.erp.dto;

public class Title {
	private String tCode;
	private String tName;	

	public Title() {	}
	
	public Title(String tCode, String tName) {
		this.tCode = tCode;
		this.tName = tName;
	}
	
	public String gettCode() {
		return tCode;
	}

	public void settCode(String tCode) {
		this.tCode = tCode;
	}

	public String gettName() {
		return tName;
	}

	public void settName(String tName) {
		this.tName = tName;
	}	
	
	@Override
	public String toString() {
		return String.format("%s(%s)", tName, tCode);
	}

	public Object[] toArray() {
		return new Object[] {tCode, tName};
	}
}
