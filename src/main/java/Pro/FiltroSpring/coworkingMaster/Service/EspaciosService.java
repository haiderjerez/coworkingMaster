package pro.Trartaria.FiltroSpring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro.Trartaria.FiltroSpring.Repository.EspaciosRepository;

@Service
public class EspaciosService {
    @Autowired
    private EspaciosRepository espaciosRepository;

    public List<EspaciosRepository> obtenerTodos(){
        return espaciosRepository.findAll();
    }

    public Optional<EspaciosRepository> obtenerPorId(Long id){
        return espaciosRepository.findById(id);
    }

    public EspaciosRepository guardarEspacio(EspaciosRepository espacios){
        return espaciosRepository.save(espacios);
    }

    public String eliminarEspacio(Long id) {
        espaciosRepository.deleteById(id);
        return "Espacio eliminado con éxito";
    }
}
 