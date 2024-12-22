/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Listas;

import Nodo.Nodo;

/**
 *
 * @author HP
 */
public class Listas {
    private Nodo cabeza;

    // Constructor
    public Listas() {
        this.cabeza = null;
    }

   
    public void añadirPersona(String ci, String nombre, String apellido, String sexo, String fechaIngreso, int edad, String carrera) {
        Nodo nuevaPersona = new Nodo(ci, nombre, apellido, sexo, fechaIngreso, edad, carrera);
        if (cabeza == null) {
            cabeza = nuevaPersona;
        } else {
            Nodo actual = cabeza;
            while (actual.getSiguiente() != null) {
                actual = actual.getSiguiente();
            }
            actual.setSiguiente(nuevaPersona);
        }
    }

 
    public void mostrarPersonas() {
        if (cabeza == null) {
            System.out.println("La lista está vacía.");
        } else {
            Nodo actual = cabeza;
            while (actual != null) {
                System.out.println("CI: " + actual.getCi() + ", Nombre: " + actual.getNombre() + ", Apellido: " + actual.getApellido() +
                                   ", Sexo: " + actual.getSexo() + ", Fecha de Ingreso: " + actual.getFechaIngreso() +
                                   ", Edad: " + actual.getEdad() + ", Carrera: " + actual.getCarrera());
                actual = actual.getSiguiente();
            }
        }
    }

   
    public boolean eliminarPersona(String ci) {
        if (cabeza == null) {
            return false;
        }

        if (cabeza.getCi().equals(ci)) {
            cabeza = cabeza.getSiguiente();
            return true;
        }

        Nodo actual = cabeza;
        while (actual.getSiguiente() != null && !actual.getSiguiente().getCi().equals(ci)) {
            actual = actual.getSiguiente();
        }

        if (actual.getSiguiente() != null) {
            actual.setSiguiente(actual.getSiguiente().getSiguiente());
            return true;
        }

        return false; // No se encontró la persona con el CI dado
    }

    
    public boolean modificarPersona(String ci, String nuevoNombre, String nuevoApellido, String nuevoSexo, String nuevaFechaIngreso, int nuevaEdad, String nuevaCarrera) {
        Nodo actual = cabeza;
        while (actual != null) {
            if (actual.getCi().equals(ci)) {
                actual.setNombre(nuevoNombre);
                actual.setApellido(nuevoApellido);
                actual.setSexo(nuevoSexo);
                actual.setFechaIngreso(nuevaFechaIngreso);
                actual.setEdad(nuevaEdad);
                actual.setCarrera(nuevaCarrera);
                return true;
            }
            actual = actual.getSiguiente();
        }
        return false; 
    }
}
