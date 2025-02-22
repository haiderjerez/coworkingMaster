package pro.Trartaria.FiltroSpring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro.Trartaria.FiltroSpring.Entities.Reservas;
import pro.Trartaria.FiltroSpring.Repository.EspaciosRepository;
import pro.Trartaria.FiltroSpring.Repository.ReservasRepository;

@Service
public class ReservasService {
    @Autowired
    private ReservasRepository reservasRepository;

    public List<EspaciosRepository> obtenerTodos(){
        return reservasRepository.findAll();
    }
    
    public Optional<EspaciosRepository> obtenerPorId(Long id){
        return reservasRepository.findById(id);
    }

    public Reservas guardarReserva(Reservas reservas){
        return reservasRepository.save(reservas);
    }

    public String eliminarReserva(Long id){
        reservasRepository.deleteById(id);
                return null;
    }
}

