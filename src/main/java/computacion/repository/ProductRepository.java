package computacion.repository;

import computacion.db.Product;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import java.util.List;

@Repository
public interface ProductRepository extends EntityRepository<Product, Integer> {

    List<Product> findByName(String name);
    List<Product> findByPriceGreaterThan(double price);
    List<Product> findPriceLessThan(double price);
}
