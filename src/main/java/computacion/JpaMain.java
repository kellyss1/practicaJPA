package computacion;

import computacion.db.Product;
import computacion.db.Supplier;
import computacion.repository.ProductRepository;
import computacion.repository.SupplierRepository;
import jakarta.enterprise.inject.se.SeContainer;
import jakarta.enterprise.inject.se.SeContainerInitializer;

import java.util.List;

public class JpaMain {
    public static void main(String[] args) {

        //Version DeltaSpike
        SeContainer container = SeContainerInitializer.newInstance().initialize();
        var repoProducts = container.select(ProductRepository.class).get();

        List<Product> productosMayor10 = repoProducts.findByPriceGreaterThan(40.0);
        productosMayor10.forEach(System.out::println);

        var repoSuppliers = container.select(SupplierRepository.class).get();
        List<Supplier> suppliers = repoSuppliers.findByCountry("Ecuador");
        suppliers.forEach(System.out::println);
        container.close();
    }
}
