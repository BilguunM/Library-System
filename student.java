package sw_sem7;

public class student {
	private String st_code;
	private String l_name;
	private String f_name;
	private String address;
	private int phoneNum;
	
	public student() {
		
	}
	
	public student(String id, String lname, String fname, String address, int phoneNum) {
		this.st_code = id;
		this.l_name = lname;
		this.f_name = fname;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	public String getSt_code() {
		return st_code;
	}

	public void setSt_code(String st_code) {
		this.st_code = st_code;
	}

	public String getL_name() {
		return l_name;
	}

	public void setL_name(String l_name) {
		this.l_name = l_name;
	}

	public String getF_name() {
		return f_name;
	}

	public void setF_name(String f_name) {
		this.f_name = f_name;
	}

	public String getAddress() {
		return address;
	}

