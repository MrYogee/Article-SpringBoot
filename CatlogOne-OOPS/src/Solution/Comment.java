package Solution;

import java.util.Date;

public class Comment {
	private User author;

	private Comment repliedTo;

	private String message;

	private Date createdAt;

	public Comment(User author, String message, Comment repliedTo) {
		this.author = author;
		this.message = message;
		this.repliedTo = repliedTo;
		this.createdAt = new Date(System.currentTimeMillis());
	}

	public Comment(User author, String message) {
		this(author, message, null);
	}

	public User getAuthor() {
		return author;
	}

	public void setAuthor(User author) {
		this.author = author;
	}

	public Comment getRepliedTo() {
		return repliedTo;
	}

	public void setRepliedTo(Comment repliedTo) {
		this.repliedTo = repliedTo;
	}

	public String getMessage() {
		return message;
	}

	public void setMessage(String message) {
		this.message = message;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder(message).append(" by ").append(author.getName());
		if (repliedTo != null) {
			sb.append(" (replied to ").append(repliedTo.getAuthor().getName()).append(") ");
		}
		return sb.toString();
	}
}
