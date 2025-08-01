/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package Vista;

import Controlador.Control;
import Enums.EstadoEncendido;
import Enums.VelocidadLimpiaParabrisas;
import javax.swing.JOptionPane;




/**
 *
 * @author huete
 */
public class FrmLimpiaParabrisas extends javax.swing.JFrame {
   private final Control control;
    private VelocidadLimpiaParabrisas[] velocidades = VelocidadLimpiaParabrisas.values();
    private int indiceVelocidad = 0; 

    public FrmLimpiaParabrisas(Control control) {
        this.control = control;
        initComponents();
        sincronizarEstado();
    }

    private void sincronizarEstado() {
        VelocidadLimpiaParabrisas velocidadActual = control.getVelocidadLimpiaParabrisas();
        indiceVelocidad = velocidadActual.ordinal();
        btnEncenderLimpia.setSelected(velocidadActual != VelocidadLimpiaParabrisas.OFF);
        btnEncenderLimpia.setText(velocidadActual != VelocidadLimpiaParabrisas.OFF ? "Apagar" : "Encender");
        lblEstado.setText("Velocidad: " + velocidadActual.name());
    }

    private void cambiarVelocidad(int cambio) {
        if (!btnEncenderLimpia.isSelected()) {
            JOptionPane.showMessageDialog(this, "Primero debes encender el limpia parabrisas.");
            return;
        }

        int nuevaVelocidad = Math.max(1, Math.min(indiceVelocidad + cambio, velocidades.length - 1));
        if (nuevaVelocidad != indiceVelocidad) {
            boolean cambioExitoso = control.cambiarVelocidadLimpiaParabrisas(velocidades[nuevaVelocidad]);
            if (cambioExitoso) {
                indiceVelocidad = nuevaVelocidad;
                lblEstado.setText("Velocidad: " + velocidades[indiceVelocidad].name());
            } else {
                JOptionPane.showMessageDialog(this, "El auto está apagado. No se puede cambiar la velocidad.");
            }
        }
    }
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel2 = new javax.swing.JLabel();
        btnEncenderLimpia = new javax.swing.JToggleButton();
        btnAumentarVelocidad = new javax.swing.JButton();
        btnDisminuirVelocidad = new javax.swing.JButton();
        lblEstado = new javax.swing.JLabel();
        btnVolver = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        getContentPane().setLayout(new org.netbeans.lib.awtextra.AbsoluteLayout());

        jLabel2.setFont(new java.awt.Font("sansserif", 1, 18)); // NOI18N
        jLabel2.setForeground(new java.awt.Color(255, 255, 255));
        jLabel2.setText("LimpiaParabrisas");
        jLabel2.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        getContentPane().add(jLabel2, new org.netbeans.lib.awtextra.AbsoluteConstraints(110, 30, 170, -1));

        btnEncenderLimpia.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/encendido-apagado.png"))); // NOI18N
        btnEncenderLimpia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEncenderLimpiaActionPerformed(evt);
            }
        });
        getContentPane().add(btnEncenderLimpia, new org.netbeans.lib.awtextra.AbsoluteConstraints(300, 30, 50, 40));

        btnAumentarVelocidad.setBackground(new java.awt.Color(0, 153, 0));
        btnAumentarVelocidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/agregar.png"))); // NOI18N
        btnAumentarVelocidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 153, 0), 2, true));
        btnAumentarVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAumentarVelocidadActionPerformed(evt);
            }
        });
        getContentPane().add(btnAumentarVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(210, 270, 40, 40));

        btnDisminuirVelocidad.setBackground(new java.awt.Color(153, 0, 0));
        btnDisminuirVelocidad.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/boton-menos.png"))); // NOI18N
        btnDisminuirVelocidad.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(204, 0, 0), 2, true));
        btnDisminuirVelocidad.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDisminuirVelocidadActionPerformed(evt);
            }
        });
        getContentPane().add(btnDisminuirVelocidad, new org.netbeans.lib.awtextra.AbsoluteConstraints(140, 270, 40, 40));

        lblEstado.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        lblEstado.setForeground(new java.awt.Color(255, 255, 255));
        lblEstado.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        getContentPane().add(lblEstado, new org.netbeans.lib.awtextra.AbsoluteConstraints(90, 120, 200, 40));

        btnVolver.setBackground(new java.awt.Color(0, 0, 0));
        btnVolver.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        btnVolver.setForeground(new java.awt.Color(255, 255, 255));
        btnVolver.setText("Volver");
        btnVolver.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 3, true));
        btnVolver.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnVolverActionPerformed(evt);
            }
        });
        getContentPane().add(btnVolver, new org.netbeans.lib.awtextra.AbsoluteConstraints(150, 350, 90, 40));

        jLabel6.setFont(new java.awt.Font("sansserif", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText("Velocidad del Climatizado");
        jLabel6.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(255, 255, 255), 2, true));
        getContentPane().add(jLabel6, new org.netbeans.lib.awtextra.AbsoluteConstraints(100, 220, -1, -1));

        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Images/fondoAzul.png"))); // NOI18N
        jLabel1.setText("jLabel1");
        getContentPane().add(jLabel1, new org.netbeans.lib.awtextra.AbsoluteConstraints(0, 0, 400, 410));

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnEncenderLimpiaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEncenderLimpiaActionPerformed
        toggleEncenderLimpia(evt);
        
    }//GEN-LAST:event_btnEncenderLimpiaActionPerformed

    private void btnAumentarVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAumentarVelocidadActionPerformed
        cambiarVelocidad(1);
    }//GEN-LAST:event_btnAumentarVelocidadActionPerformed

    private void btnDisminuirVelocidadActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDisminuirVelocidadActionPerformed
      cambiarVelocidad(-1);  
    }//GEN-LAST:event_btnDisminuirVelocidadActionPerformed

    private void btnVolverActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnVolverActionPerformed
        this.dispose();
    }//GEN-LAST:event_btnVolverActionPerformed
    private void toggleEncenderLimpia(java.awt.event.ActionEvent evt) {
        if (control.getEstadoEncendido() != EstadoEncendido.ENCENDIDO) {
            JOptionPane.showMessageDialog(this, "El auto está apagado. No se puede usar el limpia parabrisas.");
            btnEncenderLimpia.setSelected(false);
            return;
        }

        if (btnEncenderLimpia.isSelected()) {
            
            indiceVelocidad = 1;
            control.cambiarVelocidadLimpiaParabrisas(velocidades[indiceVelocidad]);
            btnEncenderLimpia.setText("Apagar");
        } else {
            
            indiceVelocidad = 0;
            control.cambiarVelocidadLimpiaParabrisas(VelocidadLimpiaParabrisas.OFF);
            btnEncenderLimpia.setText("Encender");
        }

        lblEstado.setText("Velocidad: " + velocidades[indiceVelocidad].name());
    }
    /**
     * @param args the command line arguments
     */
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAumentarVelocidad;
    private javax.swing.JButton btnDisminuirVelocidad;
    private javax.swing.JToggleButton btnEncenderLimpia;
    private javax.swing.JButton btnVolver;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel lblEstado;
    // End of variables declaration//GEN-END:variables
}
