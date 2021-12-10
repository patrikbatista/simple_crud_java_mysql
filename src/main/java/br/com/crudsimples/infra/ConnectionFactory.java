package br.com.crudsimples.infra;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//classe responsavel por fazer a conexão com o db
public class ConnectionFactory {

    private ConnectionFactory() {}

    public static Connection getConnection() {
        String url = "jdbc:mysql://localhost/DespesasDB";
        //driverManager permite obter uma conexao com db
        try {
            return DriverManager.getConnection(url,"root", "");
        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
    }

}
