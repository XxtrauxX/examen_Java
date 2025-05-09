/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.soluciones.clases;

/**
 *
 * @author camper
 */
public class Empleado {
    
    private int id;
    private String nombre;
    private String cargo;
    private Float salario;
    private String especialidad;
    private int idProyecto;

    public Empleado() {
    }

    public Empleado(int id, String nombre, String cargo, Float salario, String especialidad, int idProyecto) {
        this.id = id;
        this.nombre = nombre;
        this.cargo = cargo;
        this.salario = salario;
        this.especialidad = especialidad;
        this.idProyecto = idProyecto;
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getCargo() {
        return cargo;
    }

    public Float getSalario() {
        return salario;
    }

    public String getEspecialidad() {
        return especialidad;
    }

    public int getIdProyecto() {
        return idProyecto;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public void setSalario(Float salario) {
        this.salario = salario;
    }

    public void setEspecialidad(String especialidad) {
        this.especialidad = especialidad;
    }

    public void setIdProyecto(int idProyecto) {
        this.idProyecto = idProyecto;
    }

    @Override
    public String toString() {
        return "Empleado{" + "id=" + id + ", nombre=" + nombre + ", cargo=" + cargo + ", salario=" + salario + ", especialidad=" + especialidad + ", idProyecto=" + idProyecto + '}';
    }
    
    
    public void asignarProyecto(){
    
        System.out.println("prueba de asignacion");
    }
    
    
    
    
    public void RegistrarHorasTrabajadas(){
    
        System.out.println("prueba de horas empleados");
    }
    
    
    
    
    
}
