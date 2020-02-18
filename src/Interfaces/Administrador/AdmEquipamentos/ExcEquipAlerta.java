package Interfaces.Administrador.AdmEquipamentos;

import Interfaces.Administrador.AdmEquipamentos.OpEquipamentos;
import Objetos_DAO.EquipamentoDAO;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objetos.Equipamento;

/**
 *
 * @author GabrielFelipe
 */
public class ExcEquipAlerta extends javax.swing.JFrame {

    EquipamentoDAO EquipamentoBanco = new EquipamentoDAO();
    Equipamento e;
    OpEquipamentos ope;
    
    public ExcEquipAlerta(Equipamento e, OpEquipamentos ope) {
        this.e = e;
        this.ope = ope;
        initComponents();
    }
    
    public ExcEquipAlerta(){}

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        ConfirmaExcEquip = new javax.swing.JButton();
        CancelaExcEquip = new javax.swing.JButton();
        nomeEditEquip1 = new javax.swing.JLabel();
        NomeExcEquip = new javax.swing.JLabel();
        FabricanteExcEquip = new javax.swing.JLabel();
        statusEditEquip1 = new javax.swing.JLabel();
        ManuCadEquip = new javax.swing.JLabel();
        uEditEquip1 = new com.toedter.calendar.JDateChooser();
        ManuCadEquip1 = new javax.swing.JLabel();
        pEditEquip1 = new com.toedter.calendar.JDateChooser();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Excluir o Equipamento: ");
        Titulo.setToolTipText("");

        ConfirmaExcEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ConfirmaExcEquip.setText("Sim");
        ConfirmaExcEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaExcEquipActionPerformed(evt);
            }
        });

        CancelaExcEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CancelaExcEquip.setText("Cancelar");
        CancelaExcEquip.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaExcEquipActionPerformed(evt);
            }
        });

        nomeEditEquip1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeEditEquip1.setText("???");

        NomeExcEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NomeExcEquip.setText("Nome:");
        NomeExcEquip.setToolTipText("");

        FabricanteExcEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        FabricanteExcEquip.setText("Staus:");
        FabricanteExcEquip.setToolTipText("");

        statusEditEquip1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        statusEditEquip1.setText("???");

        ManuCadEquip.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ManuCadEquip.setText("Ultima Manutenção:");

        uEditEquip1.setEnabled(false);
        uEditEquip1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        ManuCadEquip1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ManuCadEquip1.setText("Proxima Manutenção:");

        pEditEquip1.setEnabled(false);
        pEditEquip1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(24, 24, 24)
                        .addComponent(ConfirmaExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(CancelaExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(40, 40, 40)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(FabricanteExcEquip)
                                    .addComponent(NomeExcEquip))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(nomeEditEquip1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(statusEditEquip1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(ManuCadEquip, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 151, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(ManuCadEquip1, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(uEditEquip1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(pEditEquip1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 275, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeExcEquip)
                    .addComponent(nomeEditEquip1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(FabricanteExcEquip)
                    .addComponent(statusEditEquip1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(ManuCadEquip)
                .addGap(2, 2, 2)
                .addComponent(uEditEquip1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ManuCadEquip1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(pEditEquip1, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmaExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelaExcEquip, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setSize(new java.awt.Dimension(372, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Botoões de Ações
    private void CancelaExcEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaExcEquipActionPerformed
        dispose();
    }//GEN-LAST:event_CancelaExcEquipActionPerformed

    private void ConfirmaExcEquipActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaExcEquipActionPerformed
        try {
            // Click no Botão Sim:
            EquipamentoBanco.remove(e);
            dispose();
            JOptionPane.showMessageDialog(null, "Equipamento Excluido com Sucesso!!!");
            
            ope.Limpar();            
        } catch (Exception ex) {
            Logger.getLogger(ExcEquipAlerta.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }//GEN-LAST:event_ConfirmaExcEquipActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        nomeEditEquip1.setText(e.getNome());
        statusEditEquip1.setText(e.getStatus());
        pEditEquip1.setDate(e.getP_manutencao());
        uEditEquip1.setDate(e.getU_manutencao());

    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelaExcEquip;
    private javax.swing.JButton ConfirmaExcEquip;
    private javax.swing.JLabel FabricanteExcEquip;
    private javax.swing.JLabel ManuCadEquip;
    private javax.swing.JLabel ManuCadEquip1;
    private javax.swing.JLabel NomeExcEquip;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel nomeEditEquip1;
    private com.toedter.calendar.JDateChooser pEditEquip1;
    private javax.swing.JLabel statusEditEquip1;
    private com.toedter.calendar.JDateChooser uEditEquip1;
    // End of variables declaration//GEN-END:variables
}
