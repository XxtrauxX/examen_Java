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
public class Contrato {
    
    private int id;
    private int idCLiente;
    private int idServicio;
    private Date FechaInicio;
    private Date FechaFin;
    private Float CostoTotal;
    private String estado;

    public Contrato() {
    }

    public int getId() {
        return id;
    }

    public int getIdCLiente() {
        return idCLiente;
    }

    public int getIdServicio() {
        return idServicio;
    }

    public Date getFechaInicio() {
        return FechaInicio;
    }

    public Date getFechaFin() {
        return FechaFin;
    }

    public Float getCostoTotal() {
        return CostoTotal;
    }

    public String getEstado() {
        return estado;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setIdCLiente(int idCLiente) {
        this.idCLiente = idCLiente;
    }

    public void setIdServicio(int idServicio) {
        this.idServicio = idServicio;
    }

    public void setFechaInicio(Date FechaInicio) {
        this.FechaInicio = FechaInicio;
    }

    public void setFechaFin(Date FechaFin) {
        this.FechaFin = FechaFin;
    }

    public void setCostoTotal(Float CostoTotal) {
        this.CostoTotal = CostoTotal;
    }

    public void setEstado(String estado) {
        this.estado = estado;
    }

    @Override
    public String toString() {
        return "Contrato{" + "id=" + id + ", idCLiente=" + idCLiente + ", idServicio=" + idServicio + ", FechaInicio=" + FechaInicio + ", FechaFin=" + FechaFin + ", CostoTotal=" + CostoTotal + ", estado=" + estado + '}';
    }
    
    
    public void verEstadoContrato(){
        System.out.println("prueba de contarto");
        
    }
    
    public void CalcularCosto(){
    
            System.out.println("calculmdo costo");
    }
    
}
