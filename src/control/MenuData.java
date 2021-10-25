package control;

import java.sql.*;
import java.util.*;

import modelo.*;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class MenuData {
    private Connection con;
    private Conexion conexion;
    
    public MenuData(Conexion conexion) {
        try {
            con = conexion.getConexion();
            this.conexion = conexion;
        } catch (SQLException ex) {
            System.out.println("Error en la conexion");
        }
    }
    
    public void agregarMenu(Menu menu, Alojamiento alo) {
        String sql = "INSERT INTO menu (tipo_menu, costo, id_alojamiento, activo) VALUES (?, ?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, menu.getTipoMenu());
            ps.setDouble(2, menu.getCosto());
            ps.setInt(3, alo.getIdAlojamiento());
            ps.setBoolean(4, menu.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                menu.setIdMenu(rs.getInt(1));
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al agregar Menu. " + ex);
        }
    }
    
    public void actualizarMenu(Menu menu) {
        String sql = "UPDATE menu SET tipo_menu = ?, costo = ?, id_alojamiento = ?, activo = ? WHERE id_menu = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, menu.getTipoMenu());
            ps.setDouble(2, menu.getCosto());
            ps.setInt(3, menu.getAlojamiento().getIdAlojamiento());
            ps.setBoolean(4, menu.isActivo());
            
            ps.setInt(5, menu.getIdMenu());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error en actualizar Menu. " + ex);
        }
    }
    
    public Menu buscarMenu(int id) {
        Menu menu = new Menu();
        Alojamiento alo;
        String sql = "SELECT * FROM menu WHERE id_menu = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                menu.setIdMenu(rs.getInt(1));
                menu.setTipoMenu(rs.getString(2));
                menu.setCosto(rs.getDouble(3));
                
                alo = buscarAlojamiento(rs.getInt("id_alojamiento"));
                menu.setAlojamiento(alo);
                
                menu.setActivo(rs.getBoolean(5));
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error en buscar Menu. " + ex);
        }
        
        return menu;
    }
    
    public List<Menu> obtenerMenues() {
        List<Menu> lista = new ArrayList<>();
        Alojamiento alo;
        String sql = "SELECT * FROM menu";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt(1));
                menu.setTipoMenu(rs.getString(2));
                menu.setCosto(rs.getDouble(3));
                
                alo = buscarAlojamiento(rs.getInt("id_alojamiento"));
                menu.setAlojamiento(alo);
                
                menu.setActivo(rs.getBoolean(5));
                
                lista.add(menu);
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener toda la lista. " + ex);
        }
        
        return lista;
    }
    
    public List<Menu> obtenerMenuesActivos() {
        List<Menu> listaAc = new ArrayList<>();
        Alojamiento alo;
        String sql = "SELECT * FROM menu WHERE activo = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt(1));
                menu.setTipoMenu(rs.getString(2));
                menu.setCosto(rs.getDouble(3));
                
                alo = buscarAlojamiento(rs.getInt("id_alojamiento"));
                menu.setAlojamiento(alo);
                
                menu.setActivo(rs.getBoolean(5));
                
                listaAc.add(menu);
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener toda la lista. " + ex);
        }
        
        return listaAc;
    }
    
    public List<Menu> obtenerMenuesInactivos() {
        List<Menu> listaIn = new ArrayList<>();
        Alojamiento alo;
        String sql = "SELECT * FROM menu WHERE activo = false";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt(1));
                menu.setTipoMenu(rs.getString(2));
                menu.setCosto(rs.getDouble(3));
                
                alo = buscarAlojamiento(rs.getInt("id_alojamiento"));
                menu.setAlojamiento(alo);
                
                menu.setActivo(rs.getBoolean(5));
                
                listaIn.add(menu);
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener toda la lista. " + ex);
        }
        
        return listaIn;
    }
    
    public void activarMenu(int id) {
        String sql = "UPDATE menu SET activo = true WHERE id_menu = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al activar Menu. " + ex);
        }
    }
    
    public void desactivarMenu(int id) {
        String sql = "UPDATE menu SET activo = false WHERE id_menu = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al desactivar Menu. " + ex);
        }
    }
    
    public void borrarMenu(int id) {
        String sql = "DELETE FROM menu WHERE id_menu = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, id);
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error en borrar Menu. " + ex);
        }
    }
    
    // Buscador
    public Alojamiento buscarAlojamiento(int id) {
        AlojamientoData aloD = new AlojamientoData(conexion);
        
        return aloD.buscarAlojamiento(id);
    }
}