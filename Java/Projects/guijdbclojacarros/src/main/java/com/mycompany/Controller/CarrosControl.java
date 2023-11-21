package com.mycompany.Controller;

import com.mycompany.Connection.CarrosDAO;
import com.mycompany.Model.Carros;

import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.util.List;

public class CarrosControl {

    private DefaultTableModel tableModel;
    private JTable table;

    public CarrosControl(DefaultTableModel tableModel, JTable table) {
        this.tableModel = tableModel;
        this.table = table;
    }

    public void atualizarTabela() {
        tableModel.setRowCount(0);
        List<Carros> carros = new CarrosDAO().listarTodos();
        for (Carros carro : carros) {
            tableModel.addRow(new Object[]{carro.getMarca(), carro.getModelo(),
                    carro.getAno(), carro.getPlaca(), carro.getValor()});
        }
    }

    public void cadastrar(String marca, String modelo, String ano, String placa, String valor) {
        new CarrosDAO().cadastrar(marca, modelo, ano, placa, valor);
        atualizarTabela();
    }

    public void editar(String marca, String modelo, String ano, String placa, String valor) {
        new CarrosDAO().atualizar(marca, modelo, ano, placa, valor);
        atualizarTabela();
    }

    public void apagar(String placa) {
        new CarrosDAO().apagar(placa);
        atualizarTabela();
    }
}


