package Classes;

import static Classes.Interface.controleListaFilme;
import static Classes.Interface.controleListaUsuario;
import static Classes.Interface.usuariologado;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.Collections;
import java.util.Random;

public class InicialTela extends javax.swing.JFrame {

    public String tipoDelist="T";
    
    public InicialTela() {
        initComponents();
        fechar();
        mostrarFilmes();
        btnDeslogar.setVisible(false);
        btnFilmesJaVotados.setVisible(false);
        btnDicasDeFilmes.setVisible(false);
    }

    private void fechar() {

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent evt) {

                controleListaUsuario.salvarLista();
                controleListaFilme.salvarLista();

            }

        });
    }

    private int sorteio() { //sorteia um numero de acordo com o numero total de filmes
        Integer numero = (Integer) controleListaFilme.getFilmes().size();
        Random random = new Random();
        int intervalo_randomico = random.nextInt(numero - 1);
        return intervalo_randomico;

    }

    public void ativaDeslogar() {

        btnDeslogar.setVisible(true);
        btnFilmesJaVotados.setVisible(true); 
         btnDicasDeFilmes.setVisible(true);

    }

    private String addFilme() { // pega o titulo e um filme aleatorio
        String titulo;

        titulo = controleListaFilme.getFilmes().get(sorteio()).getTitulo();

        return titulo;
    }

    public String getTipoDelist() {
        return tipoDelist;
    }

    public void setTipoDelist(String tipoDelist) {
        this.tipoDelist = tipoDelist;
    }
    

    private void mostrarFilmes() { // Altera o nome das label aleatorio

        lblFilme1.setText(addFilme());
        lblFilme2.setText(addFilme());
        lblFilme3.setText(addFilme());
        lblFilme4.setText(addFilme());
        lblFilme5.setText(addFilme());
        lblFilme6.setText(addFilme());
        lblFilme7.setText(addFilme());
        lblFilme8.setText(addFilme());

    }

    public void logar() {

        lblLogado.setText("Logado em: " + usuariologado.getLogin());

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        canvas1 = new java.awt.Canvas();
        jMenu3 = new javax.swing.JMenu();
        btnLogar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        lblLogado = new javax.swing.JLabel();
        btnDeslogar = new javax.swing.JButton();
        lblFilme3 = new javax.swing.JLabel();
        lblFilme4 = new javax.swing.JLabel();
        lblFilme8 = new javax.swing.JLabel();
        lblFilme2 = new javax.swing.JLabel();
        lblFilme1 = new javax.swing.JLabel();
        lblFilme6 = new javax.swing.JLabel();
        lblFilme7 = new javax.swing.JLabel();
        lblFilme5 = new javax.swing.JLabel();
        btnFilmes = new javax.swing.JButton();
        btnMaisVotados = new javax.swing.JButton();
        btnFilmesJaVotados = new javax.swing.JButton();
        btnAddFilmes = new javax.swing.JButton();
        btnDicasDeFilmes = new javax.swing.JButton();

        jMenu3.setText("jMenu3");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogar.setText("Logar");
        btnLogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLogarActionPerformed(evt);
            }
        });

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagens/aaa_2.png"))); // NOI18N
        jLabel1.setText("jLabel1");

        btnDeslogar.setText("Deslogar");
        btnDeslogar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDeslogarActionPerformed(evt);
            }
        });

        lblFilme3.setBackground(new java.awt.Color(255, 51, 51));
        lblFilme3.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblFilme3.setText("filme");
        lblFilme3.setPreferredSize(new java.awt.Dimension(22, 20));

        lblFilme4.setBackground(new java.awt.Color(255, 51, 51));
        lblFilme4.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblFilme4.setText("filme");
        lblFilme4.setPreferredSize(new java.awt.Dimension(22, 20));

        lblFilme8.setBackground(new java.awt.Color(255, 51, 51));
        lblFilme8.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblFilme8.setText("filme");
        lblFilme8.setPreferredSize(new java.awt.Dimension(22, 20));

        lblFilme2.setBackground(new java.awt.Color(255, 51, 51));
        lblFilme2.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblFilme2.setText("filme");
        lblFilme2.setPreferredSize(new java.awt.Dimension(22, 20));

        lblFilme1.setBackground(new java.awt.Color(255, 51, 51));
        lblFilme1.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblFilme1.setText("filme");
        lblFilme1.setPreferredSize(new java.awt.Dimension(22, 20));

        lblFilme6.setBackground(new java.awt.Color(255, 51, 51));
        lblFilme6.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblFilme6.setText("filme");
        lblFilme6.setPreferredSize(new java.awt.Dimension(22, 20));

        lblFilme7.setBackground(new java.awt.Color(255, 51, 51));
        lblFilme7.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblFilme7.setText("filme");
        lblFilme7.setPreferredSize(new java.awt.Dimension(22, 20));

        lblFilme5.setBackground(new java.awt.Color(255, 51, 51));
        lblFilme5.setFont(new java.awt.Font("Verdana", 0, 14)); // NOI18N
        lblFilme5.setText("filme");
        lblFilme5.setPreferredSize(new java.awt.Dimension(22, 20));

        btnFilmes.setText("Filmes");
        btnFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmesActionPerformed(evt);
            }
        });

        btnMaisVotados.setText("Os mais bem votados");
        btnMaisVotados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnMaisVotadosActionPerformed(evt);
            }
        });

        btnFilmesJaVotados.setText("Filmes Já Votados");
        btnFilmesJaVotados.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFilmesJaVotadosActionPerformed(evt);
            }
        });

        btnAddFilmes.setText("Adicionar Filmes");
        btnAddFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddFilmesActionPerformed(evt);
            }
        });

        btnDicasDeFilmes.setText("Dicas de filmes");
        btnDicasDeFilmes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDicasDeFilmesActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(lblFilme2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(lblFilme5, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(47, 47, 47)
                        .addComponent(lblFilme6, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFilme7, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(97, 97, 97)
                        .addComponent(lblFilme8, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblFilme3, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(98, 98, 98)
                        .addComponent(lblFilme4, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 343, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 8, Short.MAX_VALUE)
                .addComponent(lblLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 190, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnMaisVotados))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 87, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnAddFilmes))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(btnFilmesJaVotados)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnDicasDeFilmes))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 133, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblLogado, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnDeslogar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnLogar, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnAddFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnMaisVotados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnFilmesJaVotados, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnDicasDeFilmes, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(54, 54, 54)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFilme6, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFilme5, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFilme7, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFilme8, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblFilme1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFilme2, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFilme3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblFilme4, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnLogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLogarActionPerformed
        Login login = new Login(this);
        login.setVisible(true);
    }//GEN-LAST:event_btnLogarActionPerformed

    private void btnDeslogarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDeslogarActionPerformed
        // TODO add your handling code here:
        lblLogado.setText("");
        usuariologado.setLogin(null);
        btnDeslogar.setVisible(false);
        btnFilmesJaVotados.setVisible(false); 

    }//GEN-LAST:event_btnDeslogarActionPerformed

    private void btnFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmesActionPerformed
        setTipoDelist("T");
        Collections.sort(controleListaFilme.getFilmes());
        ListaFilmes listafilmes = new ListaFilmes(this);
        listafilmes.setVisible(true);
    }//GEN-LAST:event_btnFilmesActionPerformed

    private void btnMaisVotadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnMaisVotadosActionPerformed
        setTipoDelist("T");
        Collections.sort(controleListaFilme.getFilmes());
         Collections.sort(controleListaFilme.getFilmes(), new Movie());
        ListaFilmes listafilmes = new ListaFilmes(this);
        listafilmes.setVisible(true);
    }//GEN-LAST:event_btnMaisVotadosActionPerformed

    private void btnFilmesJaVotadosActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFilmesJaVotadosActionPerformed
        // TODO add your handling code here:
        setTipoDelist("U");
        Collections.sort(controleListaUsuario.usuarioLogado().filmesVotados);
        ListaFilmes listafilmes = new ListaFilmes(this);
        listafilmes.setVisible(true);
    }//GEN-LAST:event_btnFilmesJaVotadosActionPerformed

    private void btnAddFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddFilmesActionPerformed
        // TODO add your handling code here:
        AddFilmes adicionarfilmes = new AddFilmes(this);
        adicionarfilmes.setVisible(true);
                
    }//GEN-LAST:event_btnAddFilmesActionPerformed

    private void btnDicasDeFilmesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDicasDeFilmesActionPerformed
        // TODO add your handling code here:
        setTipoDelist("D");
        Collections.sort(controleListaUsuario.usuarioLogado().filmesVotados);
        ListaFilmes listafilmes = new ListaFilmes(this);
        listafilmes.setVisible(true);
    }//GEN-LAST:event_btnDicasDeFilmesActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddFilmes;
    private javax.swing.JButton btnDeslogar;
    private javax.swing.JButton btnDicasDeFilmes;
    private javax.swing.JButton btnFilmes;
    private javax.swing.JButton btnFilmesJaVotados;
    private javax.swing.JButton btnLogar;
    private javax.swing.JButton btnMaisVotados;
    private java.awt.Canvas canvas1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JLabel lblFilme1;
    private javax.swing.JLabel lblFilme2;
    private javax.swing.JLabel lblFilme3;
    private javax.swing.JLabel lblFilme4;
    private javax.swing.JLabel lblFilme5;
    private javax.swing.JLabel lblFilme6;
    private javax.swing.JLabel lblFilme7;
    private javax.swing.JLabel lblFilme8;
    private javax.swing.JLabel lblLogado;
    // End of variables declaration//GEN-END:variables
}
