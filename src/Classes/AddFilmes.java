package Classes;

import static Classes.Interface.controleListaFilme;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class AddFilmes extends javax.swing.JFrame {

    InicialTela inicialtela;

    public AddFilmes(InicialTela inicialtela) {
        initComponents();
        this.inicialtela = inicialtela;
    }

    public boolean isInt(String v) {
        try {
            Integer.parseInt(v);
            return true;
        } catch (Exception e) {
            return false;
        }
    }

    private boolean validar() {
        boolean retorno = true;

        if (txtAno.getText().isEmpty() || txtTitulo.getText().isEmpty() || jComboBoxCategoria.getSelectedIndex() == -1) {
            retorno = false;
        }

        return retorno;
    }

    private boolean seNaoTemFilme() {

        for (Movie filme : controleListaFilme.getFilmes()) {
            if (filme.getTitulo().toLowerCase().equals(txtTitulo.getText().toLowerCase())) {
                return false;

            }
        }
        return true;
    }

    private void limpardados() {
        txtAno.setText("");
        txtTitulo.setText("");
        jComboBoxCategoria.setSelectedIndex(-1);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnAddfilme = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        txtTitulo = new javax.swing.JTextField();
        txtAno = new javax.swing.JTextField();
        jComboBoxCategoria = new javax.swing.JComboBox();

        btnAddfilme.setText("Adicionar Filme");
        btnAddfilme.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddfilmeActionPerformed(evt);
            }
        });

        jLabel1.setText("Titulo:");

        jLabel2.setText("Genero:");

        jLabel3.setText("Ano:");

        jComboBoxCategoria.setModel(new DefaultComboBoxModel(Categoria.values()));

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnAddfilme, javax.swing.GroupLayout.PREFERRED_SIZE, 119, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtTitulo)
                    .addComponent(txtAno)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, 221, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(81, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(75, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(txtTitulo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jComboBoxCategoria, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(26, 26, 26)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtAno, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(70, 70, 70)
                .addComponent(btnAddfilme, javax.swing.GroupLayout.PREFERRED_SIZE, 33, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );

        pack();
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void btnAddfilmeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddfilmeActionPerformed
        if (validar()) {
            if (isInt(txtAno.getText())) {
                if (seNaoTemFilme()) {
                    Movie filme = new Movie(txtTitulo.getText(), Integer.parseInt(txtAno.getText()), (Categoria) jComboBoxCategoria.getSelectedItem());
                    controleListaFilme.filmes.add(filme);
                    JOptionPane.showMessageDialog(null, "Filme adicionado");
                    limpardados();
                } else {//ja cadastrado
                    JOptionPane.showMessageDialog(null, "Filme ja cadastrado.");
                }
            } else {//validaridade
                JOptionPane.showMessageDialog(null, "No campo Ano não pode contar letras.");
            }
        } else {//validarCampo em branco
            JOptionPane.showMessageDialog(null, "Campos em branco.");
        }


    }//GEN-LAST:event_btnAddfilmeActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddfilme;
    private javax.swing.JComboBox jComboBoxCategoria;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JTextField txtAno;
    private javax.swing.JTextField txtTitulo;
    // End of variables declaration//GEN-END:variables
}
