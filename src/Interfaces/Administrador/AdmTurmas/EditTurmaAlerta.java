package Interfaces.Administrador.AdmTurmas;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objetos.Turma;
import objetos_dao.TurmaDAO;

/**
 *
 * @author GabrielFelipe
 */
public class EditTurmaAlerta extends javax.swing.JFrame {

    TurmaDAO alunoBanco = new TurmaDAO();
    Turma turma_antiga;
    Turma turma_nova;
    OpTurma opa;

    public EditTurmaAlerta(Turma antigo, Turma novo, OpTurma opa) {
        turma_antiga = antigo;
        turma_nova = novo;
        this.opa = opa;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        InstEditTurma1 = new javax.swing.JLabel();
        instrEditTurma1 = new javax.swing.JLabel();
        SegEditTurma1 = new javax.swing.JLabel();
        segEditTurma1 = new javax.swing.JLabel();
        TerEditTurma1 = new javax.swing.JLabel();
        terEditTurma1 = new javax.swing.JLabel();
        QuaEditTurma1 = new javax.swing.JLabel();
        quaEditTurma1 = new javax.swing.JLabel();
        QuinEditTurma1 = new javax.swing.JLabel();
        quinEditTurma1 = new javax.swing.JLabel();
        SexEditTurma1 = new javax.swing.JLabel();
        sexEditTurma1 = new javax.swing.JLabel();
        SetaEditTurma = new javax.swing.JLabel();
        InstEditTurma2 = new javax.swing.JLabel();
        instrEditTurma2 = new javax.swing.JLabel();
        SegEditTurma2 = new javax.swing.JLabel();
        segEditTurma2 = new javax.swing.JLabel();
        TerEditTurma2 = new javax.swing.JLabel();
        terEditTurma2 = new javax.swing.JLabel();
        QuaEditTurma2 = new javax.swing.JLabel();
        quaEditTurma2 = new javax.swing.JLabel();
        QuinEditTurma2 = new javax.swing.JLabel();
        quinEditTurma2 = new javax.swing.JLabel();
        SexEditTurma2 = new javax.swing.JLabel();
        sexEditTurma2 = new javax.swing.JLabel();
        ConfirmaEditTurma = new javax.swing.JButton();
        CancelaEditTurma = new javax.swing.JButton();
        labelQtdMax1 = new javax.swing.JLabel();
        qtdMax1 = new javax.swing.JLabel();
        labelQtdMax2 = new javax.swing.JLabel();
        qtdMax2 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Editar a Turma: ");
        Titulo.setToolTipText("");

        InstEditTurma1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        InstEditTurma1.setText("Instrutor:");
        InstEditTurma1.setToolTipText("");

        instrEditTurma1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        instrEditTurma1.setText("???");

        SegEditTurma1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        SegEditTurma1.setText("Segunda-Feira:");

        segEditTurma1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        segEditTurma1.setText("???");

        TerEditTurma1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TerEditTurma1.setText("Terça-Feira:");

        terEditTurma1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        terEditTurma1.setText("???");

        QuaEditTurma1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        QuaEditTurma1.setText("Quarta-Feira:");

        quaEditTurma1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        quaEditTurma1.setText("???");

        QuinEditTurma1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        QuinEditTurma1.setText("Quinta-Feira:");

        quinEditTurma1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        quinEditTurma1.setText("???");

        SexEditTurma1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        SexEditTurma1.setText("Sexta-Feira:");

        sexEditTurma1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sexEditTurma1.setText("???");

        SetaEditTurma.setFont(new java.awt.Font("Dialog", 1, 55)); // NOI18N
        SetaEditTurma.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SetaEditTurma.setText("→");

        InstEditTurma2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        InstEditTurma2.setText("Instrutor:");
        InstEditTurma2.setToolTipText("");

        instrEditTurma2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        instrEditTurma2.setText("???");

        SegEditTurma2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        SegEditTurma2.setText("Segunda-Feira:");

        segEditTurma2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        segEditTurma2.setText("???");

        TerEditTurma2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TerEditTurma2.setText("Terça-Feira:");

        terEditTurma2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        terEditTurma2.setText("???");

        QuaEditTurma2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        QuaEditTurma2.setText("Quarta-Feira:");

        quaEditTurma2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        quaEditTurma2.setText("???");

        QuinEditTurma2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        QuinEditTurma2.setText("Quinta-Feira:");

        quinEditTurma2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        quinEditTurma2.setText("???");

        SexEditTurma2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        SexEditTurma2.setText("Sexta-Feira:");

        sexEditTurma2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sexEditTurma2.setText("???");

        ConfirmaEditTurma.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ConfirmaEditTurma.setText("Sim");
        ConfirmaEditTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaEditTurmaActionPerformed(evt);
            }
        });

        CancelaEditTurma.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CancelaEditTurma.setText("Cancelar");
        CancelaEditTurma.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaEditTurmaActionPerformed(evt);
            }
        });

        labelQtdMax1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        labelQtdMax1.setText("Qtd. máxima:");

        qtdMax1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        qtdMax1.setText("???");

        labelQtdMax2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        labelQtdMax2.setText("Qtd. máxima:");

        qtdMax2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        qtdMax2.setText("???");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 680, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addGap(42, 42, 42)
                                                .addComponent(InstEditTurma1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(instrEditTurma1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                                .addComponent(SegEditTurma1)
                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(segEditTurma1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(TerEditTurma1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(terEditTurma1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                            .addComponent(QuaEditTurma1)
                                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(quaEditTurma1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                        .addComponent(QuinEditTurma1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(quinEditTurma1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(SetaEditTurma)
                                .addGap(38, 38, 38))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(16, 16, 16)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(SexEditTurma1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(sexEditTurma1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(labelQtdMax1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(qtdMax1, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(42, 42, 42)
                                        .addComponent(InstEditTurma2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(instrEditTurma2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addComponent(SegEditTurma2)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(segEditTurma2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(TerEditTurma2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(terEditTurma2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addComponent(QuaEditTurma2)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(quaEditTurma2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(QuinEditTurma2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(quinEditTurma2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(SexEditTurma2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(sexEditTurma2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(labelQtdMax2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(qtdMax2, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(ConfirmaEditTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38)
                        .addComponent(CancelaEditTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(181, 181, 181)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addComponent(Titulo)
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instrEditTurma2)
                            .addComponent(InstEditTurma2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SegEditTurma2)
                            .addComponent(segEditTurma2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TerEditTurma2)
                            .addComponent(terEditTurma2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QuaEditTurma2)
                            .addComponent(quaEditTurma2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QuinEditTurma2)
                            .addComponent(quinEditTurma2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SexEditTurma2)
                            .addComponent(sexEditTurma2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelQtdMax2)
                            .addComponent(qtdMax2)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(instrEditTurma1)
                            .addComponent(InstEditTurma1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SegEditTurma1)
                                    .addComponent(segEditTurma1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(TerEditTurma1)
                                    .addComponent(terEditTurma1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(QuaEditTurma1)
                                    .addComponent(quaEditTurma1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(15, 15, 15)
                                .addComponent(SetaEditTurma)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(QuinEditTurma1)
                            .addComponent(quinEditTurma1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SexEditTurma1)
                            .addComponent(sexEditTurma1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(labelQtdMax1)
                            .addComponent(qtdMax1))))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CancelaEditTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(ConfirmaEditTurma, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        setSize(new java.awt.Dimension(696, 369));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando Abre a Janela

        //Antes
        instrEditTurma1.setText(turma_antiga.getInstrutor().getNome());
        segEditTurma1.setText(turma_antiga.getHorario().split("\\|")[0]);
        terEditTurma1.setText(turma_antiga.getHorario().split("\\|")[1]);
        quaEditTurma1.setText(turma_antiga.getHorario().split("\\|")[2]);
        quinEditTurma1.setText(turma_antiga.getHorario().split("\\|")[3]);
        sexEditTurma1.setText(turma_antiga.getHorario().split("\\|")[4]);
        qtdMax1.setText(String.valueOf(turma_antiga.getQuantidade()));

        //Depois
        instrEditTurma2.setText(turma_nova.getInstrutor().getNome());
        segEditTurma2.setText(turma_nova.getHorario().split("\\|")[0]);
        terEditTurma2.setText(turma_nova.getHorario().split("\\|")[1]);
        quaEditTurma2.setText(turma_nova.getHorario().split("\\|")[2]);
        quinEditTurma2.setText(turma_nova.getHorario().split("\\|")[3]);
        sexEditTurma2.setText(turma_nova.getHorario().split("\\|")[4]);
        qtdMax2.setText(String.valueOf(turma_nova.getQuantidade()));

    }//GEN-LAST:event_formWindowOpened

    private void CancelaEditTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaEditTurmaActionPerformed
        // Click no Botão Cancelar:
        dispose();
    }//GEN-LAST:event_CancelaEditTurmaActionPerformed

    private void ConfirmaEditTurmaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaEditTurmaActionPerformed
        try {
            new TurmaDAO().altera(turma_nova);            

            JOptionPane.showMessageDialog(null, "Turma editada com sucesso!");
            opa.Limpar();
            dispose();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível editar a turma");
        }
    }//GEN-LAST:event_ConfirmaEditTurmaActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelaEditTurma;
    private javax.swing.JButton ConfirmaEditTurma;
    private javax.swing.JLabel InstEditTurma1;
    private javax.swing.JLabel InstEditTurma2;
    private javax.swing.JLabel QuaEditTurma1;
    private javax.swing.JLabel QuaEditTurma2;
    private javax.swing.JLabel QuinEditTurma1;
    private javax.swing.JLabel QuinEditTurma2;
    private javax.swing.JLabel SegEditTurma1;
    private javax.swing.JLabel SegEditTurma2;
    private javax.swing.JLabel SetaEditTurma;
    private javax.swing.JLabel SexEditTurma1;
    private javax.swing.JLabel SexEditTurma2;
    private javax.swing.JLabel TerEditTurma1;
    private javax.swing.JLabel TerEditTurma2;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel instrEditTurma1;
    private javax.swing.JLabel instrEditTurma2;
    private javax.swing.JLabel labelQtdMax1;
    private javax.swing.JLabel labelQtdMax2;
    private javax.swing.JLabel qtdMax1;
    private javax.swing.JLabel qtdMax2;
    private javax.swing.JLabel quaEditTurma1;
    private javax.swing.JLabel quaEditTurma2;
    private javax.swing.JLabel quinEditTurma1;
    private javax.swing.JLabel quinEditTurma2;
    private javax.swing.JLabel segEditTurma1;
    private javax.swing.JLabel segEditTurma2;
    private javax.swing.JLabel sexEditTurma1;
    private javax.swing.JLabel sexEditTurma2;
    private javax.swing.JLabel terEditTurma1;
    private javax.swing.JLabel terEditTurma2;
    // End of variables declaration//GEN-END:variables
}
