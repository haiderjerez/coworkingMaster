package pro.Trartaria.FiltroSpring.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pro.Trartaria.FiltroSpring.Entities.Espacios;
import pro.Trartaria.FiltroSpring.Entities.EstadoReserva;

@Repository
public interface EstadoReservaRepository extends JpaRepository<EspaciosRepository, Long>{
    List<Espacios> findByTipoAndActivo(String tipo, boolean activo);

    EstadoReserva save(EstadoReserva estadoReserva);
}
