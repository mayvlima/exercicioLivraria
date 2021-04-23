package br.com.magalu.aulas.aula3;

import br.com.magalu.aulas.aula3.Livraria.Cliente;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class TrabalhandoComListas {

    //Tem o tamanho fixo, temos que declarar o seu tamanho ao cria-ló
    //É uma estrutura de dados nativa do core do Java
    //Tem seus valores acessados por []
    //Pode armazenar tanto tipos primitivos como objetos

    //Para adicionar valores ao Array, devemos escolher a posição através do índice. Veja como fica a atribuição no Array de Inteiros.
    private void trabalhandoComArray(){
        String[] vetorNomes = new String [10]; // Array de Strings
        Integer[] vetorDeInteiros = new Integer [10]; // Array de Strings

        vetorNomes[0] = "Camila";
    }

    //
    public void trabalhandoComArrayList(){

      //  Tem tamanho dinâmico, não é obrigatório declarar seu tamanho em sua instanciação
      //  Faz parte do framework Collection, sendo uma implementação da interface List
        //  Tem seus valores acessados por metodos, ex: get()
        //  Não suporta tipos primitivos, apenas objetos

       // Os ArrayLists são coleções de dados que podem aumentar e diminuir dinamicamente, além de permitir a inserção de qualquer tipo de dado, no mesmo ArrayList (inteiros, Strings, Decimais e etc).
        ArrayList<Object> arrayListObjetoGenerico = new ArrayList<>();

        List<Object> listaDeObjetosGenericos = new ArrayList<>();
        Cliente aluno = new Cliente();
        aluno.nome ="Camila" ;

        listaDeObjetosGenericos.add(10);
        listaDeObjetosGenericos.add("teste");
        listaDeObjetosGenericos.add(aluno);

        //Lista de alunos
        List<Cliente> listaDeAlunos = new ArrayList<>();

        Cliente aluno0 = new Cliente();
        aluno0.nome ="Camila" ;
        aluno0.matricula = "4545445";

        Cliente aluno1 = new Cliente();
        aluno1.nome ="Julia" ;
        aluno1.matricula="65656";

        Cliente aluno2 = new Cliente();
        aluno2.nome ="Ana" ;
        aluno2.matricula="8985526";

        Cliente aluno3 = new Cliente();
        aluno3.nome ="Mayara" ;
        aluno3.matricula="45487";

        listaDeAlunos.add(aluno0);
        listaDeAlunos.add(aluno1);
        listaDeAlunos.add(aluno2);
        listaDeAlunos.add(aluno3);
        listaDeAlunos.add(new Cliente());

        for (int i = 0; listaDeAlunos.size() > i; i++) {
            System.out.println("\nPosição: " + i);
            System.out.println("Nome: " + listaDeAlunos.get(i).nome);
            System.out.println("Matricula: " + listaDeAlunos.get(i).matricula);
        }

    }

    public void trabalhandoHashMap(){
        //ArrayList
        // é um conjunto de elementos de um tipo definido. É uma estrutura ordenada de dados, ou seja, os valores podem ser acessados por seus índices.

        //HashMap
        //É um conjunto de pares de chave-valor, para cada elemento (valor) salvo num HashMap deve existir uma chave única atrelada a ele. Os elementos num HashMap devem ser acessados por suas chaves.

        HashMap<String, Cliente> hashMap = new HashMap<>();
        hashMap.put("a", new Cliente());
        hashMap.put("d", new Cliente());
        hashMap.put("b", new Cliente());

       for(String i : hashMap.keySet()){
           Cliente inf = hashMap.get(i);
           System.out.println(i + " = " + inf.nome + " " + inf.matricula);
       }
    }

    //https://www.devmedia.com.br/diferenca-entre-arraylist-vector-e-linkedlist-em-java/29162


}
