package computacion.db;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.List;

@Entity
@Table(name = "suppliers")
@Getter
@Setter
@ToString(exclude = "products")
public class Supplier {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String name;
    private String country;
    private String contact;

    @OneToMany(mappedBy = "supplier")
    private List<Product> products;
}
