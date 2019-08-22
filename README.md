# Article-SpringBoot
In this challenge we're going to start to build a JSON controller as a way to retreieve articles from the API.

Spring: JSON Articles Controller 1
Instructions
JSON Articles Controller
In this challenge we're going to start to build a JSON controller as a way to retreieve articles from the API.
Endpoints
We'll need to handle the following two endpoints.
Description
Return JSON
Without Data
Article Service
@Service
class ArticleService {
    // will retrieve all articles stored
    public List<Article> getAll();
    // will use the id to find an article with the same id
    // if none is found, it will return null
    public Article findById(int id);
.
GET /articles
- An endpoint for retrieving all
Article
stored.
GET /articles/{id}
- An endpoint for retrieving a specific
Article
by it's
id
       The endpoints should return JSON representations of
Article
and
List<Article>
for
GET /articles
   and
GET /articles/{id}
respectively.
If the
GET /articles
endpoint has no articles, it should return an empty list.
   If the
GET /articles{id}
endpoint finds no article it should return nothing and set a
 404 response code.
The controller will have access to the
ArticleService
through which it can obtain articles.
Two methods that are of particular utility to this challenge in the
ArticleService
are:
 }
Article Model
The
Article
model has three properties with getters and setters for each:
Title (String) -
getTitle
 
/setTitle
Body (String) -
getBody
 
/setBody /setId
