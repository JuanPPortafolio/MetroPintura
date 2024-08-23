
package com.mycompany.views;

import com.mycompany.tesis.conexion;
import java.text.DecimalFormat;  
import com.mycompany.tesis.pdf;
import java.awt.Color;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

public class Ventas extends javax.swing.JPanel { 
    
    boolean uwu= true;
    String MalditoDesgraciado, CorazonDeMiVida;
    public static int row;
    private static final DecimalFormat decfor = new DecimalFormat("0.00");  
    public static String consulta;
    Double PutoInutil= 0.00, PerraMoribunda=0.00;
    conexion con =  new conexion();
    Connection conexion = con.conectar();
    
    
    
    public Ventas() {
        initComponents();
        initStyles();
        BSR.setForeground(Color.BLACK);
        FAC.setForeground(Color.BLACK);
        AGG.setForeground(Color.BLACK);
        mostrar("INVENTARIO");
    }

private void initStyles(){
    
}    

private String Fecha(){
    String Ayuda;
     Date f = new Date();
     DateFormat a = new SimpleDateFormat("dd/MM/yyyy");
     Ayuda=(a.format(f).toString());
     return (Ayuda).toString();
 }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        BSR = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        NOM = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        DIR = new javax.swing.JTextField();
        jScrollPane1 = new javax.swing.JScrollPane();
        Factura = new javax.swing.JTable();
        jLabel4 = new javax.swing.JLabel();
        BS = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        Dolar = new javax.swing.JTextField();
        CH = new javax.swing.JCheckBox();
        DESC = new javax.swing.JTextField();
        FAC = new javax.swing.JButton();
        CI = new javax.swing.JTextField();
        EA = new javax.swing.JComboBox<>();
        ComboPro = new javax.swing.JComboBox<>();
        Cantidad = new javax.swing.JTextField();
        AGG = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();

        setPreferredSize(new java.awt.Dimension(750, 429));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        jLabel1.setText("Cedula:");

        BSR.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        BSR.setText("Buscar");
        BSR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSRActionPerformed(evt);
            }
        });

        jLabel2.setText("Nombre:");

        NOM.setEnabled(false);

        jLabel3.setText("Dirección:");

        DIR.setEnabled(false);
        DIR.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DIRActionPerformed(evt);
            }
        });

        Factura.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        Factura.setEnabled(false);
        jScrollPane1.setViewportView(Factura);

        jLabel4.setText("Productos:");

        BS.setEnabled(false);
        BS.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                BSActionPerformed(evt);
            }
        });

        jLabel5.setText("Precio (BS):");

        jLabel6.setText("Precio ($):");

        Dolar.setEnabled(false);
        Dolar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                DolarActionPerformed(evt);
            }
        });

        CH.setText("Descuento");
        CH.setEnabled(false);

        DESC.setEnabled(false);

        FAC.setText("Mostrar factura");
        FAC.setEnabled(false);
        FAC.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                FACActionPerformed(evt);
            }
        });

        EA.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { " ", "V-", "E-", "J-" }));

        ComboPro.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", " " }));
        ComboPro.setEnabled(false);
        ComboPro.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ComboProActionPerformed(evt);
            }
        });

        Cantidad.setEnabled(false);
        Cantidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CantidadActionPerformed(evt);
            }
        });
        Cantidad.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                CantidadKeyTyped(evt);
            }
        });

        AGG.setText("Agregar");
        AGG.setEnabled(false);
        AGG.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                AGGActionPerformed(evt);
            }
        });

        jLabel7.setText("Nombre del Producto");

        jLabel8.setText("Cantidad");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(62, 62, 62)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(CH)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(DESC, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel5)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(BS, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jLabel6)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(Dolar, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(ComboPro, javax.swing.GroupLayout.PREFERRED_SIZE, 189, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(51, 51, 51)
                                .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(AGG))
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 828, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 48, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(EA, javax.swing.GroupLayout.PREFERRED_SIZE, 55, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(CI, javax.swing.GroupLayout.PREFERRED_SIZE, 127, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jLabel7)
                                        .addGap(117, 117, 117))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(82, 82, 82)
                                        .addComponent(BSR, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel3)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel8)
                                    .addComponent(DIR, javax.swing.GroupLayout.PREFERRED_SIZE, 160, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(411, 411, 411)
                        .addComponent(FAC)))
                .addContainerGap(93, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(NOM, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(DIR, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3))
                        .addGap(12, 12, 12)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(Cantidad, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(AGG)
                                    .addComponent(ComboPro, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(12, 12, 12)
                                .addComponent(jLabel4))))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(CI, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(EA, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(BSR)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 322, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 49, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(BS, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(Dolar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(CH)
                    .addComponent(DESC, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(FAC)
                .addContainerGap(50, Short.MAX_VALUE))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void ComboProActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ComboProActionPerformed
        
    }//GEN-LAST:event_ComboProActionPerformed
   
    
    private void BSRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSRActionPerformed
        Function f = new Function();
        ResultSet rs = null;
        String A,B,C;
        C=EA.getSelectedItem().toString()+CI.getText();
        rs = f.find(C);
        try {
            if(rs.next()){
                NOM.setText(rs.getString("Nombre Completo"));
                DIR.setText(rs.getString("Direccion"));
                Habilitar();
            } else {
                JOptionPane.showMessageDialog(null, "Cliente no encontrado");
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, e);
        }
        
        
    }//GEN-LAST:event_BSRActionPerformed

 public void Habilitar(){
     ComboPro.setEnabled(true);
     Cantidad.setEnabled(true);
     AGG.setEnabled(true);
     Factura.setEnabled(true);
     DESC.setEnabled(true);
     CH.setEnabled(true);
     FAC.setEnabled(true);
 }
    
public class Function{
    conexion con =  new conexion();
    Connection conexion = con.conectar();
    ResultSet rs = null;
    PreparedStatement sp = null;
    public ResultSet find(String s){
        try {
            sp = conexion.prepareStatement("SELECT * FROM CLIENTES WHERE CI = ?");
            sp.setString(1,s);
            rs = sp.executeQuery();
            
        } catch (SQLException B) {
            JOptionPane.showMessageDialog(null, B);
        }
        return rs;
    }
}

    
    private void CantidadKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_CantidadKeyTyped
        int key = evt.getKeyChar();
        boolean numeros = key >= 48 && key <= 57;
        if(!numeros){
            evt.consume();
        }
    }//GEN-LAST:event_CantidadKeyTyped

    private void AGGActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_AGGActionPerformed
        int CA;
        double C1=0.00;
        String C2,C4;
        C2=Fecha().toString();
        C4=EA.getSelectedItem().toString()+CI.getText().toString();
        CA=(int) Float.parseFloat(Cantidad.getText());
        Statement st;
        Statement st2;
        conexion con =  new conexion();
        Connection conexion = con.conectar();
        if (CA>0){
            if(uwu){
                try {
                    PreparedStatement pps = conexion.prepareStatement("INSERT INTO Factura (`Fecha`,`Monto total`,`Cliente`) VALUES (?,?,?);");
                    pps.setString(1, C2);
                    pps.setDouble(2,C1);
                    pps.setString(3, C4);
                    pps.executeUpdate();
                    uwu = false;
                } catch (SQLException ex) {
                    JOptionPane.showMessageDialog(null, "Error " + ex.toString());
                }
            }
            try {
                st= conexion.createStatement();
                st2= conexion.createStatement();
                ResultSet C3 = st.executeQuery("SELECT ID from factura order by ID desc limit 1");
                C3.next();
                String c3t = C3.getString(1);
                ResultSet Matame = st2.executeQuery("SELECT `Precio del Producto` FROM INVENTARIO where `ID Producto` = " + (ComboPro.getSelectedIndex()+1) +" limit 1");
                Matame.next();
                String Suicidate = Matame.getString(1);
                PreparedStatement sst = conexion.prepareStatement("INSERT INTO detalle_factura (`ID Factura`,`ID Producto`,`Cantidad`,`Precio`) VALUES " + "("+(c3t+',' + (ComboPro.getSelectedIndex()+1) + ',' + CA + ','+ Suicidate+");"));
                System.out.println(sst);
                sst.executeUpdate();
                PutoInutil=PutoInutil+(Double.parseDouble(Suicidate)*CA);
                MalditoDesgraciado= decfor.format(PutoInutil);
                PerraMoribunda=PutoInutil*40;
                CorazonDeMiVida= decfor.format(PerraMoribunda);
                Dolar.setText(MalditoDesgraciado);
                BS.setText(CorazonDeMiVida);
            } catch (SQLException ex) {
                JOptionPane.showMessageDialog(null, "Error " + ex.toString());
            }
            try {
                st= conexion.createStatement();
                ResultSet C3 = st.executeQuery("SELECT ID from factura order by ID desc limit 1");
                C3.next();
                String c3t = C3.getString(1);
            Mostrar1("detalle_factura",c3t);
            } catch (SQLException ex) {
                Logger.getLogger(Ventas.class.getName()).log(Level.SEVERE, null, ex);
            }
        } else if (Cantidad.toString()== " "){
            JOptionPane.showMessageDialog(null, "Por favor agregue la cantidad del producto");
        }
    }//GEN-LAST:event_AGGActionPerformed

    private void CantidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CantidadActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_CantidadActionPerformed

    private void DolarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DolarActionPerformed
       
    }//GEN-LAST:event_DolarActionPerformed

    private void DIRActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_DIRActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_DIRActionPerformed

    private void BSActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_BSActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_BSActionPerformed

    private void FACActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_FACActionPerformed
            int i;
            String CR= EA.getSelectedItem()+CI.getText();
            try {
                Statement sql = conexion.createStatement();
                ResultSet eb= sql.executeQuery("SELECT ID from factura order by ID desc limit 1");
                eb.next();
                String ar= eb.getString(1);
                consulta = "select Fecha,`Monto total`,Cliente from Factura where ID = " + ar;
                ResultSet resultadofac = sql.executeQuery(consulta);
                while (resultadofac.next()) {
                    Statement sql1 = conexion.createStatement();
                    consulta = "SELECT `Nombre Completo`,Celular,Direccion FROM Clientes WHERE CI = '" + CR + "'";
                    ResultSet resultadopro = sql1.executeQuery(consulta);  
                    
                    while (resultadopro.next()) {                        
                        System.out.println("hey");
                    Map<String, Map<Object, Object>> res = Map.of(
                            "Factura", Map.of(
                                    "Numero", ar,
                                    "dia", resultadofac.getString(1).substring(0, 2),
                                    "mes", resultadofac.getString(1).substring(3, 5),
                                    "ano", resultadofac.getString(1).substring(8, 10)
                            ), 
                            "Proveedor", Map.of(
                                    "Nombre", resultadopro.getString(1),
                                    "Rif", CR,
                                    "direccion", resultadopro.getString(3),
                                    "telefono", resultadopro.getString(2)
                            ),
                            "Productos", new HashMap<>()
                            
                    );
                    try {
                    System.out.println("hey");
                    Statement sql2 = conexion.createStatement();
                    consulta = """
                      SELECT 
                          \tdf.`Nombre del Producto`,
                          \td.`Cantidad`,
                          \tdf.`Precio del Producto`
                      FROM
                          \tdetalle_factura d
                      JOIN 
                          \tinventario df ON d.`ID Producto` = df.`ID Producto`
                      WHERE
                          \td.`ID factura` = """ + ar +""" 
                      \tLIMIT 14;""";
                    ResultSet resultadodet = sql2.executeQuery(consulta);
                    
                    i = 0;
                        while (resultadodet.next()) { 
                            Map<String, String> producto = new HashMap<>(); // Crea un mapa para cada producto
                            producto.put("cantidad", resultadodet.getString(2));
                            producto.put("descripcion", resultadodet.getString(1));
                            producto.put("precio", resultadodet.getString(3));
                            res.get("Productos").put(i, producto);
                            i++;
                        }
                            for (int j = i; j < 14; j++) {
                                Map<String, String> producto = new HashMap<>(); // Crea un mapa para cada producto
                            producto.put("cantidad", "\n");
                            producto.put("descripcion", "\n");
                            producto.put("precio", "\n");
                            res.get("Productos").put(j, producto);
                            }
                    System.out.println(res.toString());
                    pdf.crear(res);
                        } catch (SQLException e) {
                            JOptionPane.showMessageDialog(null, e);
                        }
                    }
                }

            } catch (SQLException e) {
                
                            JOptionPane.showMessageDialog(null, e);
            }
    }//GEN-LAST:event_FACActionPerformed

    public void Mostrar1(String tabla,String IDFactura){
        String sql = "SELECT INVENTARIO.`Nombre del Producto`,detalle_factura.Cantidad, detalle_factura.Precio FROM INVENTARIO, detalle_factura where detalle_factura.`ID Factura` = "  + IDFactura + " and INVENTARIO.`ID Producto` = detalle_factura.`ID Producto`";
        Statement st;
        conexion con =  new conexion();
        Connection conexion = con.conectar();
        DefaultTableModel model = new DefaultTableModel();
        model.addColumn("Nombre Producto");
        model.addColumn("Cantidad");
        model.addColumn("Precio");
        Factura.setModel(model);
        String [] datos = new String[5];
        try{
            st = conexion.createStatement();
            ResultSet rs = st.executeQuery(sql);
            while (rs.next()){
                datos[0]=rs.getString(1);
                datos[1]=rs.getString(2);
                datos[2]=rs.getString(3);
                model.addRow(datos);
            } 
        }catch(SQLException e){
                    JOptionPane.showMessageDialog(null, "Error " + e.toString());
                    }        
    }
    
    public void mostrar(String tabla){
        String sql = "SELECT `Nombre del Producto` FROM " + tabla;
        Statement st;
        conexion con =  new conexion();
        Connection conexion = con.conectar();
        DefaultComboBoxModel model = new DefaultComboBoxModel();
        ComboPro.setModel(model);
        try {
        st = conexion.createStatement();
        ResultSet rs = st.executeQuery(sql);
        while(rs.next()){
           ComboPro.addItem(rs.getString(1));
        }
        } catch (SQLException e) {
            JOptionPane.showMessageDialog(null, "Error " + e.toString());
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton AGG;
    private javax.swing.JTextField BS;
    public static javax.swing.JButton BSR;
    private javax.swing.JCheckBox CH;
    private javax.swing.JTextField CI;
    private javax.swing.JTextField Cantidad;
    private javax.swing.JComboBox<String> ComboPro;
    private javax.swing.JTextField DESC;
    private javax.swing.JTextField DIR;
    private javax.swing.JTextField Dolar;
    private javax.swing.JComboBox<String> EA;
    private javax.swing.JButton FAC;
    private javax.swing.JTable Factura;
    private javax.swing.JTextField NOM;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    // End of variables declaration//GEN-END:variables
}
