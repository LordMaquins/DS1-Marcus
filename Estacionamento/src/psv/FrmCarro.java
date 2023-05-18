package psv;

import javax.swing.table.*;
import java.sql.*;
import java.util.*;
import javax.swing.JOptionPane;

public class FrmCarro extends javax.swing.JFrame {

    public FrmCarro() {
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        txtField = new javax.swing.JLabel();
        txtField2 = new javax.swing.JLabel();
        txtField3 = new javax.swing.JLabel();
        lblMensagem = new javax.swing.JLabel();
        txtPlaca = new javax.swing.JTextField();
        txtCor = new javax.swing.JTextField();
        txtDescricao = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblConsulta = new javax.swing.JTable();
        btnIncluir = new javax.swing.JButton();
        btnAlterar = new javax.swing.JButton();
        btnExcluir = new javax.swing.JButton();
        btnPesquisar = new javax.swing.JButton();
        btnLimpar = new javax.swing.JButton();
        btnFechar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        txtChassi = new javax.swing.JTextField();
        txtModelo = new javax.swing.JTextField();
        txtCalota = new javax.swing.JTextField();
        txtNomeMotorista = new javax.swing.JTextField();
        txtNumeroVaga = new javax.swing.JTextField();
        txtHorario = new javax.swing.JTextField();
        txtEstofado = new javax.swing.JTextField();
        txtTipo = new javax.swing.JTextField();
        txtMarca = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtField.setText("Placa");

        txtField2.setText("Cor");

        txtField3.setText("Descricao");

        lblMensagem.setText("Mensagem");

        txtPlaca.setText(" ");

        txtCor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtCorActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 580, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 57, Short.MAX_VALUE)
        );

        tblConsulta.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Placa", "Cor", "Chassi", "Marca", "Modelo", "Calota", "NomeMotorista", "Descricao", "NumeroVaga", "Horario", "Estofado", "Tipo"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tblConsulta.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblConsultaMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblConsulta);
        if (tblConsulta.getColumnModel().getColumnCount() > 0) {
            tblConsulta.getColumnModel().getColumn(0).setResizable(false);
            tblConsulta.getColumnModel().getColumn(1).setResizable(false);
            tblConsulta.getColumnModel().getColumn(2).setResizable(false);
        }

        btnIncluir.setText("Incluir");
        btnIncluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnIncluirMouseClicked(evt);
            }
        });
        btnIncluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnIncluirActionPerformed(evt);
            }
        });

        btnAlterar.setText("Alterar");
        btnAlterar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnAlterarMouseClicked(evt);
            }
        });
        btnAlterar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAlterarActionPerformed(evt);
            }
        });

        btnExcluir.setText("Excluir");
        btnExcluir.setToolTipText("");
        btnExcluir.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnExcluirMouseClicked(evt);
            }
        });
        btnExcluir.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnExcluirActionPerformed(evt);
            }
        });

        btnPesquisar.setText("Pesquisar");
        btnPesquisar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnPesquisarMouseClicked(evt);
            }
        });
        btnPesquisar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPesquisarActionPerformed(evt);
            }
        });

        btnLimpar.setText("Limpar");
        btnLimpar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnLimparMouseClicked(evt);
            }
        });
        btnLimpar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLimparActionPerformed(evt);
            }
        });

        btnFechar.setText("Fechar");
        btnFechar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                btnFecharMouseClicked(evt);
            }
        });
        btnFechar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnFecharActionPerformed(evt);
            }
        });

        jLabel1.setText("Chassi");

        jLabel2.setText("Marca");

        jLabel3.setText("Modelo");

        jLabel4.setText("Calota");

        jLabel5.setText("NomeMotorista");

        jLabel6.setText("NumeroVaga");

        jLabel7.setText("Horario");

        jLabel8.setText("Estofado");

        jLabel9.setText("Tipo");

        txtChassi.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtChassiActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(43, 43, 43)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(txtCalota, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(txtModelo)
                                    .addComponent(txtMarca, javax.swing.GroupLayout.Alignment.TRAILING))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtNomeMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, 163, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(jLabel6)
                                        .addGap(13, 13, 13))
                                    .addComponent(btnIncluir))
                                .addComponent(txtField3)
                                .addComponent(jLabel7))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(lblMensagem)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel8))
                                .addGap(23, 23, 23)))
                        .addGap(23, 23, 23)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtDescricao, javax.swing.GroupLayout.DEFAULT_SIZE, 165, Short.MAX_VALUE)
                                .addComponent(txtNumeroVaga)
                                .addComponent(txtHorario)
                                .addComponent(txtEstofado)
                                .addComponent(txtTipo))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnAlterar)
                                .addGap(18, 18, 18)
                                .addComponent(btnExcluir)
                                .addGap(18, 18, 18)
                                .addComponent(btnPesquisar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(btnLimpar)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(btnFechar))))
                    .addComponent(jLabel2)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addComponent(txtField)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtField2)
                                .addComponent(jLabel1))
                            .addGap(56, 56, 56)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(txtChassi)))))
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jScrollPane1))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField)
                    .addComponent(txtPlaca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField2)
                    .addComponent(txtCor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(txtChassi, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel3)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel4)
                                    .addComponent(txtCalota, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                                .addGap(0, 28, Short.MAX_VALUE)
                                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(12, 12, 12)
                        .addComponent(txtMarca, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(txtModelo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtNomeMotorista, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtField3)
                    .addComponent(txtDescricao, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtNumeroVaga, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addGap(16, 16, 16)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(txtHorario, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtEstofado, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(24, 24, 24)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addComponent(lblMensagem)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnIncluir)
                    .addComponent(btnAlterar)
                    .addComponent(btnExcluir)
                    .addComponent(btnPesquisar)
                    .addComponent(btnLimpar)
                    .addComponent(btnFechar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 61, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(19, 19, 19))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    private void txtCorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtCorActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtCorActionPerformed

    private void btnIncluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnIncluirActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnIncluirActionPerformed

    private void btnFecharActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnFecharActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnFecharActionPerformed

    private void btnFecharMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnFecharMouseClicked
        // TODO add your handling code here:
        System.exit(0);
    }//GEN-LAST:event_btnFecharMouseClicked

    private void btnLimparMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnLimparMouseClicked
        // TODO add your handling code here:
        txtPlaca.setText("");
        txtCor.setText("");
        txtChassi.setText("");
        txtMarca.setText("");
        txtModelo.setText("");
        txtCalota.setText("");
        txtNomeMotorista.setText("");
        txtDescricao.setText("");
        txtNumeroVaga.setText("");
        txtHorario.setText("");
        txtEstofado.setText("");
        txtTipo.setText("");
        txtDescricao.setText("");
        lblMensagem.setText("");

        DefaultTableModel tbm
                = (DefaultTableModel) tblConsulta.getModel();
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }
    }//GEN-LAST:event_btnLimparMouseClicked

    private void btnPesquisarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPesquisarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnPesquisarActionPerformed

    private void tblConsultaMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblConsultaMouseClicked

        Integer linha = tblConsulta.getSelectedRow();
        String placa = (String) tblConsulta.getValueAt(linha, 0);
        String cor = (String) tblConsulta.getValueAt(linha, 1);
        String chassi = (String) tblConsulta.getValueAt(linha, 1);
        String marca = (String) tblConsulta.getValueAt(linha, 1);
        String modelo = (String) tblConsulta.getValueAt(linha, 1);
        String calota = (String) tblConsulta.getValueAt(linha, 1);
        String nomeMotorista = (String) tblConsulta.getValueAt(linha, 1);
        String descricao = (String) tblConsulta.getValueAt(linha, 1);
        String NumeroVaga = (String) tblConsulta.getValueAt(linha, 1);
        String horario = (String) tblConsulta.getValueAt(linha, 1);
        String estofado = (String) tblConsulta.getValueAt(linha, 1);
        String tipo = (String) tblConsulta.getValueAt(linha, 1);
        txtPlaca.setText(placa);
        txtCor.setText(cor);
        txtChassi.setText(chassi);
        txtMarca.setText(marca);
        txtModelo.setText(modelo);
        txtCalota.setText(calota);
        txtNomeMotorista.setText(nomeMotorista);
        txtDescricao.setText(descricao);
        txtNumeroVaga.setText(NumeroVaga);
        txtHorario.setText(horario);
        txtEstofado.setText(estofado);
        txtTipo.setText(tipo);
    }//GEN-LAST:event_tblConsultaMouseClicked

    private void btnAlterarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnAlterarMouseClicked

        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        cb.setPlaca(txtPlaca.getText());
        cb.setCor(txtCor.getText());
        cb.setDescricao(txtChassi.getText());
        cb.setDescricao(txtMarca.getText());
        cb.setDescricao(txtModelo.getText());
        cb.setDescricao(txtCalota.getText());
        cb.setDescricao(txtNomeMotorista.getText());
        cb.setDescricao(txtDescricao.getText());
        cb.setDescricao(txtNumeroVaga.getText());
        cb.setDescricao(txtHorario.getText());
        cb.setDescricao(txtEstofado.getText());
        cb.setDescricao(txtTipo.getText());
        Conexao.FecharConexao(con);
    }//GEN-LAST:event_btnAlterarMouseClicked

    private void btnAlterarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAlterarActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnAlterarActionPerformed

    private void btnExcluirActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnExcluirActionPerformed
        // TODO add your handling code here:

    }//GEN-LAST:event_btnExcluirActionPerformed

    private void btnIncluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnIncluirMouseClicked

        Connection con = Conexao.abrirConexao();
        CarroBean cb = new CarroBean();
        CarroDAO cd = new CarroDAO(con);
        cb.setPlaca(txtPlaca.getText());
        cb.setCor(txtCor.getText());
        cb.setDescricao(txtChassi.getText());
        cb.setDescricao(txtMarca.getText());
        cb.setDescricao(txtModelo.getText());
        cb.setDescricao(txtCalota.getText());
        cb.setDescricao(txtNomeMotorista.getText());
        cb.setDescricao(txtDescricao.getText());
        cb.setDescricao(txtNumeroVaga.getText());
        cb.setDescricao(txtHorario.getText());
        cb.setDescricao(txtEstofado.getText());
        cb.setDescricao(txtTipo.getText());
        lblMensagem.setText(cd.inserir(cb));
        Conexao.FecharConexao(con);


    }//GEN-LAST:event_btnIncluirMouseClicked

    private void btnLimparActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLimparActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btnLimparActionPerformed

    private void btnExcluirMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnExcluirMouseClicked
        // TODO add your handling code here:
    }//GEN-LAST:event_btnExcluirMouseClicked

    private void btnPesquisarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btnPesquisarMouseClicked

        Connection con = Conexao.abrirConexao();
        CarroDAO cd = new CarroDAO(con);
        List<CarroBean> listaCarro = new ArrayList<CarroBean>();
        listaCarro = cd.listarTodos();
        DefaultTableModel tbm
                = (DefaultTableModel) tblConsulta.getModel();
        for (int i = tbm.getRowCount() - 1; i >= 0; i--) {
            tbm.removeRow(i);
        }
        int i = 0;
        for (CarroBean cb : listaCarro) {
            tbm.addRow(new String[1]);
            tblConsulta.setValueAt(cb.getPlaca(), i, 0);
            tblConsulta.setValueAt(cb.getCor(), i, 1);
            tblConsulta.setValueAt(cb.getChassi(), i, 2);
            tblConsulta.setValueAt(cb.getMarca(), i, 3);
            tblConsulta.setValueAt(cb.getModelo(), i, 4);
            tblConsulta.setValueAt(cb.getCalota(), i, 5);
            tblConsulta.setValueAt(cb.getNomeMotorista(), i, 6);
            tblConsulta.setValueAt(cb.getDescricao(), i, 7);
            tblConsulta.setValueAt(cb.getNumeroVaga(), i, 8);
            tblConsulta.setValueAt(cb.getHorario(), i, 9);
            tblConsulta.setValueAt(cb.getEstofado(), i, 10);
            tblConsulta.setValueAt(cb.getTipo(), i, 11);
            i++;
        }
        Conexao.FecharConexao(con);


    }//GEN-LAST:event_btnPesquisarMouseClicked

    private void txtChassiActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtChassiActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtChassiActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(FrmCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmCarro.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new FrmCarro().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAlterar;
    private javax.swing.JButton btnExcluir;
    private javax.swing.JButton btnFechar;
    private javax.swing.JButton btnIncluir;
    private javax.swing.JButton btnLimpar;
    private javax.swing.JButton btnPesquisar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblMensagem;
    private javax.swing.JTable tblConsulta;
    private javax.swing.JTextField txtCalota;
    private javax.swing.JTextField txtChassi;
    private javax.swing.JTextField txtCor;
    private javax.swing.JTextField txtDescricao;
    private javax.swing.JTextField txtEstofado;
    private javax.swing.JLabel txtField;
    private javax.swing.JLabel txtField2;
    private javax.swing.JLabel txtField3;
    private javax.swing.JTextField txtHorario;
    private javax.swing.JTextField txtMarca;
    private javax.swing.JTextField txtModelo;
    private javax.swing.JTextField txtNomeMotorista;
    private javax.swing.JTextField txtNumeroVaga;
    private javax.swing.JTextField txtPlaca;
    private javax.swing.JTextField txtTipo;
    // End of variables declaration//GEN-END:variables
}
