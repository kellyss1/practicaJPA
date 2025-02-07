package computacion.repository;

import computacion.db.Supplier;
import org.apache.deltaspike.data.api.EntityRepository;
import org.apache.deltaspike.data.api.Repository;

import java.util.List;

@Repository
public interface SupplierRepository extends EntityRepository<Supplier, Integer> {
    List<Supplier> findByName(String name);
    List<Supplier> findByCountry(String country);
    List<Supplier> findByContact(String contact);

    List<Supplier> findByCountryOrderByNameAsc(String country); // Ordenar por nombre ascendente
    List<Supplier> findByCountryOrderByNameDesc(String country); // Ordenar por nombre descendente

    List<Supplier> findByCountryAndName(String country, String name);  // Proveedores por país y nombre
    List<Supplier> findByCountryOrName(String country, String name);   // Proveedores por país o nombre

    List<Supplier> findByNameContaining(String keyword);  // Proveedores cuyo nombre contenga "keyword"
    List<Supplier> findByCountryIgnoreCase(String country); // Ignorar mayúsculas/minúsculas
    List<Supplier> findByNameStartingWith(String prefix);  // Proveedores cuyo nombre empiece con "prefix"

    void deleteByName(String name); // Elimina proveedor por nombre
    long countByCountry(String country); // Número de proveedores en un país

}
