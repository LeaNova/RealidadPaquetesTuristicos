package control;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;

import modelo.*;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class PaqueteData {
    private Connection con;
    private Conexion conexion;
    
    public PaqueteData(Conexion conexion) {
        try {
            con = conexion.getConexion();
            this.conexion = conexion;
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }
    
    public void agregarPaquete(Paquete paquete) {
        String sql = "INSERT INTO paquete (id_cliente, id_transporte, id_alojamiento, id_menu, fecha_inicio, fecha_final, cantidad_personas, costo_total, activo) VALUES (?, ?, ?, ?, ?, ?, ?, ? ,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setInt(1, paquete.getCliente().getIdCliente());
            ps.setInt(2, paquete.getTransporte().getIdTransporte());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getMenu().getIdMenu());
            ps.setDate(5, Date.valueOf(paquete.getFechaInicio()));
            ps.setDate(6, Date.valueOf(paquete.getFechaFinal()));
            ps.setInt(7, paquete.getCantPersonas());
            ps.setDouble(8, paquete.getCostoTotal());
            ps.setBoolean(9, paquete.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                paquete.setIdPaquete(rs.getInt(1));
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al guardar Paquete. " + ex);
        }
    }
    
    public void actualizarPaquete(Paquete paquete) {
        String sql = "UPTDATE paquete SET id_cliente = ?, id_transporte = ?, id_alojamiento = ?, id_menu = ?, fecha_inicio = ?, fecha_final = ?, cantidad_personas = ?, costo_total = ?, activo = ? WHERE id_paquete = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, paquete.getCliente().getIdCliente());
            ps.setInt(2, paquete.getTransporte().getIdTransporte());
            ps.setInt(3, paquete.getAlojamiento().getIdAlojamiento());
            ps.setInt(4, paquete.getMenu().getIdMenu());
            ps.setDate(5, Date.valueOf(paquete.getFechaInicio()));
            ps.setDate(6, Date.valueOf(paquete.getFechaFinal()));
            ps.setInt(7, paquete.getCantPersonas());
            ps.setDouble(8, paquete.getCostoTotal());
            ps.setBoolean(9, paquete.isActivo());
            
            ps.setInt(10, paquete.getIdPaquete());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar Paquete. " + ex);
        }
    }
    
    public Paquete buscarPaquete(int id) {
        Paquete paquete = new Paquete();
        Cliente cli;
        Transporte tra;
        Alojamiento alo;
        Menu me;
        String sql = "SELECT * FROM paquete WHERE id_paquete = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                paquete.setIdPaquete(rs.getInt(1));
                
                cli = buscarCliente(rs.getInt("id_cliente"));
                paquete.setCliente(cli);
                
                tra = buscarTransporte(rs.getInt("id_transporte"));
                paquete.setTransporte(tra);
                
                alo = buscarAlojamiento(rs.getInt("id_alojamiento"));
                paquete.setAlojamiento(alo);
                
                me = buscarMenu(rs.getInt("id_menu"));
                paquete.setMenu(me);
                
                paquete.setFechaInicio(rs.getDate(6).toLocalDate());
                paquete.setFechaFinal(rs.getDate(7).toLocalDate());
                paquete.setCantPersonas(rs.getInt(8));
                paquete.setCostoTotal(rs.getDouble(9));
                paquete.setActivo(rs.getBoolean(10));
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar Paquete. " + ex);
        }
        return paquete;
    }
    
    public List<Paquete> obtenerPaquetes() {
        List<Paquete> lista = new ArrayList<>();
        Cliente cli;
        Transporte tra;
        Alojamiento alo;
        Menu me;
        String sql = "SELECT * FROM paquete";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Paquete paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt(1));
                
                cli = buscarCliente(rs.getInt("id_cliente"));
                paquete.setCliente(cli);
                
                tra = buscarTransporte(rs.getInt("id_transporte"));
                paquete.setTransporte(tra);
                
                alo = buscarAlojamiento(rs.getInt("id_alojamiento"));
                paquete.setAlojamiento(alo);
                
                me = buscarMenu(rs.getInt("id_menu"));
                paquete.setMenu(me);
                
                paquete.setFechaInicio(rs.getDate(6).toLocalDate());
                paquete.setFechaFinal(rs.getDate(7).toLocalDate());
                paquete.setCantPersonas(rs.getInt(8));
                paquete.setCostoTotal(rs.getDouble(9));
                paquete.setActivo(rs.getBoolean(10));
                
                lista.add(paquete);
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener toda la lista. " + ex);
        }
        return lista;
    }
    
    public List<Paquete> obtenerPaquetesActivos() {
        List<Paquete> listaAc = new ArrayList<>();
        Cliente cli;
        Transporte tra;
        Alojamiento alo;
        Menu me;
        String sql = "SELECT * FROM paquete WHERE activo = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Paquete paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt(1));
                
                cli = buscarCliente(rs.getInt("id_cliente"));
                paquete.setCliente(cli);
                
                tra = buscarTransporte(rs.getInt("id_transporte"));
                paquete.setTransporte(tra);
                
                alo = buscarAlojamiento(rs.getInt("id_alojamiento"));
                paquete.setAlojamiento(alo);
                
                me = buscarMenu(rs.getInt("id_menu"));
                paquete.setMenu(me);
                
                paquete.setFechaInicio(rs.getDate(6).toLocalDate());
                paquete.setFechaFinal(rs.getDate(7).toLocalDate());
                paquete.setCantPersonas(rs.getInt(8));
                paquete.setCostoTotal(rs.getDouble(9));
                paquete.setActivo(rs.getBoolean(10));
                
                listaAc.add(paquete);
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener toda la lista. " + ex);
        }
        return listaAc;
    }
    
    public List<Paquete> obtenerPaquetesInactivos() {
        List<Paquete> listaIn = new ArrayList<>();
        Cliente cli;
        Transporte tra;
        Alojamiento alo;
        Menu me;
        String sql = "SELECT * FROM paquete WHERE activo = false";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Paquete paquete = new Paquete();
                paquete.setIdPaquete(rs.getInt(1));
                
                cli = buscarCliente(rs.getInt("id_cliente"));
                paquete.setCliente(cli);
                
                tra = buscarTransporte(rs.getInt("id_transporte"));
                paquete.setTransporte(tra);
                
                alo = buscarAlojamiento(rs.getInt("id_alojamiento"));
                paquete.setAlojamiento(alo);
                
                me = buscarMenu(rs.getInt("id_menu"));
                paquete.setMenu(me);
                
                paquete.setFechaInicio(rs.getDate(6).toLocalDate());
                paquete.setFechaFinal(rs.getDate(7).toLocalDate());
                paquete.setCantPersonas(rs.getInt(8));
                paquete.setCostoTotal(rs.getDouble(9));
                paquete.setActivo(rs.getBoolean(10));
                
                listaIn.add(paquete);
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener toda la lista. " + ex);
        }
        return listaIn;
    }
    
    public void activarPaquete(int id) {
        String sql = "UPDATE paquete SET activo = true WHERE id_paquete = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al activar Paquete. " + ex);
        }
    }
    
    public void desactivarPaquete(int id) {
        String sql = "UPDATE paquete SET activo = false WHERE id_paquete = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al desactivar Paquete. " + ex);
        }
    }
    
    public void borrarPaquete(int id) {
        String sql = "DELETE FROM paquete WHERE id_paquete = ?";
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar Paquete. " + ex);
        }
    }
    
    // Buscadores;
    public Cliente buscarCliente(int id) {
        ClienteData cliD = new ClienteData(conexion);
        
        return cliD.buscarCliente(id);
    }
    
    public Transporte buscarTransporte(int id) {
        TransporteData traD = new TransporteData(conexion);
        
        return traD.buscarTransporte(id);
    }
    
    public Alojamiento buscarAlojamiento(int id) {
        AlojamientoData aloD = new AlojamientoData(conexion);
        
        return aloD.buscarAlojamiento(id);
    }
    
    public Menu buscarMenu(int id) {
        MenuData meD = new MenuData(conexion);
        
        return meD.buscarMenu(id);
    }
}
