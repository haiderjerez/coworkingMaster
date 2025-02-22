package pro.Trartaria.FiltroSpring.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import pro.Trartaria.FiltroSpring.Entities.Espacios;
import pro.Trartaria.FiltroSpring.Service.DisponibilidadService;

@RestController
@RequestMapping("/disponibilidad")
public class DisponibilidadController {
    @Autowired
    private DisponibilidadService disponibilidadService;
    
    @RequestMapping
    public List<Espacios> obtenerTodos(){
        return disponibilidadService.obtenerTodos();
    }

    @RequestMapping("/{id}")
    public Espacios obtenerPorId(@PathVariable Long id){
        return disponibilidadService.obtenerPorId(id).orElse(null);
    }

    @RequestMapping("/guardar")
    public Espacios guardarDisponibilidad(@RequestBody Espacios disponibilidad){
        return disponibilidadService.guardarEspacio(disponibilidad);
    }

    @RequestMapping("/eliminar/{id}")
    public void eliminarDisponibilidad(@PathVariable Long id){
        disponibilidadService.eliminarEspacio(id);
    }
}

