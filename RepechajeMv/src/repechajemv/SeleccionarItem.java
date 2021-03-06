/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package repechajemv;

import Clases.Carta;
import Clases.Mesa;
import com.sun.xml.internal.ws.api.streaming.XMLStreamReaderFactory;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTable;

/**
 *
 * @author TOSHIBA
 */
public class SeleccionarItem extends javax.swing.JFrame {

    /**
     * Creates new form SeleccionarItem
     */
    Connection cnx;
    RegistrarPedido rp = null;
    ActualizarPedido aP = null;
    
    ArrayList<String> codigos = new ArrayList();
    ArrayList<String> tipos = new ArrayList();
    ArrayList<String> descripciones = new ArrayList();
    ArrayList<String> cantidad = new ArrayList();
    
    ArrayList<Object[]> entradas = new ArrayList();
    ArrayList<Object[]> menuDia = new ArrayList();
    ArrayList<Object[]> bebidas = new ArrayList();
    ArrayList<Object[]> extras = new ArrayList();
    ArrayList<Object[]> adicionales = new ArrayList();
        
    public SeleccionarItem(Connection cnx,RegistrarPedido rp) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Seleccionar Item");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.cnx = cnx;
        this.rp = rp;
        llenarTablas();
    }
    
    public SeleccionarItem(Connection cnx,ActualizarPedido aP) {
        initComponents();
        this.setLocationRelativeTo(null);
        this.setTitle("Seleccionar Item");
        this.setDefaultCloseOperation(JFrame.DO_NOTHING_ON_CLOSE);
        this.cnx = cnx;
        this.aP = aP;
        llenarTablas();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanel1 = new javax.swing.JPanel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tbEntradas = new javax.swing.JTable();
        pMenuDia = new javax.swing.JPanel();
        jScrollPane3 = new javax.swing.JScrollPane();
        tbMenuDia = new javax.swing.JTable();
        pExtras = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        tbExtras = new javax.swing.JTable();
        pAdicionales = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        tbAdicionales = new javax.swing.JTable();
        pBebidas = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tbBebidas = new javax.swing.JTable();
        bCancelar = new javax.swing.JButton();
        bAceptar = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setResizable(false);

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder("Entradas"));

        tbEntradas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane2.setViewportView(tbEntradas);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pMenuDia.setBorder(javax.swing.BorderFactory.createTitledBorder("Menú del Día"));

        tbMenuDia.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane3.setViewportView(tbMenuDia);

        javax.swing.GroupLayout pMenuDiaLayout = new javax.swing.GroupLayout(pMenuDia);
        pMenuDia.setLayout(pMenuDiaLayout);
        pMenuDiaLayout.setHorizontalGroup(
            pMenuDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pMenuDiaLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );
        pMenuDiaLayout.setVerticalGroup(
            pMenuDiaLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pMenuDiaLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pExtras.setBorder(javax.swing.BorderFactory.createTitledBorder("Extras"));

        tbExtras.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane5.setViewportView(tbExtras);

        javax.swing.GroupLayout pExtrasLayout = new javax.swing.GroupLayout(pExtras);
        pExtras.setLayout(pExtrasLayout);
        pExtrasLayout.setHorizontalGroup(
            pExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExtrasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pExtrasLayout.setVerticalGroup(
            pExtrasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pExtrasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 208, Short.MAX_VALUE)
                .addGap(15, 15, 15))
        );

        pAdicionales.setBorder(javax.swing.BorderFactory.createTitledBorder("Adicionales"));

        tbAdicionales.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane4.setViewportView(tbAdicionales);

        javax.swing.GroupLayout pAdicionalesLayout = new javax.swing.GroupLayout(pAdicionales);
        pAdicionales.setLayout(pAdicionalesLayout);
        pAdicionalesLayout.setHorizontalGroup(
            pAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pAdicionalesLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pAdicionalesLayout.setVerticalGroup(
            pAdicionalesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pAdicionalesLayout.createSequentialGroup()
                .addContainerGap(15, Short.MAX_VALUE)
                .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(15, 15, 15))
        );

        pBebidas.setBorder(javax.swing.BorderFactory.createTitledBorder("Bebidas"));

        tbBebidas.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {},
                {},
                {},
                {}
            },
            new String [] {

            }
        ));
        jScrollPane1.setViewportView(tbBebidas);

        javax.swing.GroupLayout pBebidasLayout = new javax.swing.GroupLayout(pBebidas);
        pBebidas.setLayout(pBebidasLayout);
        pBebidasLayout.setHorizontalGroup(
            pBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBebidasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 317, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );
        pBebidasLayout.setVerticalGroup(
            pBebidasLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pBebidasLayout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 208, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(15, Short.MAX_VALUE))
        );

        bCancelar.setText("Cancelar");
        bCancelar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bCancelarActionPerformed(evt);
            }
        });

        bAceptar.setText("Aceptar");
        bAceptar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bAceptarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pAdicionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pMenuDia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(201, 201, 201)
                        .addComponent(bCancelar)
                        .addGap(18, 18, 18)
                        .addComponent(bAceptar))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(pBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(15, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(15, 15, 15)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(pMenuDia, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(pExtras, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(pAdicionales, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(pBebidas, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(101, 101, 101)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(bCancelar)
                            .addComponent(bAceptar))))
                .addContainerGap(15, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bCancelarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bCancelarActionPerformed
        // TODO add your handling code here:
        this.dispose();
    }//GEN-LAST:event_bCancelarActionPerformed

    private void bAceptarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bAceptarActionPerformed
        // TODO add your handling code here:
        detallePedido(tbEntradas,tbEntradas.getColumnCount()-1,entradas);
        detallePedido(tbMenuDia,tbMenuDia.getColumnCount()-1,menuDia);
        detallePedido(tbBebidas,tbBebidas.getColumnCount()-1,bebidas);
        detallePedido(tbExtras,tbExtras.getColumnCount()-1,extras);
        detallePedido(tbAdicionales,tbAdicionales.getColumnCount()-1,adicionales);
        
        if(aP==null){
            rp.llenarTabla(codigos, tipos, descripciones, cantidad);
        }
        else{
            aP.AgregarItem(codigos, tipos, descripciones, cantidad);
        }
        this.dispose();
        
    }//GEN-LAST:event_bAceptarActionPerformed

    public void detallePedido(JTable tabla,int nroColumnas,ArrayList<Object[]> arrayObj){
        for(int i = 0;i<tabla.getRowCount();i++){
            if(Integer.valueOf(String.valueOf(tabla.getValueAt(i, nroColumnas)))>0){
                //System.out.println("hola");
                for (Object[] aO1 : arrayObj) {
                    if(aO1[1].equals(tabla.getValueAt(i, 0))){
                        //System.out.println("hola");
                        codigos.add(String.valueOf(aO1[0]));
                        tipos.add(String.valueOf(aO1[2]));
                        descripciones.add(String.valueOf(aO1[1]));
                        cantidad.add(String.valueOf(tabla.getValueAt(i, nroColumnas)));
                    }
                }
            }
        }
    }
    
    public void objTablas(Object[][] obj ,ArrayList<Object[]> lisObj){
        
        for(int i=0;i<lisObj.size();i++){    
                obj[i][0]=lisObj.get(i)[1];
                obj[i][1]=lisObj.get(i)[3];
                obj[i][2]=lisObj.get(i)[4];
                obj[i][3]=0;
         }
    }
    
    public void llenarTablas(){
        
        String sql = "SELECT * FROM carta Where fecha = curdate();";
        Carta c = null;
        ResultSet rs = null;
        Statement st;
        try {
            st = cnx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                c = new Carta(rs.getString(1),rs.getString(2));
            }
            
        } catch (SQLException ex) {
            Logger.getLogger(SeleccionarItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        sql = "SELECT i.idItem,i.nombre,i.tipo,i.precio,dc.cantidad "
                + "FROM detallecarta AS dc I"
                + "NNER JOIN item AS i "
                + "ON dc.idItem = i.idItem WHERE idCarta = "
                + c.getIdCarta();     
        
        String[] columnas = new String[]{"Nombre","Precio","Disponible","Pedir"};
        String[] columnasE = new String[]{"Nombre","Disponible","Pedir"};
        
        final Class[] tiposColumnas = new Class[]{
            java.lang.String.class,
            java.lang.String.class,
            java.lang.String.class,
            java.lang.String.class 
        };
        
        try {
            st = cnx.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
                Object [] item = new Object[5]; 
                item[0] = rs.getInt(1); //item
                item[1] = rs.getString(2); //nombre
                item[2] = rs.getString(3); //tipo
                item[3] = rs.getString(4); //precio
                item[4] = rs.getString(5); //cantidad
                
                if(item[2].equals("En")){
                    entradas.add(item);
                }
                else{
                    if(item[2].equals("Md")){
                        menuDia.add(item);
                    }
                    else{
                        if(item[2].equals("Be")){
                            bebidas.add(item);
                        }
                        else{
                            if(item[2].equals("Ex")){
                                extras.add(item);
                            }
                            else{
                                adicionales.add(item);
                            }
                        }
                    }
                }    
            }
            
            Object[][] tEntradas = new Object[entradas.size()][4];
            Object[][] tMenuDia = new Object[menuDia.size()][4];
            Object[][] tBebidas = new Object[bebidas.size()][4];
            Object[][] tExtras = new Object[extras.size()][4];
            Object[][] tAdicionales = new Object[adicionales.size()][4];
            
            for(int i=0;i<entradas.size();i++){    
                tEntradas[i][0]=entradas.get(i)[1];
                tEntradas[i][1]=entradas.get(i)[4];
                tEntradas[i][2]=0;
            }
            
            objTablas(tMenuDia,menuDia);
            objTablas(tBebidas,bebidas);
            objTablas(tExtras,extras);
            objTablas(tAdicionales,adicionales);
            
            tbEntradas.setModel(new javax.swing.table.DefaultTableModel(tEntradas,columnasE ){
            // Esta variable nos permite conocer de antemano los tipos de datos de cada columna, dentro del TableModel
                Class[] tipos = tiposColumnas;
                @Override
                public Class getColumnClass(int columnIndex) {
                    return tipos[columnIndex];
                }
            });
            
            tbMenuDia.setModel(new javax.swing.table.DefaultTableModel(tMenuDia,columnas ){
            // Esta variable nos permite conocer de antemano los tipos de datos de cada columna, dentro del TableModel
                Class[] tipos = tiposColumnas;
                @Override
                public Class getColumnClass(int columnIndex) {
                    return tipos[columnIndex];
                }
            });
            
            tbBebidas.setModel(new javax.swing.table.DefaultTableModel(tBebidas,columnas ){
            // Esta variable nos permite conocer de antemano los tipos de datos de cada columna, dentro del TableModel
                Class[] tipos = tiposColumnas;
                @Override
                public Class getColumnClass(int columnIndex) {
                    return tipos[columnIndex];
                }
            });
            
            tbExtras.setModel(new javax.swing.table.DefaultTableModel(tExtras,columnas ){
            // Esta variable nos permite conocer de antemano los tipos de datos de cada columna, dentro del TableModel
                Class[] tipos = tiposColumnas;
                @Override
                public Class getColumnClass(int columnIndex) {
                    return tipos[columnIndex];
                }
            });
            
            tbAdicionales.setModel(new javax.swing.table.DefaultTableModel(tAdicionales,columnas ){
            // Esta variable nos permite conocer de antemano los tipos de datos de cada columna, dentro del TableModel
                Class[] tipos = tiposColumnas;
                @Override
                public Class getColumnClass(int columnIndex) {
                    return tipos[columnIndex];
                }
            });
            
            
        } catch (SQLException ex) {
            Logger.getLogger(SeleccionarItem.class.getName()).log(Level.SEVERE, null, ex);
        }
        
    }
    
    /**
     * @param args the command line arguments
     *//*
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
/*        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(SeleccionarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(SeleccionarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(SeleccionarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(SeleccionarItem.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form *//*
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new SeleccionarItem().setVisible(true);
            }
        });
    }*/

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bAceptar;
    private javax.swing.JButton bCancelar;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JPanel pAdicionales;
    private javax.swing.JPanel pBebidas;
    private javax.swing.JPanel pExtras;
    private javax.swing.JPanel pMenuDia;
    private javax.swing.JTable tbAdicionales;
    private javax.swing.JTable tbBebidas;
    private javax.swing.JTable tbEntradas;
    private javax.swing.JTable tbExtras;
    private javax.swing.JTable tbMenuDia;
    // End of variables declaration//GEN-END:variables
}
