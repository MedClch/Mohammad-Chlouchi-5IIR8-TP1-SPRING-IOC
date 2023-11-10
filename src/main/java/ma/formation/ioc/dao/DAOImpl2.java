package ma.formation.ioc.dao;

import ma.formation.ioc.Model.Article;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@Qualifier("dao2")
public class DAOImpl2 implements iDAO{

    private static final List<Article> repo = List.of(
            new Article(1L,"DESCRIPTION_1",100d,2d),
            new Article(2L,"DESCRIPTION_2",300d,11d),
            new Article(3L,"DESCRIPTION_3",15000d,33d),
            new Article(4L,"DESCRIPTION_4",11000d,4d)
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
