/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soluciones.clases;

/**
 *
 * @author camper
 */
public class Clientes {
    private int id;
    private String nombre;
    private String representante;
    private String correo;
    private String telefono;
    private String direccion;
    private String Sector;

    public Clientes() {
    }

    public Clientes(int id, String nombre, String representante, String correo, String telefono, String direccion, String Sector) {
        this.id = id;
        this.nombre = nombre;
        this.representante = representante;
        this.correo = correo;
        this.telefono = telefono;
        this.direccion = direccion;
        this.Sector = Sector;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getRepresentante() {
        return representante;
    }

    public String getCorreo() {
        return correo;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getSector() {
        return Sector;
    }

 

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setRepresentante(String representante) {
        this.representante = representante;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setSector(String Sector) {
        this.Sector = Sector;
    }

    @Override
    public String toString() {
        return "Clientes{" + "id=" + id + ", nombre=" + nombre + ", representante=" + representante + ", correo=" + correo + ", telefono=" + telefono + ", direccion=" + direccion + ", Sector=" + Sector + '}';
    }
    
    
    
    
    
    public void consultarDatos() {
    
        System.out.println("prueba de metodo");
    }
    
    
    public void listarProyectosActivos(){
    
        System.out.println("prueba de metodo listar proyectos activos ");
    }
    
}
