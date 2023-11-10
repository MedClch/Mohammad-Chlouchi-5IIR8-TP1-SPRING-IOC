package ma.formation.ioc.service;

import ma.formation.ioc.Main;
import ma.formation.ioc.Services.iService;
import ma.formation.ioc.Services.iServiceImpl;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestService {
    static AnnotationConfigApplicationContext context = null;

    @BeforeAll
    static void init(){
        context = new AnnotationConfigApplicationContext(Main.class);
    }

    @AfterAll
    static void close(){
        context.close();
    }

    @Test
    void test1(){
        iService service = context.getBean(iServiceImpl.class);
        Assertions.assertAll("Donnees erronees",
                ()-> Assertions.assertEquals(1L,service.findById(1L).getId(),
                        "First ID article is not correct"),
                ()-> Assertions.assertEquals("PC HP I7",service.findById(1L).getDescription(),
                        "First article description is not correct"),
                ()-> Assertions.assertEquals(25000d,service.findById(1L).getPrix(),
                        "First article price is not correct"),
                ()-> Assertions.assertEquals(5d,service.findById(1L).getQte(),
                        "First article quantity is not correct")
        );
    }
}
