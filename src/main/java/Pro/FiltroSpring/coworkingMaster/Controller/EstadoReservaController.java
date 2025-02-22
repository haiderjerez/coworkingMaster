package pro.Trartaria.FiltroSpring.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pro.Trartaria.FiltroSpring.Entities.EstadoReserva;
import pro.Trartaria.FiltroSpring.Repository.EspaciosRepository;
import pro.Trartaria.FiltroSpring.Service.EstadoReservaService;

@RestController
@RequestMapping("/estados-reservas")
public class EstadoReservaController {
    @Autowired
    private EstadoReservaService estadoReservaService;
    @RequestMapping
    public List<EspaciosRepository> obtenerTodos(){
        return estadoReservaService.obtenerTodos();
    }
    @RequestMapping("/{id}")
    public Optional<EstadoReserva> obtenerPorId(@PathVariable Long id){
        return estadoReservaService.obtenerPorId(id);
    }
    
    @RequestMapping("/guardar")
    public EstadoReserva guardarEstadoReserva(){
        return estadoReservaService.guardarEstadoReserva(null);
    }

    @RequestMapping("/eliminar/{id}")
    public void eliminarEstadoReserva(@PathVariable Long id){
        estadoReservaService.eliminarEstadoReserva(id);
    }
}
