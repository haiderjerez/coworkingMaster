package pro.Trartaria.FiltroSpring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro.Trartaria.FiltroSpring.Entities.EstadoReserva;
import pro.Trartaria.FiltroSpring.Repository.EspaciosRepository;
import pro.Trartaria.FiltroSpring.Repository.EstadoReservaRepository;

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
