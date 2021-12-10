package br.com.crudsimples;

import br.com.crudsimples.dao.DespesaDAO;
import br.com.crudsimples.model.Categoria;
import br.com.crudsimples.model.Despesa;

import java.time.LocalDate;

public class Application {

    public static void main(String[] args) {

        DespesaDAO dao = new DespesaDAO();

        Despesa despesa = new Despesa();
        despesa.setDescricao("Pagamento do Aluguel");
        despesa.setCategoria(Categoria.MORADIA);// ref a enum que contem as despesas
        despesa.setValor(1200d);
        despesa.setData(LocalDate.now());

        dao.save(despesa);

    }

}
