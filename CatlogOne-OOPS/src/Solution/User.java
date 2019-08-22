package Solution;

import java.sql.Timestamp;

public class User {

	private boolean logIn = false;

	private Timestamp lastLoggedInAt;

	private String name;

	public User(String name) {
		this.setName(name);

	}

	/**
	 * @return the logIn
	 */
	public boolean isLoggedIn() {
		return logIn;
	}

	/**
	 * @param logIn the logIn to set
	 */
	public void logIn() {
		this.logIn = true;
		setLastLoggedInAt(new Timestamp(System.currentTimeMillis()));
	}

	public void logOut() {
		this.logIn = false;
	}

	/**
	 * @return the lastLoggedInAt
	 */
	public Timestamp getLastLoggedInAt() {
		return lastLoggedInAt;
	}

	/**
	 * @param lastLoggedInAt the lastLoggedInAt to set
	 */
	public void setLastLoggedInAt(Timestamp lastLoggedInAt) {
		this.lastLoggedInAt = lastLoggedInAt;
	}

	public Object getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public boolean canEdit(Comment user1Comment) {
		return user1Comment.getAuthor().equals(this) ? true : false;
	}

	public boolean canDelete(Comment user1Comment) {
		return false;
	}
	
	@Override
	public String toString() {
		return super.toString();
	}

}
