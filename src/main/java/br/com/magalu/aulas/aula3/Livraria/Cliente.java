package br.com.magalu.aulas.aula3.Livraria;

import java.util.List;

public class Cliente {
    public String nome;
    public String matricula;
    public Livros[] livros = new Livros[2];

    public Cliente(String nome, String matricula) {
        this.nome = nome;
        this.matricula = matricula;
    }

    public Cliente() {
    }

    public Cliente adicionar(String nome, String matricula) {
        Cliente cliente = new Cliente();
        cliente.nome = nome;
        cliente.matricula = matricula;
        return cliente;
    }

    public void printar(List<Cliente> listaClientes) {
        for (int i = 0; listaClientes.size() > i; i++) {
            System.out.println("\nNome: " + listaClientes.get(i).nome);
            System.out.println("Matricula: " + listaClientes.get(i).matricula);
            System.out.println("Lista de emprestimos: ");

            for (int j = 0; listaClientes.get(i).livros.length > j; j++) {
                if (listaClientes.get(i).livros[j] != null) {
                    System.out.println("\nTitulo: " + listaClientes.get(i).livros[j].titulo);
                    System.out.println("Matricula: " + listaClientes.get(i).livros[j].autor);
                    System.out.println("Data de retirada: " + listaClientes.get(i).livros[j].dataDeRetirada);
                    System.out.println("Data de emprestimo: " + listaClientes.get(i).livros[j].dataDeDevolução);
                    System.out.println("Alugado? " + listaClientes.get(i).livros[j].alugado);
                }
            }
        }
    }

    public void printar(Cliente cliente){
        System.out.println("\nNome: " + cliente.nome);
        System.out.println("Matricula: " + cliente.matricula);
        System.out.println("Lista de emprestimos: ");

        for (int i = 0; cliente.livros.length > i; i++) {
            if (cliente.livros[i] != null) {
                System.out.println("Titulo: " + cliente.livros[i].titulo);
                System.out.println("Matricula: " + cliente.livros[i].autor);
                System.out.println("Data de retirada: " + cliente.livros[i].dataDeRetirada);
                System.out.println("Data de emprestimo: " + cliente.livros[i].dataDeDevolução);
                System.out.println("Alugado? " + cliente.livros[i].alugado);
                System.out.println("\n");
            }
        }

    }
}

//Um cliente não pode estar com mais de 2 livros
// não pode haver dois alugueis para o mesmo livro ao mesmo tempo
// cliente deve ter nome, matricula e lista de livros