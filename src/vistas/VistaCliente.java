package vistas;

import control.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import modelo.*;
import modelo.Conexion;

/**
 *
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class VistaCliente extends javax.swing.JInternalFrame {
 private Conexion c;
 private ClienteData cl;
 private ArrayList<Cliente> clientes;
 private ArrayList<Cliente> clientesAc;
 private ArrayList<Cliente> clientesIn;
 private DefaultTableModel modelo;
 
    /**
     * Creates new form VistaCliente
     */
    public VistaCliente() {
     try {
         initComponents();
         c = new Conexion();
         cl = new ClienteData(c);
        clientes = (ArrayList)cl.obtenerClientes();
        clientesAc = (ArrayList)cl.obtenerClientesActivos();
        clientesIn = (ArrayList)cl.obtenerClientesInactivos();
         modelo = new DefaultTableModel();
         
         armarCabecera();
         
            btGroup.add(radioTodos);
            btGroup.add(radioActivos);
            btGroup.add(radioInactivos);
         
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

        btGroup = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        txtNombre = new javax.swing.JTextField();
        txtDni = new javax.swing.JTextField();
        txtContacto = new javax.swing.JTextField();
        txtCelular = new javax.swing.JTextField();
        checkActivo = new javax.swing.JCheckBox();
        btnCargar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jLabel7 = new javax.swing.JLabel();
        radioTodos = new javax.swing.JRadioButton();
        radioActivos = new javax.swing.JRadioButton();
        radioInactivos = new javax.swing.JRadioButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tabClientes = new javax.swing.JTable();
        btnBuscar = new javax.swing.JToggleButton();
        jSeparator1 = new javax.swing.JSeparator();

        setClosable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Agregar Cliente");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Nombre:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Dni:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Contacto:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Celular:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Activo");

        txtNombre.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtNombre.setEnabled(false);
        txtNombre.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtNombreFocusLost(evt);
            }
        });

        txtDni.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtDni.setEnabled(false);
        txtDni.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtDniFocusLost(evt);
            }
        });

        txtContacto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtContacto.setEnabled(false);
        txtContacto.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtContactoFocusLost(evt);
            }
        });

        txtCelular.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        txtCelular.setEnabled(false);
        txtCelular.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                txtCelularFocusLost(evt);
            }
        });

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

        jLabel7.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel7.setText("Lista de Clientes");

        radioTodos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioTodos.setSelected(true);
        radioTodos.setText("Todos");

        radioActivos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioActivos.setText("Activos");

        radioInactivos.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        radioInactivos.setText("Inactivos");

        tabClientes.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(tabClientes);

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jSeparator1.setOrientation(javax.swing.SwingConstants.VERTICAL);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(83, 83, 83)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(66, 66, 66)
                        .addComponent(btnCargar)
                        .addGap(52, 52, 52)
                        .addComponent(btnNuevo))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(checkActivo))))
                .addGap(53, 53, 53)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(121, 121, 121)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGap(17, 17, 17)
                                .addComponent(jLabel7))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(radioTodos)
                                .addGap(18, 18, 18)
                                .addComponent(radioActivos)
                                .addGap(18, 18, 18)
                                .addComponent(radioInactivos))))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 500, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(219, 219, 219)
                        .addComponent(btnBuscar)))
                .addContainerGap(18, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(radioTodos)
                            .addComponent(radioActivos)
                            .addComponent(radioInactivos))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(btnBuscar)
                        .addContainerGap(24, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addGap(49, 49, 49)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtNombre, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtDni, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtContacto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(txtCelular, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel6)
                            .addComponent(checkActivo))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnCargar)
                            .addComponent(btnNuevo))
                        .addGap(27, 27, 27))))
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        Cliente cli = new Cliente();
        try {
        cli.setNombre(txtNombre.getText());
    
        cli.setDni(Integer.parseInt(txtDni.getText()));
        cli.setContacto(txtContacto.getText());
        cli.setCelular(Integer.parseInt(txtCelular.getText()));
        cli.setActivo(checkActivo.isEnabled());
        
        cl.agregarCliente(cli);
         limpiarCampos();
        
        } catch (Throwable ex) {
            JOptionPane.showMessageDialog(this, "Error en los datos");
        }
        
    }//GEN-LAST:event_btnCargarActionPerformed

    private void txtNombreFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtNombreFocusLost
        // TODO add your handling code here:
        if(txtNombre.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el nombre del Cliente");
            txtNombre.requestFocus();
        }
    }//GEN-LAST:event_txtNombreFocusLost

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

    private void txtDniFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtDniFocusLost
        // TODO add your handling code here:
         if(txtDni.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el Dni del Cliente");
            txtDni.requestFocus();
        }
    }//GEN-LAST:event_txtDniFocusLost

    private void txtContactoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtContactoFocusLost
        // TODO add your handling code here:
        if(!txtContacto.getText().contains("@")){
            JOptionPane.showMessageDialog(this, "Ingrese un correo valido");
            txtContacto.requestFocus();
        }
    }//GEN-LAST:event_txtContactoFocusLost

    private void txtCelularFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_txtCelularFocusLost
        // TODO add your handling code here:
        if(txtCelular.getText().isEmpty()){
            JOptionPane.showMessageDialog(this, "Ingrese el Celular del Cliente");
            txtCelular.requestFocus();
        }
    }//GEN-LAST:event_txtCelularFocusLost
    private void limpiarCampos(){
        txtNombre.setText("");
        txtDni.setText("");
        txtContacto.setText("");
        txtCelular.setText("");
        checkActivo.setSelected(false);
    }
    private void activarCampos(){
        txtNombre.setEnabled(true);
        txtDni.setEnabled(true);
        txtContacto.setEnabled(true);
        txtCelular.setEnabled(true);
        checkActivo.setEnabled(true);
        btnCargar.setEnabled(true);
    }
    private void armarCabecera(){
        ArrayList<Object> titulos = new ArrayList<>();
        
        titulos.add("ID");
        titulos.add("Nombre");
        titulos.add("Dni");
        titulos.add("Contacto");
        titulos.add("Celular");
        titulos.add("Activo");
        
        for (Object titulo : titulos) {
            modelo.addColumn(titulo);
        }
        
        tabClientes.setModel(modelo);
    }
     private void vaciarTabla(){
        int filas = modelo.getRowCount() - 1;
        
        for (int i = filas; i >= 0; i--) {
            modelo.removeRow(i);
        }
    }
    private void llenarTablaTodos(){
        for (Cliente cli : clientes) {
            modelo.addRow(new Object[]{cli.getIdCliente(),cli.getNombre(),cli.getDni(),cli.getContacto(),cli.getCelular(),cli.isActivo()});
        }
    }
      private void llenarTablaActivos(){
        for (Cliente cli : clientesAc) {
            modelo.addRow(new Object[]{cli.getIdCliente(),cli.getNombre(),cli.getDni(),cli.getContacto(),cli.getCelular(),cli.isActivo()});
        }
    }
    
    private void llenarTablaInactivos(){
        for (Cliente cli : clientesIn) {
            modelo.addRow(new Object[]{cli.getIdCliente(),cli.getNombre(),cli.getDni(),cli.getContacto(),cli.getCelular(),cli.isActivo()});
        }
    }
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup btGroup;
    private javax.swing.JToggleButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JCheckBox checkActivo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JRadioButton radioActivos;
    private javax.swing.JRadioButton radioInactivos;
    private javax.swing.JRadioButton radioTodos;
    private javax.swing.JTable tabClientes;
    private javax.swing.JTextField txtCelular;
    private javax.swing.JTextField txtContacto;
    private javax.swing.JTextField txtDni;
    private javax.swing.JTextField txtNombre;
    // End of variables declaration//GEN-END:variables
}
