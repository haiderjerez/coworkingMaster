package Pro.FiltroSpring.coworkingMaster.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import Pro.FiltroSpring.coworkingMaster.Entities.Espacios;
import Pro.FiltroSpring.coworkingMaster.Entities.EstadoReserva;

@Repository
public interface EstadoReservaRepository extends JpaRepository<EspaciosRepository, Long>{
    List<Espacios> findByTipoAndActivo(String tipo, boolean activo);

    EstadoReserva save(EstadoReserva estadoReserva);
}
