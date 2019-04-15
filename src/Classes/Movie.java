package Classes;

import java.io.Serializable;
import java.util.Comparator;

public class Movie implements Comparable<Movie>, Comparator<Movie>,Interface,Serializable {

    private String titulo;
    private int nota = 0;
    private Double media = 0.0;
    private int ano;
    private Categoria categoria;
    private int contadorNumeroNota;

    public Movie(String titulo, int ano, Categoria categoria) {
        this.titulo = titulo;
        this.ano = ano;
        this.categoria = categoria;
    }
    
    public Movie(){};

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public int getNota() {
        return nota;
    }

    public void setNota(int nota) {
        this.nota = this.nota + nota;
        this.contadorNumeroNota = this.contadorNumeroNota + 1;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public int getAno() {
        return ano;
    }

    public void setAno(int ano) {
        this.ano = ano;
    }

    public Categoria getCategoria() {
        return categoria;
    }

    public void setCategoria(Categoria categoria) {
        this.categoria = categoria;
    }

    @Override
    public int compareTo(Movie o) {

        return (this.titulo.toLowerCase().compareTo(o.getTitulo()
                .toLowerCase()));

    }

    public void fazerMedia() {

        this.media = (double) this.nota / this.contadorNumeroNota;

    }

    @Override
    public int compare(Movie o1, Movie o2) {
        if (o1.getMedia() < o2.getMedia()) {
            return 1;
        }
        if (o1.getMedia() > o2.getMedia()) {
            return -1;
        }
        return 0;
    }
    
    public void addFilmeUsuario(){
    
    Movie a = new Movie(getTitulo(), getAno(), getCategoria());
    controleListaUsuario.usuarioLogado().setFilmesVotados(a);
    
    
    }
}
