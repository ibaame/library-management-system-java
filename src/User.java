

public class User {
	
	private String userID;
	private String userFirstName;
	private String userLastName;
	private String emailAddress;
	private String userPassword;
	private boolean isActive;
	
	public User() {}
	
	public User(String userID, String userFirstName, String userLastName, String emailAddress, String userPassword,boolean isActive) {
		this.userID = userID;
		this.userFirstName = userFirstName;
		this.userLastName = userLastName;
		this.emailAddress = emailAddress;
		this.userPassword = userPassword;
		this.isActive = isActive;
	}

	public String getUserID() {
		return userID;
	}

	public void setUserID(String userID) {
		this.userID = userID;
	}

	public String getUserFirstName() {
		return userFirstName;
	}

	public void setUserFirstName(String userFirstName) {
		this.userFirstName = userFirstName;
	}

	public String getUserLastName() {
		return userLastName;
	}

	public void setUserLastName(String userLastName) {
		this.userLastName = userLastName;
	}

	public String getEmailAddress() {
		return emailAddress;
	}

	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}

	public String getUserPassword() {
		return userPassword;
	}

	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
	}
	
	public String get2UserPassword() {
		char[] c = getUserPassword().toCharArray();
		String password = "";
		for(int i = 0 ; i < c.length - 3 ; i++)
			password += String.valueOf(c[i]);
		password += "***";
		return password;
	}

	public boolean isActive() {
		return isActive;
	}

	public void setActive(boolean isActive) {
		this.isActive = isActive;
	}
	
	
	@Override
	public String toString() {
		String txt = "~~ User ~~"+ "\n";
		txt += "user ID: " + getUserID() + "\n";
		txt += "full name: " + getUserFirstName() + " " + getUserLastName() + "\n";
		txt += "email: " + getEmailAddress() + "\n";
		txt += "password: " + get2UserPassword() + "\n";
		
		if(isActive() == true) txt += "User is Active\n";
		else txt += "User is not Active\n";
		
		return txt;
	}
	
	
	
	
	
	

}
