/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package Main;

import Listas.Listas;
import java.util.Scanner;

/**
 *
 * @author HP
 */
public class _Departamentos {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
          // TODO code application logic here
         Scanner scanner = new Scanner(System.in);
        Listas listaClientes = new Listas();
        String[] habitaciones = new String[30];

        // Inicializar habitaciones
        for (int i = 0; i < 30; i++) {
            habitaciones[i] = "Disponible";
        }

        while (true) {
            System.out.println("\n*** Departamento Camiri ***");
            System.out.println("1. Gestionar Habitaciones");
            System.out.println("2. Gestionar Clientes");
            System.out.println("3. Ver Datos del Departamento");
            System.out.println("4. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    gestionarHabitaciones(scanner, listaClientes, habitaciones);
                    break;
                case 2:
                    gestionarClientes(scanner, listaClientes);
                    break;
                case 3:
                    verDatosDepartamento(listaClientes, habitaciones);
                    break;
                case 4:
                    System.out.println("Saliendo del sistema. ¡Adiós!");
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void gestionarHabitaciones(Scanner scanner, Listas listaClientes, String[] habitaciones) {
        while (true) {
            System.out.println("\n** Gestionar Habitaciones **");
            System.out.println("1. Ver Habitaciones");
            System.out.println("2. Volver al Menú Principal");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            if (opcion == 1) {
                for (int i = 0; i < habitaciones.length; i++) {
                    System.out.println("Habitación " + (i + 1) + ": " + habitaciones[i]);
                }
                System.out.print("Seleccione una habitación (1-30): ");
                int numeroHabitacion = scanner.nextInt();
                scanner.nextLine(); // Limpiar buffer

                if (numeroHabitacion < 1 || numeroHabitacion > 30) {
                    System.out.println("Número de habitación inválido.");
                } else if (!habitaciones[numeroHabitacion - 1].equals("Disponible")) {
                    System.out.println("La habitación ya está ocupada.");
                } else {
                    System.out.println("Ingrese los datos del cliente:");
                    System.out.print("CI: ");
                    String ci = scanner.nextLine();
                    System.out.print("Nombre: ");
                    String nombre = scanner.nextLine();
                    System.out.print("Apellido: ");
                    String apellido = scanner.nextLine();
                    System.out.print("Sexo: ");
                    String sexo = scanner.nextLine();
                    System.out.print("Fecha de Ingreso: ");
                    String fechaIngreso = scanner.nextLine();
                    System.out.print("Edad: ");
                    int edad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Carrera: ");
                    String carrera = scanner.nextLine();

                    listaClientes.añadirPersona(ci, nombre, apellido, sexo, fechaIngreso, edad, carrera);
                    habitaciones[numeroHabitacion - 1] = ci;
                    System.out.println("Cliente registrado en la habitación " + numeroHabitacion + ".");
                }
            } else if (opcion == 2) {
                return;
            } else {
                System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void gestionarClientes(Scanner scanner, Listas listaClientes) {
        while (true) {
            System.out.println("\n** Gestionar Clientes **");
            System.out.println("1. Modificar Cliente");
            System.out.println("2. Eliminar Cliente");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar buffer

            switch (opcion) {
                case 1:
                    System.out.print("Ingrese el CI del cliente a modificar: ");
                    String ciModificar = scanner.nextLine();
                    System.out.print("Nuevo Nombre: ");
                    String nuevoNombre = scanner.nextLine();
                    System.out.print("Nuevo Apellido: ");
                    String nuevoApellido = scanner.nextLine();
                    System.out.print("Nuevo Sexo: ");
                    String nuevoSexo = scanner.nextLine();
                    System.out.print("Nueva Fecha de Ingreso: ");
                    String nuevaFechaIngreso = scanner.nextLine();
                    System.out.print("Nueva Edad: ");
                    int nuevaEdad = scanner.nextInt();
                    scanner.nextLine(); // Limpiar buffer
                    System.out.print("Nueva Carrera: ");
                    String nuevaCarrera = scanner.nextLine();

                    if (listaClientes.modificarPersona(ciModificar, nuevoNombre, nuevoApellido, nuevoSexo, nuevaFechaIngreso, nuevaEdad, nuevaCarrera)) {
                        System.out.println("Cliente modificado exitosamente.");
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 2:
                    System.out.print("Ingrese el CI del cliente a eliminar: ");
                    String ciEliminar = scanner.nextLine();

                    if (listaClientes.eliminarPersona(ciEliminar)) {
                        System.out.println("Cliente eliminado exitosamente.");
                    } else {
                        System.out.println("Cliente no encontrado.");
                    }
                    break;
                case 3:
                    return;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        }
    }

    private static void verDatosDepartamento(Listas listaClientes, String[] habitaciones) {
        System.out.println("\n** Datos del Departamento **");
        listaClientes.mostrarPersonas();

        for (int i = 0; i < habitaciones.length; i++) {
            System.out.println("Habitación " + (i + 1) + ": " + habitaciones[i]);
        }
    
    }
    
}
