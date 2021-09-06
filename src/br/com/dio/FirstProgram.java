
package br.com.dio;

import br.com.dio.model.dog;

public class FirstProgram {
    public static void main(String[] args) {
        dog dog = new dog ();

        System.out.println(dog);

        Livro livro = new Livro("invencivel", 300);

        System.out.println(livro);

        /*int a = 5;
        int b = 3;
        System.out.println("By World" + (a+b));*/
    }
}

class Livro {
    private String nome;
    private Integer numpaginas;

    public Livro (String nome, Integer numpaginas) {
        this.nome = nome;
        this.numpaginas = numpaginas;
        }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumpaginas() {
        return numpaginas;
    }

    public void setNumpaginas(Integer numpaginas) {
        this.numpaginas = numpaginas;
    }

    @Override
    public String toString() {
        return "Livro{" +
                "nome='" + nome + '\'' +
                ", numpaginas=" + numpaginas +
                '}';
    }
}



