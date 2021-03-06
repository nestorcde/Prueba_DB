/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package cl.vista;

import cl.conexion.ConexionBD2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
/**
 *
 * @author user
 */
public class RegPersonas extends javax.swing.JFrame {
    
    

    /**
     * Creates new form regUsuario
     */
    public RegPersonas() {
        initComponents();
        this.setLocationRelativeTo(null);
        limpiar();
        bloquear();
    }
    ConexionBD2 con = new ConexionBD2();
    Connection cn = con.conexion1();
    void limpiar(){
        txt_cedula.setText("");
        txt_nombre.setText("");
        txt_apellido.setText("");
        txt_direccion.setText("");
        txt_correo.setText("");
        txt_telefono.setText("");
    }
    void bloquear(){
        txt_cedula.setEnabled(false);
        txt_nombre.setEnabled(false);
        txt_apellido.setEnabled(false);
        txt_direccion.setEnabled(false);
        txt_correo.setEnabled(false);
        txt_telefono.setEnabled(false);
        btn_guardar.setEnabled(false);
    }
    void desbloquear(){
        txt_cedula.setEnabled(true);
        txt_nombre.setEnabled(true);
        txt_apellido.setEnabled(true);
        txt_direccion.setEnabled(true);
        txt_correo.setEnabled(true);
        txt_telefono.setEnabled(true);
        btn_guardar.setEnabled(true);
    }
    
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
        btn_consultar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        btn_Nuevo = new javax.swing.JButton();
        lbl_nombre1 = new javax.swing.JLabel();
        txt_cedula = new javax.swing.JTextField();
        lbl_fondo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Registro de Usuarios");
        setIconImages(null);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        lbl_apellido.setForeground(new java.awt.Color(255, 255, 255));
        lbl_apellido.setText("Apellido:");
        getContentPane().add(lbl_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 150, -1, 20));

        lbl_direccion.setForeground(new java.awt.Color(255, 255, 255));
        lbl_direccion.setText("Direccion:");
        getContentPane().add(lbl_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 190, -1, 20));

        lbl_correo.setForeground(new java.awt.Color(255, 255, 255));
        lbl_correo.setText("Correo:");
        getContentPane().add(lbl_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 230, -1, 20));

        lbl_telefono.setForeground(new java.awt.Color(255, 255, 255));
        lbl_telefono.setText("Telefono: ");
        getContentPane().add(lbl_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 270, -1, 20));

        lbl_nombre.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre.setText("Nombre: ");
        getContentPane().add(lbl_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 110, -1, 20));

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
        getContentPane().add(txt_apellido, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 150, 240, -1));

        txt_direccion.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txt_direccionActionPerformed(evt);
            }
        });
        getContentPane().add(txt_direccion, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 190, 240, -1));
        getContentPane().add(txt_correo, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 230, 240, -1));

        txt_telefono.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_telefonoKeyTyped(evt);
            }
        });
        getContentPane().add(txt_telefono, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 270, 240, -1));

        txt_nombre.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_nombreKeyTyped(evt);
            }
        });
        getContentPane().add(txt_nombre, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 110, 240, -1));

        btn_guardar.setText("Guardar");
        btn_guardar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_guardarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_guardar, new org.netbeans.lib.awtextra.AbsoluteConstraints(250, 320, 160, 30));

        btn_consultar.setText("Consultar Personas");
        btn_consultar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_consultarMouseReleased(evt);
            }
        });
        btn_consultar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_consultarActionPerformed(evt);
            }
        });
        getContentPane().add(btn_consultar, new org.netbeans.lib.awtextra.AbsoluteConstraints(440, 320, 150, 30));

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setText("REGISTRO DE PERSONAS");
        jLabel1.setToolTipText("");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(120, 20, 390, 40));

        btn_Nuevo.setText("Nuevo Registro");
        btn_Nuevo.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseReleased(java.awt.event.MouseEvent evt) {
                btn_NuevoMouseReleased(evt);
            }
        });
        btn_Nuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btn_NuevoActionPerformed(evt);
            }
        });
        getContentPane().add(btn_Nuevo, new org.netbeans.lib.awtextra.AbsoluteConstraints(50, 320, 160, 30));

        lbl_nombre1.setForeground(new java.awt.Color(255, 255, 255));
        lbl_nombre1.setText("Cedula:");
        getContentPane().add(lbl_nombre1, new org.netbeans.lib.awtextra.AbsoluteConstraints(130, 70, -1, 20));

        txt_cedula.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txt_cedulaFocusLost(evt);
            }
        });
        txt_cedula.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyReleased(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyReleased(evt);
            }
            public void keyTyped(java.awt.event.KeyEvent evt) {
                txt_cedulaKeyTyped(evt);
            }
        });
        getContentPane().add(txt_cedula, new org.netbeans.lib.awtextra.AbsoluteConstraints(220, 70, 240, -1));

        lbl_fondo.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Imagenes/azules-14.jpg"))); // NOI18N
        lbl_fondo.setLabelFor(lbl_fondo);
        getContentPane().add(lbl_fondo, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 620, 360));

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
        String  texto1, texto2, texto3, texto4, texto5;
        Integer texto0;
        
        texto0 = Integer.parseInt(txt_cedula.getText());
        texto1 = txt_nombre.getText();
        texto2 = txt_apellido.getText();
        texto3 = txt_direccion.getText();
        texto4 = txt_correo.getText();
        texto5 = txt_telefono.getText();
        if(txt_cedula.getText().equals("") || txt_nombre.getText().equals("") || txt_apellido.getText().equals("") || txt_direccion.getText().equals("") || txt_correo.getText().equals("") || txt_telefono.getText().equals("")){
            javax.swing.JOptionPane.showMessageDialog(this, "Debe llenar todos los campos","AVISO",javax.swing.JOptionPane.INFORMATION_MESSAGE);
            txt_nombre.requestFocus();
        }else{
            try{
                /*Statement st = cn.createStatement();
                st.executeUpdate("INSERT INTO clientes VALUES('"+texto1+"','"+texto2+"','"+texto3+"','"+texto4+"','"+texto5+"')");
                    */
                PreparedStatement pps = cn.prepareStatement("INSERT INTO personas(ced_persona,nom_persona,ape_persona,dir_persona,corr_persona,tel_persona) VALUES(?,?,?,?,?,?)");
                    pps.setInt(1,texto0);
                    pps.setString(2,texto1);
                    pps.setString(3,texto2);
                    pps.setString(4,texto3);
                    pps.setString(5,texto4);
                    pps.setString(6,texto5);
                    pps.executeUpdate();
                    JOptionPane.showMessageDialog(this, "Datos Guardados");
                    pps.close();
                    cn.close();
        
            }catch(SQLException e){
                System.out.println("Error de SQL "+e.getMessage());
            }
            limpiar();
            bloquear();
        }
    }//GEN-LAST:event_btn_guardarActionPerformed

    private void txt_apellidoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txt_apellidoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txt_apellidoActionPerformed

    private void txt_apellidoKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_apellidoKeyTyped
        char c = evt.getKeyChar();
        if((c<'a' || c>'z') && (c<'A' || c>'Z') && (c<' ' || c>' '))evt.consume();
    }//GEN-LAST:event_txt_apellidoKeyTyped

    private void btn_consultarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_consultarActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_consultarActionPerformed

    private void btn_consultarMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_consultarMouseReleased
        ConsPersonas ejecutar = new ConsPersonas();
        ejecutar.setVisible(true);
        
    }//GEN-LAST:event_btn_consultarMouseReleased

    private void btn_NuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btn_NuevoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_btn_NuevoActionPerformed

    private void btn_NuevoMouseReleased(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_btn_NuevoMouseReleased
        desbloquear();
        txt_cedula.requestFocus();
    }//GEN-LAST:event_btn_NuevoMouseReleased

    private void txt_cedulaKeyTyped(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyTyped
         char c = evt.getKeyChar();
        if((c<'0' || c>'9')) evt.consume();
    }//GEN-LAST:event_txt_cedulaKeyTyped

    private void txt_cedulaKeyReleased(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txt_cedulaKeyReleased
        /*Integer c = Integer.parseInt(txt_cedula.getText());
        String sql = "SELECT ced_persona::Integer FROM personas WHERE ced_persona = "+c;
        ConexionBD2 con = new ConexionBD2();
        Connection cn = con.conexion1();
        ResultSet rs;
        Statement st;
        Integer res = 0;
        try {
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            res = rs.getInt("ced_persona");
            if(res != 0){
                txt_nombre.requestFocus();
            }else{
                JOptionPane.showMessageDialog(null, "El numero de Cedula ya Existe, Ingrese Otro");
                txt_cedula.requestFocus();
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de SQL "+ ex.getMessage());
        }*/
    }//GEN-LAST:event_txt_cedulaKeyReleased

    private void txt_cedulaFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txt_cedulaFocusLost
            Integer c = Integer.parseInt(txt_cedula.getText());
        String sql = "SELECT * FROM personas WHERE ced_persona = "+c+"";
        ConexionBD2 con = new ConexionBD2();
        Connection cn = con.conexion1();
        String nombre = null;
        String apellido = null;
       
        String res = null;
        try {
            ResultSet rs;
            Statement st;
            st = cn.createStatement();
            rs = st.executeQuery(sql);
            while(rs.next()){
            
            res = rs.getString("ced_persona");
            nombre = rs.getString("nom_persona");
            apellido = rs.getString("ape_persona");
            if(res == null){
                txt_nombre.requestFocus();
            }else{
                JOptionPane.showMessageDialog(null, "El numero de Cedula: "+res+" ya Existe\nPertenece a "+nombre+" "+apellido+"\nIngrese Otro");
                txt_cedula.requestFocus();
            }
            }
            
        } catch (SQLException ex) {
            JOptionPane.showMessageDialog(null,"Error de SQL "+ ex.getMessage());
        }        // TODO add your handling code here:
    }//GEN-LAST:event_txt_cedulaFocusLost

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
            java.util.logging.Logger.getLogger(RegPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(RegPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(RegPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(RegPersonas.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new RegPersonas().setVisible(true);
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btn_Nuevo;
    private javax.swing.JButton btn_consultar;
    private javax.swing.JButton btn_guardar;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel lbl_apellido;
    private javax.swing.JLabel lbl_correo;
    private javax.swing.JLabel lbl_direccion;
    private javax.swing.JLabel lbl_fondo;
    private javax.swing.JLabel lbl_nombre;
    private javax.swing.JLabel lbl_nombre1;
    private javax.swing.JLabel lbl_telefono;
    private javax.swing.JTextField txt_apellido;
    private javax.swing.JTextField txt_cedula;
    private javax.swing.JTextField txt_correo;
    private javax.swing.JTextField txt_direccion;
    private javax.swing.JTextField txt_nombre;
    private javax.swing.JTextField txt_telefono;
    // End of variables declaration//GEN-END:variables
}
