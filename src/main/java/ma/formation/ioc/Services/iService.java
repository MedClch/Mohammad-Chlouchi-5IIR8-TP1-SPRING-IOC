package ma.formation.ioc.Services;

import ma.formation.ioc.Model.Article;

import java.util.List;

public interface iService {
    List<Article> getAll();
    void save(Article article);
    void deleteById(Long id);
    Article findById(Long id);
}
