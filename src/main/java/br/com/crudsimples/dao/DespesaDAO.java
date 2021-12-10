package br.com.crudsimples.dao;

import br.com.crudsimples.infra.ConnectionFactory;
import br.com.crudsimples.model.Categoria;
import br.com.crudsimples.model.Despesa;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.List;
import java.util.Optional;

public class DespesaDAO implements IDespesaDAO {


    @Override
    public Despesa save(Despesa despesa) {
        try (Connection connection = ConnectionFactory.getConnection()){
            String sql = "INSERT INTO despesas (descricao, valor, data, categoria) VALUES(?, ?, ?, ?)"; // as interrogacoes sao os indices 1, 2, 3, que serao usados no preparedStatement
            PreparedStatement preparedStatement = connection.prepareStatement(sql);// executa instrucao sql no db
            preparedStatement.setString(1, despesa.getDescricao());
            preparedStatement.setDouble(2, despesa.getValor());
            preparedStatement.setDate(3, java.sql.Date.valueOf(despesa.getData())); //  java.sql.Date.valueOf faz a conversacao do local date pra o tipo que o jdbc espera
            preparedStatement.setString(4, despesa.getCategoria().toString());// espera uma String

            preparedStatement.executeUpdate(); // esse comando executa a instrucao acima

        } catch (SQLException error) {
            throw new RuntimeException(error);
        }
        return null;
    }

    @Override
    public Despesa update(Despesa despesa) {
        return null;
    }

    @Override
    public void delete(Long id) {

    }

    @Override
    public List<Despesa> findAll() {
        return null;
    }

    @Override
    public List<Despesa> findbyCategory(Categoria categoria) {
        return null;
    }

    @Override
    public Optional<Despesa> findById(Long id) {
        return Optional.empty();
    }
}
