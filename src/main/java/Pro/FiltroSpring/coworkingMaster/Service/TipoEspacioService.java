package Pro.FiltroSpring.coworkingMaster.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pro.FiltroSpring.coworkingMaster.Repository.EspaciosRepository;
import Pro.FiltroSpring.coworkingMaster.Repository.TipoEspacioRepository;


@Service
public class TipoEspacioService {
    @Autowired
    private TipoEspacioRepository tipoEspacioRepository;

    public List<EspaciosRepository> obtenerTodos(){
        return tipoEspacioRepository.findAll();
    }

    public Optional<EspaciosRepository> obtenerPorId(Long id){
        return tipoEspacioRepository.findById(id);
    }
    
    public TipoEspacioRepository guardarTipoEspacio(TipoEspacioRepository tipoEspacio){
        return tipoEspacioRepository.save(tipoEspacio);
    }

    public String eliminarTipoEspacio(Long id){
        tipoEspacioRepository.deleteById(id);;
                return null;
    }
}
