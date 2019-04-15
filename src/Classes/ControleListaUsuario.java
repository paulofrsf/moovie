package Classes;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;
import javax.swing.JOptionPane;

public class ControleListaUsuario implements Interface {

    ArrayList<Usuario> usuariosCadastrados  = new ArrayList<>(); ;

    public ArrayList<Usuario> getUsuariosCadastrados() {
        return usuariosCadastrados;
    }

    public void settUsuariosCadastrados(ArrayList<Usuario> usuario) {
        usuariosCadastrados = usuario;
    }
public Usuario usuarioLogado(){

    for (Usuario usuario : usuariosCadastrados) {
        if(usuario.getNome().equals(usuariologado.getLogin())){
        return usuario;
        }
    }
return null;
}
    public void salvarLista() {

        try {
            FileOutputStream fos = new FileOutputStream("Usuario.data");
            ObjectOutputStream oos = new ObjectOutputStream(fos);
            oos.writeObject(controleListaUsuario.getUsuariosCadastrados());
            oos.close();

        }  catch (IOException ex) {
            JOptionPane.showMessageDialog(null, "erro 001 cria lista");
        }

    }

}
