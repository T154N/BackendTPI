package Repository;

import Entities.Interesado;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;

public interface InteresadoRepository extends JpaRepository<Interesado, Long>, JpaSpecificationExecutor<Interesado> {
}
