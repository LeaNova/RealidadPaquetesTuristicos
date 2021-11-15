package vistas;

import control.*;
import modelo.*;
import java.util.List;
import javax.swing.JOptionPane;
/**
 *
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class VistaModAlojamiento extends javax.swing.JInternalFrame {

    private Conexion c;
    private AlojamientoData ad;
    /**
     * Creates new form VistaModAlojamiento
     */
    public VistaModAlojamiento() {
        try {
            initComponents();
            
            c = new Conexion();
            ad = new AlojamientoData(c);
            cargarComboId();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error en la conexion. " + ex);
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        comboId = new javax.swing.JComboBox<>();
        btnBuscar = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtTipo = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        btnActualizar = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Alojamiento");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID:");

        comboId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnDesactivar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDesactivar.setText("Desactivar");
        btnDesactivar.setEnabled(false);
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Nombre:");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setEnabled(false);

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Tipo:");

        txtTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtTipo.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Ubicacion:");

        txtUbicacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUbicacion.setEnabled(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Costo:");

        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCosto.setEnabled(false);

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.setEnabled(false);
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        btnActivar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActivar.setText("Activar");
        btnActivar.setEnabled(false);
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(79, 79, 79)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(81, 81, 81)
                        .addComponent(comboId, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(26, 26, 26)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(jLabel5)
                            .addComponent(jLabel3)
                            .addComponent(jLabel2)
                            .addComponent(jLabel4))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 139, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 140, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(71, Short.MAX_VALUE)
                .addComponent(btnActualizar)
                .addGap(18, 18, 18)
                .addComponent(btnActivar)
                .addGap(18, 18, 18)
                .addComponent(btnDesactivar)
                .addGap(66, 66, 66))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(comboId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 56, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnActivar)
                    .addComponent(btnDesactivar))
                .addGap(26, 26, 26))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        activarCampos();
        Alojamiento a = ad.buscarAlojamiento(Integer.parseInt(comboId.getSelectedItem()+""));

        txtNombre.setText(a.getNombre());
        txtTipo.setText(a.getTipoAlojamiento());
        txtUbicacion.setText(a.getUbicacion());
        txtCosto.setText(a.getCosto()+"");
        
        btnActualizar.setEnabled(true);
        if(a.isActivo()) {
            btnActivar.setEnabled(false);
            btnDesactivar.setEnabled(true);
        } else {
            btnActivar.setEnabled(true);
            btnDesactivar.setEnabled(false);
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        try{
        
            if(!txtNombre.getText().isEmpty() && !txtTipo.getText().isEmpty() && !txtUbicacion.getText().isEmpty() && !txtCosto.getText().isEmpty()){
            
                Alojamiento a = new Alojamiento();
        
                a.setIdAlojamiento(Integer.parseInt(comboId.getSelectedItem()+""));
                a.setNombre(txtNombre.getText());
                a.setTipoAlojamiento(txtTipo.getText());
                a.setUbicacion(txtUbicacion.getText());
                a.setCosto(Double.parseDouble(txtCosto.getText()));
        
                ad.actualizarAlojamiento(a);
                limpiarCampos();
                desactivarCampos();
            }
            else{
                JOptionPane.showMessageDialog(this, "Error al actualizar");
            }
            
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this, "Precio no válido");
            txtCosto.setText("");
            txtCosto.requestFocus();
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        // TODO add your handling code here:
        ad.activarAlojamiento(Integer.parseInt(comboId.getSelectedItem()+""));
        limpiarCampos();
        desactivarCampos();
    }//GEN-LAST:event_btnActivarActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed
        // TODO add your handling code here:
        ad.desactivarAlojamiento(Integer.parseInt(comboId.getSelectedItem()+""));
        limpiarCampos();
        desactivarCampos();
    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void activarCampos(){
        txtNombre.setEnabled(true);
        txtTipo.setEnabled(true);
        txtUbicacion.setEnabled(true);
        txtCosto.setEnabled(true);
    }
    
    private void desactivarCampos(){
        txtNombre.setEnabled(false);
        txtTipo.setEnabled(false);
        txtUbicacion.setEnabled(false);
        txtCosto.setEnabled(false);
        btnActualizar.setEnabled(false);
        btnActivar.setEnabled(false);
        btnDesactivar.setEnabled(false);
    }
    
    private void limpiarCampos(){
        txtNombre.setText("");
        txtTipo.setText("");
        txtUbicacion.setText("");
        txtCosto.setText("");
    }
    
    private void cargarComboId(){
        List<Alojamiento> alojamientos;
        alojamientos = ad.obtenerAlojamientos();
        for (Alojamiento a : alojamientos) {
                comboId.addItem(a.getIdAlojamiento());
            }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDesactivar;
    private javax.swing.JComboBox<Integer> comboId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtTipo;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
