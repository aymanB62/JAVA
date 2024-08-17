package classes;
import java.io.*;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class TaskManager {
    private List<Task> tareas;
    private static final String ARCHIVO_TAREAS = "tareas.txt"; // Archivo donde se guardarán las tareas

    public TaskManager() {
        this.tareas = new ArrayList<>(); // Asegúrate de inicializar la lista de tareas
    }

    /**
     * Agrega una tarea a la lista de tareas.
     */
    public void agregarTarea(Task tarea) {
        if (tarea != null) {
            tareas.add(tarea);
        } else {
            System.out.println("La tarea no puede ser nula.");
        }
    }

    /**
     * Elimina una tarea de la lista por su ID.
     */
    public void eliminarTarea(int id) {
        tareas.removeIf(t -> t.getId() == id);
    }

    /**
     * Edita el nombre de una tarea existente.
     */
    public void editarTarea(int id, String nuevoNombre) {
        for (Task tarea : tareas) {
            if (tarea.getId() == id) {
                tarea.setNombre(nuevoNombre);
                break;
            }
        }
    }

    /**
     * Marca una tarea como completada por su ID.
     */
    public void marcarComoCompletada(int id) {
        for (Task tarea : tareas) {
            if (tarea.getId() == id) {
                tarea.setCompletada(true);
                break;
            }
        }
    }

    /**
     * Lista todas las tareas.
     */
    public void listarTareas() {
        for (Task tarea : tareas) {
            System.out.println(tarea);
        }
    }

    /**
     * Guarda las tareas en un archivo de texto.
     */
    public void guardarTareas() {
        try (BufferedWriter writer = new BufferedWriter(new FileWriter(ARCHIVO_TAREAS))) {
            for (Task tarea : tareas) {
                writer.write(tarea.getId() + ";" + tarea.getNombre() + ";" + tarea.isCompletada() + "\n");
            }
            System.out.println("Tareas guardadas exitosamente en " + ARCHIVO_TAREAS);
        } catch (IOException e) {
            System.err.println("Error al guardar las tareas: " + e.getMessage());
        }
    }

    /**
     * Carga las tareas desde un archivo de texto.
     */
    public void cargarTareas() {
        try (BufferedReader reader = new BufferedReader(new FileReader(ARCHIVO_TAREAS))) {
            String linea;
            while ((linea = reader.readLine()) != null) {
                String[] partes = linea.split(";");
                if (partes.length == 3) {
                    int id = Integer.parseInt(partes[0]);
                    String nombre = partes[1];
                    boolean completada = Boolean.parseBoolean(partes[2]);
                    Task tarea = new Task(nombre);
                    tarea.setId(id);
                    tarea.setCompletada(completada);
                    tareas.add(tarea);
                }
            }
            System.out.println("Tareas cargadas exitosamente desde " + ARCHIVO_TAREAS);
        } catch (IOException e) {
            System.err.println("Error al cargar las tareas: " + e.getMessage());
        }
    }

	public List<Task> getTareas() {
		// TODO Auto-generated method stub
		return tareas;
	}
	
	 public void eliminarDuplicados() {
	        Set<Integer> ids = new HashSet<>();
	        List<Task> tareasUnicas = new ArrayList<>();
	        
	        for (Task tarea : tareas) {
	            if (ids.add(tarea.getId())) {  // Añade ID al set, si no está ya
	                tareasUnicas.add(tarea);   // Añade tarea a la lista de únicas si el ID es nuevo
	            }
	        }

	        tareas = tareasUnicas; // Actualiza la lista de tareas eliminando duplicados
	    }
}
