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
public class EditAgenServAlerta extends javax.swing.JFrame {
    OpAgenServicos oas;
    Agendamento agendamento_antigo;
    Agendamento agendamento_novo;

    public EditAgenServAlerta(Agendamento agendamento_antigo, Agendamento agendamento_novo, OpAgenServicos oas) {
        this.oas = oas;
        this.agendamento_antigo = agendamento_antigo;
        this.agendamento_novo = agendamento_novo;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo = new javax.swing.JLabel();
        ConfirmaExcAgenServ = new javax.swing.JButton();
        CancelaExcAgenServ = new javax.swing.JButton();
        NomeExcAgenServ = new javax.swing.JLabel();
        nomeSolicitador = new javax.swing.JLabel();
        cpfSolicitador = new javax.swing.JLabel();
        ObjExcAgenServ = new javax.swing.JLabel();
        DataExcAgenServ = new javax.swing.JLabel();
        dataServico = new javax.swing.JLabel();
        horaServico = new javax.swing.JLabel();
        HoraExcAgenServ = new javax.swing.JLabel();
        SetaEditAlun = new javax.swing.JLabel();
        NomeExcAgenServ1 = new javax.swing.JLabel();
        nomeSolicitador1 = new javax.swing.JLabel();
        cpfSolicitador1 = new javax.swing.JLabel();
        ObjExcAgenServ1 = new javax.swing.JLabel();
        DataExcAgenServ1 = new javax.swing.JLabel();
        dataServico1 = new javax.swing.JLabel();
        horaServico1 = new javax.swing.JLabel();
        HoraExcAgenServ1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Titulo.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Titulo.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo.setText("Editar o Serviço: ");
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

        NomeExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NomeExcAgenServ.setText("Solicitador:");
        NomeExcAgenServ.setToolTipText("");

        nomeSolicitador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeSolicitador.setText("???");

        cpfSolicitador.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cpfSolicitador.setText("???");

        ObjExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ObjExcAgenServ.setText("CPF:");
        ObjExcAgenServ.setToolTipText("");

        DataExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        DataExcAgenServ.setText("Data:");
        DataExcAgenServ.setToolTipText("");

        dataServico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dataServico.setText("???");

        horaServico.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        horaServico.setText("???");

        HoraExcAgenServ.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        HoraExcAgenServ.setText("Hora:");
        HoraExcAgenServ.setToolTipText("");

        SetaEditAlun.setFont(new java.awt.Font("Dialog", 1, 55)); // NOI18N
        SetaEditAlun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SetaEditAlun.setText("→");

        NomeExcAgenServ1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NomeExcAgenServ1.setText("Solicitador:");
        NomeExcAgenServ1.setToolTipText("");

        nomeSolicitador1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeSolicitador1.setText("???");

        cpfSolicitador1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cpfSolicitador1.setText("???");

        ObjExcAgenServ1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ObjExcAgenServ1.setText("CPF:");
        ObjExcAgenServ1.setToolTipText("");

        DataExcAgenServ1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        DataExcAgenServ1.setText("Data:");
        DataExcAgenServ1.setToolTipText("");

        dataServico1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        dataServico1.setText("???");

        horaServico1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        horaServico1.setText("???");

        HoraExcAgenServ1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        HoraExcAgenServ1.setText("Hora:");
        HoraExcAgenServ1.setToolTipText("");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(NomeExcAgenServ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(nomeSolicitador, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(53, 53, 53)
                                .addComponent(ObjExcAgenServ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cpfSolicitador, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(DataExcAgenServ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(dataServico, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(45, 45, 45)
                                .addComponent(HoraExcAgenServ)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(horaServico, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(SetaEditAlun)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(123, 123, 123)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(NomeExcAgenServ1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(nomeSolicitador1, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(53, 53, 53)
                                        .addComponent(ObjExcAgenServ1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cpfSolicitador1, javax.swing.GroupLayout.PREFERRED_SIZE, 128, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(DataExcAgenServ1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(dataServico1, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(HoraExcAgenServ1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(horaServico1, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(179, 179, 179)
                        .addComponent(Titulo, javax.swing.GroupLayout.PREFERRED_SIZE, 216, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(131, 131, 131)
                        .addComponent(ConfirmaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(32, 32, 32)
                        .addComponent(CancelaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addComponent(Titulo)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addComponent(SetaEditAlun)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
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
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(HoraExcAgenServ)
                                    .addComponent(horaServico))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(NomeExcAgenServ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(nomeSolicitador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(cpfSolicitador1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(ObjExcAgenServ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(dataServico1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(DataExcAgenServ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(6, 6, 6)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(HoraExcAgenServ1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(2, 2, 2)
                                        .addComponent(horaServico1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                                .addGap(54, 54, 54)))))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelaExcAgenServ, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(96, 96, 96))
        );

        setSize(new java.awt.Dimension(616, 370));
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
            adao.altera(agendamento_antigo, agendamento_novo);
            
            dispose();
            JOptionPane.showMessageDialog(null, "Agendamento alterado com sucesso");
            oas.Limpar();
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "Não foi possível alterar o agendamento");
        }
    }//GEN-LAST:event_ConfirmaExcAgenServActionPerformed

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        nomeSolicitador.setText(agendamento_antigo.getAluno().getNome());
        cpfSolicitador.setText(agendamento_antigo.getAluno().getCPF());
        dataServico.setText(new SimpleDateFormat("dd/MM/yyyy").format(agendamento_antigo.getData_hora()));
        horaServico.setText(new SimpleDateFormat("HH:mm").format(agendamento_antigo.getData_hora()));
        
        nomeSolicitador1.setText(agendamento_novo.getAluno().getNome());
        cpfSolicitador1.setText(agendamento_novo.getAluno().getCPF());
        dataServico1.setText(new SimpleDateFormat("dd/MM/yyyy").format(agendamento_novo.getData_hora()));
        horaServico1.setText(new SimpleDateFormat("HH:mm").format(agendamento_novo.getData_hora()));

    }//GEN-LAST:event_formWindowOpened

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CancelaExcAgenServ;
    private javax.swing.JButton ConfirmaExcAgenServ;
    private javax.swing.JLabel DataExcAgenServ;
    private javax.swing.JLabel DataExcAgenServ1;
    private javax.swing.JLabel HoraExcAgenServ;
    private javax.swing.JLabel HoraExcAgenServ1;
    private javax.swing.JLabel NomeExcAgenServ;
    private javax.swing.JLabel NomeExcAgenServ1;
    private javax.swing.JLabel ObjExcAgenServ;
    private javax.swing.JLabel ObjExcAgenServ1;
    private javax.swing.JLabel SetaEditAlun;
    private javax.swing.JLabel Titulo;
    private javax.swing.JLabel cpfSolicitador;
    private javax.swing.JLabel cpfSolicitador1;
    private javax.swing.JLabel dataServico;
    private javax.swing.JLabel dataServico1;
    private javax.swing.JLabel horaServico;
    private javax.swing.JLabel horaServico1;
    private javax.swing.JLabel nomeSolicitador;
    private javax.swing.JLabel nomeSolicitador1;
    // End of variables declaration//GEN-END:variables
}
