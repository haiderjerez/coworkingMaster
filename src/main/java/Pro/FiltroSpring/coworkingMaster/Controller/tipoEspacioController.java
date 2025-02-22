package pro.Trartaria.FiltroSpring.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pro.Trartaria.FiltroSpring.Repository.EspaciosRepository;
import pro.Trartaria.FiltroSpring.Service.TipoEspacioService;

@RestController
@RequestMapping("/tipoEspacio")
public class tipoEspacioController {
    @Autowired
    private TipoEspacioService tipoEspacioService;

    @RequestMapping
    public List<EspaciosRepository> obtenerTodos(){
        return tipoEspacioService.obtenerTodos();
    }   
    
    @RequestMapping("/{id}")
    public Optional<EspaciosRepository> obtenerPorId(@PathVariable Long id){
        return tipoEspacioService.obtenerPorId(id);
    }
    @RequestMapping("/guardar")
    public EspaciosRepository guardarTipoEspacio(){
        return (EspaciosRepository) tipoEspacioService.guardarTipoEspacio(null);
    }
    @RequestMapping("/eliminar/{id}")
    public String eliminarTipoEspacio(@PathVariable Long id){
        return tipoEspacioService.eliminarTipoEspacio(id);
    }
}
