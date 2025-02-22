package pro.Trartaria.FiltroSpring.DTO;

import java.time.LocalDate;

public class FiltroReservasDTO {
    private LocalDate fecha;
    private String estado;
    public LocalDate getFecha() {
        return fecha;
    }
    public void setFecha(LocalDate fecha) {
        this.fecha = fecha;
    }
    public String getEstado() {
        return estado;
    }
    public void setEstado(String estado) {
        this.estado = estado;
    }

}