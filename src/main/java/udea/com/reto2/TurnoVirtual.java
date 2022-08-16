
package udea.com.reto2;


public class TurnoVirtual {
    
    // Atributos
    private String[] turnos;
    private String[] turnosPerdidos;
    private boolean estadoTurnoVirtual = true;
    private int turnoEnAtencion = 0;
    private int cantidadTurnosAtendidos = 1;
    private int indice = 0;
    
    // contructor

    public TurnoVirtual(String[] turnos) {
        this.turnos = turnos;
        turnosPerdidos = new String[turnos.length];
        for(int i = 0 ; i < turnosPerdidos.length ; i++){
            turnosPerdidos[i] = " ";
        }//fin for
    }// fin constructor
    
    //setters
    public void setTurnos(String[] turnos) {
        this.turnos = turnos;
    }

    public void setTurnosPerdidos(String[] turnosPerdidos) {
        this.turnosPerdidos = turnosPerdidos;
    }

    public void setEstadoTurnoVirtual(boolean estadoTurnoVirtual) {
        this.estadoTurnoVirtual = estadoTurnoVirtual;
    }

    public void setTurnoEnAtencion(int turnoEnAtencion) {
        this.turnoEnAtencion = turnoEnAtencion;
    }

    public void setCantidadTurnosAtendidos(int cantidadTurnosAtendidos) {
        this.cantidadTurnosAtendidos = cantidadTurnosAtendidos;
    }
    
    //getters

    public String[] getTurnos() {
        return turnos;
    }

    public String[] getTurnosPerdidos() {
        return turnosPerdidos;
    }

    public boolean isEstadoTurnoVirtual() {
        return estadoTurnoVirtual;
    }

    public int getTurnoEnAtencion() {
        return turnoEnAtencion;
    }

    public int getCantidadTurnosAtendidos() {
        return cantidadTurnosAtendidos;
    }
    
    //metodos
    public void atenderProximoTurno() {
        if (estadoTurnoVirtual == true) {
            String enAtencion = turnos[indice];
            indice ++;
            turnoEnAtencion ++;
            cantidadTurnosAtendidos ++;
        }// fin if
    }// fin metodo atender proximo turno    
    
    public void agregarTurnoPerdido() {
    for (int i = 0; i < turnosPerdidos.length; i++) {
        if (" ".equals(turnosPerdidos[i])) {
            turnosPerdidos[i] = turnos[turnoEnAtencion];
            break;
            }//fin if
        }//fin for
    }//fin metodo agregarTurnoPerdido
    
    
    public void cambiarEstadoTurno() {
        if(estadoTurnoVirtual != true){
            estadoTurnoVirtual = true;
        }else{
            estadoTurnoVirtual = false;
        }
    }// fin cambiar turno

    private void wihle(boolean b) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
}//fin clase turno virtual
