

package udea.com.reto2;

import java.util.Arrays;


public class Principal {

    public static void main(String[] args) {
        
    // Pantallazo 1
    String[] cola = {"A10", "A11", "A12", "A13", "A14","A15", "A16", "A17", "A18", "A19", "A20", "A21", "A22", "A23", "A24", "A25", "A26", "A27", "A28", "A29", "A30"};
        
    TurnoVirtual turnoVirtual1 = new TurnoVirtual(cola);
    
    // Pantallazo 2
    turnoVirtual1.atenderProximoTurno();
    turnoVirtual1.atenderProximoTurno();
    turnoVirtual1.atenderProximoTurno();
    turnoVirtual1.atenderProximoTurno();
    
    // Pantallazo 3
    turnoVirtual1.agregarTurnoPerdido();
    turnoVirtual1.atenderProximoTurno();
    turnoVirtual1.agregarTurnoPerdido();
    turnoVirtual1.atenderProximoTurno();
    turnoVirtual1.agregarTurnoPerdido();
    
    // Pantallazo 4
    turnoVirtual1.cambiarEstadoTurno();
    turnoVirtual1.atenderProximoTurno();
    turnoVirtual1.cambiarEstadoTurno();
    
    
    //impresiones
    System.out.println("**********************************");
    
    System.out.print("Turnos: ");
    System.out.println(Arrays.toString(turnoVirtual1.getTurnos()));
    
    System.out.println("**********************************");
    
    System.out.print("Turnos Perdidos: ");
    System.out.println(Arrays.toString(turnoVirtual1.getTurnosPerdidos()));
    
    System.out.println("**********************************");
    
    System.out.print("Estado del Turno Virtual: ");
    System.out.println(turnoVirtual1.isEstadoTurnoVirtual());
    
    System.out.println("**********************************");
    
    System.out.print("Turno en Atención: ");
    System.out.println(turnoVirtual1.getTurnoEnAtencion());
    
    System.out.println("**********************************");
    
    System.out.print("Cantidad de turnos atendidos:");
    System.out.println(turnoVirtual1.getCantidadTurnosAtendidos());
    
    System.out.println("**********************************");
    
    }// fin made
}//fin clase principal
