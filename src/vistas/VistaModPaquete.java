package vistas;

import control.*;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import modelo.*;
import java.time.*;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

import java.util.logging.*;
import javax.swing.JOptionPane;
import java.util.*;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class VistaModPaquete extends javax.swing.JInternalFrame {

    private PaqueteData pd;
    private ClienteData cd;
    private TransporteData td;
    private AlojamientoData ad;
    private MenuData md;
    private DestinoData dd;
    private ArrayList<Paquete> listaPaquetes;
    private ArrayList<Cliente> listaClientes;
    private ArrayList<Menu> listaMenues;
    private ArrayList<Destino> listaDestinos;
    
    private Conexion con;
    /**
     * Creates new form VistaModPaquete
     */
    public VistaModPaquete() {
        try {
            initComponents();
            
            con = new Conexion("jdbc:mysql://localhost/paquetes_turisticos", "root", "");
            pd = new PaqueteData(con);
            cd = new ClienteData(con);
            td = new TransporteData(con);
            ad = new AlojamientoData(con);
            md = new MenuData(con);
            dd = new DestinoData(con);
            listaPaquetes = (ArrayList)pd.obtenerPaquetes();
            listaClientes = (ArrayList)cd.obtenerClientes();
            listaMenues = (ArrayList)md.obtenerMenues();
            listaDestinos = (ArrayList)dd.obtenerDestinos();
            
            btnActualizar.setEnabled(false);
            btnActivar.setEnabled(false);
            btnDesactivar.setEnabled(false);
            
            llenarComboID();
            setearCalendario();
            
        } catch (ClassNotFoundException ex) {
            Logger.getLogger(VistaModPaquete.class.getName()).log(Level.SEVERE, null, ex);
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

        btnActualizar = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jcCliente = new javax.swing.JComboBox<>();
        jcTransporte = new javax.swing.JComboBox<>();
        jcAlojamiento = new javax.swing.JComboBox<>();
        jcMenu = new javax.swing.JComboBox<>();
        jcDestino = new javax.swing.JComboBox<>();
        jtCosto = new javax.swing.JTextField();
        jLabel13 = new javax.swing.JLabel();
        btnBuscar = new javax.swing.JButton();
        btnActivar = new javax.swing.JButton();
        btnDesactivar = new javax.swing.JButton();
        jcID = new javax.swing.JComboBox<>();
        dateFechaInicio = new com.toedter.calendar.JDateChooser();
        dateFechaFinal = new com.toedter.calendar.JDateChooser();

        setClosable(true);

        btnActualizar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActualizar.setText("Actualizar");
        btnActualizar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActualizarActionPerformed(evt);
            }
        });

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        jLabel1.setText("Modificar Paquete");

        jLabel2.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel2.setText("Cliente:");

        jLabel3.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel3.setText("Transporte:");

        jLabel4.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel4.setText("Alojamiento:");

        jLabel5.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel5.setText("Menu:");

        jLabel6.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel6.setText("Destino:");

        jLabel7.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel7.setText("Fecha Inicio:");

        jLabel8.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel8.setText("Fecha Final:");

        jLabel9.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel9.setText("Costo Total:");

        jcCliente.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcTransporte.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcAlojamiento.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcMenu.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jcDestino.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jcDestino.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                jcDestinoItemStateChanged(evt);
            }
        });

        jtCosto.setEditable(false);
        jtCosto.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        jLabel13.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        jLabel13.setText("ID:");

        btnBuscar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnBuscar.setText("Buscar");
        btnBuscar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnBuscarActionPerformed(evt);
            }
        });

        btnActivar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnActivar.setText("Activar");
        btnActivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnActivarActionPerformed(evt);
            }
        });

        btnDesactivar.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N
        btnDesactivar.setText("Desactivar");
        btnDesactivar.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnDesactivarActionPerformed(evt);
            }
        });

        jcID.setFont(new java.awt.Font("Tahoma", 0, 14)); // NOI18N

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(57, 57, 57)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel13)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel5)
                                    .addComponent(jLabel3)
                                    .addComponent(jLabel7)
                                    .addComponent(jLabel8)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(jcDestino, 0, 190, Short.MAX_VALUE)
                                    .addComponent(jcAlojamiento, 0, 190, Short.MAX_VALUE)
                                    .addComponent(jcMenu, 0, 190, Short.MAX_VALUE)
                                    .addComponent(jcTransporte, 0, 190, Short.MAX_VALUE)
                                    .addComponent(jtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, 122, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(jcID, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(btnBuscar))
                                    .addComponent(jcCliente, 0, 190, Short.MAX_VALUE)
                                    .addComponent(dateFechaInicio, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(dateFechaFinal, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                            .addGroup(layout.createSequentialGroup()
                                .addGap(57, 57, 57)
                                .addComponent(jLabel1))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addComponent(btnActualizar)
                        .addGap(18, 18, 18)
                        .addComponent(btnActivar)
                        .addGap(18, 18, 18)
                        .addComponent(btnDesactivar)))
                .addContainerGap(63, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1)
                .addGap(35, 35, 35)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel13)
                    .addComponent(btnBuscar)
                    .addComponent(jcID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jcCliente, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(jcDestino, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(jcAlojamiento, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jcMenu, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jcTransporte, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addComponent(dateFechaInicio, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel8)
                    .addComponent(dateFechaFinal, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jtCosto, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnActualizar)
                    .addComponent(btnActivar)
                    .addComponent(btnDesactivar))
                .addContainerGap(47, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnActualizarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActualizarActionPerformed
        // TODO add your handling code here:
        try {
            Paquete pa = new Paquete();
            
            int id = (int) jcID.getSelectedItem();
            
            pa.setIdPaquete(id);
            pa.setCliente((Cliente)jcCliente.getSelectedItem());
            pa.setTransporte((Transporte)jcTransporte.getSelectedItem());
            pa.setAlojamiento((Alojamiento)jcAlojamiento.getSelectedItem());
            pa.setMenu((Menu)jcMenu.getSelectedItem());
            pa.setDestino((Destino)jcDestino.getSelectedItem());
            
            SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
            String fecha1 = formato.format(dateFechaInicio.getDate());
            String fecha2 = formato.format(dateFechaFinal.getDate());
            LocalDate fechaInicio = LocalDate.parse(fecha1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
            LocalDate fechaFinal = LocalDate.parse(fecha2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
                
            pa.setFechaInicio(fechaInicio);
            pa.setFechaFinal(fechaFinal);
            
            pd.actualizarPaquete(pa);
            jtCosto.setText(calcularTodo()+"");
            
        } catch (Throwable ex) {
            JOptionPane.showMessageDialog(this, "Error al actualizar Paquete");
        }
    }//GEN-LAST:event_btnActualizarActionPerformed

    private void btnBuscarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnBuscarActionPerformed
        // TODO add your handling code here:
        try {
            int id = (int) jcID.getSelectedItem();
            
            llenarComboCliente();
            llenarComboMenu();
            llenarComboDestino();
            
            Paquete pa = pd.buscarPaquete(id);
            jcCliente.setSelectedItem(pa.getCliente());
            jcTransporte.setSelectedItem(pa.getTransporte());
            jcAlojamiento.setSelectedItem(pa.getAlojamiento());
            jcMenu.setSelectedItem(pa.getMenu());
            jcDestino.setSelectedItem(pa.getDestino());
            
            dateFechaInicio.setDate(java.sql.Date.valueOf(pa.getFechaInicio()));
            dateFechaFinal.setDate(java.sql.Date.valueOf(pa.getFechaFinal()));
            
            jtCosto.setText(pa.getCostoTotal()+"");
            btnActualizar.setEnabled(true);
            
            if(pa.isActivo()) {
                btnActivar.setEnabled(false);
                btnDesactivar.setEnabled(true);
            } else {
                btnActivar.setEnabled(true);
                btnDesactivar.setEnabled(false);
            }
            
        } catch (NumberFormatException ex){
            JOptionPane.showMessageDialog(this, "Error en el ID");
        } catch (NullPointerException ez) {
            JOptionPane.showMessageDialog(this, "No se pudo encontrar Paquete");
        }
    }//GEN-LAST:event_btnBuscarActionPerformed

    private void btnActivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnActivarActionPerformed
        // TODO add your handling code here:
        int id = (int) jcID.getSelectedItem();
        
        pd.activarPaquete(id);
    }//GEN-LAST:event_btnActivarActionPerformed

    private void btnDesactivarActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnDesactivarActionPerformed
        // TODO add your handling code here:
        int id = (int) jcID.getSelectedItem();
        
        pd.desactivarPaquete(id);
    }//GEN-LAST:event_btnDesactivarActionPerformed

    private void jcDestinoItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_jcDestinoItemStateChanged
        // TODO add your handling code here:
        Destino des = (Destino)jcDestino.getSelectedItem();
        
        jcAlojamiento.removeAllItems();
        jcTransporte.removeAllItems();
        llenarComboAlojamiento(des.getNombre());
        llenarComboTransporte(des.getNombre());
    }//GEN-LAST:event_jcDestinoItemStateChanged

    private void setearCalendario(){
        try {
            dateFechaInicio.getJCalendar().setSelectableDateRange(new Date(),new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2030"));
            dateFechaFinal.getJCalendar().setSelectableDateRange(new Date(),new SimpleDateFormat("dd/MM/yyyy").parse("01/01/2030"));
        } catch (ParseException ex) {
            JOptionPane.showMessageDialog(this, "Error al setear calendario");
        }
    }
    
    private void llenarComboID() {
        for (Paquete pa: listaPaquetes) {
            jcID.addItem(pa.getIdPaquete());
        }
    }
    
    private void llenarComboCliente() {
        for (Cliente cli: listaClientes) {
            if (cli.isActivo()) {
                jcCliente.addItem(cli);
            }
        }
    }
    
    private void llenarComboTransporte(String des) {
        for (Transporte tra: td.obtenerTransportesPorUbicacion(des)) {
            if (tra.isActivo()) {
                jcTransporte.addItem(tra);
            }
        }
    }
    
    private void llenarComboAlojamiento(String des) {
        for (Alojamiento alo: ad.obtenerAlojamientosPorUbicacion(des)) {
            if (alo.isActivo()) {
                jcAlojamiento.addItem(alo);
            }
        }
    }
    
    private void llenarComboMenu() {
        for (Menu me: listaMenues) {
            if (me.isActivo()) {
                jcMenu.addItem(me);
            }
        }
    }
    
    private void llenarComboDestino() {
        for (Destino des: listaDestinos) {
            if (des.isActivo()) {
                jcDestino.addItem(des);
            }
        }
    }
    
    private double calcularTodo() {
        Alojamiento alo = (Alojamiento)jcAlojamiento.getSelectedItem();
        Menu me = (Menu)jcMenu.getSelectedItem();
        Transporte tra = (Transporte)jcTransporte.getSelectedItem();

        SimpleDateFormat formato = new SimpleDateFormat("dd/MM/yyyy");
        String fecha1 = formato.format(dateFechaInicio.getDate());
        String fecha2 = formato.format(dateFechaFinal.getDate());
        LocalDate f1 = LocalDate.parse(fecha1, DateTimeFormatter.ofPattern("dd/MM/yyyy"));
        LocalDate f2 = LocalDate.parse(fecha2, DateTimeFormatter.ofPattern("dd/MM/yyyy"));

        double aloC = alo.getCosto() * calcularDias(f1, f2);
        double adicional = obtenerAdicional(f1);

        return calcular(aloC, me, tra) * adicional;
    }
    
    private int calcularDias(LocalDate fecha1, LocalDate fecha2) {
        int dias = (int) ChronoUnit.DAYS.between(fecha1, fecha2);
        
        return dias;
    }
    
    private double obtenerAdicional(LocalDate fecha) {
        int mes = fecha.getMonth().getValue();
        switch (mes) {
            case 1:
            case 7:
                return 1.30;
            case 2:
            case 6:
                return 1.15;
            default:
                return 1;
        }
    }
    
    private double calcular(double alo, Menu me, Transporte tra) {
        double costo = alo + me.getCosto() + tra.getCosto();
        
        return costo;
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnActivar;
    private javax.swing.JButton btnActualizar;
    private javax.swing.JButton btnBuscar;
    private javax.swing.JButton btnDesactivar;
    private com.toedter.calendar.JDateChooser dateFechaFinal;
    private com.toedter.calendar.JDateChooser dateFechaInicio;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JComboBox<Alojamiento> jcAlojamiento;
    private javax.swing.JComboBox<Cliente> jcCliente;
    private javax.swing.JComboBox<Destino> jcDestino;
    private javax.swing.JComboBox<Integer> jcID;
    private javax.swing.JComboBox<Menu> jcMenu;
    private javax.swing.JComboBox<Transporte> jcTransporte;
    private javax.swing.JTextField jtCosto;
    // End of variables declaration//GEN-END:variables
}
