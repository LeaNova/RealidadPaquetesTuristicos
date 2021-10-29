package realidadpaquetesturisticos;

import modelo.*;
import control.*;
import java.time.LocalDate;

/**
 * @author Gomez Jon Darian, Guardia Lucero Santiago Agustín, Heredia Leandro
 */
public class RealidadPaquetesTuristicos {
    
    public static void main(String[] args) {
        /*
        try {
            Conexion con = new Conexion();
            
            // Instanciamiento de las clases Data.
            AlojamientoData ad = new AlojamientoData(con);
            ClienteData cd = new ClienteData(con);
            DestinoData dd = new DestinoData(con);
            MenuData md = new MenuData(con);
            PaqueteData pd = new PaqueteData(con);
            TransporteData td = new TransporteData(con);
            */
            // Creacion de todas las Clase Modelo.
            Alojamiento alo = new Alojamiento("Hotel Turismo IDE", "Hotel", "San Algunlugar", 1250.0, true);
            Cliente cli = new Cliente("Alejandro Martinez", 29255378, "ale_martinez@hotmail.com", 155687985, true);
            Destino des = new Destino("San Algunlugar", "Argentina", LocalDate.of(2021, 10, 25), LocalDate.of(2021, 10, 30), true);
            Menu me = new Menu("Desayuno", 350.0, true);
            Transporte tra = new Transporte("Coche cama", LocalDate.of(2021, 10, 25), LocalDate.of(2021, 10, 26), 850.50, true);
            
            Paquete pa = new Paquete(cli, tra, alo, me, des, LocalDate.of(2021, 10, 26), LocalDate.of(2021, 10, 30), true);
            
            System.out.println(pa.getCostoTotal());
            /*
        } catch (ClassNotFoundException ex) {
            System.out.println("Error! " + ex);
        }
        */
    }
    
}
