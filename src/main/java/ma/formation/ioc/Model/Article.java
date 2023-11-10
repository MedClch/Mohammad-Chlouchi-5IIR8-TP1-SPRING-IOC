package ma.formation.ioc.Model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Article {
    private Long id;
    private String description;
    private Double prix;
    private Double qte;
}
