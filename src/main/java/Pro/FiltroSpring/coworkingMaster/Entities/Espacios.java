package pro.Trartaria.FiltroSpring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name="Espacios")
public class Espacios {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String Nombre;

    @OneToOne
    private Long TipoEspacio_ID;

    private String CapaciadMaxima;
    
    @OneToOne
    private Long Disponibilidad_ID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getNombre() {
        return Nombre;
    }

    public void setNombre(String nombre) {
        Nombre = nombre;
    }

    public Long getTipoEspacio_ID() {
        return TipoEspacio_ID;
    }

    public void setTipoEspacio_ID(Long tipoEspacio_ID) {
        TipoEspacio_ID = tipoEspacio_ID;
    }

    public String getCapaciadMaxima() {
        return CapaciadMaxima;
    }

    public void setCapaciadMaxima(String capaciadMaxima) {
        CapaciadMaxima = capaciadMaxima;
    }

    public Long getDisponibilidad_ID() {
        return Disponibilidad_ID;
    }

    public void setDisponibilidad_ID(Long disponibilidad_ID) {
        Disponibilidad_ID = disponibilidad_ID;
    }

    public Espacios() {
    }

    public Espacios(Long id, String nombre, Long tipoEspacio_ID, String capaciadMaxima, Long disponibilidad_ID) {
        this.id = id;
        Nombre = nombre;
        TipoEspacio_ID = tipoEspacio_ID;
        CapaciadMaxima = capaciadMaxima;
        Disponibilidad_ID = disponibilidad_ID;
    }
}
