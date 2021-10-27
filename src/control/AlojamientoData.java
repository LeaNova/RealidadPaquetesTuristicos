package control;

import java.sql.*;
import java.util.*;
import modelo.*;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class AlojamientoData {
    private Connection con;
    
    public AlojamientoData(Conexion c){
        try {
            this.con = c.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion " + ex);
        }
    }
    
    public void AgregarAlojamiento(Alojamiento a){
        String sql = "INSERT INTO alojamiento (tipo_alojamiento,nombre,ubicacion,costo,activo) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, a.getTipoAlojamiento());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getUbicacion());
            ps.setDouble(4, a.getCosto());
            ps.setBoolean(5, a.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                a.setIdAlojamiento(rs.getInt(1));
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al agregar un alojamiento. " + ex);
        }
    }
    
    public void ActualizarAlojamiento(Alojamiento a){
        String sql = "UPDATE alojamiento SET tipo_alojamiento = ?, nombre = ?, ubicacion = ?, costo = ?, activo = ? WHERE id_alojamiento = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, a.getTipoAlojamiento());
            ps.setString(2, a.getNombre());
            ps.setString(3, a.getUbicacion());
            ps.setDouble(4, a.getCosto());
            ps.setBoolean(5, a.isActivo());
            ps.setInt(6, a.getIdAlojamiento());
            
            ps.executeUpdate();
            ps.close();
                    
        }catch(SQLException ex){
            System.out.println("Error al actualizar el alojamiento. " + ex);
        }
    }
    
    public Alojamiento buscarAlojamieno(int idAlojamiento){
        Alojamiento a = new Alojamiento();
        
        String sql = "SELECT * FROM alojamiento WHERE id_alojamiento = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idAlojamiento);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                a.setIdAlojamiento(rs.getInt(1));
                a.setTipoAlojamiento(rs.getString(2));
                a.setNombre(rs.getString(3));
                a.setUbicacion(rs.getString(4));
                a.setCosto(rs.getDouble(5));
                a.setActivo(rs.getBoolean(6));
            }
            
            ps.close();
            
        }catch(SQLException ex){
            System.out.println("Error al buscar el alojamiento. " + ex);
        }
        
        return a;
    }
    
    public List<Alojamiento> obtenerAlojamientos(){
        List<Alojamiento> alojamientos = new ArrayList<>();
        Alojamiento a = new Alojamiento();
        
        String sql = "SELECT * FROM alojamiento";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                a.setIdAlojamiento(rs.getInt(1));
                a.setTipoAlojamiento(rs.getString(2));
                a.setNombre(rs.getString(3));
                a.setUbicacion(rs.getString(4));
                a.setCosto(rs.getDouble(5));
                a.setActivo(rs.getBoolean(6));
                
                alojamientos.add(a);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los alojamientos. " + ex);
        }
        
        return alojamientos;
    }
    
    public List<Alojamiento> obtenerAlojamientosActivos(){
        List<Alojamiento> alojamientos = new ArrayList<>();
        Alojamiento a = new Alojamiento();
        
        String sql = "SELECT * FROM alojamiento WHERE activo = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                a.setIdAlojamiento(rs.getInt(1));
                a.setTipoAlojamiento(rs.getString(2));
                a.setNombre(rs.getString(3));
                a.setUbicacion(rs.getString(4));
                a.setCosto(rs.getDouble(5));
                a.setActivo(rs.getBoolean(6));
                
                alojamientos.add(a);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener a los alojamientos activos. " + ex);
        }
        
        return alojamientos;
    }
    
    public List<Alojamiento> obtenerAlojamientosInactivos(){
        List<Alojamiento> alojamientos = new ArrayList<>();
        Alojamiento a = new Alojamiento();
        
        String sql = "SELECT * FROM alojamiento WHERE activo = false";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                a.setIdAlojamiento(rs.getInt(1));
                a.setTipoAlojamiento(rs.getString(2));
                a.setNombre(rs.getString(3));
                a.setUbicacion(rs.getString(4));
                a.setCosto(rs.getDouble(5));
                a.setActivo(rs.getBoolean(6));
                
                alojamientos.add(a);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener a los alojamientos inactivos. " + ex);
        }
        
        return alojamientos;
    }
    
    public void desactivarAlojamiento(int idAlojamiento){
        String sql = "UPDATE alojamiento SET activo = false WHERE id_alojamiento = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idAlojamiento);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al desactivar el alojamiento. " + ex);
        }
    }
    
    public void activarAlojamiento(int idAlojamiento){
        String sql = "UPDATE alojamiento SET activo = true WHERE id_alojamiento = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idAlojamiento);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al activar el alojamiento. " + ex);
        }
    }
    
    public void borrarAlojamiento(int idAlojamiento) {
        String sql = "DELETE FROM alojamiento WHERE id_alojamiento = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idAlojamiento);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar el alojamiento. " + ex);
        }
    }
}
