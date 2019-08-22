package com.catlogone.articles.model;

import java.util.Objects;


public class Article {

	private String title;

	private String body;

	@Override
	public int hashCode() {
		return Objects.hash(body, id, title);
	}

	@Override
	public String toString() {
		return "Article [title=" + title + ", body=" + body + ", id=" + id + "]";
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Article other = (Article) obj;
		return Objects.equals(body, other.body) && Objects.equals(id, other.id) && Objects.equals(title, other.title);
	}

	private Integer id;

	public Article(String title) {
		this.title = title;
		//UUID should be used here 
		this.setId(Sequence.nextValue());
	}

	/**
	 * @return the title
	 */
	public String getTitle() {
		return title;
	}

	/**
	 * @param title the title to set
	 */
	public void setTitle(String title) {
		this.title = title;
	}

	/**
	 * @return the body
	 */
	public String getBody() {
		return body;
	}

	/**
	 * @param body the body to set
	 */
	public void setBody(String body) {
		this.body = body;
	}

	/**
	 * @return the id
	 */
	public Integer getId() {
		return id;
	}

	/**
	 * @param id the id to set
	 */
	public void setId(Integer id) {
		this.id = id;
	}

}
