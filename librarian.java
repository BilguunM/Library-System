
public class librarian {
	private String userName;
	private String password;
	private String name;

	public librarian() {

	}

	public librarian(String name, String userName, String pass) {
		this.name = name;
		this.userName = userName;
		this.password = pass;
	}
	
	boolean passCheck(String pass) {
		if(this.password.equals(pass)) {
			return true;
		}
		else {
			System.out.println("Password is wrong!");
			return false;
		}
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

}
