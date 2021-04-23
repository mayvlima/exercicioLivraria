package br.com.magalu.aulas.aula3.Livraria;

import java.util.*;

public class Livros implements Comparable<Livros>{

    public String titulo;
    public String autor;
    public String matricula;
    public String editora;
    public String dataDeRetirada;
    public String dataDeDevolução;
    public Integer quantidade;
    public Boolean alugado;

    public Livros(){

    }

    public Livros(String titulo, String autor, String matricula, String editora){
        this.titulo = titulo;
        this.autor = autor;
        this.matricula = matricula;
        this.editora = editora;
        this.dataDeRetirada = null;
        this.dataDeDevolução = null;
        this.alugado = false;
    }

    @Override
    public int compareTo(Livros pLivros) {
        return this.titulo.compareTo(pLivros.titulo);
    }

    public void printar(List<Livros> listaDeLivros){
        for (int i = 0; listaDeLivros.size() > i; i++) {
            System.out.println("\nTitulo: " + listaDeLivros.get(i).titulo);
            System.out.println("Matricula: " + listaDeLivros.get(i).autor);
            System.out.println("Data de retirada: " + listaDeLivros.get(i).dataDeRetirada);
            System.out.println("Data de emprestimo: " + listaDeLivros.get(i).dataDeDevolução);
            System.out.println("Alugado? " + listaDeLivros.get(i).alugado);

        }
    }

    public void printar(Livros livro){

            System.out.println("\nTitulo: " + livro.titulo);
            System.out.println("Matricula: " + livro.autor);
            System.out.println("Data de retirada: " + livro.dataDeRetirada);
            System.out.println("Data de emprestimo: " + livro.dataDeDevolução);
            System.out.println("Alugado? " + livro.alugado);
    }

    public void ordenarLista(List<Livros> listaDeLivros){
        Collections.sort(listaDeLivros);

        for (int i = 0; listaDeLivros.size() > i; i++) {
            System.out.println("\nTitulo: " + listaDeLivros.get(i).titulo);
            System.out.println("Matricula: " + listaDeLivros.get(i).autor);
            System.out.println("Data de retirada: " + listaDeLivros.get(i).dataDeRetirada);
            System.out.println("Data de emprestimo: " + listaDeLivros.get(i).dataDeDevolução);
            System.out.println("Alugado? " + listaDeLivros.get(i).alugado);

        }
    }

    public List<Livros> listarAlugados(List<Livros> listaDeLivros){
        List<Livros> livrosAlugados = null;

        for(int i = 0; listaDeLivros.size() > i; i++){
            if(listaDeLivros.get(i).alugado){
                livrosAlugados.add(listaDeLivros.get(i));
            }
        }
        return livrosAlugados;
    }

    // cada livro deve ter nome, autor, matricula, titulo, quantidade, status;
    // cada livro deve ter data de retirada e devolucao
    //crie um metodo para ordenar os livros por nome
    //crie um metodo para listar os livros alugados


}
