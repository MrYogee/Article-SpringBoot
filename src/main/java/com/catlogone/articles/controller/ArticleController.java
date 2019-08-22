package com.catlogone.articles.controller;

import java.util.Collections;
import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

import com.catlogone.articles.model.Article;
import com.catlogone.articles.service.ArticleService;
//import io.swagger.annotations.Api;

/**
 * This controller exposes services to get AWS resources for customer accounts.
 * 
 * @author yogesh
 */
@RestController
public class ArticleController {

	private static final Logger LOGGER = LoggerFactory.getLogger(ArticleController.class);

	/**
	 * <code>CostExplorerReportService</code> instance.
	 */
	@Autowired
	private ArticleService articleService;

	/**
	 * This method is exposing a REST API to retrieve all articles
	 * 
	 * @return @List of @Article
	 */
	// @PreAuthorize("hasRole("XYZ") goes here
	// @ApiResponses - API documentations goes here

	@GetMapping(value = "/articles", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<List<Article>> fetchArticles() {
		List<Article> categories = articleService.getAll();
		if (categories == null) {
			categories = Collections.emptyList();
		}
		LOGGER.debug("Successfully retrieved articles");
		return new ResponseEntity<List<Article>>(categories, HttpStatus.OK);
	}

	/**
	 * This method is exposing a REST API to retrieve articles by given id
	 * 
	 * @return @Article
	 */
	@GetMapping(value = "/articles/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
	public ResponseEntity<Article> fetchArticlesById(@PathVariable("id") Integer id) {
		final Article article = articleService.findById(id);
		if (article == null) {
			LOGGER.debug("Failed to retrieved article for id " + id);
			return new ResponseEntity<Article>(article, HttpStatus.NOT_FOUND);
		}
		LOGGER.debug("Successfully retrieved article for id " + id);
		return new ResponseEntity<Article>(article, HttpStatus.OK);
	}

}
