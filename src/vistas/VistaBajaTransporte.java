package vistas;

import control.TransporteData;
import java.time.format.DateTimeFormatter;
import java.util.List;
import javax.swing.JOptionPane;
import modelo.Conexion;
import modelo.Transporte;

/**
 *
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class VistaBajaTransporte extends javax.swing.JInternalFrame {
 private Conexion c;
    private TransporteData tr;
    /**
     * Creates new form VistaBajaTransporte
     */
    public VistaBajaTransporte() {
         try {
            initComponents();
            
            c = new Conexion();
           tr = new TransporteData(c);
           cargarComboId();
            
        } catch (ClassNotFoundException ex) {
            JOptionPane.showMessageDialog(this, "Error en la conexion. " + ex);
        }
    }
 private void cargarComboId(){
        List<Transporte> transportes;
        transportes = tr.obtenerTransportes();
        for (Transporte tra : transportes) {
                comboId.addItem(tra.getIdTransporte());
            }
    }
 private void activarBtns(){
        btnBaja.setEnabled(true);
        btnEliminar.setEnabled(true);
    }
 
     private void desactivarBtns(){
        btnBaja.setEnabled(false);
        btnEliminar.setEnabled(false);
    }
     private void limpiarCampos(){
        txtTransporte.setText("");
        txtDestino.setText("");
        txtFechaLlegada.setText("");
        txtFechaPartida.setText("");
        txtCosto.setText("");
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnBaja = new javax.swing.JButton();
        btnEliminar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtFechaPartida = new javax.swing.JTextField();
        txtTransporte = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtFechaLlegada = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        comboId = new javax.swing.JComboBox<>();
        jLabel7 = new javax.swing.JLabel();
        txtDestino = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();

        setClosable(true);

        btnBaja.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBaja.setText("Baja");
        btnBaja.setEnabled(false);
        btnBaja.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBajaActionPerformed(evt);
            }
        });

        btnEliminar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnEliminar.setText("Eliminar");
        btnEliminar.setEnabled(false);
        btnEliminar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnEliminarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Bajar Transporte");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("F. Partida:");
        jLabel4.setToolTipText("Fecha de partida:");

        txtCosto.setEditable(false);
        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Costo:");

        jLabel9.setText("dd/mm/yyyy");
        jLabel9.setToolTipText("Fecha de nacimiento:");

        jLabel10.setText("dd/mm/yyyy");
        jLabel10.setToolTipText("Fecha de nacimiento:");

        txtFechaPartida.setEditable(false);
        txtFechaPartida.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        txtTransporte.setEditable(false);
        txtTransporte.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("F. Llegada:");
        jLabel3.setToolTipText("Fecha de llegada:");

        txtFechaLlegada.setEditable(false);
        txtFechaLlegada.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Transporte:");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        comboId.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("ID:");

        txtDestino.setEditable(false);

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Destino:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(134, 134, 134)
                .addComponent(jLabel1)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(85, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(30, 30, 30)
                        .addComponent(btnBaja)
                        .addGap(64, 64, 64)
                        .addComponent(btnEliminar))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addComponent(comboId, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(27, 27, 27)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel8, javax.swing.GroupLayout.Alignment.TRAILING))
                            .addComponent(jLabel3, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4, javax.swing.GroupLayout.Alignment.TRAILING))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFechaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel10))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(txtFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, 101, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel9)))))
                .addGap(105, 105, 105))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(jLabel1)
                .addGap(13, 13, 13)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(comboId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnBuscar))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(txtDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtFechaPartida, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel10))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtFechaLlegada, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8)
                    .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 51, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnBaja)
                    .addComponent(btnEliminar))
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnBajaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBajaActionPerformed
        // TODO add your handling code here:
        tr.desactivarTransportes(Integer.parseInt(comboId.getSelectedItem()+""));
        limpiarCampos();
        desactivarBtns();
    }//GEN-LAST:event_btnBajaActionPerformed

    private void btnEliminarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnEliminarActionPerformed
        // TODO add your handling code here:
        tr.borrarTransporte(Integer.parseInt(comboId.getSelectedItem()+""));
        limpiarCampos();
        desactivarBtns();
    }//GEN-LAST:event_btnEliminarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        Transporte tra = tr.buscarTransporte(Integer.parseInt(comboId.getSelectedItem()+""));

        txtTransporte.setText(tra.getTipodetransporte());
        txtDestino.setText(tra.getDestino());
        txtFechaLlegada.setText(tra.getFechallegada().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        txtFechaPartida.setText(tra.getFechapartida().format(DateTimeFormatter.ofPattern("dd/MM/yyyy")));
        txtCosto.setText(tra.getCosto()+"");

        activarBtns();
    }//GEN-LAST:event_btnBuscarActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBaja;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnEliminar;
    private javax.swing.JComboBox<Integer> comboId;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtDestino;
    private javax.swing.JTextField txtFechaLlegada;
    private javax.swing.JTextField txtFechaPartida;
    private javax.swing.JTextField txtTransporte;
    // End of variables declaration//GEN-END:variables
}
