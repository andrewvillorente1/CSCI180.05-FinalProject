package app.repositories;

import app.entities.Cafeteria;
import org.springframework.data.jpa.repository.JpaRepository;
import java.util.Optional;

public interface CafeteriaRepository extends JpaRepository<Cafeteria, Long>{
    Optional<Cafeteria> findByCafeteriaName(String cafeterianame);

}
