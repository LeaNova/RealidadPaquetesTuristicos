package control;

import java.sql.*;
import java.util.*;

import modelo.*;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class MenuData {
    private Connection con;
    
    public MenuData(Conexion conexion) {
        try {
            con = conexion.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion. " + ex);
        }
    }
    
    public void agregarMenu(Menu menu) {
        String sql = "INSERT INTO menu (tipo_menu, costo, activo) VALUES (?, ?, ?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, menu.getTipoMenu());
            ps.setDouble(2, menu.getCosto());
            ps.setBoolean(3, menu.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                menu.setIdMenu(rs.getInt(1));
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al agregar menu. " + ex);
        }
    }
    
    public void actualizarMenu(Menu menu) {
        String sql = "UPDATE menu SET tipo_menu = ?, costo = ? WHERE id_menu = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, menu.getTipoMenu());
            ps.setDouble(2, menu.getCosto());
            
            ps.setInt(3, menu.getIdMenu());
            
            ps.executeUpdate();
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al actualizar menu. " + ex);
        }
    }
    
    public Menu buscarMenu(int id) {
        Menu menu = new Menu();
        String sql = "SELECT * FROM menu WHERE id_menu = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setInt(1, id);
            
            ResultSet rs = ps.executeQuery();
            
            if (rs.next()) {
                menu.setIdMenu(rs.getInt(1));
                menu.setTipoMenu(rs.getString(2));
                menu.setCosto(rs.getDouble(3));
                menu.setActivo(rs.getBoolean(4));
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al buscar menu. " + ex);
        }
        
        return menu;
    }
    
    public List<Menu> obtenerMenues() {
        List<Menu> lista = new ArrayList<>();
        String sql = "SELECT * FROM menu";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt(1));
                menu.setTipoMenu(rs.getString(2));
                menu.setCosto(rs.getDouble(3));
                menu.setActivo(rs.getBoolean(4));
                
                lista.add(menu);
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los menues. " + ex);
        }
        
        return lista;
    }
    
    public List<Menu> obtenerMenuesActivos() {
        List<Menu> listaAc = new ArrayList<>();
        String sql = "SELECT * FROM menu WHERE activo = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt(1));
                menu.setTipoMenu(rs.getString(2));
                menu.setCosto(rs.getDouble(3));
                menu.setActivo(rs.getBoolean(4));
                
                listaAc.add(menu);
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los menues activos. " + ex);
        }
        
        return listaAc;
    }
    
    public List<Menu> obtenerMenuesInactivos() {
        List<Menu> listaIn = new ArrayList<>();
        String sql = "SELECT * FROM menu WHERE activo = false";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            
            while (rs.next()) {
                Menu menu = new Menu();
                menu.setIdMenu(rs.getInt(1));
                menu.setTipoMenu(rs.getString(2));
                menu.setCosto(rs.getDouble(3));
                menu.setActivo(rs.getBoolean(4));
                
                listaIn.add(menu);
            }
            
            ps.close();
        } catch (SQLException ex) {
            System.out.println("Error al obtener los menues inactivos. " + ex);
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
            System.out.println("Error al activar menu. " + ex);
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
            System.out.println("Error al desactivar menu. " + ex);
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
            System.out.println("Error al borrar menu. " + ex);
        }
    }
}