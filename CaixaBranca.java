package login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Esta classe realiza operações de login e verificação de usuário usando um banco de dados MySQL.
 */
public class CaixaBranca {

    /**
     * Conecta ao banco de dados MySQL.
     * 
     * @return Uma conexão com o banco de dados.
     */
    public Connection conectarBD() {
        Connection conn = null;
        try {
            // Carrega o driver JDBC para MySQL
            Class.forName("com.mysql.Driver.Manager").newInstance();
            // URL de conexão com o banco de dados MySQL
            String url = "jdbc:mysql://127.0.0.1/test?user=lopes&password=123";
            // Estabelece a conexão com o banco de dados
            conn = DriverManager.getConnection(url);
        } catch (Exception e) {
            // Tratamento de exceção para erros de conexão
        }
        return conn;
    }

    // Variáveis de instância
    public String nome = ""; // Nome do usuário logado
    public boolean result = false; // Resultado da verificação de usuário

    /**
     * Verifica se as credenciais de login fornecidas correspondem a um usuário no banco de dados.
     * 
     * @param login O nome de usuário fornecido.
     * @param senha A senha fornecida.
     * @return true se as credenciais forem válidas, false caso contrário.
     */
    public boolean verificarUsuario(String login, String senha) {
        String sql = "";
        Connection conn = conectarBD();

        // Monta a consulta SQL para verificar o usuário
        sql += "SELECT nome FROM usuarios ";
        sql += "WHERE login = '" + login + "'";
        sql += " AND senha = '" + senha + "';";

        try {
            // Cria uma declaração SQL
            Statement st = conn.createStatement();
            // Executa a consulta SQL
            ResultSet rs = st.executeQuery(sql);

            // Verifica se há resultados
            if (rs.next()) {
                result = true; // Define o resultado como verdadeiro
                nome = rs.getString("nome"); // Obtém o nome do usuário
            }
        } catch (Exception e) {
            // Tratamento de exceção para erros de consulta
        }
        return result;
    }
}
