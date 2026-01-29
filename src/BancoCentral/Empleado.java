
package BancoCentral;

//clase empleado
public class Empleado {
    private int Id;
    private String nombre;
    private String puesto;
    private double salario;
    private int dias_vacaciones;
    private int Antiguedad;

    public Empleado() {
    }

    public Empleado(int Id, String nombre, String puesto, double salario, int dias_vacaciones, int Antiguedad) {
        this.Id = Id;
        this.nombre = nombre;
        this.puesto = puesto;
        this.salario = salario;
        this.dias_vacaciones = dias_vacaciones;
        this.Antiguedad = Antiguedad;
    }

    public int getId() {
        return Id;
    }

    public void setId(int Id) {
        this.Id = Id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSalario() {
        return salario;
    }

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getDias_vacaciones() {
        return dias_vacaciones;
    }

    public void setDias_vacaciones(int dias_vacaciones) {
        this.dias_vacaciones = dias_vacaciones;
    }

    public int getAntiguedad() {
        return Antiguedad;
    }

    public void setAntiguedad(int Antiguedad) {
        this.Antiguedad = Antiguedad;
    }
// metodo toString
    @Override
    public String toString() {
        return "Empleado{" + "Id=" + Id + ", nombre=" + nombre + ", puesto=" + puesto + ", salario=" + salario + ", dias_vacaciones=" + dias_vacaciones + ", Antiguedad=" + Antiguedad + '}';
    }
    
    
}
