
package Classes;

public class UsuarioLogado {
    
    
    private String login;
    
    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }
    public boolean logado(){
    
    if(login == null){
    return false;
    }
    return true;
    }
}
