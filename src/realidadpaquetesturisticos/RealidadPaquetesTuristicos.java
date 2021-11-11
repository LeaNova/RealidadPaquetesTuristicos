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
            Alojamiento alo1 = new Alojamiento("Hotel Turismo IDE", "Hotel", "Puerto Deseado", 750.0, true);
            Alojamiento alo2 = new Alojamiento("Hostal El Barrio", "Hostal", "Buenos Aires", 380.0, true);
            Alojamiento alo3 = new Alojamiento("Descanzo el Ritual", "Hostal", "Lima", 250.0, true);
            Alojamiento alo4 = new Alojamiento("Resort: Buen aire", "Resort", "Lima", 1000.0, true);
            Cliente cli = new Cliente("Ramiro Padula", 28969158, "ramiro.pad@gmail.com", 157894182, true);
            Cliente cli1 = new Cliente("Alejandro Martinez", 29255378, "ale_martinez@hotmail.com", 155687985, true);
            Cliente cli2 = new Cliente("Esteban Carrizo", 31555987, "e_c_1997@hotmail.com", 266560045, true);
            Cliente cli3 = new Cliente("Maria Antonieta", 39278978, "mariaanto@hotmail.com", 297897455, true);
            Cliente cli4 = new Cliente("Julia Carla Hernandez", 25985122, "jc_hernandez@hotmail.com", 355314697, true);
            Destino des = new Destino("BuenosAires", "Argentina", LocalDate.of(2021, 11, 25), LocalDate.of(2021, 11, 30), true);
            Destino des1 = new Destino("Buenos Aires", "Argentina", LocalDate.of(2021, 10, 25), LocalDate.of(2021, 10, 30), true);
            Destino des2 = new Destino("Puerto Deseado", "Argentina", LocalDate.of(2021, 1, 15), LocalDate.of(2021, 1, 23), true);
            Destino des3 = new Destino("Lima", "Peru", LocalDate.of(2011, 7, 30), LocalDate.of(2011, 8, 5), true);
            Destino des4 = new Destino("Lima", "Peru", LocalDate.of(2017, 2, 1), LocalDate.of(2017, 2, 11), true);
            Menu me = new Menu("Completo", 1000.0, true);
            Menu me1 = new Menu("Desayuno", 150.0, true);
            Menu me2 = new Menu("Desayuno-Cena", 400.0, true);
            Menu me3 = new Menu("Cena", 250.0, true);
            Menu me4 = new Menu("Sin menu", 0.0, true);
            Transporte tra = new Transporte("Avion Primera Clase", "Lima", LocalDate.of(2021, 11, 25), LocalDate.of(2021, 11, 26), 1675.50, true);
            Transporte tra1 = new Transporte("Coche cama", "Puerto Deseado", LocalDate.of(2021, 10, 25), LocalDate.of(2021, 10, 26), 850.50, true);
            Transporte tra2 = new Transporte("Avion", "Buenos Aires", LocalDate.of(2011, 7, 28), LocalDate.of(2011, 7, 29), 1600.0, true);
            Transporte tra3 = new Transporte("Avion", "Lima", LocalDate.of(2017, 2, 1), LocalDate.of(2017, 2, 1), 1950.50, true);
            Transporte tra4 = new Transporte("Colectivo", "Puerto Deseado", LocalDate.of(2021, 1, 24), LocalDate.of(2021, 1, 25), 850.50, true);
            
            Paquete pa = new Paquete(cli, tra, alo, me, des, LocalDate.of(2021, 10, 26), LocalDate.of(2021, 10, 30), true);
            Paquete pa1 = new Paquete(cli1, tra1, alo1, me1, des1, LocalDate.of(2021, 10, 26), LocalDate.of(2021, 10, 30), true);
            Paquete pa2 = new Paquete(cli2, tra2, alo2, me2, des2, LocalDate.of(2021, 1, 15), LocalDate.of(2021, 1, 23), true);
            Paquete pa3 = new Paquete(cli3, tra3, alo3, me3, des3, LocalDate.of(2011, 7, 30), LocalDate.of(2021, 8, 5), true);
            Paquete pa4 = new Paquete(cli4, tra4, alo4, me4, des4, LocalDate.of(2017, 2, 1), LocalDate.of(2017, 2, 21), true);
            
            ad.agregarAlojamiento(alo);
            ad.agregarAlojamiento(alo1);
            ad.agregarAlojamiento(alo2);
            ad.agregarAlojamiento(alo3);
            ad.agregarAlojamiento(alo4);
            cd.agregarCliente(cli);
            cd.agregarCliente(cli1);
            cd.agregarCliente(cli2);
            cd.agregarCliente(cli3);
            cd.agregarCliente(cli4);
            dd.agregarDestino(des);
            dd.agregarDestino(des1);
            dd.agregarDestino(des2);
            dd.agregarDestino(des3);
            dd.agregarDestino(des4);
            md.agregarMenu(me);
            md.agregarMenu(me1);
            md.agregarMenu(me2);
            md.agregarMenu(me3);
            md.agregarMenu(me4);
            td.agregarTransporte(tra);
            td.agregarTransporte(tra1);
            td.agregarTransporte(tra2);
            td.agregarTransporte(tra3);
            td.agregarTransporte(tra4);
            
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
            
            //pd.desactivarPaquete(pa.getIdPaquete());
            System.out.println(pd.obtenerPaquetes());
            System.out.println(pd.obtenerPaquetesInactivos());
            
            ad.desactivarAlojamiento(alo.getIdAlojamiento());
            cd.desactivarCliente(cli.getIdCliente());
            dd.desactivarDestino(des.getIdDestino());
            md.desactivarMenu(me.getIdMenu());
            td.desactivarTransportes(tra.getIdTransporte());
            //pd.desactivarPaquete(pa.getIdPaquete());
            
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
