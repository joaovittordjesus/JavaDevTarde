import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class App {
    public static void main(String[] args) throws Exception {
        try {
            Statement s; // Cria uma instância de Statement para executar comandos SQL.
            String usuario = "postgres"; // Nome de usuário do banco de dados.
            String senha = "postgres"; // Senha do banco de dados.
            String url = "jdbc:postgresql://localhost:5432/postgres"; // URL de conexão com o banco de dados PostgreSQL.

            Connection c = DriverManager.getConnection(url, usuario, senha); // Estabelece a conexão com o banco de dados.
            s = c.createStatement(); // Cria um objeto Statement a partir da conexão.

            // Executa uma consulta SQL de inserção na tabela "CONTATO".
            // O SQL utilizado está incorreto, pois os valores '1', 'NOME' e 'EMAIL' devem ser substituídos pelos valores reais a serem inseridos.
            s.executeQuery("INSERT INTO CONTATO VALUES('2', 'João Vittor Domingos de Jesus', 'joaovittordomingosdejesus@outlook.com')");

            c.close(); // Fecha a conexão com o banco de dados após a conclusão da operação.

        } catch (Exception E) {
            System.out.println("\n" + E); // Captura e imprime qualquer exceção que ocorra durante a execução.
        }
    }
}
