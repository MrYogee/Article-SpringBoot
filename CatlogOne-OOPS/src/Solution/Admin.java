package Solution;

public class Admin extends Moderator {

	public Admin(String name) {
		super(name);
	}

	@Override
	public boolean canEdit(Comment user1Comment) {
		return true;
	}

	@Override
	public boolean canDelete(Comment user1Comment) {
		return true;
	}
}
