/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pruebabd;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class regPersonas extends javax.swing.JFrame {
    
    

    /**
     * Creates new form regUsuario
     */
    public regPersonas() {
        initComponents();
        this.setLocationRelativeTo(null);
    }
    ConexionBD2 con = new ConexionBD2();
    Connection cn = con.conexion1();
    
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        lbl_apellido = new javax.swing.JLabel();
        lbl_direccion = new javax.swing.JLabel();
        lbl_correo = new javax.swing.JLabel();
        lbl_telefono = new javax.swing.JLabel();
        lbl_nombre = new javax.swing.JLabel();
        txt_apellido = new javax.swing.JTextField();
        txt_direccion = new javax.swing.JTextField();
        txt_correo = new javax.swing.JTextField();
        txt_telefono = new javax.swing.JTextField();
        txt_nombre = new javax.swing.JTextField();
        btn_guardar = new javax.swing.JButton();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Usuarios");
        setAlwaysOnTop(true);
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_apellido.setForeground(new java.awt.Color(255, 255, 255));
        lbl_apellido.setText("Apellido:");
        getContentPane().add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 110, -1, -1));

        lbl_direccion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_direccion.setText("Direccion");
        getContentPane().add(lbl_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 150, -1, -1));

        lbl_correo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_correo.setText("Correo");
        getContentPane().add(lbl_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 190, -1, -1));

        lbl_telefono.setForeground(new java.awt.Color(255, 255, 255));
        lbl_telefono.setText("Telefono: ");
        getContentPane().add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 230, -1, -1));

        lbl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setText("Nombre: ");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(40, 70, -1, -1));

        txt_apellido.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_apellidoActionPerformed(evt);
            }
        });
        txt_apellido.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_apellidoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 110, 270, -1));

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 150, 270, -1));
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 190, 270, -1));

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 230, 180, -1));

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(230, 70, 270, -1));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 280, 230, 40));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azules-14.jpg"))); // NOI18N
        lbl_fondo.setLabelFor(lbl_fondo);
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 630, 340));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void txt_direccionActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_direccionActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_direccionActionPerformed

    private void txt_nombreKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_nombreKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' '))evt.consume();
    }//GEN-LAST:event_txt_nombreKeyTyped

    private void txt_telefonoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_telefonoKeyTyped
        char c = evt.getKeyChar();
        if((c<'0' || c>'9')) evt.consume();
    }//GEN-LAST:event_txt_telefonoKeyTyped

    private void btn_guardarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_guardarActionPerformed
        String texto1, texto2, texto3, texto4, texto5;
        
        texto1 = txt_nombre.getText();
        texto2 = txt_apellido.getText();
        texto3 = txt_direccion.getText();
        texto4 = txt_correo.getText();
        texto5 = txt_telefono.getText();
        if(txt_nombre.getText().equals("") || txt_apellido.getText().equals("") || txt_direccion.getText().equals("") || txt_correo.getText().equals("") || txt_telefono.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos","AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
        }else{
            try{
                /*Statement st = cn.createStatement();
                st.executeUpdate("INSERT INTO clientes VALUES('"+texto1+"','"+texto2+"','"+texto3+"','"+texto4+"','"+texto5+"')");
                    */
                PreparedStatement pps = cn.prepareStatement("INSERT INTO personas(nom_persona,ape_persona,dir_persona,corr_persona,tel_persona) VALUES(?,?,?,?,?)");
                    pps.setString(1,texto1);
                    pps.setString(2,texto2);
                    pps.setString(3,texto3);
                    pps.setString(4,texto4);
                    pps.setString(5,texto5);
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Datos Guardados");
                    pps.close();
                    cn.close();
        
            }catch(SQLException e){
                System.out.println("Error de SQL"+e);
            }
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' '))evt.consume();
    }//GEN-LAST:event_txt_apellidoKeyTyped

    /**
     * @param args the command line arguments
     * @throws java.lang.ClassNotFoundException
     */
    public static void main(String args[]) throws ClassNotFoundException {
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
            java.util.logging.Logger.getLogger(regPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(regPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(regPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(regPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new regPersonas().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}