package vistas;

import control.*;
import modelo.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
/**
 *
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class VistaAlojamiento extends javax.swing.JInternalFrame {

    private Conexion c;
    private AlojamientoData ad;
    private ArrayList<Alojamiento> alojamientos;
    private DefaultTableModel modelo;
    
    /**
     * Creates new form VistaAlojamiento
     */
    public VistaAlojamiento() {
        try {
            initComponents();
            
            c = new Conexion();
            ad = new AlojamientoData(c);
            alojamientos = (ArrayList)ad.obtenerAlojamientos();
            modelo = new DefaultTableModel();
            armarCabecera();
            
            btnGrupo.add(radioTodos);
            btnGrupo.add(radioActivos);
            btnGrupo.add(radioInactivos);
            
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

        btnGrupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtUbicacion = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtCosto = new javax.swing.JTextField();
        jLabel5 = new javax.swing.JLabel();
        checkActivo = new javax.swing.JCheckBox();
        btnCargar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        btnBuscar = new javax.swing.JButton();
        jLabel6 = new javax.swing.JLabel();
        radioTodos = new javax.swing.JRadioButton();
        radioActivos = new javax.swing.JRadioButton();
        radioInactivos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabAlojamientos = new javax.swing.JTable();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        comboTipo = new javax.swing.JComboBox<>();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Alojamiento");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setEnabled(false);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Ubicacion:");

        txtUbicacion.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtUbicacion.setEnabled(false);
        txtUbicacion.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtUbicacionFocusLost(evt);
            }
        });

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Costo:");

        txtCosto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCosto.setEnabled(false);

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Activo");

        checkActivo.setEnabled(false);

        btnCargar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnCargar.setText("Cargar");
        btnCargar.setEnabled(false);
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnNuevo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jLabel6.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel6.setText("Lista de Alojamientos");

        radioTodos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioTodos.setSelected(true);
        radioTodos.setText("Todos");

        radioActivos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioActivos.setText("Activos");

        radioInactivos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioInactivos.setText("Inactivos");

        tabAlojamientos.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null},
                {null, null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4", "Title 5"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tabAlojamientos.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(tabAlojamientos);
        if (tabAlojamientos.getColumnModel().getColumnCount() > 0) {
            tabAlojamientos.getColumnModel().getColumn(0).setResizable(false);
            tabAlojamientos.getColumnModel().getColumn(1).setResizable(false);
            tabAlojamientos.getColumnModel().getColumn(2).setResizable(false);
            tabAlojamientos.getColumnModel().getColumn(3).setResizable(false);
            tabAlojamientos.getColumnModel().getColumn(4).setResizable(false);
        }

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Nombre:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Tipo:");

        comboTipo.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        comboTipo.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Cabaña", "Departamento", "Hotel", "Hostal", "Motel", "Resort" }));
        comboTipo.setEnabled(false);

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(46, 46, 46)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(22, 22, 22)
                        .addComponent(btnCargar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(146, 146, 146)
                        .addComponent(btnNuevo))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel8)
                            .addComponent(jLabel7)
                            .addComponent(jLabel3)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(jLabel5)
                                .addComponent(jLabel4)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkActivo))))
                .addGap(26, 26, 26)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(155, 155, 155)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioTodos)
                                .addGap(18, 18, 18)
                                .addComponent(radioActivos)
                                .addGap(18, 18, 18)
                                .addComponent(radioInactivos))
                            .addComponent(jLabel6)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(245, 245, 245)
                        .addComponent(btnBuscar))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 530, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(21, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel8)
                            .addComponent(comboTipo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtUbicacion, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel5)
                            .addComponent(checkActivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargar)
                            .addComponent(btnNuevo)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioTodos)
                            .addComponent(radioActivos)
                            .addComponent(radioInactivos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 210, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 32, Short.MAX_VALUE)
                        .addComponent(btnBuscar)))
                .addGap(23, 23, 23))
            .addComponent(jSeparator1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        try{
        
            if(!txtCosto.getText().isEmpty()){
            
                Alojamiento a = new Alojamiento();
        
                a.setNombre(txtNombre.getText());
                a.setTipoAlojamiento(comboTipo.getSelectedItem()+"");
                a.setUbicacion(txtUbicacion.getText());
                a.setCosto(Double.parseDouble(txtCosto.getText()));
                a.setActivo(checkActivo.isEnabled());
        
                ad.agregarAlojamiento(a);
                limpiarCampos();
            }
            else{
                JOptionPane.showMessageDialog(this, "Ingrese el precio del alojamiento");
                txtCosto.requestFocus();
            }
            
        }catch(NumberFormatException nf){
            JOptionPane.showMessageDialog(this, "Precio no válido");
            txtCosto.setText("");
            txtCosto.requestFocus();
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        limpiarCampos();
        activarCampos();
        txtNombre.requestFocus();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        vaciarTabla();
        boolean check1 = radioTodos.isSelected();
        boolean check2 = radioActivos.isSelected();
        boolean check3 = radioInactivos.isSelected();
        
        if(check1)
            llenarTablaTodos();
        if(check2)
            llenarTablaActivos();
        if(check3)
            llenarTablaInactivos();
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void txtUbicacionFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtUbicacionFocusLost
        // TODO add your handling code here:
        if(txtUbicacion.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese la ubicacion del alojamiento");
            txtUbicacion.requestFocus();
        }
    }//GEN-LAST:event_txtUbicacionFocusLost

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
        if(txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del alojamiento");
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_txtNombreFocusLost

    private void activarCampos(){
        txtNombre.setEnabled(true);
        comboTipo.setEnabled(true);
        txtUbicacion.setEnabled(true);
        txtCosto.setEnabled(true);
        checkActivo.setEnabled(true);
        btnCargar.setEnabled(true);
    }
    
    private void limpiarCampos(){
        txtNombre.setText("");
        comboTipo.setSelectedIndex(-1);
        txtUbicacion.setText("");
        txtCosto.setText("");
        checkActivo.setSelected(false);
    }
    
    private void armarCabecera(){
        ArrayList<Object> titulos = new ArrayList<>();
        
        titulos.add("ID");
        titulos.add("Nombre");
        titulos.add("Tipo");
        titulos.add("Ubicacion");
        titulos.add("Costo");
        titulos.add("Activo");
        
        for (Object titulo : titulos) {
            modelo.addColumn(titulo);
        }
        
        tabAlojamientos.setModel(modelo);
    }
    
    private void vaciarTabla(){
        int filas = modelo.getRowCount() - 1;
        
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    
    private void llenarTablaTodos(){
        for (Alojamiento a : alojamientos) {
            modelo.addRow(new Object[]{a.getIdAlojamiento(),a.getNombre(),a.getTipoAlojamiento(),a.getUbicacion(),a.getCosto(),a.isActivo()});
        }
    }
    
    private void llenarTablaActivos(){
        for (Alojamiento a : alojamientos) {
            if(a.isActivo()){
                modelo.addRow(new Object[]{a.getIdAlojamiento(),a.getNombre(),a.getTipoAlojamiento(),a.getUbicacion(),a.getCosto(),a.isActivo()});
            }
        }
    }
    
    private void llenarTablaInactivos(){
        for (Alojamiento a : alojamientos) {
            if(!a.isActivo()){
                modelo.addRow(new Object[]{a.getIdAlojamiento(),a.getNombre(),a.getTipoAlojamiento(),a.getUbicacion(),a.getCosto(),a.isActivo()});
            }
        }
    }
    
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox checkActivo;
    private javax.swing.JComboBox<String> comboTipo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radioActivos;
    private javax.swing.JRadioButton radioInactivos;
    private javax.swing.JRadioButton radioTodos;
    private javax.swing.JTable tabAlojamientos;
    private javax.swing.JTextField txtCosto;
    private javax.swing.JTextField txtNombre;
    private javax.swing.JTextField txtUbicacion;
    // End of variables declaration//GEN-END:variables
}
