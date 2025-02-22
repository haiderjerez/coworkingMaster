package Pro.FiltroSpring.coworkingMaster.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import Pro.FiltroSpring.coworkingMaster.Repository.EspaciosRepository;
import Pro.FiltroSpring.coworkingMaster.Service.EspaciosService;



@RestController
@RequestMapping("/espacios")
public class EspaciosController {
     
    @Autowired
    private EspaciosService espaciosService;
    @RequestMapping
    public List<EspaciosRepository> obtenerTodos(){
        return espaciosService.obtenerTodos();
    }

    @RequestMapping("/{id}")
    public Optional<EspaciosRepository> obtenerPorId(@PathVariable Long id){
        return espaciosService.obtenerPorId(id);
    }
    @RequestMapping("/guardar")
    public EspaciosRepository guardarEspacio(){
        return espaciosService.guardarEspacio(null);
    }
    @RequestMapping("/eliminar/{id}")
    public String eliminarEspacio(@PathVariable Long id){
        return espaciosService.eliminarEspacio(id);
    }
}