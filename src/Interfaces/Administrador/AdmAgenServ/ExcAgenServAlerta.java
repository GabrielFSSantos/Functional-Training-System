package Interfaces.Administrador.AdmAgenServ;

import java.text.SimpleDateFormat;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objetos.Agendamento;
import objetos_dao.AgendamentoDAO;

/**
 *
 * @author GabrielFelipe
 */
public class ExcAgenServAlerta extends javax.swing.JFrame {
    OpAgenServicos oas;
    Agendamento agendamento;

    public ExcAgenServAlerta(Agendamento agendamento, OpAgenServicos oas) {
        this.oas = oas;
        this.agendamento = agendamento;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        NomeExcAgenServ = new javax.swing.JLabel();
        nomeSolicitador = new javax.swing.JLabel();
        ObjExcAgenServ = new javax.swing.JLabel();
        cpfSolicitador = new javax.swing.JLabel();
        DataExcAgenServ = new javax.swing.JLabel();
        dataServico = new javax.swing.JLabel();
        HoraExcAgenServ = new javax.swing.JLabel();
        horaServico = new javax.swing.JLabel();
        ConfirmaExcAgenServ = new javax.swing.JButton();
        CancelaExcAgenServ = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Excluir o Serviço: ");
        Titulo.setToolTipText("");

        NomeExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NomeExcAgenServ.setText("Solicitador:");
        NomeExcAgenServ.setToolTipText("");

        nomeSolicitador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeSolicitador.setText("???");

        ObjExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ObjExcAgenServ.setText("CPF:");
        ObjExcAgenServ.setToolTipText("");

        cpfSolicitador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cpfSolicitador.setText("???");

        DataExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        DataExcAgenServ.setText("Data:");
        DataExcAgenServ.setToolTipText("");

        dataServico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dataServico.setText("???");

        HoraExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        HoraExcAgenServ.setText("Hora:");
        HoraExcAgenServ.setToolTipText("");

        horaServico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        horaServico.setText("???");

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

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 359, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ObjExcAgenServ)
                                .addGap(18, 18, 18)
                                .addComponent(cpfSolicitador, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(DataExcAgenServ)
                                .addGap(18, 18, 18)
                                .addComponent(dataServico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(HoraExcAgenServ)
                                .addGap(18, 18, 18)
                                .addComponent(horaServico, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap())
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(48, 48, 48)
                                .addComponent(NomeExcAgenServ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeSolicitador, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(ConfirmaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(CancelaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(13, 13, 13)
                .addComponent(Titulo)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NomeExcAgenServ)
                    .addComponent(nomeSolicitador))
                .addGap(6, 6, 6)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cpfSolicitador)
                    .addComponent(ObjExcAgenServ))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(dataServico)
                    .addComponent(DataExcAgenServ))
                .addGap(7, 7, 7)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(horaServico)
                    .addComponent(HoraExcAgenServ))
                .addGap(94, 94, 94)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)))
        );

        setSize(new java.awt.Dimension(372, 370));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    // Botoões de Ações
    private void CancelaExcAgenServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaExcAgenServActionPerformed
        // Click no Botão Cancelar:

        dispose();

    }//GEN-LAST:event_CancelaExcAgenServActionPerformed

    private void ConfirmaExcAgenServActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaExcAgenServActionPerformed
        try {
            AgendamentoDAO adao = new AgendamentoDAO();
            adao.remove(agendamento);
            oas.Limpar();
            dispose();
            JOptionPane.showMessageDialog(null, "Agendamento excluído com sucesso");
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível excluir o agendamento");
        }

    }//GEN-LAST:event_ConfirmaExcAgenServActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        nomeSolicitador.setText(agendamento.getAluno().getNome());
        cpfSolicitador.setText(agendamento.getAluno().getCPF());
        dataServico.setText(new SimpleDateFormat("dd/MM/yyyy").format(agendamento.getData_hora()));
        horaServico.setText(new SimpleDateFormat("HH:mm").format(agendamento.getData_hora()));
       

    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelaExcAgenServ;
    private javax.swing.JButton ConfirmaExcAgenServ;
    private javax.swing.JLabel DataExcAgenServ;
    private javax.swing.JLabel HoraExcAgenServ;
    private javax.swing.JLabel NomeExcAgenServ;
    private javax.swing.JLabel ObjExcAgenServ;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel cpfSolicitador;
    private javax.swing.JLabel dataServico;
    private javax.swing.JLabel horaServico;
    private javax.swing.JLabel nomeSolicitador;
    // End of variables declaration//GEN-END:variables
}
