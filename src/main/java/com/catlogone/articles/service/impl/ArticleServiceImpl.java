package com.catlogone.articles.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.catlogone.articles.model.Article;
import com.catlogone.articles.service.ArticleService;

/**
 * This is service class implementation for article service.
 * @author yogesh
 */

@Service
public class ArticleServiceImpl implements ArticleService {

	private static List<Article> articles = new ArrayList<Article>();
	
	//ideally it should call DAO Layer for all DB related operation
	//@Autowired
	//private ArticleDAO articleDAO;

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
