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
    String sql = "INSERT INTO transporte (tipo_transporte,nombre,costo,id_destino,activo) VALUES (?,?,?,?,?)";
        try {
          
            
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            ps.setString(1, t.getTipodetransporte());
            ps.setString(2, t.getNombre());
            ps.setDouble(3, t.getCosto());
            ps.setInt(4, t.getDestino().getIdDestino());
            ps.setBoolean(5, t.isActivo());
            
            
            
ps.executeUpdate();
ResultSet rs = ps.getGeneratedKeys();
        } catch (SQLException ex) {
            System.out.println("Error al agregar un transporte. " + ex);;
        }
}    
    
  public void ActualizarTransporte(Transporte t){
        String sql = "UPDATE transporte SET tipo_transporte = ?, nombre = ?, costo = ?, id_destino = ?, activo = ? WHERE id_transporte = ?";
        
        try{
            
            
           PreparedStatement ps = con.prepareStatement(sql);
           
            ps.setString(1, t.getTipodetransporte());
            ps.setString(2, t.getNombre());
            ps.setDouble(3, t.getCosto());
            ps.setInt(4, t.getDestino().getIdDestino());
            ps.setBoolean(5, t.isActivo());

            
            ps.executeUpdate();
            ps.close();
                    
        }catch(SQLException ex){
            System.out.println("Error al actualizar el Transporte. " + ex);
        }
    }   
    
    
      public Transporte buscarTransporte(int idTransporte){
        Transporte t = new Transporte();
        Destino destino;
        
        String sql = "SELECT * FROM transporte WHERE id_transporte = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idTransporte);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                
                t.setIdTransporte(rs.getInt(1));
                t.setTipodetransporte(rs.getString(2));
                t.setNombre(rs.getString(3));
                t.setCosto(rs.getDouble(4));
                destino = buscarDestino(rs.getInt(5));
                t.setActivo(rs.getBoolean(6));
                
                
                t.setDestino(destino);
           
                
            }
            
        }catch(SQLException ex){
            System.out.println("Error al buscar el Transporte. " + ex);
        }
        
        return t;
    }
    
        public List<Transporte> obtenerTransporte(){
        List<Transporte> transportes = new ArrayList<>();
        Destino destino;
        
        String sql = "SELECT * FROM transporte";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Transporte t = new Transporte();
                
               t.setIdTransporte(rs.getInt(1));
                t.setTipodetransporte(rs.getString(2));
                t.setNombre(rs.getString(3));
                t.setCosto(rs.getDouble(4));
                destino = buscarDestino(rs.getInt(5));
                t.setActivo(rs.getBoolean(6));
                
                
                t.setDestino(destino);
                
                
     transportes.add(t);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los transportes. " + ex);
        }
        
        return transportes;
    }
    
    public List<Transporte> obtenerTransportesActivos(){
        List<Transporte> transportes = new ArrayList<>();
        Transporte t = new Transporte();
       Destino destino;
        
        String sql = "SELECT * FROM transporte WHERE activo = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                 t.setIdTransporte(rs.getInt(1));
                t.setTipodetransporte(rs.getString(2));
                t.setNombre(rs.getString(3));
                t.setCosto(rs.getDouble(4));
                destino = buscarDestino(rs.getInt(5));
                t.setActivo(rs.getBoolean(6));
                
                
                t.setDestino(destino);
                
                transportes.add(t);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Transportes activos. " + ex);
        }
        
        return transportes;
    }
        public List<Transporte> obtenerTrasportesInactivos(){
        List<Transporte> transportes = new ArrayList<>();
        Transporte t = new Transporte();
        Destino destino;
        
        String sql = "SELECT * FROM transporte WHERE activo = false";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                t.setIdTransporte(rs.getInt(1));
                t.setTipodetransporte(rs.getString(2));
                t.setNombre(rs.getString(3));
                t.setCosto(rs.getDouble(4));
                destino = buscarDestino(rs.getInt(5));
                t.setActivo(rs.getBoolean(6));
                
                
                t.setDestino(destino);
                
                transportes.add(t);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Trasportes inactivos. " + ex);
        }
        
        return transportes;
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
    
    // Buscador
    public Destino buscarDestino(int  idDestino) {
    
        DestinoData des = new DestinoData((Conexion) con);
   
    
    return des.buscarDestino(idDestino);
    }
}
