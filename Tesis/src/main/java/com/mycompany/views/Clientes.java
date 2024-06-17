
package com.mycompany.views;

import com.mycompany.tesis.conexion;
import com.mysql.jdbc.CallableStatement;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class Clientes extends javax.swing.JPanel {

conexion con =  new conexion();
Connection conexion = con.conectar();
    
    public Clientes() {
        initComponents();
        mostrar("Clientes");
        initStyle();
    }
    
    private void initStyle(){
     Cliente.putClientProperty("FlatLaf.style", "font: 24 $light.font");
     Cliente.setForeground(Color.black);
     Guardar.putClientProperty("JButton.buttonType", "roundRect");
     Editar.putClientProperty("JButton.buttonType", "roundRect");
     Guardar.putClientProperty("FlatLaf.style", "font: 15 $light.font");
     Guardar.setForeground(Color.black);
     Editar.putClientProperty("FlatLaf.style", "font: 15 $light.font");
     Editar.setForeground(Color.black);
     Cancelar.putClientProperty("JButton.buttonType", "roundRect");
     Cancelar.putClientProperty("FlatLaf.style", "font: 15 $light.font");
     Cancelar.setForeground(Color.black);
     jButton1.putClientProperty("JButton.buttonType", "roundRect");
     jButton1.putClientProperty("FlatLaf.style", "font: 15 $light.font");
     jButton1.setForeground(Color.black);
    }
    
    public void mostrar(String tabla){
        String sql = "SELECT * FROM " + tabla;
        Statement st;
        conexion con =  new conexion();
        Connection conexion = con.conectar();
        System.out.println(sql);
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cedula");
        model.addColumn("Nombre Completo");
        model.addColumn("Número telefonico");
        model.addColumn("Cliente Especial");
        TBCliente.setModel(model);
        
        String [] datos = new String[4];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                model.addRow(datos);
            } 
        }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Error " + e.toString());
                    }
         
    }

    public void Cancelar(){
        NOM.setEnabled(false);
        CI.setEnabled(false);
        Numero.setEnabled(false);
        Editar.setEnabled(false);
        Guardar.setEnabled(false);
        Cancelar.setEnabled(false);
        jCheckBox1.setEnabled(false);
        Editar.setEnabled(false);
        NOM.setText("");
        CI.setText("");
        Numero.setText("");
        jCheckBox1.setSelected(false);
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        TBCliente = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        Cliente = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        NOM = new javax.swing.JTextField();
        CI = new javax.swing.JTextField();
        Numero = new javax.swing.JTextField();
        Guardar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Editar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();

        jPanel1.addContainerListener(new java.awt.event.ContainerAdapter() {
            public void componentAdded(java.awt.event.ContainerEvent evt) {
                jPanel1ComponentAdded(evt);
            }
        });
        jPanel1.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusGained(java.awt.event.FocusEvent evt) {
                jPanel1FocusGained(evt);
            }
        });

        jScrollPane1.setBorder(javax.swing.BorderFactory.createTitledBorder("Clientes"));

        TBCliente.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        TBCliente.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        TBCliente.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        TBCliente.setFocusable(false);
        TBCliente.setShowHorizontalLines(true);
        TBCliente.setShowVerticalLines(true);
        TBCliente.getTableHeader().setResizingAllowed(false);
        TBCliente.getTableHeader().setReorderingAllowed(false);
        TBCliente.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                TBClienteMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(TBCliente);

        jButton1.setText("Cliente nuevo");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        Cliente.setText("Registro de Clientes");

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Datos del Cliente"));

        NOM.setEnabled(false);

        CI.setEnabled(false);

        Numero.setEnabled(false);

        Guardar.setText("Guardar");
        Guardar.setEnabled(false);
        Guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                GuardarActionPerformed(evt);
            }
        });

        Cancelar.setText("Cancelar");
        Cancelar.setEnabled(false);
        Cancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CancelarActionPerformed(evt);
            }
        });

        jLabel1.setText("Nombre Completo:");

        jLabel2.setText("Cedula:");

        jLabel3.setText("Numero telefonico:");

        Editar.setText("Editar");
        Editar.setEnabled(false);
        Editar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                EditarActionPerformed(evt);
            }
        });

        jCheckBox1.setEnabled(false);

        jLabel4.setText("Cliente especial:");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Guardar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 15, Short.MAX_VALUE)
                .addComponent(Editar)
                .addGap(18, 18, 18)
                .addComponent(Cancelar))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel4)
                        .addGap(18, 18, 18)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                        .addComponent(NOM, javax.swing.GroupLayout.DEFAULT_SIZE, 119, Short.MAX_VALUE)
                        .addComponent(CI)
                        .addComponent(Numero, javax.swing.GroupLayout.Alignment.LEADING)))
                .addGap(14, 14, 14))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addGap(55, 55, 55)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(CI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addGap(49, 49, 49)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jCheckBox1)
                    .addComponent(jLabel4))
                .addGap(60, 60, 60)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Guardar)
                    .addComponent(Cancelar)
                    .addComponent(Editar))
                .addGap(51, 51, 51))
        );

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(231, 231, 231)
                        .addComponent(Cliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(5, 5, 5)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 472, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(0, 32, Short.MAX_VALUE))
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(261, 261, 261)
                .addComponent(jButton1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap(36, Short.MAX_VALUE)
                .addComponent(Cliente)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 462, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(48, 48, 48))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(57, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NOM.setEnabled(true);
        CI.setEnabled(true);
        Numero.setEnabled(true);
        Guardar.setEnabled(true);
        Cancelar.setEnabled(true);
        jCheckBox1.setEnabled(true);
        Editar.setEnabled(false);
        jCheckBox1.setSelected(false);
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jPanel1FocusGained(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_jPanel1FocusGained
    this.repaint();
    }//GEN-LAST:event_jPanel1FocusGained

    private void jPanel1ComponentAdded(java.awt.event.ContainerEvent evt) {//GEN-FIRST:event_jPanel1ComponentAdded
     
    }//GEN-LAST:event_jPanel1ComponentAdded

    private void GuardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_GuardarActionPerformed
        String a="",C1,C2,C3;
        C1=CI.getText();
        C2=NOM.getText();
        C3=Numero.getText();
        if(this.jCheckBox1.isSelected()){
            a="Si";
        }else if (this.jCheckBox1.isSelected() == false){
            a="No";

        }if(C1.equals("") || C2.equals("") || C3.equals("") ){
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los espacios");
        } else {
            try {
            PreparedStatement pps = conexion.prepareStatement("INSERT INTO Clientes (CI,`Nombre Completo`,`Celular`,`Cliente Especial`) VALUES (?,?,?,?);");
            pps.setString(1,C1);
            pps.setString(2,C2);
            pps.setString(3,C3);
            pps.setString(4,a);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡Cliente agregado!");
            NOM.setEnabled(false);
            CI.setEnabled(false);
            Numero.setEnabled(false);
            Guardar.setEnabled(false);
            Cancelar.setEnabled(false);
            jCheckBox1.setEnabled(false);
            Editar.setEnabled(false);
            NOM.setText("");
            CI.setText("");
            Numero.setText("");
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Cliente_E.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        String A,B,C;
        A=NOM.getText();
        B=Numero.getText();
        C=CI.getText();
        String consulta = "UPDATE Clientes set Clientes.`Nombre Completo` = ?, Clientes.`Celular` = ? WHERE Clientes.CI = ?;";
        
        try {
            java.sql.CallableStatement pps = conexion.prepareCall(consulta);
            pps.setString(1, A);
            pps.setString(2, B);
            pps.setString(3, C);
            pps.execute();
            JOptionPane.showMessageDialog(null, "Cliente actualizado");
            Cancelar();
        } catch (Exception e){
            JOptionPane.showMessageDialog(null, "No se puedo actualizar el cliente");
            Cancelar();
        }
        
        
    }//GEN-LAST:event_EditarActionPerformed

    private void CancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CancelarActionPerformed
        Cancelar();
        
    }//GEN-LAST:event_CancelarActionPerformed

    private void TBClienteMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_TBClienteMouseClicked
        NOM.setEnabled(true);
        CI.setEnabled(false);
        Numero.setEnabled(true);
        Editar.setEnabled(true);
        Guardar.setEnabled(false);
        Cancelar.setEnabled(true);
        try {
            int fila = TBCliente.getSelectedRow();
            
            if (fila>=0){
                CI.setText((TBCliente.getValueAt(fila, 0).toString()));
                NOM.setText((TBCliente.getValueAt(fila, 1).toString()));
                Numero.setText((TBCliente.getValueAt(fila, 2).toString()));
            }
            else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TBClienteMouseClicked


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JTextField CI;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Cliente;
    public javax.swing.JButton Editar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField NOM;
    private javax.swing.JTextField Numero;
    private javax.swing.JTable TBCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
