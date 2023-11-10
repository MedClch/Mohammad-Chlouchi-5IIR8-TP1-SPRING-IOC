package ma.formation.ioc.dao;

import ma.formation.ioc.Model.Article;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

//@Repository
//@Qualifier("dao1")
public class DAOImpl1 implements iDAO{
    private static final List<Article> repo = List.of(
            new Article(1L,"PC HP I7",25000d,5d),
            new Article(2L,"PC HP I5",15000d,10d),
            new Article(3L,"TV LG 32p",3500d,8d),
            new Article(4L,"TV SAMSUNG 60p",9000d,15d)
    );

    @Override
    public List<Article> getAll() {
        return repo;
    }

    @Override
    public void save(Article article) {
        repo.add(article);
    }

    @Override
    public void deleteBId(Long id) {
        repo.remove(repo.stream().filter(a->a.getId()
                .equals(id)).findAny().orElse(null)
                .getId().intValue());
    }

    @Override
    public Article findBId(Long id) {
        return repo.stream().filter(a->a.getId()
                        .equals(id)).findAny().orElse(null);
    }
}
