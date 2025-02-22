package pro.Trartaria.FiltroSpring.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface EspaciosRepository extends JpaRepository<EspaciosRepository, Long>{
    EspaciosRepository findByUsuarioAndEspacioAndActivo(String usuario, String espacio, boolean activo);
}
