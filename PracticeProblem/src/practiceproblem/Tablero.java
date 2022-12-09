
package practiceproblem;


public class Tablero {
    int tamanoi;
    int tamanoj;
    String nombre;

    public Tablero(int tamanoi, int tamanoj, String nombre) {
        this.tamanoi = tamanoi;
        this.nombre = nombre;
        this.tamanoj = tamanoj;
    }

    public int getTamano() {
        return tamanoi;
    }

    public void setTamano(int tamanoi) {
        this.tamanoi = tamanoi;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
    
    public int getTamanoj(){
        return tamanoj;
    }
    
    public void setTamanoj(int tamanoj){
        this.tamanoj = tamanoj;
    }
   
}
