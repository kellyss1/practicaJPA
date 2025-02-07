package computacion.config;

import jakarta.enterprise.context.ApplicationScoped;
import jakarta.enterprise.inject.Disposes;
import jakarta.enterprise.inject.Produces;
import jakarta.inject.Inject;
import jakarta.persistence.EntityManager;
import jakarta.persistence.EntityManagerFactory;
import org.apache.deltaspike.jpa.api.entitymanager.PersistenceUnitName;

@ApplicationScoped
public class JpaConfig {

//    @PersistenceUnitName("postgres-db")
//    @Inject
//    EntityManagerFactory emfPostgres;

    @PersistenceUnitName("sqlite-db")
    @Inject
    EntityManagerFactory emfSqlite;

//    @Produces
//    protected EntityManager entityManagerPostgres() {
//        System.out.println("Creando EntityManager para PostgreSQL...");
//        return emfPostgres.createEntityManager();
//    }

    @Produces
    public EntityManager entityManagerSqlite() {
        System.out.println("Creando EntityManager para SQLite...");
        return emfSqlite.createEntityManager();
    }

    public void closeEntityManager(@Disposes EntityManager entityManager) {
        System.out.println("Cerrando EntityManager...");
        if(entityManager.isOpen()){
            entityManager.close();
        }
    }

}
