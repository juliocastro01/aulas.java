
package model;


public class filmes {
    private String nome;
    private String diretor;
    private int ano;
    
    filmes (String nome, String diretor, int ano){
        this.nome = nome;
        this.diretor = diretor;
        this.ano = ano;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getDiretor() {
        return diretor;
    }
    public void setDiretor(String diretor) {
        this.diretor = diretor;
    }
    public int getAno() {
        return ano;
    }
    public void setAno(int ano) {
        this.ano = ano;
    }

    
}
