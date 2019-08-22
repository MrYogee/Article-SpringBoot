package Solution;

public class Moderator extends User {

	public Moderator(String name) {
		super(name);
	}

	@Override
	public boolean canEdit(Comment user1Comment) {
		return user1Comment.getAuthor().equals(this) ? true : false;
	}

	@Override
	public boolean canDelete(Comment user1Comment) {
		return true;
	}
}
