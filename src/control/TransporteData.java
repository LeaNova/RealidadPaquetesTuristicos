package control;

import java.sql.*;
import java.util.*;
import modelo.*;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class TransporteData {
        private Connection con;

    public TransporteData(Conexion t) { 
        try {
            this.con = t.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion " + ex);
        }

}

    public void AgregarTransporte(Transporte t){
        String sql = "INSERT INTO transporte (tipo_transporte,fecha_llegada,fecha_partida,costo,activo) VALUES (?,?,?,?,?)";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getTipodetransporte());
            ps.setDate(2, java.sql.Date.valueOf(t.getFechallegada()));
            ps.setDate(3, java.sql.Date.valueOf(t.getFechapartida()));
            ps.setDouble(4, t.getCosto());
            ps.setBoolean(5, t.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                t.setIdTransporte(rs.getInt(1));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al agregar un transporte. " + ex);;
        }
    }    
    
  public void ActualizarTransporte(Transporte t){
        String sql = "UPDATE transporte SET tipo_transporte = ?, fecha_llegada = ?, fecha_partida = ?, costo = ?, activo = ? WHERE id_transporte = ?";
        
        try{
            
            
           PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setString(1, t.getTipodetransporte());
            
             ps.setDate(2, java.sql.Date.valueOf(t.getFechallegada()));
          ps.setDate(3, java.sql.Date.valueOf(t.getFechapartida()));
          ps.setDouble(4, t.getCosto());
             ps.setBoolean(5, t.isActivo());
             
             
            ps.executeUpdate();
            ps.close();
                    
        }catch(SQLException ex){
            System.out.println("Error al actualizar el Transporte. " + ex);
        }
    }   
    
    
      public Transporte buscarTransporte(int idTransporte){
        Transporte t = new Transporte();
       
        
        String sql = "SELECT * FROM transporte WHERE id_transporte = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idTransporte);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                t.setIdTransporte(rs.getInt(1));
                t.setTipodetransporte(rs.getString(2));
                t.setFechallegada(rs.getDate(3).toLocalDate());
                t.setFechapartida(rs.getDate(4).toLocalDate());
                t.setCosto(rs.getDouble(5));
                 t.setActivo(rs.getBoolean(6));
                           
            }
            
        }catch(SQLException ex){
            System.out.println("Error al buscar el Transporte. " + ex);
        }
        
        return t;
    }
    
        public List<Transporte> obtenerTransportes(){
        List<Transporte> transportes = new ArrayList<>();
        
        
        String sql = "SELECT * FROM transporte";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Transporte t = new Transporte();
                
               t.setIdTransporte(rs.getInt(1));
                t.setTipodetransporte(rs.getString(2));
                t.setFechallegada(rs.getDate(3).toLocalDate());
                t.setFechapartida(rs.getDate(4).toLocalDate());
                t.setCosto(rs.getDouble(5));
                t.setActivo(rs.getBoolean(6));
                
                
                
                
                
     transportes.add(t);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los transportes. " + ex);
        }
        
        return transportes;
    }
    
    public List<Transporte> obtenerTransportesActivos(){
        List<Transporte> transportesactivos = new ArrayList<>();
        Transporte t = new Transporte();
       
        
        String sql = "SELECT * FROM transporte WHERE activo = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                 t.setIdTransporte(rs.getInt(1));
                 t.setTipodetransporte(rs.getString(2));
                 t.setFechallegada(rs.getDate(3).toLocalDate());
                t.setFechapartida(rs.getDate(4).toLocalDate());
                t.setCosto(rs.getDouble(5));
                t.setActivo(rs.getBoolean(6));

                transportesactivos .add(t);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Transportes activos. " + ex);
        }
        
        return transportesactivos;
    }
        public List<Transporte> obtenerTrasportesInactivos(){
        List<Transporte> transporteinactivos = new ArrayList<>();
        Transporte t = new Transporte();
       
        
        String sql = "SELECT * FROM transporte WHERE activo = false";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                t.setIdTransporte(rs.getInt(1));
                t.setTipodetransporte(rs.getString(2));
                t.setFechallegada(rs.getDate(3).toLocalDate());
                t.setFechapartida(rs.getDate(4).toLocalDate());
                t.setCosto(rs.getDouble(5));  
                t.setActivo(rs.getBoolean(6));

                transporteinactivos.add(t);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Trasportes inactivos. " + ex);
        }
        
        return transporteinactivos;
    }
        public void desactivarTransportes(int idTransporte){
        String sql = "UPDATE transporte SET activo = false WHERE id_transporte = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idTransporte);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al desactivar el Transporte. " + ex);
        }
    }
    
    public void activarTransportes(int idTransporte){
        String sql = "UPDATE transporte SET activo = true WHERE id_transporte = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idTransporte);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al activar el Transporte. " + ex);
        }
    }
    
    public void borrarTransporte(int idTransporte) {
        String sql = "DELETE FROM transporte WHERE id_transporte = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idTransporte);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar el transporte. " + ex);
        }
    }
}