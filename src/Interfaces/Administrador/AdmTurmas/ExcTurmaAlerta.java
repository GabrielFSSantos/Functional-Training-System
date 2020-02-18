package Interfaces.Administrador.AdmTurmas;

import javax.swing.JOptionPane;
import objetos.Turma;
import objetos_dao.TurmaDAO;

/**
 *
 * @author GabrielFelipe
 */
public class ExcTurmaAlerta extends javax.swing.JFrame {

    TurmaDAO turmaBanco = new TurmaDAO();
    Turma turma;
    OpTurma opa;

    public ExcTurmaAlerta(Turma a, OpTurma opa) {
        turma = a;
        this.opa = opa;
        initComponents();
    }

    private ExcTurmaAlerta() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        ConfirmaExcAgenServ = new javax.swing.JButton();
        CancelaExcAgenServ = new javax.swing.JButton();
        InstExcTurma = new javax.swing.JLabel();
        instrExcTurma = new javax.swing.JLabel();
        SegExcTurma = new javax.swing.JLabel();
        segExcTurma = new javax.swing.JLabel();
        TerExcTurma = new javax.swing.JLabel();
        QuaExcTurma = new javax.swing.JLabel();
        terExcTurma = new javax.swing.JLabel();
        quaExcTurma = new javax.swing.JLabel();
        QuinExcTurma = new javax.swing.JLabel();
        quinExcTurma = new javax.swing.JLabel();
        SexExcTurma = new javax.swing.JLabel();
        sexExcTurma = new javax.swing.JLabel();
        labelQtdMax1 = new javax.swing.JLabel();
        qtdMax1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Excluir a Turma ");
        Titulo.setToolTipText("");

        ConfirmaExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ConfirmaExcAgenServ.setText("Sim");
        ConfirmaExcAgenServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaExcAgenServActionPerformed(evt);
            }
        });

        CancelaExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CancelaExcAgenServ.setText("Cancelar");
        CancelaExcAgenServ.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaExcAgenServActionPerformed(evt);
            }
        });

        InstExcTurma.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        InstExcTurma.setText("Instrutor:");
        InstExcTurma.setToolTipText("");

        instrExcTurma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        instrExcTurma.setText("???");

        SegExcTurma.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        SegExcTurma.setText("Segunda-Feira:");

        segExcTurma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        segExcTurma.setText("???");

        TerExcTurma.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TerExcTurma.setText("Terça-Feira:");

        QuaExcTurma.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        QuaExcTurma.setText("Quarta-Feira:");

        terExcTurma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        terExcTurma.setText("???");

        quaExcTurma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        quaExcTurma.setText("???");

        QuinExcTurma.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        QuinExcTurma.setText("Quinta-Feira:");

        quinExcTurma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        quinExcTurma.setText("???");

        SexExcTurma.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        SexExcTurma.setText("Sexta-Feira:");

        sexExcTurma.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sexExcTurma.setText("???");

        labelQtdMax1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        labelQtdMax1.setText("Qtd. máxima:");

        qtdMax1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        qtdMax1.setText("???");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addGap(42, 42, 42)
                                    .addComponent(InstExcTurma)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(instrExcTurma, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                    .addComponent(SegExcTurma)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(segExcTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(TerExcTurma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(terExcTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(QuaExcTurma)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quaExcTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(QuinExcTurma)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(quinExcTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(SexExcTurma)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(sexExcTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                            .addComponent(labelQtdMax1)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(qtdMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(ConfirmaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(CancelaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(instrExcTurma)
                    .addComponent(InstExcTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SegExcTurma)
                    .addComponent(segExcTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(TerExcTurma)
                    .addComponent(terExcTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuaExcTurma)
                    .addComponent(quaExcTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(QuinExcTurma)
                    .addComponent(quinExcTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(SexExcTurma)
                    .addComponent(sexExcTurma))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(labelQtdMax1)
                    .addComponent(qtdMax1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(48, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(372, 404));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Botoões de Ações
    private void CancelaExcAgenServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaExcAgenServActionPerformed
        // Click no Botão Cancelar:

        dispose();

    }//GEN-LAST:event_CancelaExcAgenServActionPerformed

    private void ConfirmaExcAgenServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaExcAgenServActionPerformed
        // Click no Botão Sim:

        try {

            turmaBanco.remove(turma);
            JOptionPane.showMessageDialog(null, "Turma Excluida com Sucesso!!!");

        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir a Turma, verifique se existem dependências");
        }

        opa.Limpar();
        dispose();

    }//GEN-LAST:event_ConfirmaExcAgenServActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando a Janela Abre:

        instrExcTurma.setText(turma.getInstrutor().getNome());
        segExcTurma.setText(turma.getHorario().split("\\|")[0]);
        terExcTurma.setText(turma.getHorario().split("\\|")[1]);
        quaExcTurma.setText(turma.getHorario().split("\\|")[2]);
        quinExcTurma.setText(turma.getHorario().split("\\|")[3]);
        sexExcTurma.setText(turma.getHorario().split("\\|")[4]);
        qtdMax1.setText(String.valueOf(turma.getQuantidade()));

    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelaExcAgenServ;
    private javax.swing.JButton ConfirmaExcAgenServ;
    private javax.swing.JLabel InstExcTurma;
    private javax.swing.JLabel QuaExcTurma;
    private javax.swing.JLabel QuinExcTurma;
    private javax.swing.JLabel SegExcTurma;
    private javax.swing.JLabel SexExcTurma;
    private javax.swing.JLabel TerExcTurma;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel instrExcTurma;
    private javax.swing.JLabel labelQtdMax1;
    private javax.swing.JLabel qtdMax1;
    private javax.swing.JLabel quaExcTurma;
    private javax.swing.JLabel quinExcTurma;
    private javax.swing.JLabel segExcTurma;
    private javax.swing.JLabel sexExcTurma;
    private javax.swing.JLabel terExcTurma;
    // End of variables declaration//GEN-END:variables
}
