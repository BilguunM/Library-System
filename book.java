package sw_sem7;

import java.util.ArrayList;

public class book {
	private static int num=1;
	public String b_id;
	public String name;
	public String author;
	public int year;
	public int totalNum;

	public ArrayList<bookCategory> type = new ArrayList<>();

	public book() {

	}

	public book(String b_id, String name, String author, int year, int totalNum) {
		this.b_id = b_id;
		this.name = name;
		this.author = author;
		this.year = year;
		this.totalNum = totalNum;
	}
	
	boolean bookCheck(String search){
		if(this.name.equals(search)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	boolean bookIdCheck(String bid){
		if(this.b_id.equals(bid)) {
			if(this.issue()) {
				return true;
			}
			else {
				System.out.println("\tene nom duussan");
				return false;
			}			
		}
		else {
			return false;
		}
	}

	public String getB_id() {
		return b_id;
	}

	public void setB_id(String b_id) {
		this.b_id = b_id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}

	public int getYear() {
		return year;
	}

	public void setYear(int year) {
		this.year = year;
	}

	public int getTotalNum() {
		return totalNum;
	}

	public void setTotalNum(int totalNum) {
		this.totalNum = totalNum;
	}

	public ArrayList<bookCategory> getType() {
		return type;
	}

	public void setType(ArrayList<bookCategory> type) {
		this.type = type;
	}

	boolean issue() {
		if (0 == this.totalNum) {
			System.out.println("This book finished.");
			return false;
		} else {
			this.totalNum -= num;
			return true;
		}			
	}

	void remove() {
		this.totalNum += num;
	}

	public String toString() {
		return b_id + " - " + name;
	}

}
