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
            
            // Instanciamiento de las clases Data.
            AlojamientoData ad = new AlojamientoData(con);
            ClienteData cd = new ClienteData(con);
            DestinoData dd = new DestinoData(con);
            MenuData md = new MenuData(con);
            PaqueteData pd = new PaqueteData(con);
            TransporteData td = new TransporteData(con);
            
            // Creacion de todas las Clase Modelo.
            Alojamiento alo1 = new Alojamiento("Hotel Turismo IDE", "Hotel", "San Algunlugar", 750.0, true);
            Alojamiento alo2 = new Alojamiento("Hostal El Barrio", "Hostal", "Aguilea", 380.0, true);
            Alojamiento alo3 = new Alojamiento("Descanzo el Ritual", "Hostal", "", 250.0, true);
            Alojamiento alo4 = new Alojamiento("Resort: Buen aire", "Resort", "San Algunlugar", 1000.0, true);
            Cliente cli1 = new Cliente("Alejandro Martinez", 29255378, "ale_martinez@hotmail.com", 155687985, true);
            Cliente cli2 = new Cliente("Esteban Carrizo", 31555987, "e_c_1997@hotmail.com", 266560045, true);
            Cliente cli3 = new Cliente("Maria Antonieta", 39278978, "mariaanto@hotmail.com", 297897455, true);
            Cliente cli4 = new Cliente("Julia Carla Hernandez", 25985122, "jc_hernandez@hotmail.com", 355314697, true);
            Destino des1 = new Destino("San Algunlugar", "Argentina", LocalDate.of(2021, 10, 25), LocalDate.of(2021, 10, 30), true);
            Destino des2 = new Destino("Aguilea", "Argentina", LocalDate.of(2021, 1, 15), LocalDate.of(2021, 1, 23), true);
            Destino des3 = new Destino("Descanzo el Ritual", "Peru", LocalDate.of(2011, 7, 30), LocalDate.of(2011, 8, 5), true);
            Destino des4 = new Destino("Resort: Buen aire", "Peru", LocalDate.of(2017, 2, 1), LocalDate.of(2017, 2, 21), true);
            Menu me1 = new Menu("Desayuno", 150.0, true);
            Menu me2 = new Menu("Desayuno-Cena", 400.0, true);
            Menu me3 = new Menu("Cena", 250.0, true);
            Menu me4 = new Menu("Sin menu", 0.0, true);
            Transporte tra1 = new Transporte("Coche cama", LocalDate.of(2021, 10, 25), LocalDate.of(2021, 10, 26), 850.50, true);
            Transporte tra2 = new Transporte("Avion", LocalDate.of(2011, 7, 28), LocalDate.of(2011, 7, 29), 1600.0, true);
            Transporte tra3 = new Transporte("Avion", LocalDate.of(2017, 2, 1), LocalDate.of(2017, 2, 1), 1950.50, true);
            Transporte tra4 = new Transporte("Colectivo", LocalDate.of(2021, 1, 24), LocalDate.of(2021, 1, 25), 850.50, true);
            
            Paquete pa1 = new Paquete(cli1, tra1, alo1, me1, des1, LocalDate.of(2021, 10, 26), LocalDate.of(2021, 10, 30), true);
            Paquete pa2 = new Paquete(cli2, tra2, alo2, me2, des2, LocalDate.of(2021, 1, 15), LocalDate.of(2021, 1, 23), true);
            Paquete pa3 = new Paquete(cli3, tra3, alo3, me3, des3, LocalDate.of(2011, 7, 30), LocalDate.of(2021, 8, 5), true);
            Paquete pa4 = new Paquete(cli4, tra4, alo4, me4, des4, LocalDate.of(2017, 2, 1), LocalDate.of(2017, 2, 21), true);
            /*
            System.out.println(pa1);
            System.out.println(pa1.getCostoTotal());
            System.out.println(pa2 + "Con destino a " + pa2.getDestino().getPais() + " para 3 personas.");
            System.out.println(pa2.getCostoTotal() * 3);
            System.out.println(pa3 + " para el cliente " + pa3.getCliente().getNombre() + " en temporada media:");
            System.out.println(pa3.getCostoTotal());
            System.out.println(pa4 + " con alojamiento en " + pa4.getAlojamiento());
            System.out.println(pa4.getCostoTotal() * 2);
            */
            /*
            ad.AgregarAlojamiento(alo1);
            ad.AgregarAlojamiento(alo2);
            ad.AgregarAlojamiento(alo3);
            ad.AgregarAlojamiento(alo4);
            cd.AgregarCliente(cli1);
            cd.AgregarCliente(cli2);
            cd.AgregarCliente(cli3);
            cd.AgregarCliente(cli4);
            dd.AgregarDestino(des1);
            dd.AgregarDestino(des2);
            dd.AgregarDestino(des3);
            dd.AgregarDestino(des4);
            md.agregarMenu(me1);
            md.agregarMenu(me2);
            md.agregarMenu(me3);
            md.agregarMenu(me4);
            td.AgregarTransporte(tra1);
            td.AgregarTransporte(tra2);
            td.AgregarTransporte(tra3);
            td.AgregarTransporte(tra4);
            */
            pd.agregarPaquete(pa1);
            pd.agregarPaquete(pa2);
            pd.agregarPaquete(pa3);
            pd.agregarPaquete(pa4);
            
        } catch (ClassNotFoundException ex) {
            System.out.println("Error! " + ex);
        }
        
    }
    
}
