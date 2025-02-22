package Pro.FiltroSpring.coworkingMaster.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Pro.FiltroSpring.coworkingMaster.Entities.Reservas;


@Repository
public interface ReservasRepository extends JpaRepository<EspaciosRepository, Long>{
    EspaciosRepository findByUsuarioAndEspacioAndActivo(String usuario, String espacio, boolean activo);

    Reservas save(Reservas reservas);
}

