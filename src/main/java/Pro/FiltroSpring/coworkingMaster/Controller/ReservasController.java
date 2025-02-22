package pro.Trartaria.FiltroSpring.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pro.Trartaria.FiltroSpring.Entities.Reservas;
import pro.Trartaria.FiltroSpring.Repository.EspaciosRepository;
import pro.Trartaria.FiltroSpring.Service.ReservasService;

@RestController
@RequestMapping("/reservas")
public class ReservasController {
    @Autowired
    private ReservasService reservasService; 

    @RequestMapping
    public List<EspaciosRepository> obtenerTodos(){
        return reservasService.obtenerTodos();
    }
    @RequestMapping("/{id}")
    public Optional<EspaciosRepository> obtenerPorId(@PathVariable Long id){
        return reservasService.obtenerPorId(id);
    }
    @RequestMapping("/guardar")
    public Reservas guardarReserva(){
        return reservasService.guardarReserva(null);
    }
    @RequestMapping("/eliminar/{id}")
    public String eliminarReserva(@PathVariable Long id){
        return reservasService.eliminarReserva(id);
    }
    

}
