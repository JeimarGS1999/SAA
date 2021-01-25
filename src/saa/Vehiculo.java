/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package saa;

/**
 *
 * @author miguel
 */
public class Vehiculo {
    private int idVehiculo, costo;
    private String marca, estado, tipo, carroceria, color;
    private boolean disponibilidad;
    
    public void Vehiculo(){
        this.idVehiculo = 0;
        this.marca = "";
    }
    
    public String getMarca(){
        return this.marca;
    }
    
    public void setMarca(String marcaVehiculo){
        this.marca = marcaVehiculo;
    }
    
    public void setCosto(int costo){
        this.costo = costo;
    }
    
    public int getCosto(){
        return this.costo;
    }
    
    public void setEstado(String estado){
        this.estado = estado;
    }
    
    public String getEstado(){
        return this.estado;
    }
    
    
}
