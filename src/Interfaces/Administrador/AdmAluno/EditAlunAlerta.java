package Interfaces.Administrador.AdmAluno;

import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import objetos.Aluno;
import objetos_dao.AlunoDAO;

/**
 *
 * @author GabrielFelipe
 */
public class EditAlunAlerta extends javax.swing.JFrame {

    AlunoDAO alunoBanco =  new AlunoDAO();
    Aluno aluno_antigo;
    Aluno aluno_novo;
    OpAlunos opa;

    public EditAlunAlerta(Aluno antigo, Aluno novo, OpAlunos opa) {
        aluno_antigo = antigo;
        aluno_novo = novo;
        this.opa = opa;
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Titulo1 = new javax.swing.JLabel();
        NomeEditAlun1 = new javax.swing.JLabel();
        nomeEditAlun1 = new javax.swing.JLabel();
        CPFEditAlun1 = new javax.swing.JLabel();
        cpfEditAlun1 = new javax.swing.JLabel();
        SexoEditAlun1 = new javax.swing.JLabel();
        sexoEditAlun1 = new javax.swing.JLabel();
        NutrEditAlun1 = new javax.swing.JLabel();
        nutrEditAlun1 = new javax.swing.JLabel();
        TelefoneEditAlun1 = new javax.swing.JLabel();
        telefoneEditAlun1 = new javax.swing.JLabel();
        EmailEditAlun1 = new javax.swing.JLabel();
        emailEditAlun1 = new javax.swing.JLabel();
        SetaEditAlun = new javax.swing.JLabel();
        NomeEditAlun2 = new javax.swing.JLabel();
        nomeEditAlun2 = new javax.swing.JLabel();
        CPFEditAlun2 = new javax.swing.JLabel();
        cpfEditAlun2 = new javax.swing.JLabel();
        SexoEditAlun2 = new javax.swing.JLabel();
        sexoEditAlun2 = new javax.swing.JLabel();
        NutrEditAlun2 = new javax.swing.JLabel();
        nutrEditAlun2 = new javax.swing.JLabel();
        TelefoneEditAlun2 = new javax.swing.JLabel();
        telefoneEditAlun2 = new javax.swing.JLabel();
        EmaiEditAlun2 = new javax.swing.JLabel();
        emailEditAlun2 = new javax.swing.JLabel();
        ConfirmaEditAlun = new javax.swing.JButton();
        CancelaEditAlun = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        Titulo1.setFont(new java.awt.Font("Impact", 0, 24)); // NOI18N
        Titulo1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Titulo1.setText("Editar o Funcionário: ");
        Titulo1.setToolTipText("");

        NomeEditAlun1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NomeEditAlun1.setText("Nome:");
        NomeEditAlun1.setToolTipText("");

        nomeEditAlun1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeEditAlun1.setText("???");

        CPFEditAlun1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CPFEditAlun1.setText("CPF:");
        CPFEditAlun1.setToolTipText("");

        cpfEditAlun1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cpfEditAlun1.setText("???");

        SexoEditAlun1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        SexoEditAlun1.setText("Sexo:");
        SexoEditAlun1.setToolTipText("");

        sexoEditAlun1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sexoEditAlun1.setText("???");

        NutrEditAlun1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NutrEditAlun1.setText("Nutricionista:");
        NutrEditAlun1.setToolTipText("");

        nutrEditAlun1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nutrEditAlun1.setText("???");

        TelefoneEditAlun1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TelefoneEditAlun1.setText("Telefone:");
        TelefoneEditAlun1.setToolTipText("");

        telefoneEditAlun1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        telefoneEditAlun1.setText("???");

        EmailEditAlun1.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        EmailEditAlun1.setText("Email:");
        EmailEditAlun1.setToolTipText("");

        emailEditAlun1.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        emailEditAlun1.setText("???");

        SetaEditAlun.setFont(new java.awt.Font("Dialog", 1, 55)); // NOI18N
        SetaEditAlun.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        SetaEditAlun.setText("→");

        NomeEditAlun2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NomeEditAlun2.setText("Nome:");
        NomeEditAlun2.setToolTipText("");

        nomeEditAlun2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nomeEditAlun2.setText("???");

        CPFEditAlun2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CPFEditAlun2.setText("CPF:");
        CPFEditAlun2.setToolTipText("");

        cpfEditAlun2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        cpfEditAlun2.setText("???");

        SexoEditAlun2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        SexoEditAlun2.setText("Sexo:");
        SexoEditAlun2.setToolTipText("");

        sexoEditAlun2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        sexoEditAlun2.setText("???");

        NutrEditAlun2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        NutrEditAlun2.setText("Nutricionista:");
        NutrEditAlun2.setToolTipText("");

        nutrEditAlun2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        nutrEditAlun2.setText("???");

        TelefoneEditAlun2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        TelefoneEditAlun2.setText("Telefone:");
        TelefoneEditAlun2.setToolTipText("");

        telefoneEditAlun2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        telefoneEditAlun2.setText("???");

        EmaiEditAlun2.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        EmaiEditAlun2.setText("Email:");
        EmaiEditAlun2.setToolTipText("");

        emailEditAlun2.setFont(new java.awt.Font("Arial", 0, 18)); // NOI18N
        emailEditAlun2.setText("???");

        ConfirmaEditAlun.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        ConfirmaEditAlun.setText("Sim");
        ConfirmaEditAlun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ConfirmaEditAlunActionPerformed(evt);
            }
        });

        CancelaEditAlun.setFont(new java.awt.Font("Impact", 0, 18)); // NOI18N
        CancelaEditAlun.setText("Cancelar");
        CancelaEditAlun.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelaEditAlunActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Titulo1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGap(16, 16, 16)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(NomeEditAlun1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(nomeEditAlun1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(60, 60, 60))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(60, 60, 60)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(SexoEditAlun1)
                                    .addComponent(CPFEditAlun1))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cpfEditAlun1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(sexoEditAlun1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(24, 24, 24)
                                        .addComponent(EmailEditAlun1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(emailEditAlun1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(TelefoneEditAlun1)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(telefoneEditAlun1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(NutrEditAlun1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(nutrEditAlun1, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(SetaEditAlun)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addComponent(TelefoneEditAlun2)
                            .addGap(12, 12, 12)
                            .addComponent(telefoneEditAlun2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(24, 24, 24)
                            .addComponent(EmaiEditAlun2)
                            .addGap(12, 12, 12)
                            .addComponent(emailEditAlun2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(SexoEditAlun2)
                            .addComponent(CPFEditAlun2)
                            .addComponent(NutrEditAlun2)
                            .addComponent(NomeEditAlun2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cpfEditAlun2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(sexoEditAlun2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nutrEditAlun2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(nomeEditAlun2, javax.swing.GroupLayout.PREFERRED_SIZE, 180, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(18, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(ConfirmaEditAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(32, 32, 32)
                .addComponent(CancelaEditAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 138, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(184, 184, 184))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(Titulo1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomeEditAlun1)
                            .addComponent(nomeEditAlun1))
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(5, 5, 5)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(CPFEditAlun1)
                                    .addComponent(cpfEditAlun1))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(SexoEditAlun1)
                                    .addComponent(sexoEditAlun1))
                                .addGap(7, 7, 7)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(nutrEditAlun1)
                                    .addComponent(NutrEditAlun1)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(12, 12, 12)
                                .addComponent(SetaEditAlun)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(TelefoneEditAlun1)
                            .addComponent(telefoneEditAlun1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(EmailEditAlun1)
                            .addComponent(emailEditAlun1)))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NomeEditAlun2)
                            .addComponent(nomeEditAlun2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CPFEditAlun2)
                            .addComponent(cpfEditAlun2))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(SexoEditAlun2)
                            .addComponent(sexoEditAlun2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NutrEditAlun2)
                            .addComponent(nutrEditAlun2))
                        .addGap(6, 6, 6)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(TelefoneEditAlun2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(2, 2, 2)
                                .addComponent(telefoneEditAlun2)))
                        .addGap(5, 5, 5)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(EmaiEditAlun2)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(emailEditAlun2)))))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(ConfirmaEditAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CancelaEditAlun, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(33, Short.MAX_VALUE))
        );

        setSize(new java.awt.Dimension(696, 369));
        setLocationRelativeTo(null);
    }// </editor-fold>//GEN-END:initComponents

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // Quando Abre a Janela

        //Antes
        nomeEditAlun1.setText(aluno_antigo.getNome());
        cpfEditAlun1.setText(aluno_antigo.getCPF());
        sexoEditAlun1.setText(String.valueOf(aluno_antigo.getSexo()));
        if(aluno_antigo.getNutricionista() == null)
            nutrEditAlun1.setText("");
        else
            nutrEditAlun1.setText(aluno_antigo.getNutricionista().getNome());
        telefoneEditAlun1.setText(aluno_antigo.getTelefone());
        emailEditAlun1.setText(aluno_antigo.getEmail());

        //Depois
        nomeEditAlun2.setText(aluno_novo.getNome());
        cpfEditAlun2.setText(aluno_novo.getCPF());
        sexoEditAlun2.setText(String.valueOf(aluno_novo.getSexo()));
        if(aluno_novo.getNutricionista() == null)
            nutrEditAlun2.setText("");
        else
            nutrEditAlun2.setText(aluno_novo.getNutricionista().getNome());
        telefoneEditAlun2.setText(aluno_novo.getTelefone());
        emailEditAlun2.setText(aluno_novo.getEmail());
       

    }//GEN-LAST:event_formWindowOpened

    private void ConfirmaEditAlunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ConfirmaEditAlunActionPerformed
        try {
            // Click no Botão Sim:
            
            alunoBanco.altera(aluno_novo);
            
            dispose();
            JOptionPane.showMessageDialog(null, "Aluno editado com sucesso");
            opa.Limpar();
        } catch (Exception ex) {
            JOptionPane.showMessageDialog(null, "Não foi possível editar o aluno");
        }
        
    }//GEN-LAST:event_ConfirmaEditAlunActionPerformed

    private void CancelaEditAlunActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelaEditAlunActionPerformed
        // Click no Botão Cancelar:

        dispose();
    }//GEN-LAST:event_CancelaEditAlunActionPerformed
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel CPFEditAlun1;
    private javax.swing.JLabel CPFEditAlun2;
    private javax.swing.JButton CancelaEditAlun;
    private javax.swing.JButton ConfirmaEditAlun;
    private javax.swing.JLabel EmaiEditAlun2;
    private javax.swing.JLabel EmailEditAlun1;
    private javax.swing.JLabel NomeEditAlun1;
    private javax.swing.JLabel NomeEditAlun2;
    private javax.swing.JLabel NutrEditAlun1;
    private javax.swing.JLabel NutrEditAlun2;
    private javax.swing.JLabel SetaEditAlun;
    private javax.swing.JLabel SexoEditAlun1;
    private javax.swing.JLabel SexoEditAlun2;
    private javax.swing.JLabel TelefoneEditAlun1;
    private javax.swing.JLabel TelefoneEditAlun2;
    private javax.swing.JLabel Titulo1;
    private javax.swing.JLabel cpfEditAlun1;
    private javax.swing.JLabel cpfEditAlun2;
    private javax.swing.JLabel emailEditAlun1;
    private javax.swing.JLabel emailEditAlun2;
    private javax.swing.JLabel nomeEditAlun1;
    private javax.swing.JLabel nomeEditAlun2;
    private javax.swing.JLabel nutrEditAlun1;
    private javax.swing.JLabel nutrEditAlun2;
    private javax.swing.JLabel sexoEditAlun1;
    private javax.swing.JLabel sexoEditAlun2;
    private javax.swing.JLabel telefoneEditAlun1;
    private javax.swing.JLabel telefoneEditAlun2;
    // End of variables declaration//GEN-END:variables
}
