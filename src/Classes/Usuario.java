package Classes;

import java.io.Serializable;
import java.util.ArrayList;

public class Usuario extends ControleListaUsuario implements Serializable  {

    private String nome;
    private int idade;
    private Genero genero;
    private String ocupacao;
    private String CEP;
    public ArrayList<Movie> filmesVotados = new ArrayList();

    public ArrayList<Movie> getFilmesVotados() {
        return filmesVotados;
    }

    public void setFilmesVotados(Movie filme) {
        this.filmesVotados.add(filme);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    public Genero getGenero() {
        return genero;
    }

    public void setGenero(Genero genero) {
        this.genero = genero;
    }

    public String getOcupacao() {
        return ocupacao;
    }

    public void setOcupacao(String ocupacao) {
        this.ocupacao = ocupacao;
    }

    public String getCEP() {
        return CEP;
    }

    public void setCEP(String cEP) {
        CEP = cEP;
    }

}
