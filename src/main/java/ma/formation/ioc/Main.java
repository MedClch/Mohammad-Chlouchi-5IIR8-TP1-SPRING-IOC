package ma.formation.ioc;
import ma.formation.ioc.dao.DAOImpl1;
import ma.formation.ioc.dao.iDAO;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ma.formation.ioc")
public class Main {
    @Bean
    @Qualifier("dao1")
    public iDAO getDAO(){
        return new DAOImpl1();
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
    }
}