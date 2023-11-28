package com.mycompany.View;

import com.mycompany.Connection.CarrosDAO;
import com.mycompany.Model.Carros;

import javax.swing.JComboBox;
import javax.swing.JPanel;
import java.util.List;

public class VendasView extends JPanel {
    JComboBox<String> carrosComboBox;
    List<Carros> carros;

    public VendasView() {
        super();
        carrosComboBox = new JComboBox<>();
        carros = new CarrosDAO().listarTodos();
        carrosComboBox.addItem("Selecione o Carro");
        for (Carros carro : carros) {
            carrosComboBox.addItem(
                    carro.getMarca()
                            + " " + carro.getModelo()
                            + " " + carro.getPlaca()
            );
        }
        add(carrosComboBox);
    }
}
