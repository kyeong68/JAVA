package vo;

public class UserTestVO {
	private	String name;
	private	String email;
	private	String password;
	public UserTestVO(String name, String email, String password) {
	 //	super();
		this.name = name;
		this.email = email;
		this.password = password;
	}
	
	public String getName() {
		return name;
	}
	public String getEmail() {
		return email;
	}
	public String getPassword() {
		return password;
	}

	@Override
	public String toString() {
		return "UserTestVO [name=" + name + ", email=" + email + ", password=" + password + "]";
	}
		
	
	

}
