package sw_sem7;

import java.util.ArrayList;

public class student {
	private String st_code;
	private String l_name;
	private String f_name;
	private String address;
	private int phoneNum;
	public ArrayList<book> bookList= new ArrayList<>();
	
	public student() {
		
	}
	
	
	public student(String id, String lname, String fname, String address, int phoneNum) {
		this.st_code = id;
		this.l_name = lname;
		this.f_name = fname;
		this.address = address;
		this.phoneNum = phoneNum;
	}
	
	
	boolean stuIdCheck(String id) {
		if(this.st_code.equals(id)) {
			return true;
		}
		else {
			
			return false;
		}
	}
	@Override 
	public String toString() {
		return st_code + " "+f_name+" avsan nomiin too "+bookList.size();
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
	
