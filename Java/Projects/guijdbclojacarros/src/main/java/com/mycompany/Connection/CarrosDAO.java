package com.mycompany.Connection;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CarrosDAO {

    private Connection connection;

    public CarrosDAO() {
        this.connection = ConnectionFactory.getConnection();
        criarTabela();
    }

    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS carros_lojacarros (" +
                     "MARCA VARCHAR(255), " +
                     "MODELO VARCHAR(255), " +
                     "ANO VARCHAR(255), " +
                     "PLACA VARCHAR(255) PRIMARY KEY, " +
                     "VALOR VARCHAR(255))";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        }
    }

    public List<Carros> listarTodos() {
        String sql = "SELECT * FROM carros_lojacarros";
        List<Carros> carros = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Carros carro = new Carros(
                        rs.getString("marca"),
                        rs.getString("modelo"),
                        rs.getString("ano"),
                        rs.getString("placa"),
                        rs.getString("valor")
                );
                carros.add(carro);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return carros;
    }

    public void cadastrar(String marca, String modelo, String ano, String placa, String valor) {
        String sql = "INSERT INTO carros_lojacarros (marca, modelo, ano, placa, valor) VALUES (?, ?, ?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, marca);
            stmt.setString(2, modelo);
            stmt.setString(3, ano);
            stmt.setString(4, placa);
            stmt.setString(5, valor);
            stmt.executeUpdate();
            System.out.println("Dados inseridos com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao inserir dados no banco de dados.", e);
        }
    }

    public void atualizar(String marca, String modelo, String ano, String placa, String valor) {
        String sql = "UPDATE carros_lojacarros SET marca = ?, modelo = ?, ano = ?, valor = ? WHERE placa = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, marca);
            stmt.setString(2, modelo);
            stmt.setString(3, ano);
            stmt.setString(4, valor);
            stmt.setString(5, placa);
            stmt.executeUpdate();
            System.out.println("Dados atualizados com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar dados no banco de dados.", e);
        }
    }

    public void apagar(String placa) {
        String sql = "DELETE FROM carros_lojacarros WHERE placa = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, placa);
            stmt.executeUpdate();
            System.out.println("Dado apagado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar dados no banco de dados.", e);
        }
    }
}


