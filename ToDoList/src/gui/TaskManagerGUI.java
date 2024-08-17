package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

import classes.Task;
import classes.TaskManager;

public class TaskManagerGUI {
    private JFrame frame;
    private JTextField taskNameField;
    private JTextArea taskListArea;
    private TaskManager taskManager;

    public TaskManagerGUI(TaskManager taskManager) {
        this.taskManager = taskManager;
        initialize();
    }

    private void initialize() {
        frame = new JFrame("Gestor de Tareas");
        frame.setBounds(100, 100, 600, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new BorderLayout());

        // Panel para agregar y eliminar tareas
        JPanel inputPanel = new JPanel();
        inputPanel.setLayout(new FlowLayout());

        JLabel taskNameLabel = new JLabel("Nombre de la tarea:");
        inputPanel.add(taskNameLabel);

        taskNameField = new JTextField(20);
        inputPanel.add(taskNameField);

        JButton addButton = new JButton("Agregar Tarea");
        inputPanel.add(addButton);

        JButton deleteButton = new JButton("Eliminar Tarea");
        inputPanel.add(deleteButton);

        JButton editButton = new JButton("Editar Tarea");
        inputPanel.add(editButton);

        JButton markCompletedButton = new JButton("Marcar Completada");
        inputPanel.add(markCompletedButton);
        
        JButton clearHistoryButton = new JButton("Borrar Historial");
        inputPanel.add(clearHistoryButton);

        frame.add(inputPanel, BorderLayout.NORTH);

        // Panel para mostrar tareas
        taskListArea = new JTextArea();
        taskListArea.setEditable(false);
        JScrollPane scrollPane = new JScrollPane(taskListArea);
        frame.add(scrollPane, BorderLayout.CENTER);

        // Panel para guardar y cargar tareas
        JPanel saveLoadPanel = new JPanel();
        saveLoadPanel.setLayout(new FlowLayout());

        JButton saveButton = new JButton("Guardar Tareas");
        saveLoadPanel.add(saveButton);

        JButton loadButton = new JButton("Cargar Tareas");
        saveLoadPanel.add(loadButton);

        frame.add(saveLoadPanel, BorderLayout.SOUTH);

        // Eventos de los botones
        addButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nombre = taskNameField.getText();
                if (!nombre.isEmpty()) {
                    Task nuevaTarea = new Task(nombre);
                    taskManager.agregarTarea(nuevaTarea);
                    taskNameField.setText("");
                    refreshTaskList();
                } else {
                    JOptionPane.showMessageDialog(frame, "El nombre de la tarea no puede estar vacío.");
                }
            }
        });

        deleteButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idStr = JOptionPane.showInputDialog(frame, "Ingrese el ID de la tarea a eliminar:");
                try {
                    int id = Integer.parseInt(idStr);
                    taskManager.eliminarTarea(id);
                    refreshTaskList();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "ID inválido.");
                }
            }
        });

        editButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idStr = JOptionPane.showInputDialog(frame, "Ingrese el ID de la tarea a editar:");
                try {
                    int id = Integer.parseInt(idStr);
                    String nuevoNombre = JOptionPane.showInputDialog(frame, "Ingrese el nuevo nombre de la tarea:");
                    if (nuevoNombre != null && !nuevoNombre.isEmpty()) {
                        taskManager.editarTarea(id, nuevoNombre);
                        refreshTaskList();
                    } else {
                        JOptionPane.showMessageDialog(frame, "El nuevo nombre no puede estar vacío.");
                    }
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "ID inválido.");
                }
            }
        });

        markCompletedButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String idStr = JOptionPane.showInputDialog(frame, "Ingrese el ID de la tarea a marcar como completada:");
                try {
                    int id = Integer.parseInt(idStr);
                    taskManager.marcarComoCompletada(id);
                    refreshTaskList();
                } catch (NumberFormatException ex) {
                    JOptionPane.showMessageDialog(frame, "ID inválido.");
                }
            }
        });

        saveButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taskManager.guardarTareas();
                JOptionPane.showMessageDialog(frame, "Tareas guardadas exitosamente.");
            }
        });

        loadButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taskManager.cargarTareas();
                refreshTaskList();
                JOptionPane.showMessageDialog(frame, "Tareas cargadas exitosamente.");
            }
        });
        
        clearHistoryButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                taskListArea.setText(""); // Limpia el historial de operaciones
            }
        });

        frame.setVisible(true);
    }

    private void refreshTaskList() {
        taskManager.eliminarDuplicados();  // Llama al método para eliminar duplicados antes de mostrar
        taskListArea.setText("");
        for (Task tarea : taskManager.getTareas()) {
            taskListArea.append(tarea.toString() + "\n");
        }
    }

    public static void main(String[] args) {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                TaskManager taskManager = new TaskManager();
                new TaskManagerGUI(taskManager);
            }
        });
    }
}
