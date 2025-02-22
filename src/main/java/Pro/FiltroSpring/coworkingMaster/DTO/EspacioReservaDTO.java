package pro.Trartaria.FiltroSpring.DTO;

import java.util.List;

public class EspacioReservaDTO {
    private Long id;
    private String nombre;
    private String tipo;
    private int capacidad;
    private boolean activo;
    private List<ReservaDTO> reservas;
    
    public Long getId() {
        return id;
    }
    public void setId(Long id) {
        this.id = id;
    }
    public String getNombre() {
        return nombre;
    }
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    public String getTipo() {
        return tipo;
    }
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }
    public int getCapacidad() {
        return capacidad;
    }
    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }
    public boolean isActivo() {
        return activo;
    }
    public void setActivo(boolean activo) {
        this.activo = activo;
    }
    public List<ReservaDTO> getReservas() {
        return reservas;
    }
    public void setReservas(List<ReservaDTO> reservas) {
        this.reservas = reservas;
    }

    
}
