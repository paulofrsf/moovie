package Classes;

import static Classes.Interface.usuariologado;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import static java.lang.Integer.parseInt;
import javax.swing.JOptionPane;

public class InfoFilme extends javax.swing.JFrame implements Interface {

    public ListaFilmes listadefilmes;

    public InfoFilme(ListaFilmes listafilmes) {
        initComponents();
        this.listadefilmes = listafilmes;
        fechar();
        lblTitulo.setText("Titulo: " + listadefilmes.getNomeFilmeSelect());
        lblGenero.setText("Categoria: " + listadefilmes.getGenero());
        lblAno.setText("Ano: " + listadefilmes.getAnoFilme());
        lblMedia.setText("Media: " + listadefilmes.getMedia());
    }

    private void fechar() {

        this.addWindowListener(new WindowAdapter() {

            @Override
            public void windowClosing(WindowEvent evt) {

                listadefilmes.setInfoVisivel(true);
                listadefilmes.setVisible(true);

            }

        });

    }

    private boolean seTemFilme() {

        for (Movie filme : controleListaUsuario.usuarioLogado().filmesVotados) {
            if (filme.getTitulo().toLowerCase().equals(listadefilmes.getNomeFilmeSelect())) {
                return true;

            }
        }
        return false;
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lblTitulo = new javax.swing.JLabel();
        lblAno = new javax.swing.JLabel();
        lblMedia = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jComboBoxNota = new javax.swing.JComboBox();
        btnOkNota = new javax.swing.JButton();
        lblGenero = new javax.swing.JLabel();

        lblTitulo.setFont(new java.awt.Font("Tahoma", 0, 24)); // NOI18N
        lblTitulo.setText("Titulo");

        lblAno.setText("Ano: ");

        lblMedia.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        lblMedia.setText("Média:");

        jLabel5.setText("De sua nota:");

        jComboBoxNota.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "1", "2", "3", "4", "5" }));

        btnOkNota.setText("OK");
        btnOkNota.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnOkNotaActionPerformed(evt);
            }
        });

        lblGenero.setText("Genero: ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblTitulo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(135, 135, 135)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jComboBoxNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(50, 50, 50)
                        .addComponent(btnOkNota, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 57, Short.MAX_VALUE)))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(0, 0, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(29, 29, 29)
                .addComponent(lblTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, 32, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addComponent(lblGenero, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAno, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(lblMedia, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(130, 130, 130))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 27, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jComboBoxNota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(btnOkNota))
                        .addGap(37, 37, 37))))
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnOkNotaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnOkNotaActionPerformed
        if (usuariologado.logado()) {
            for (Movie filme : controleListaFilme.getFilmes()) {

                if (filme.getTitulo().equals(listadefilmes.getNomeFilmeSelect())) {
                    try {
                        filme.setNota(parseInt(jComboBoxNota.getSelectedItem().toString()));
                        filme.fazerMedia();
                        listadefilmes.setInfoVisivel(true);
                        if (seTemFilme()) {
                            for (Movie filmeusuario : controleListaUsuario.usuarioLogado().filmesVotados) {
                                if (filmeusuario.getTitulo().toLowerCase().equals(listadefilmes.getNomeFilmeSelect())) {
                                    filmeusuario.setNota(parseInt(jComboBoxNota.getSelectedItem().toString()));
                                    filmeusuario.fazerMedia();
                                }
                            }
                        } else {
                            filme.addFilmeUsuario();
                        }
                    } catch (Exception e) {
                        JOptionPane.showMessageDialog(null, "Não foi possivel votar no filme.");
                    }
                    this.setVisible(false);
                    break;
                }
            }
        } else {
            JOptionPane.showMessageDialog(null, "Precisa esta logado para poder vota em um filme.");
            Login login = new Login(listadefilmes.getInicialtela());
            login.setVisible(true);
        }
    }//GEN-LAST:event_btnOkNotaActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnOkNota;
    private javax.swing.JComboBox jComboBoxNota;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel lblAno;
    private javax.swing.JLabel lblGenero;
    private javax.swing.JLabel lblMedia;
    private javax.swing.JLabel lblTitulo;
    // End of variables declaration//GEN-END:variables
}
