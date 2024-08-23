
package com.mycompany.views;

import com.mycompany.tesis.conexion;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
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
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Cedula");
        model.addColumn("Nombre Completo");
        model.addColumn("Nro Telefonico");
        model.addColumn("Direccion");
        model.addColumn("Cliente Especial");
        TBCliente.setModel(model);
        
        String [] datos = new String[5];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                datos[3]=rs.getString(4);
                datos[4]=rs.getString(5);
                model.addRow(datos);
            } 
        }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Error " + e.toString());
                    }
         
    }

    public void Cancelar(){
        NOM.setEnabled(false);
        CI.setEnabled(false);
        CCI.setEnabled(false);
        Numero.setEnabled(false);
        DIR.setEnabled(false);
        Editar.setEnabled(false);
        Guardar.setEnabled(false);
        Cancelar.setEnabled(false);
        jCheckBox1.setEnabled(false);
        Editar.setEnabled(false);
        NOM.setText("");
        CI.setText("");
        Numero.setText("");
        DIR.setText("");
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
        Guardar = new javax.swing.JButton();
        Cancelar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        Editar = new javax.swing.JButton();
        jCheckBox1 = new javax.swing.JCheckBox();
        jLabel4 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        DIR = new javax.swing.JTextField();
        CCI = new javax.swing.JComboBox<>();
        Numero = new javax.swing.JFormattedTextField();

        jPanel1.setPreferredSize(new java.awt.Dimension(1000, 734));
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
        jScrollPane1.setPreferredSize(new java.awt.Dimension(1000, 423));

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
        TBCliente.setRowHeight(30);
        TBCliente.setRowMargin(8);
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
        CI.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CIActionPerformed(evt);
            }
        });

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

        jLabel2.setText("CI/RIF:");

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

        jLabel6.setText("Dirección:");

        DIR.setEnabled(false);

        CCI.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "V-", "J-", "E-" }));
        CCI.setEnabled(false);

        try {
            Numero.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.MaskFormatter("####-#######")));
        } catch (java.text.ParseException ex) {
            ex.printStackTrace();
        }
        Numero.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(Guardar)
                .addGap(18, 18, 18)
                .addComponent(Editar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 30, Short.MAX_VALUE)
                .addComponent(Cancelar))
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 103, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel3)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(CCI, javax.swing.GroupLayout.PREFERRED_SIZE, 57, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)))
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(CI)
                    .addComponent(NOM)
                    .addComponent(Numero, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(DIR)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(jCheckBox1)
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(CI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CCI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3)
                    .addComponent(Numero, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(DIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel4)
                    .addComponent(jCheckBox1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
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
                        .addGap(11, 11, 11)
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 710, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(Cliente))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(431, 431, 431)
                        .addComponent(jButton1)))
                .addContainerGap(26, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addComponent(Cliente)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 453, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(165, 165, 165))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, 1031, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        NOM.setEnabled(true);
        CI.setEnabled(true);
        CCI.setEnabled(true);
        DIR.setEnabled(true);
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
        String a="",C1,C2,C4,C5,C6,C7;
        C1=CI.getText();
        C6=CCI.getSelectedItem().toString();
        C7=C6+C1;
        C2=NOM.getText();
        C4=Numero.getText();
        C5=DIR.getText();
        if(this.jCheckBox1.isSelected()){
            a="Si";
        }else if (this.jCheckBox1.isSelected() == false){
            a="No";

        }if(C1.equals("") || C2.equals("") || C5.equals("") ){
            JOptionPane.showMessageDialog(null, "Por favor rellene todos los espacios");
        } else {
            try {
            PreparedStatement pps = conexion.prepareStatement("INSERT INTO Clientes (CI,`Nombre Completo`,`Celular`,`Direccion`,`Cliente Especial`) VALUES (?,?,?,?,?);");
            pps.setString(1,C7);
            pps.setString(2,C2);
            pps.setString(3,C4);
            pps.setString(4,C5);
            pps.setString(5,a);
            pps.executeUpdate();
            JOptionPane.showMessageDialog(null, "¡Cliente agregado!");
            NOM.setEnabled(false);
            CI.setEnabled(false);
            Numero.setEnabled(false);
            DIR.setEnabled(false);
            Guardar.setEnabled(false);
            Cancelar.setEnabled(false);
            jCheckBox1.setEnabled(false);
            Editar.setEnabled(false);
            NOM.setText("");
            CI.setText("");
            Numero.setText("");
            mostrar("Clientes");
        } catch (SQLException ex) {
            Logger.getLogger(Agregar_Cliente_E.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }//GEN-LAST:event_GuardarActionPerformed

    private void EditarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_EditarActionPerformed
        String A,B,C,D,F,G;
        A=NOM.getText();
        B=Numero.getText();
        C=DIR.getText();
        D=CI.getText();
        System.out.println(D);
        String consulta =  "UPDATE Clientes set Clientes.`Nombre Completo` = ?,Clientes.`Celular` = ?,Clientes.`Direccion`= ? WHERE Clientes.CI = ?;";
//"UPDATE Clientes set Clientes.`Nombre Completo` = ?, Clientes.`Celular` = ? WHERE Clientes.CI = ?;";
        
        try {
            java.sql.CallableStatement pps = conexion.prepareCall(consulta);
            pps.setString(1, A);
            pps.setString(2, B);
            pps.setString(3, C);
            pps.setString(4, D);
            pps.execute();
            JOptionPane.showMessageDialog(null, "Cliente actualizado");
            mostrar("Clientes");
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
        CCI.setEnabled(false);
        Numero.setEnabled(true);
        DIR.setEnabled(true);
        Editar.setEnabled(true);
        Guardar.setEnabled(false);
        Cancelar.setEnabled(true);
        try {
            int fila = TBCliente.getSelectedRow();
            
            if (fila>=0){
                CI.setText((TBCliente.getValueAt(fila, 0).toString()));
                NOM.setText((TBCliente.getValueAt(fila, 1).toString()));
                Numero.setText((TBCliente.getValueAt(fila, 2).toString()));
                DIR.setText((String) (TBCliente.getValueAt(fila, 3)));
                
            }
            else {
                JOptionPane.showMessageDialog(null, "Fila no seleccionada");
            }
        } catch (Exception e) {
        }
    }//GEN-LAST:event_TBClienteMouseClicked

    private void CIActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CIActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CIActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> CCI;
    private javax.swing.JTextField CI;
    private javax.swing.JButton Cancelar;
    private javax.swing.JLabel Cliente;
    private javax.swing.JTextField DIR;
    public javax.swing.JButton Editar;
    private javax.swing.JButton Guardar;
    private javax.swing.JTextField NOM;
    private javax.swing.JFormattedTextField Numero;
    private javax.swing.JTable TBCliente;
    private javax.swing.JButton jButton1;
    private javax.swing.JCheckBox jCheckBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
