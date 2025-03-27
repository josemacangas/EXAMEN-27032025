package sooper.demo.tkrun;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import javax.swing.JFrame;

public class AlmacenView extends JFrame {
    private static final long serialVersionUID = 1L;
    private JTable tablaArticulos;
    private DefaultTableModel modeloTabla;

    public AlmacenView() {
        setTitle("Artículos a Embolsar");
        setSize(400, 500); 
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        setLocationRelativeTo(null);
        setLayout(new BorderLayout());

        modeloTabla = new DefaultTableModel();
        modeloTabla.addColumn("idArticulo");
        modeloTabla.addColumn("idContenedor");

        tablaArticulos = new JTable(modeloTabla);
        JScrollPane scrollPane = new JScrollPane(tablaArticulos);

        JButton btnAñadir = new JButton("Añadir Artículo");
        btnAñadir.addActionListener(e -> agregarArticulo());

        JPanel panelBoton = new JPanel();
        panelBoton.add(btnAñadir);


        add(scrollPane, BorderLayout.CENTER);
        add(panelBoton, BorderLayout.SOUTH);

        setVisible(true);
    }
    private void agregarArticulo() {
        modeloTabla.addRow(new Object[]{"EjemploID", "ContenedorX"});
    }
}

