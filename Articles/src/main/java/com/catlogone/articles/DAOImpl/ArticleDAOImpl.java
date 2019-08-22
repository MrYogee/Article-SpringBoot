package com.catlogone.articles.DAOImpl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.catlogone.articles.DAO.ArticleDAO;
import com.catlogone.articles.model.Article;
/**
 * Lets implements same logic here
 * 
 */
@Repository
public class ArticleDAOImpl implements ArticleDAO {
	private static List<Article> articles = new ArrayList<Article>();

	@Override
	public void clear() {
		articles.clear();

	}

	@Override
	public void add(Article article) {
		articles.add(article);
	}

	@Override
	public List<Article> getAll() {
		return articles;
	}

	@Override
	public Article findById(int id) {
		for (Article article : articles) {
			if (article.getId() == id) {
				return article;
			}
		}
		return null;
	}

}
