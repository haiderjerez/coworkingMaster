package Pro.FiltroSpring.coworkingMaster.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Pro.FiltroSpring.coworkingMaster.Entities.Espacios;


@Repository
public interface DisponibilidadRepository extends JpaRepository<Espacios, Long>{
    Espacios findByEspacioAndActivo(String espacio, boolean activo);
}
