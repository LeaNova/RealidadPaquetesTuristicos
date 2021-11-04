package realidadpaquetesturisticos;

import modelo.*;
import control.*;
import java.time.LocalDate;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class RealidadPaquetesTuristicos {
    
    public static void main(String[] args) {
        
        try {
            Conexion con = new Conexion();
            
            AlojamientoData ad = new AlojamientoData(con);
            ClienteData cd = new ClienteData(con);
            DestinoData dd = new DestinoData(con);
            MenuData md = new MenuData(con);
            PaqueteData pd = new PaqueteData(con);
            TransporteData td = new TransporteData(con);
            
            Alojamiento alo = new Alojamiento("Resort: Almalibre", "Resort", "Buenos Aires", 475.0, true);
            Cliente cli = new Cliente("Ramiro Padula", 28969158, "ramiro.pad@gmail.com", 157894182, true);
            Destino des = new Destino("BuenosAires", "Argentina", LocalDate.of(2021, 11, 25), LocalDate.of(2021, 11, 30), true);
            Menu me = new Menu("Completo", 1000.0, true);
            Transporte tra = new Transporte("Avion Primera Clase", LocalDate.of(2021, 11, 25), LocalDate.of(2021, 11, 26), 1675.50, true);
            
            Paquete pa = new Paquete(cli, tra, alo, me, des, LocalDate.of(2021, 10, 26), LocalDate.of(2021, 10, 30), true);
            
            ad.agregarAlojamiento(alo);
            cd.agregarCliente(cli);
            dd.agregarDestino(des);
            md.agregarMenu(me);
            td.agregarTransporte(tra);
            pd.agregarPaquete(pa);
            
            System.out.println(ad.obtenerAlojamientos());
            cd.desactivarCliente(cli.getIdCliente());
            System.out.println(cd.obtenerClientesInactivos());
            cd.activarCliente(cli.getIdCliente());
            System.out.println(cd.obtenerClientesActivos());
            
            System.out.println(dd.buscarDestino(des.getIdDestino()));
            des.setNombre("Buenos Aires");
            dd.actualizarDestino(des);
            System.out.println(dd.buscarDestino(des.getIdDestino()));
            
            System.out.println(md.obtenerMenuesInactivos());
            
            pd.desactivarPaquete(pa.getIdPaquete());
            System.out.println(pd.obtenerPaquetes());
            System.out.println(pd.obtenerPaquetesInactivos());
            
            ad.desactivarAlojamiento(alo.getIdAlojamiento());
            cd.desactivarCliente(cli.getIdCliente());
            dd.desactivarDestino(des.getIdDestino());
            md.desactivarMenu(me.getIdMenu());
            td.desactivarTransportes(tra.getIdTransporte());
            pd.desactivarPaquete(pa.getIdPaquete());
            
            System.out.println("Prueba completa del retorno de listas");
            System.out.println(ad.obtenerAlojamientos() + "\n" + ad.obtenerAlojamientosActivos() + "\n" + ad.obtenerAlojamientosInactivos());
            System.out.println(cd.obtenerClientes() + "\n" + cd.obtenerClientesActivos() + "\n" + cd.obtenerClientesInactivos());
            System.out.println(dd.obtenerDestinos() + "\n" + dd.obtenerDestinosActivos() + "\n" + dd.obtenerDestinosInactivos());
            System.out.println(md.obtenerMenues() + "\n" + md.obtenerMenuesActivos() + "\n" + md.obtenerMenuesInactivos());
            System.out.println(pd.obtenerPaquetes() + "\n" + pd.obtenerPaquetesActivos() + "\n" + pd.obtenerPaquetesInactivos());
            System.out.println(td.obtenerTransportes() + "\n" + td.obtenerTransportesActivos() + "\n" + td.obtenerTrasportesInactivos());
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error! " + ex);
        }
        
    }
    
}
