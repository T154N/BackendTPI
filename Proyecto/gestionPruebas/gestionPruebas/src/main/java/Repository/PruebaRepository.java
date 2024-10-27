package Repository;

import Entities.Prueba;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import org.springframework.data.jpa.repository.Query;

public interface PruebaRepository extends JpaRepository<Prueba, Long> , JpaSpecificationExecutor<Prueba> {

/*    @Query("SELECT p.* FROM Prueba p WHERE p.pruebaId = :id")
    Prueba findPruebaById(Long id);
*/


}
