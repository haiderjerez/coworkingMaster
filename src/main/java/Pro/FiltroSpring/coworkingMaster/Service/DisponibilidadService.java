package pro.Trartaria.FiltroSpring.Service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import pro.Trartaria.FiltroSpring.Entities.Espacios;
import pro.Trartaria.FiltroSpring.Repository.DisponibilidadRepository;;

@Service
public class DisponibilidadService {
    @Autowired
    private DisponibilidadRepository disponibilidadRepository;

    public List<Espacios> obtenerTodos(){
        return disponibilidadRepository.findAll();
    }

    public Optional<Espacios> obtenerPorId(Long id){
        return disponibilidadRepository.findById(id);
    }

    public Espacios guardarEspacio(Espacios espacios){
        return disponibilidadRepository.save(espacios);
    }

    public void eliminarEspacio(Long id){
        disponibilidadRepository.deleteById(id);;
    }
}