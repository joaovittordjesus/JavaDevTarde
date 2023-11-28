package com.mycompany.Connection;

import com.mycompany.Model.Produto;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ProdutoDAO {

    private Connection connection;

    public ProdutoDAO() {
        this.connection = ConnectionFactory.getConnection();
        criarTabela();
    }

    public void criarTabela() {
        String sql = "CREATE TABLE IF NOT EXISTS produtos_mercado (" +
                "CODIGO_BARRAS VARCHAR(255) PRIMARY KEY, " +
                "NOME VARCHAR(255), " +
                "PRECO VARCHAR(255), " +
                "QUANTIDADE INT)";
        try (Statement stmt = this.connection.createStatement()) {
            stmt.execute(sql);
            System.out.println("Tabela criada com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao criar a tabela: " + e.getMessage(), e);
        }
    }

    public List<Produto> listarTodos() {
        List<Produto> produtos = new ArrayList<>();
        String sql = "SELECT * FROM produtos_mercado";
        try (Statement stmt = this.connection.createStatement();
             ResultSet resultSet = stmt.executeQuery(sql)) {
            while (resultSet.next()) {
                String codigoBarras = resultSet.getString("CODIGO_BARRAS");
                String nome = resultSet.getString("NOME");
                String preco = resultSet.getString("PRECO");
                int quantidade = resultSet.getInt("QUANTIDADE");
                Produto produto = new Produto(codigoBarras, nome, preco, quantidade);
                produtos.add(produto);
            }
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao listar produtos: " + e.getMessage(), e);
        }
        return produtos;
    }

    public void cadastrar(String codigoBarras, String nome, String preco, int quantidade) {
        String sql = "INSERT INTO produtos_mercado (CODIGO_BARRAS, NOME, PRECO, QUANTIDADE) VALUES (?, ?, ?, ?)";
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setString(1, codigoBarras);
            stmt.setString(2, nome);
            stmt.setString(3, preco);
            stmt.setInt(4, quantidade);
            stmt.executeUpdate();
            System.out.println("Produto cadastrado com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao cadastrar produto: " + e.getMessage(), e);
        }
    }

    public void atualizar(String codigoBarras, String nome, String preco, int quantidade) {
        String sql = "UPDATE produtos_mercado SET NOME=?, PRECO=?, QUANTIDADE=? WHERE CODIGO_BARRAS=?";
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setString(1, nome);
            stmt.setString(2, preco);
            stmt.setInt(3, quantidade);
            stmt.setString(4, codigoBarras);
            stmt.executeUpdate();
            System.out.println("Produto atualizado com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao atualizar produto: " + e.getMessage(), e);
        }
    }

    public void apagar(String codigoBarras) {
        String sql = "DELETE FROM produtos_mercado WHERE CODIGO_BARRAS=?";
        try (PreparedStatement stmt = this.connection.prepareStatement(sql)) {
            stmt.setString(1, codigoBarras);
            stmt.executeUpdate();
            System.out.println("Produto apagado com sucesso.");
        } catch (SQLException e) {
            throw new RuntimeException("Erro ao apagar produto: " + e.getMessage(), e);
        }
    }

}
