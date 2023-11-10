package ma.formation.ioc.dao;

import ma.formation.ioc.Model.Article;

import java.util.List;

public interface iDAO {
    List<Article> getAll();
    void save(Article article);
    void deleteBId(Long id);
    Article findBId(Long id);
}
