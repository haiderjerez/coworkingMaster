package pro.Trartaria.FiltroSpring.Entities;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import jakarta.persistence.Table;

@Entity
@Table(name= "Reservas")
public class Reservas {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @OneToMany
    private Long Espacios_ID;

    private String FechaReserva;
    private String HoraCom;
    private String HoraFin;
    
    @OneToOne
    private Long EstadoReserva_ID;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getEspacios_ID() {
        return Espacios_ID;
    }

    public void setEspacios_ID(Long espacios_ID) {
        Espacios_ID = espacios_ID;
    }

    public String getFechaReserva() {
        return FechaReserva;
    }

    public void setFechaReserva(String fechaReserva) {
        FechaReserva = fechaReserva;
    }

    public String getHoraCom() {
        return HoraCom;
    }

    public void setHoraCom(String horaCom) {
        HoraCom = horaCom;
    }

    public String getHoraFin() {
        return HoraFin;
    }

    public void setHoraFin(String horaFin) {
        HoraFin = horaFin;
    }

    public Long getEstadoReserva_ID() {
        return EstadoReserva_ID;
    }

    public void setEstadoReserva_ID(Long estadoReserva_ID) {
        EstadoReserva_ID = estadoReserva_ID;
    }

    public Reservas() {
    }

    public Reservas(Long id, Long espacios_ID, String fechaReserva, String horaCom, String horaFin,
            Long estadoReserva_ID) {
        this.id = id;
        Espacios_ID = espacios_ID;
        FechaReserva = fechaReserva;
        HoraCom = horaCom;
        HoraFin = horaFin;
        EstadoReserva_ID = estadoReserva_ID;
    }   
}
