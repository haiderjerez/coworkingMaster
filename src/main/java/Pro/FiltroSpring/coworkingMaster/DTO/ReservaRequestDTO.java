package pro.Trartaria.FiltroSpring.DTO;

import java.time.LocalDate;
import java.time.LocalTime;

public class ReservaRequestDTO {
    private Long espacioId;
    private LocalDate fecha;
    private LocalTime horaInicio;
    private LocalTime horaFin;

    public Long getEspacioId() {
        return espacioId;
    }
    public void setEspacioId(Long espacioId) {
        this.espacioId = espacioId;
    }
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public LocalTime getHoraInicio() {
        return horaInicio;
    }
    public void setHoraInicio(LocalTime horaInicio) {
        this.horaInicio = horaInicio;
    }
    public LocalTime getHoraFin() {
        return horaFin;
    }
    public void setHoraFin(LocalTime horaFin) {
        this.horaFin = horaFin;
    }
}