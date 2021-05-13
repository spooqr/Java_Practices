package dominio;

public class Persona {
    private String nombre; // Sin modificador de acceso es default por defecto
    private double sueldo; // Usar private es la mejor practica
    private boolean eliminado;

    public Persona(String nombre, double sueldo, boolean eliminado) {
        this.nombre = nombre;
        this.sueldo = sueldo;
        this.eliminado = eliminado;
    }

    //Los GETTERS y SETTERS ya vienen definidos, esto es de practica

    // Metodo GET y SET, para recuperar la informacion y asignarla respectivamente
    public String getNombre() {
        return this.nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getSueldo() {
        return this.sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public boolean isEliminado() { // Con tipo boolean se usa is en lugar de get
        return this.eliminado;
    }

    public void setEliminado(boolean eliminado) {
        this.eliminado = eliminado;
    }

    // Metodo toString() para imprimir todos los atributos
    public String toString() {
        return "Persona [nombre: " + this.nombre +
                ", sueldo: " + this.sueldo +
                ", eliminado: " + this.eliminado + "]";
    }
}
