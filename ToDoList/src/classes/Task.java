package classes;
import java.io.Serializable;
import java.util.Date;

public class Task implements Serializable {
    private static final long serialVersionUID = 1L;

    private int id;
    private String nombre;
    private boolean completada;
    private Date fechaDeCreacion;
    private static int idCounter = 1; // Contador de IDs para asignar automáticamente a nuevas tareas

    public Task(String nombre) {
        this.id = idCounter++; // Asigna un ID único automáticamente
        this.nombre = nombre;
        this.completada = false;
        this.fechaDeCreacion = new Date();
    }

    // Getters y Setters
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public boolean isCompletada() {
        return completada;
    }

    public void setCompletada(boolean completada) {
        this.completada = completada;
    }

    public Date getFechaDeCreacion() {
        return fechaDeCreacion;
    }

    @Override
    public String toString() {
        return "Tarea [ID=" + id + ", Nombre=" + nombre + ", Completada=" + completada + ", Fecha de Creación=" + fechaDeCreacion + "]";
    }
}
