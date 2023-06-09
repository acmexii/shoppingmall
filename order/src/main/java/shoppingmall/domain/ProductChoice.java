package shoppingmall.domain;

import java.util.Date;
import java.util.List;
import javax.persistence.*;
import lombok.Data;

@Entity
@Table(name = "ProductChoice_table")
@Data
public class ProductChoice {

    @Id
    //@GeneratedValue(strategy=GenerationType.AUTO)
    private Long id;
}
