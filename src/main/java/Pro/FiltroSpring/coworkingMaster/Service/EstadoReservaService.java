package Pro.FiltroSpring.coworkingMaster.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import Pro.FiltroSpring.coworkingMaster.Entities.EstadoReserva;
import Pro.FiltroSpring.coworkingMaster.Repository.EspaciosRepository;
import Pro.FiltroSpring.coworkingMaster.Repository.EstadoReservaRepository;


@Service
public class EstadoReservaService {
    @Autowired
    private EstadoReservaRepository estadoReservaRepository;

    public List<EspaciosRepository> obtenerTodos(){
        return estadoReservaRepository.findAll();
    }

    public Optional<EstadoReserva> obtenerPorId(Long id){
        return Optional.empty();
    }

    public EstadoReserva guardarEstadoReserva(EstadoReserva estadoReserva){
        return estadoReservaRepository.save(estadoReserva);
    }

    public void eliminarEstadoReserva(Long id){
        estadoReservaRepository.deleteById(id);;
    }
}
