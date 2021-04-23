package br.com.magalu.aulas;

import br.com.magalu.aulas.aula2.CalculadoraComListas;
import br.com.magalu.aulas.aula3.Livraria.Cliente;
import br.com.magalu.aulas.aula3.Livraria.Emprestimos;
import br.com.magalu.aulas.aula3.Livraria.Livros;
import br.com.magalu.aulas.aula3.TrabalhandoComListas;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

@SpringBootApplication
public class Aula1Application {

    public static void main(String[] args) throws Exception {
        SpringApplication.run(Aula1Application.class, args);

        Cliente cliente = new Cliente();
        Livros livros = new Livros();
        Emprestimos emprestimo = new Emprestimos();

        List<Cliente> listaClientes = new ArrayList<>();
        List<Livros> listaDeLivros = new ArrayList<>();


        listaClientes.add(new Cliente("mayara","4545454"));
        listaClientes.add(new Cliente("sonia","85658"));
        listaClientes.add(new Cliente("luna","7855448"));

        listaDeLivros.add((new Livros("ditulo1", "autor1", "matricula1", "editora1")));
        listaDeLivros.add((new Livros("ritulo2", "autor2", "matricula2", "editora2")));
        listaDeLivros.add((new Livros("aitulo3", "autor3", "matricula3", "editora3")));
        listaDeLivros.add((new Livros("jitulo4", "autor4", "matricula4", "editora4")));
        listaDeLivros.add((new Livros("bitulo5", "autor5", "matricula5", "editora5")));

       cliente.printar(listaClientes.get(0));

       emprestimo.alugarlivro(listaClientes.get(0), listaDeLivros.get(0));

        cliente.printar(listaClientes.get(0));

        emprestimo.alugarlivro(listaClientes.get(0), listaDeLivros.get(1));

        cliente.printar(listaClientes.get(0));

        emprestimo.alugarlivro(listaClientes.get(0), listaDeLivros.get(1));

        emprestimo.devolverLivro(listaClientes.get(0),listaDeLivros.get(1));

        livros.printar(listaDeLivros.get(1));

        cliente.printar(listaClientes.get(0));

    }
}
