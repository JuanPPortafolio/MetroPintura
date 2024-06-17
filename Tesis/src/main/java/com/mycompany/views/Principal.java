
package com.mycompany.views;

import java.awt.Color;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.Timer;


public class Principal extends javax.swing.JPanel {


    public Principal() {
        initComponents();
        initStyles();
        Fecha();
        Hora();
    }
    
     private void Fecha(){
     Date f = new Date();
     DateFormat a = new SimpleDateFormat("dd/MM/yyyy");
     Date.setText(a.format(f));
 }
     
 private void Hora(){
        new Timer(0,new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                Date d= new Date();
                SimpleDateFormat s = new SimpleDateFormat("HH:mm:ss");
                Hour.setText(s.format(d));
            }
        }).start();
    }

     private void initStyles(){
     Bienvenido.putClientProperty("FlatLaf.style", "font: 20 $light.font");
     Bienvenido.setForeground(Color.black);
     Hora.putClientProperty("FlatLaf.style", "font: 16 $light.font");
     Hora.setForeground(Color.black);
     Fecha.putClientProperty("FlatLaf.style", "font: 16 $light.font");
     Fecha.setForeground(Color.black);
     Date.putClientProperty("FlatLaf.style", "font: 16 $light.font");
     Date.setForeground(Color.black);
     Hour.putClientProperty("FlatLaf.style", "font: 16 $light.font");
     Hour.setForeground(Color.black);
     Precio.putClientProperty("FlatLaf.style", "font: 16 $light.font");
     Precio.setForeground(Color.black);
     Dolar.putClientProperty("FlatLaf.style", "font: 16 $light.font");
     Dolar.setForeground(Color.black);
     R.putClientProperty("FlatLaf.style", "font: 16 $light.font");
     R.setForeground(Color.black);
 }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        BG = new javax.swing.JPanel();
        Bienvenido = new javax.swing.JLabel();
        Hour = new javax.swing.JLabel();
        Hora = new javax.swing.JLabel();
        Fecha = new javax.swing.JLabel();
        Date = new javax.swing.JLabel();
        Precio = new javax.swing.JLabel();
        Dolar = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        R = new javax.swing.JLabel();

        BG.setPreferredSize(new java.awt.Dimension(1020, 640));

        Bienvenido.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        Bienvenido.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Bienvenido.setText("¡Bienvenido usuario!");

        Hour.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Hour.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hour.setText("APM");

        Hora.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Hora.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Hora.setText("Hora:");

        Fecha.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Fecha.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Fecha.setText("Fecha:");

        Date.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Date.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Date.setText("Date");

        Precio.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Precio.setText("Precio del dolar (BCV):");

        Dolar.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        Dolar.setText("jLabel11");

        jPanel1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0)));
        jPanel1.setPreferredSize(new java.awt.Dimension(742, 387));

        jScrollPane1.setBorder(null);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        jScrollPane1.setViewportView(jTable1);

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 740, Short.MAX_VALUE)
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 385, Short.MAX_VALUE)
        );

        R.setText("Registros recientes:");

        javax.swing.GroupLayout BGLayout = new javax.swing.GroupLayout(BG);
        BG.setLayout(BGLayout);
        BGLayout.setHorizontalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addGap(37, 37, 37)
                .addComponent(Fecha, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Date, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(R)
                .addGap(144, 144, 144)
                .addComponent(Hora, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Hour, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(BGLayout.createSequentialGroup()
                        .addComponent(Precio, javax.swing.GroupLayout.PREFERRED_SIZE, 164, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Dolar)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, BGLayout.createSequentialGroup()
                        .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(38, 38, 38))))
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(218, 218, 218)
                .addComponent(Bienvenido, javax.swing.GroupLayout.PREFERRED_SIZE, 286, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        BGLayout.setVerticalGroup(
            BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(BGLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addComponent(Bienvenido)
                .addGap(18, 18, 18)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Hora)
                    .addComponent(Hour)
                    .addComponent(Fecha)
                    .addComponent(Date)
                    .addComponent(R))
                .addGap(18, 18, 18)
                .addComponent(jPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(29, 29, 29)
                .addGroup(BGLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Precio)
                    .addComponent(Dolar))
                .addContainerGap(36, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 750, Short.MAX_VALUE)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(BG, javax.swing.GroupLayout.PREFERRED_SIZE, 429, Short.MAX_VALUE)
        );
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JPanel BG;
    private javax.swing.JLabel Bienvenido;
    private javax.swing.JLabel Date;
    private javax.swing.JLabel Dolar;
    private javax.swing.JLabel Fecha;
    private javax.swing.JLabel Hora;
    private javax.swing.JLabel Hour;
    private javax.swing.JLabel Precio;
    private javax.swing.JLabel R;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables
}
