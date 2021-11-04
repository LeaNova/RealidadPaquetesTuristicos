package control;

import java.sql.*;
import java.util.*;
import modelo.*;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class ClienteData {
     private Connection con;

    public ClienteData(Conexion c) { 
        try {
            this.con = c.getConexion();
        } catch (SQLException ex) {
            System.out.println("Error en la conexion " + ex);
        }

}

    public void agregarCliente(Cliente c){
        String sql = "INSERT INTO cliente (nombre,dni,contacto,celular,activo) VALUES (?,?,?,?,?)";
    
        try {
            PreparedStatement ps = con.prepareStatement(sql, Statement.RETURN_GENERATED_KEYS);
            
            ps.setString(1, c.getNombre());
            ps.setInt(2, c.getDni());
            ps.setString(3, c.getContacto());
            ps.setInt(4, c.getCelular());
            ps.setBoolean(5, c.isActivo());
            
            ps.executeUpdate();
            ResultSet rs = ps.getGeneratedKeys();
            
            if (rs.next()) {
                c.setIdCliente(rs.getInt(1));
            }
            
        } catch (SQLException ex) {
            System.out.println("Error al agregar un Cliente. " + ex);;
        }
}    
    
  public void actualizarCliente(Cliente c){
        String sql = "UPDATE cliente SET nombre = ?, dni = ?, contacto = ?, celular = ? WHERE id_cliente = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            ps.setString(1, c.getNombre());
            ps.setInt(2, c.getDni());
            ps.setString(3, c.getContacto());
            ps.setInt(4, c.getCelular());
            ps.setInt(5, c.getIdCliente());
            
            ps.executeUpdate();
            ps.close();
                    
        }catch(SQLException ex){
            System.out.println("Error al actualizar el Cliente. " + ex);
        }
    }   
    
    
      public Cliente buscarCliente(int idCliente){
        Cliente c = new Cliente();
        
        
        String sql = "SELECT * FROM cliente WHERE id_cliente = ?";
        
        try{
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idCliente);
            
            ResultSet rs = ps.executeQuery();
            
            if(rs.next()){
                c.setIdCliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setDni(rs.getInt(3));
                c.setContacto(rs.getString(4));
                c.setCelular(rs.getInt(5));   
                c.setActivo(rs.getBoolean(6));
                

                
            }
            
        }catch(SQLException ex){
            System.out.println("Error al buscar el Cliente. " + ex);
        }
        
        return c;
    }
    
        public List<Cliente> obtenerClientes(){
        List<Cliente> clientes = new ArrayList<>();
        
        
        String sql = "SELECT * FROM cliente";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                Cliente c = new Cliente();
                
                c.setIdCliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setDni(rs.getInt(3));
                c.setContacto(rs.getString(4));
                c.setCelular(rs.getInt(5));  
                
                c.setActivo(rs.getBoolean(6));
                
                
     clientes.add(c);
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Clientes. " + ex);
        }
        
        return clientes;
    }
    
    public List<Cliente> obtenerClientesActivos(){
        List<Cliente> clientes = new ArrayList<>();
        Cliente c = new Cliente();
       
        
        String sql = "SELECT * FROM cliente WHERE activo = true";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                c.setIdCliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setDni(rs.getInt(3));
                c.setContacto(rs.getString(4));
                c.setCelular(rs.getInt(5));  
                
                c.setActivo(rs.getBoolean(6));
                
                clientes.add(c);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Clientes activos. " + ex);
        }
        
        return clientes;
    }
        public List<Cliente> obtenerClientesInactivos(){
        List<Cliente> clientes = new ArrayList<>();
        Cliente c = new Cliente();
       
        
        String sql = "SELECT * FROM cliente WHERE activo = false";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ResultSet rs = ps.executeQuery();
            
            while(rs.next()){
                c.setIdCliente(rs.getInt(1));
                c.setNombre(rs.getString(2));
                c.setDni(rs.getInt(3));
                c.setContacto(rs.getString(4));
                c.setCelular(rs.getInt(5));  
                
                c.setActivo(rs.getBoolean(6));
                
                clientes.add(c);
                
            }
            
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al obtener los Clientes inactivos. " + ex);
        }
        
        return clientes;
    }
        public void desactivarCliente(int idCliente){
        String sql = "UPDATE cliente SET activo = false WHERE id_cliente = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idCliente);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al desactivar el cliente. " + ex);
        }
    }
    
    public void activarCliente(int idCliente){
        String sql = "UPDATE cliente SET activo = true WHERE id_cliente = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idCliente);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al activar el cliente. " + ex);
        }
    }
    
    public void borrarCliente(int idCliente) {
        String sql = "DELETE FROM cliente WHERE id_cliente = ?";
        
        try {
            PreparedStatement ps = con.prepareStatement(sql);
            
            ps.setInt(1, idCliente);
            
            ps.executeUpdate();
            ps.close();
            
        } catch (SQLException ex) {
            System.out.println("Error al borrar el cliente. " + ex);
        }
    }
}
