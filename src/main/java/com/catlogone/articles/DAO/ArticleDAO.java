package com.catlogone.articles.DAO;

import java.util.List;

import com.catlogone.articles.model.Article;

public interface ArticleDAO {
	public void clear();

	public void add(Article article);

	// will retrieve all articles stored
	public List<Article> getAll();

	// will use the id to find an article with the same id
	// if none is found, it will return null
	public Article findById(int id);
}
