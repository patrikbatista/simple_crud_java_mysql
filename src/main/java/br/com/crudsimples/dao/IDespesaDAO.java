package br.com.crudsimples.dao;

import br.com.crudsimples.model.Categoria;
import br.com.crudsimples.model.Despesa;

import java.util.List;
import java.util.Optional;

public interface IDespesaDAO {

    //inteface contem todos os metodos que despesaDAO possui
    Despesa save(Despesa despesa); //metodo recebe e devolve uma despesa
    Despesa update(Despesa despesa); //metodo recebe e devolve uma despesa
    void delete(Long id); //recebe id da despesa que vai ser deletada
    List<Despesa> findAll(); //lista todas as despesa do db
    List<Despesa> findbyCategory(Categoria categoria); //lista todas as despesa pro categoria
    Optional<Despesa> findById(Long id); //lista despesa pelo id, usa-se o Optional pois se usar um id que nao existe ele nao retorna nada


}
