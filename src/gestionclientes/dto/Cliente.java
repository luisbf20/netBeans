/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package gestionclientes.dto;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author usuario
 */
public class Cliente {
    
    private String nombre, apellidos, provincia;
    private Date fecha;

    public Cliente(String nombre, String apellidos, String provincia, Date fecha) {
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.provincia = provincia;
        this.fecha = fecha;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public String getProvincia() {
        return provincia;
    }

    public Date getFecha() {
        return fecha;
    }
    
    public String getFechaFormateada(){
        SimpleDateFormat sdf = new SimpleDateFormat("dd-MM-yyyy");
        return sdf.format(fecha);
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setProvincia(String provincia) {
        this.provincia = provincia;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }
    
    public String[] toArrayString(){
        String[] retorna = new String[4];
        retorna[0] = nombre;
        retorna[1] = apellidos;
        retorna[2] = getFechaFormateada();
        retorna[3] = provincia;
        return retorna;
    }
    
}
