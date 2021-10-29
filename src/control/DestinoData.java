package control;

import java.sql.*;
import java.util.List;
import java.util.ArrayList;
import modelo.*;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class DestinoData {
    private Connection con;
    
    public DestinoData(Conexion c){
        try {
            this.con = c.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion " + ex);
        }
    }
    
    public void AgregarDestino(Destino d){
        String sql = "INSERT INTO destino (nombre,pais,fecha_altaInicial,fecha_altaFinal,activo) VALUES (?,?,?,?,?)";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, d.getNombre());
            ps.setString(2, d.getPais());
            ps.setDate(3, Date.valueOf(d.getFechaInicial()));
            ps.setDate(4, Date.valueOf(d.getFechaFinal()));
            ps.setBoolean(5, d.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if(rs.next()){
                d.setIdDestino(rs.getInt(1));
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al agregar un destino. " + ex);
        }
    }
    
    public void ActualizarDestino(Destino d){
        String sql = "UPDATE destino SET nombre = ?, pais = ?, fecha_altaInicial = ?, fecha_altaFinal = ?, activo = ? WHERE id_destino = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setString(1, d.getNombre());
            ps.setString(2, d.getPais());
            ps.setDate(3, Date.valueOf(d.getFechaInicial()));
            ps.setDate(4, Date.valueOf(d.getFechaFinal()));
            ps.setBoolean(5, d.isActivo());
            ps.setInt(6, d.getIdDestino());
            
            ps.executeUpdate();
            ps.close();
                    
        }catch(SQLException ex){
            System.out.println("Error al actualizar el destino. " + ex);
        }
    }
    
    public Destino buscarDestino(int idDestino){
        Destino d = new Destino();
        
        String sql = "SELECT * FROM destino WHERE id_destino = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idDestino);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                d.setIdDestino(rs.getInt(1));
                d.setNombre(rs.getString(2));
                d.setPais(rs.getString(3));
                d.setFechaInicial(rs.getDate(4).toLocalDate());
                d.setFechaFinal(rs.getDate(5).toLocalDate());
                d.setActivo(rs.getBoolean(6));
            }
            
        }catch(SQLException ex){
            System.out.println("Error al buscar el destino. " + ex);
        }
        
        return d;
    }
    
    public List<Destino> obtenerDestinos(){
        List<Destino> destinos = new ArrayList<>();
        
        String sql = "SELECT * FROM destino";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Destino d = new Destino();
                
                d.setIdDestino(rs.getInt(1));
                d.setNombre(rs.getString(2));
                d.setPais(rs.getString(3));
                d.setFechaInicial(rs.getDate(4).toLocalDate());
                d.setFechaFinal(rs.getDate(5).toLocalDate());
                d.setActivo(rs.getBoolean(6));
                
                destinos.add(d);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los destinos. " + ex);
        }
        
        return destinos;
    }
    
    public List<Destino> obtenerDestinosActivos(){
        List<Destino> destinos = new ArrayList<>();
        Destino d = new Destino();
        
        String sql = "SELECT * FROM destino WHERE activo = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                d.setIdDestino(rs.getInt(1));
                d.setNombre(rs.getString(2));
                d.setPais(rs.getString(3));
                d.setFechaInicial((rs.getDate(4)).toLocalDate());
                d.setFechaFinal((rs.getDate(5)).toLocalDate());
                d.setActivo(rs.getBoolean(6));
                
                destinos.add(d);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los destinos activos. " + ex);
        }
        
        return destinos;
    }
    
    public List<Destino> obtenerDestinosInactivos(){
        List<Destino> destinos = new ArrayList<>();
        Destino d = new Destino();
        
        String sql = "SELECT * FROM destino WHERE activo = false";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                d.setIdDestino(rs.getInt(1));
                d.setNombre(rs.getString(2));
                d.setPais(rs.getString(3));
                d.setFechaInicial(rs.getDate(4).toLocalDate());
                d.setFechaFinal(rs.getDate(5).toLocalDate());
                d.setActivo(rs.getBoolean(6));
                
                destinos.add(d);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los destinos inactivos. " + ex);
        }
        
        return destinos;
    }
    
    public void desactivarDestino(int idDestino){
        String sql = "UPDATE destino SET activo = false WHERE id_destino = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idDestino);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al desactivar el destino. " + ex);
        }
    }
    
    public void activarDestino(int idDestino){
        String sql = "UPDATE destino SET activo = true WHERE id_destino = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idDestino);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al activar el destino. " + ex);
        }
    }
    
    public void borrarDestino(int idDestino) {
        String sql = "DELETE FROM destino WHERE id_destino = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idDestino);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar el destino. " + ex);
        }
    }
}