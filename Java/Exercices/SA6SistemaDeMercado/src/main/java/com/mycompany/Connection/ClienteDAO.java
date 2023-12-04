/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Connection;

import com.mycompany.Model.Cliente;
import java.sql.*;
import java.util.ArrayList;
import java.util.List;

public class ClienteDAO {

    private Connection connection;

    public ClienteDAO() {
        this.connection = ConnectionFactory.getConnection();
        criarTabela();
    }

    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS clientes (" +
                "ID INT AUTO_INCREMENT PRIMARY KEY, " +
                "NOME VARCHAR(255), " +
                "CPF VARCHAR(14), " +
                "EMAIL VARCHAR(255))";
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.execute();
            System.out.println("Tabela de clientes criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela de clientes: " + e.getMessage(), e);
        }
    }

    public List<Cliente> listarTodos() {
        String sql = "SELECT * FROM clientes";
        List<Cliente> clientes = new ArrayList<>();

        try (PreparedStatement stmt = connection.prepareStatement(sql);
             ResultSet rs = stmt.executeQuery()) {
            while (rs.next()) {
                Cliente cliente = new Cliente(
                        rs.getInt("ID"),
                        rs.getString("NOME"),
                        rs.getString("CPF"),
                        rs.getString("EMAIL")
                );
                clientes.add(cliente);
            }
        } catch (SQLException ex) {
            ex.printStackTrace();
        }
        return clientes;
    }

    public void cadastrar(String nome, String cpf, String email) {
        String sql = "INSERT INTO clientes (NOME, CPF, EMAIL) VALUES (?, ?, ?)";
        try (PreparedStatement stmt = connection.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS)) {
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, email);
            stmt.executeUpdate();

            ResultSet generatedKeys = stmt.getGeneratedKeys();
            if (generatedKeys.next()) {
                System.out.println("Cliente cadastrado com ID: " + generatedKeys.getLong(1));
            } else {
                throw new SQLException("Falha ao obter o ID do cliente cadastrado.");
            }

        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar cliente: " + e.getMessage(), e);
        }
    }

    public void atualizar(int id, String nome, String cpf, String email) {
        String sql = "UPDATE clientes SET NOME = ?, CPF = ?, EMAIL = ? WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, cpf);
            stmt.setString(3, email);
            stmt.setInt(4, id);
            stmt.executeUpdate();
            System.out.println("Cliente atualizado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar cliente: " + e.getMessage(), e);
        }
    }

    public void apagar(int id) {
        String sql = "DELETE FROM clientes WHERE ID = ?";
        try (PreparedStatement stmt = connection.prepareStatement(sql)) {
            stmt.setInt(1, id);
            stmt.executeUpdate();
            System.out.println("Cliente apagado com sucesso");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar cliente: " + e.getMessage(), e);
        }
    }
    
    public Cliente obterClientePorId(int idCliente) {
    String sql = "SELECT * FROM clientes WHERE ID=?";
    try (PreparedStatement stmt = connection.prepareStatement(sql)) {
        stmt.setInt(1, idCliente);
        try (ResultSet rs = stmt.executeQuery()) {
            if (rs.next()) {
                int id = rs.getInt("ID");
                String nome = rs.getString("NOME");
                String email = rs.getString("EMAIL");
                String telefone = rs.getString("TELEFONE");
                if (rs.wasNull()) {
                    throw new RuntimeException("ID nulo encontrado para o cliente.");
                }
                return new Cliente(id, nome, email, telefone);
            } else {
                // Se não houver resultados, lançar uma exceção ou retornar null, dependendo da sua lógica
                throw new RuntimeException("Cliente não encontrado para o ID: " + idCliente);
            }
        }
    } catch (SQLException e) {
        throw new RuntimeException("Erro ao obter cliente por ID: " + e.getMessage(), e);
    }
}
}
