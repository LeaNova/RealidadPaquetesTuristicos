package vistas;

import control.*;
import modelo.*;

import java.util.logging.*;
import javax.swing.table.DefaultTableModel;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class VistaMenu extends javax.swing.JInternalFrame {

    private MenuData md;
    private ArrayList<Menu> listaMenues;
    
    private Conexion con;
    
    private DefaultTableModel modelo;
    /**
     * Creates new form VistaMenu
     */
    public VistaMenu() {
        try {
            initComponents();
            
            con = new Conexion("jdbc:mysql://localhost/paquetes_turisticos", "root", "");
            md = new MenuData(con);
            listaMenues = (ArrayList)md.obtenerMenues();
            
            modelo = new DefaultTableModel();
            armarCabecera();
            
            btnGrupo.add(jrTodos);
            btnGrupo.add(jrActivos);
            btnGrupo.add(jrInactivos);
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaMenu.class.getName()).log(Level.SEVERE, null, ex);
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

        jSpinner1 = new javax.swing.JSpinner();
        btnGrupo = new javax.swing.ButtonGroup();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        btnCargar = new javax.swing.JButton();
        btnNuevo = new javax.swing.JButton();
        jSeparator1 = new javax.swing.JSeparator();
        jScrollPane1 = new javax.swing.JScrollPane();
        jtabMenues = new javax.swing.JTable();
        jtID = new javax.swing.JTextField();
        jtMenu = new javax.swing.JTextField();
        jtCosto = new javax.swing.JTextField();
        jcActivo = new javax.swing.JCheckBox();
        jLabel6 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        jrTodos = new javax.swing.JRadioButton();
        jrActivos = new javax.swing.JRadioButton();
        jrInactivos = new javax.swing.JRadioButton();

        setClosable(true);
        setIconifiable(true);
        setMaximizable(true);

        jLabel1.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel1.setText("Agregar Menu");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("ID:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Tipo menu:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("costo:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Activo:");

        btnCargar.setText("Cargar");
        btnCargar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCargarActionPerformed(evt);
            }
        });

        btnNuevo.setText("Nuevo");
        btnNuevo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnNuevoActionPerformed(evt);
            }
        });

        jtabMenues.setModel(new javax.swing.table.DefaultTableModel(
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
        jScrollPane1.setViewportView(jtabMenues);

        jtID.setEditable(false);
        jtID.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtMenu.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jtCosto.setFont(new java.awt.Font("Tahoma", 0, 12)); // NOI18N

        jLabel6.setFont(new java.awt.Font("Tahoma", 3, 24)); // NOI18N
        jLabel6.setText("Lista de Menues");

        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        jrTodos.setText("Todos");

        jrActivos.setText("Activos");

        jrInactivos.setText("Inactivos");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jSeparator1, javax.swing.GroupLayout.Alignment.TRAILING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(jLabel6)
                .addGap(167, 167, 167))
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(166, 166, 166)
                        .addComponent(btnBuscar)
                        .addGap(218, 218, 218))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 514, Short.MAX_VALUE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(176, 176, 176)
                        .addComponent(jLabel1))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(80, 80, 80)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel5))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jcActivo)
                            .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, 230, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(btnCargar)
                                .addGap(70, 70, 70)
                                .addComponent(btnNuevo)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(jrTodos)
                .addGap(18, 18, 18)
                .addComponent(jrActivos)
                .addGap(18, 18, 18)
                .addComponent(jrInactivos)
                .addGap(155, 155, 155))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jtID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jtMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcActivo))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCargar)
                    .addComponent(btnNuevo))
                .addGap(18, 18, 18)
                .addComponent(jSeparator1, javax.swing.GroupLayout.PREFERRED_SIZE, 10, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jrTodos)
                    .addComponent(jrActivos)
                    .addComponent(jrInactivos))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 300, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnBuscar)
                .addGap(20, 20, 20))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnCargarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCargarActionPerformed
        // TODO add your handling code here:
        try {
            String tipo = jtMenu.getText();
            double costo = Double.parseDouble(jtCosto.getText());
            boolean activo = jcActivo.isSelected();
            
            if(soloTexto(tipo)) {
                Menu m = new Menu(tipo, costo, activo);
                md.agregarMenu(m);
                
                jtID.setText(m.getIdMenu()+"");
            } else {
                JOptionPane.showMessageDialog(this, "Error en el tipo de Menu");
            }
            
            borrarFila();
        } catch (Throwable ex ) {
            JOptionPane.showMessageDialog(this, "Error en ingresar los datos");
        }
    }//GEN-LAST:event_btnCargarActionPerformed

    private void btnNuevoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnNuevoActionPerformed
        // TODO add your handling code here:
        jtID.setText("");
        jtMenu.setText("");
        jtCosto.setText("");
        jcActivo.setSelected(false);
        
        borrarFila();
    }//GEN-LAST:event_btnNuevoActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        borrarFila();
        
        boolean check1 = jrTodos.isSelected();
        boolean check2 = jrActivos.isSelected();
        boolean check3 = jrInactivos.isSelected();
        
        if(check1) {
            llenarTablaTodos();
        } else if (check2) {
            llenarTablaActivos();
        } else if (check3) {
            llenarTablaInactivos();
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private boolean soloTexto(String str) {
        char[] caracteres = str.toCharArray();
        for (int i = 0; i < caracteres.length; i++) {
            if (Character.isDigit(caracteres[i])) {
                return false;
            }
        }
        return true;
    }
    
    private void armarCabecera() {
        ArrayList<Object> titulos = new ArrayList<>();
        
        titulos.add("ID");
        titulos.add("Tipo Menu");
        titulos.add("Costo");
        titulos.add("Activo");
        
        for (Object titulo: titulos) {
            modelo.addColumn(titulo);
        }
        
        jtabMenues.setModel(modelo);
    }
    
    private void borrarFila() {
        int filas = modelo.getRowCount() - 1;
        
        for (int cont = filas; cont >= 0; cont--) {
            modelo.removeRow(cont);
        }
    }
    
    private void llenarTablaTodos() {
        for (Menu m: listaMenues) {
            modelo.addRow(new Object[]{m.getIdMenu(), m.getTipoMenu(), m.getCosto(), m.isActivo()});
        }
    }
    
    private void llenarTablaActivos() {
        for (Menu m: listaMenues) {
            if (m.isActivo()) {
                modelo.addRow(new Object[]{m.getIdMenu(), m.getTipoMenu(), m.getCosto(), m.isActivo()});
            }
        }
    }
    
    private void llenarTablaInactivos() {
        for (Menu m: listaMenues) {
            if (!m.isActivo()) {
                modelo.addRow(new Object[]{m.getIdMenu(), m.getTipoMenu(), m.getCosto(), m.isActivo()});
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnCargar;
    private javax.swing.ButtonGroup btnGrupo;
    private javax.swing.JButton btnNuevo;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JSeparator jSeparator1;
    private javax.swing.JSpinner jSpinner1;
    private javax.swing.JCheckBox jcActivo;
    private javax.swing.JRadioButton jrActivos;
    private javax.swing.JRadioButton jrInactivos;
    private javax.swing.JRadioButton jrTodos;
    private javax.swing.JTextField jtCosto;
    private javax.swing.JTextField jtID;
    private javax.swing.JTextField jtMenu;
    private javax.swing.JTable jtabMenues;
    // End of variables declaration//GEN-END:variables
}
