package ma.formation.ioc.Services;

import ma.formation.ioc.Model.Article;
import ma.formation.ioc.dao.iDAO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class iServiceImpl implements iService{
    @Autowired
    @Qualifier("dao1")
    private iDAO dao;

//    public iServiceImpl(@Qualifier("dao1") iDAO dao) {
//        this.dao = dao;
//    }

    @Override
    public List<Article> getAll() {
        return dao.getAll();
    }

    @Override
    public void save(Article article) {
        dao.save(article);
    }

    @Override
    public void deleteById(Long id) {
        dao.deleteBId(id);
    }

//    @Autowired
//    @Qualifier("dao1")
//    public void setDao(iDAO dao) {
//        this.dao = dao;
//    }

    @Override
    public Article findById(Long id) {
        return dao.findBId(id);
    }
}
