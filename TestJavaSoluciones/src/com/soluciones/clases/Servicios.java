/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soluciones.clases;

/**
 *
 * @author camper
 */
public class Servicios {
    
    private int id;
    private String nombre;
    private String descripcion;
    private Float PrecioHora;
    private String categoria;

    public Servicios() {
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public Float getPrecioHora() {
        return PrecioHora;
    }

    public String getCategoria() {
        return categoria;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public void setPrecioHora(Float PrecioHora) {
        this.PrecioHora = PrecioHora;
    }

    public void setCategoria(String categoria) {
        this.categoria = categoria;
    }

    @Override
    public String toString() {
        return "Servicios{" + "id=" + id + ", nombre=" + nombre + ", descripcion=" + descripcion + ", PrecioHora=" + PrecioHora + ", categoria=" + categoria + '}';
    }
    
    
    
    
}
