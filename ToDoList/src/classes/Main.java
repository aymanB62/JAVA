package classes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        TaskManager taskManager = new TaskManager();
        Scanner scanner = new Scanner(System.in);
        boolean salir = false;

        // Cargar tareas al iniciar la aplicación
        taskManager.cargarTareas();

        do {
            System.out.println("Seleccione una opción:");
            System.out.println("1. Agregar tarea");
            System.out.println("2. Eliminar tarea");
            System.out.println("3. Editar tarea");
            System.out.println("4. Marcar tarea como completada");
            System.out.println("5. Listar tareas");
            System.out.println("6. Guardar tareas");
            System.out.println("7. Cargar tareas");
            System.out.println("0. Salir");

            int opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer del scanner

            switch (opcion) {
                case 1:
                    // Agregar tarea
                    System.out.print("Ingrese el nombre de la tarea: ");
                    String nombre = scanner.nextLine();
                    Task nuevaTarea = new Task(nombre);
                    taskManager.agregarTarea(nuevaTarea);
                    break;

                case 2:
                    // Eliminar tarea
                    System.out.print("Ingrese el ID de la tarea a eliminar: ");
                    int idEliminar = scanner.nextInt();
                    taskManager.eliminarTarea(idEliminar);
                    break;

                case 3:
                    // Editar tarea
                    System.out.print("Ingrese el ID de la tarea a editar: ");
                    int idEditar = scanner.nextInt();
                    scanner.nextLine(); // Limpiar el buffer del scanner
                    System.out.print("Ingrese el nuevo nombre de la tarea: ");
                    String nuevoNombre = scanner.nextLine();
                    taskManager.editarTarea(idEditar, nuevoNombre);
                    break;

                case 4:
                    // Marcar tarea como completada
                    System.out.print("Ingrese el ID de la tarea a marcar como completada: ");
                    int idCompletar = scanner.nextInt();
                    taskManager.marcarComoCompletada(idCompletar);
                    break;

                case 5:
                    // Listar tareas
                    taskManager.listarTareas();
                    break;

                case 6:
                    // Guardar tareas
                    taskManager.guardarTareas();
                    break;

                case 7:
                    // Cargar tareas
                    taskManager.cargarTareas();
                    break;

                case 0:
                    // Salir
                    System.out.println("Saliendo...");
                    salir = true;
                    break;

                default:
                    System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
                    break;
            }
        } while (!salir);

        scanner.close();
    }
}
