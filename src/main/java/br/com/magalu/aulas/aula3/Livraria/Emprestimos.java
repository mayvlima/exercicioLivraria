package br.com.magalu.aulas.aula3.Livraria;

import java.util.Scanner;

public class Emprestimos {

    public Cliente alugarlivro(Cliente cliente, Livros livro){

        Scanner sc = new Scanner(System.in);

        if(!livro.alugado && (cliente.livros[0] == null || cliente.livros[1] == null)){
           System.out.println("\nDIGITE A DATA DE RETIRADA DO LIVRO: ");
            String data = sc.next();

            livro.dataDeRetirada = data;
            livro.alugado = true;

            if(cliente.livros[0] == null){
                cliente.livros[0] = livro;
            }else{
                cliente.livros[1] = livro;
            }


            return cliente;

        }else{
            if(livro.alugado){

                System.out.println("\n\nERRO! ESTE LIVRO CONSTA COMO ALUGADO NO SISTEMA!!");

            }if(cliente.livros[0] != null && cliente.livros[0] != null){

                System.out.println("\n\nERRO! ESTE CLIENTE JÁ POSSUI DOIS LIVROS ALUGADOS!!");

            }
        }
        return cliente;
    }

    public Cliente devolverLivro(Cliente cliente, Livros livro){

        Scanner sc = new Scanner(System.in);

            System.out.println("\nDIGITE A DATA DA DEVOLUÇÃO DO LIVRO: ");
            String data = sc.next();

            livro.dataDeDevolução = data;

            livro.alugado = false;

            if(cliente.livros[0].titulo == livro.titulo){
                cliente.livros[0] = null;
            }else{
                cliente.livros[1] = null;
            }

            return cliente;

    }
}
