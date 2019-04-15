package Classes;

import static Classes.Interface.controleListaFilme;
import java.util.Random;
import javax.swing.*;

public class ListaFilmes extends javax.swing.JFrame implements Interface {

    private boolean infoVisivel = true;
    private InicialTela inicialtela;
    public String nomeFilmeSelect = "Erro!";
    public String genero = "Erro!";
    public int anoFilme = 0;
    public Double media;

    public ListaFilmes(InicialTela inicialtela) {

        initComponents();
        this.inicialtela = inicialtela;
        if ("T".equals(inicialtela.getTipoDelist())) {
            criaListaTudo();
        }
        if ("U".equals(inicialtela.getTipoDelist())) {
            criaListaUsuario();
            btnDeletarFilme.setVisible(false);
        }
        if ("D".equals(inicialtela.getTipoDelist())) {
            criaListaDicaDeFilmes();
            btnDeletarFilme.setVisible(false);
        }

    }

    public InicialTela getInicialtela() {
        return inicialtela;
    }

    public Double getMedia() {
        return media;
    }

    public void setMedia(Double media) {
        this.media = media;
    }

    public String getGenero() {
        return genero;
    }

    public void setNomeFilmeSelect(String nomeFilmeSelect) {
        this.nomeFilmeSelect = nomeFilmeSelect;
    }

    public String getNomeFilmeSelect() {
        return nomeFilmeSelect;
    }

    public void setInfoVisivel(boolean infovisivel) {
        this.infoVisivel = infovisivel;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public int getAnoFilme() {
        return anoFilme;
    }

    public void setAnoFilme(int anoFilme) {
        this.anoFilme = anoFilme;
    }

    private void criaListaTudo() {

        DefaultListModel lista = new DefaultListModel();

        for (Movie filme : controleListaFilme.getFilmes()) {
            lista.addElement(filme.getTitulo());
        }
        listFilmes.setModel(lista);
    }

    private void criaListaUsuario() {

        DefaultListModel lista = new DefaultListModel();

        for (Movie filme : controleListaUsuario.usuarioLogado().getFilmesVotados()) {
            lista.addElement(filme.getTitulo());
        }
        listFilmes.setModel(lista);
    }

    private void criaListaDicaDeFilmes() {

        DefaultListModel lista = new DefaultListModel();
        Categoria categoria = controleListaUsuario.usuarioLogado().getFilmesVotados().get(sorteio()).getCategoria();
        for (Movie filme : controleListaFilme.getFilmes()) {
            if (filme.getCategoria() == categoria) {
                lista.addElement(filme.getTitulo());
            }
            listFilmes.setModel(lista);

        }

    }

    private int sorteio() { //sorteia um numero de acordo com o numero total de filmes
        Integer numero = (Integer) controleListaUsuario.usuarioLogado().getFilmesVotados().size();
        Random random = new Random();
        int intervalo_randomico = random.nextInt(numero - 1);
        return intervalo_randomico;

    }

    private void pegarGeneroAnoTudo() {

        for (Movie filme : controleListaFilme.getFilmes()) {
            if (filme.getTitulo().equals(nomeFilmeSelect)) {

                this.setGenero(filme.getCategoria().toString());
                this.setAnoFilme(filme.getAno());
                this.setMedia(filme.getMedia());
                break;
            }

        }

    }

    private void pegarGeneroAnoUsuario() {

        for (Movie filme : controleListaUsuario.usuarioLogado().getFilmesVotados()) {
            if (filme.getTitulo().equals(nomeFilmeSelect)) {

                this.setGenero(filme.getCategoria().toString());
                this.setAnoFilme(filme.getAno());
                this.setMedia(filme.getMedia());
                break;
            }

        }

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollBar1 = new javax.swing.JScrollBar();
        jScrollPane2 = new javax.swing.JScrollPane();
        listFilmes = new javax.swing.JList();
        btnDeletarFilme = new javax.swing.JButton();

        listFilmes.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                listFilmesMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(listFilmes);

        btnDeletarFilme.setText("Deletar Filme");
        btnDeletarFilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeletarFilmeActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 406, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addComponent(btnDeletarFilme)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 334, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnDeletarFilme, javax.swing.GroupLayout.PREFERRED_SIZE, 23, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void listFilmesMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_listFilmesMouseClicked
        // TODO add your handling code here:
        if (infoVisivel) {      
                this.setNomeFilmeSelect((String) listFilmes.getSelectedValue());
                this.pegarGeneroAnoTudo();
                InfoFilme infofilme = new InfoFilme(this);
                infofilme.setVisible(true);
                infoVisivel = false;
                this.setVisible(false);
           

        }
    }//GEN-LAST:event_listFilmesMouseClicked

    private void btnDeletarFilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeletarFilmeActionPerformed
        String nomeFilme = JOptionPane.showInputDialog("Digite o nome do filme:");
        try {
            if ("T".equals(inicialtela.getTipoDelist())) {
                for (Movie filme : controleListaFilme.getFilmes()) {
                    if (filme.getTitulo().equals(nomeFilme)) {
                        controleListaFilme.getFilmes().remove(filme);
                        inicialtela.setTipoDelist("U");
                        break;
                    }
                }
            }
        } catch (Exception e) {
        }
        try {
            if ("U".equals(inicialtela.getTipoDelist())) {
                for (Movie filme : controleListaUsuario.usuarioLogado().getFilmesVotados()) {
                    if (filme.getTitulo().equals(nomeFilme)) {
                        controleListaUsuario.usuarioLogado().getFilmesVotados().remove(filme);
                        break;
                    }

                }
            }
        } catch (Exception e) {

        }


    }//GEN-LAST:event_btnDeletarFilmeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDeletarFilme;
    private javax.swing.JScrollBar jScrollBar1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JList listFilmes;
    // End of variables declaration//GEN-END:variables

}
