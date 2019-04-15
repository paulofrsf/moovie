package Classes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleListaFilme implements Interface{

    ArrayList<Movie> filmes = new ArrayList<>();

    public ArrayList<Movie> getFilmes() {
        return filmes;
    }

    public void setFilmes(ArrayList<Movie> filmes) {
        this.filmes = filmes;
    }
    
    public void salvarLista() {

        try {
            FileOutputStream fos = new FileOutputStream("Filme.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(controleListaFilme.getFilmes());
            oos.close();

        }  catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "erro 002 cria lista");
        }

    }

}
