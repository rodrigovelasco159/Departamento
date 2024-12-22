/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Nodo;

/**
 *
 * @author HP
 */
public class Nodo {
     private String ci;
    private String nombre;
    private String apellido;
    private String sexo;
    private String fechaIngreso;
    private int edad;
    private String carrera;
    private Nodo siguiente;

    // Constructor
    public Nodo(String ci, String nombre, String apellido, String sexo, String fechaIngreso, int edad, String carrera) {
        this.ci = ci;
        this.nombre = nombre;
        this.apellido = apellido;
        this.sexo = sexo;
        this.fechaIngreso = fechaIngreso;
        this.edad = edad;
        this.carrera = carrera;
        this.siguiente = null;
    }

    // Getters y setters
    public String getCi() {
        return ci;
    }

    public void setCi(String ci) {
        this.ci = ci;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public String getSexo() {
        return sexo;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public String getFechaIngreso() {
        return fechaIngreso;
    }

    public void setFechaIngreso(String fechaIngreso) {
        this.fechaIngreso = fechaIngreso;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getCarrera() {
        return carrera;
    }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public Nodo getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(Nodo siguiente) {
        this.siguiente = siguiente;
    }
}
