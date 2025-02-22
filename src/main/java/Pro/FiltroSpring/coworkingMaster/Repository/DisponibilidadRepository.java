package pro.Trartaria.FiltroSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import pro.Trartaria.FiltroSpring.Entities.Espacios;

@Repository
public interface DisponibilidadRepository extends JpaRepository<Espacios, Long>{
    Espacios findByEspacioAndActivo(String espacio, boolean activo);
}
