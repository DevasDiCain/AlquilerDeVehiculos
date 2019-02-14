/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package alquiler;

import java.time.LocalDate;
import java.util.Date;

/**
 *
 * @author jriosaguilar
 */
public class VehiculoAlquilado {
    
    //Atributos
    private Cliente cliente;
    private Vehiculo vehiculo;
    private LocalDate diaAlquiler;
    private LocalDate mesAlquiler;
    private LocalDate anioAlquiler;
    private int totalDiasAlquiler;
    
    //Métodos
    //Constructor parametrizado0
    public VehiculoAlquilado(Cliente cliente, Vehiculo vehiculo, LocalDate diaAlquiler, LocalDate mesAlquiler, LocalDate anioAlquiler, int totalDiasAlquiler) {
        this.cliente = cliente;
        this.vehiculo = vehiculo;
        this.diaAlquiler = diaAlquiler;
        this.mesAlquiler = mesAlquiler;
        this.anioAlquiler = anioAlquiler;
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
    
    //Getters y setters

    public Cliente getCliente() {
        return cliente;
    }

    public void setCliente(Cliente cliente) {
        this.cliente = cliente;
    }

    public Vehiculo getVehiculo() {
        return vehiculo;
    }

    public void setVehiculo(Vehiculo vehiculo) {
        this.vehiculo = vehiculo;
    }

    public LocalDate getDiaAlquiler() {
        return diaAlquiler;
    }

    public void setDiaAlquiler(LocalDate diaAlquiler) {
        this.diaAlquiler = diaAlquiler;
    }

    public LocalDate getMesAlquiler() {
        return mesAlquiler;
    }

    public void setMesAlquiler(LocalDate mesAlquiler) {
        this.mesAlquiler = mesAlquiler;
    }

    public LocalDate getAnioAlquiler() {
        return anioAlquiler;
    }

    public void setAnioAlquiler(LocalDate anioAlquiler) {
        this.anioAlquiler = anioAlquiler;
    }

    public int getTotalDiasAlquiler() {
        return totalDiasAlquiler;
    }

    public void setTotalDiasAlquiler(int totalDiasAlquiler) {
        this.totalDiasAlquiler = totalDiasAlquiler;
    }
    
}
