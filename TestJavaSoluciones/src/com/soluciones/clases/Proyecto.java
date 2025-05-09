/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soluciones.clases;

import java.util.Date;

/**
 *
 * @author camper
 */
public class Proyecto {
    
    private int id;
    private int idCliente;
    private String nombre;
    private Date FechaInicio;
    private Date FechaFin;
    private String estado;

    public Proyecto() {
    }

    public Proyecto(int id, int idCliente, String nombre, Date FechaInicio, Date FechaFin, String estado) {
        this.id = id;
        this.idCliente = idCliente;
        this.nombre = nombre;
        this.FechaInicio = FechaInicio;
        this.FechaFin = FechaFin;
        this.estado = estado;
    }

    public int getId() {
        return id;
    }

    public int getIdCliente() {
        return idCliente;
    }

    public String getNombre() {
        return nombre;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdCliente(int idCliente) {
        this.idCliente = idCliente;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Proyecto{" + "id=" + id + ", idCliente=" + idCliente + ", nombre=" + nombre + ", FechaInicio=" + FechaInicio + ", FechaFin=" + FechaFin + ", estado=" + estado + '}';
    }
    
    
    
    
    public void ListarEmpleados(){
    
        System.out.println("prueba listando");
    }
    
    
    public void CalcularDuracion() {
        
        System.out.println("probar calcular duracion");
    
    }
    
    


}