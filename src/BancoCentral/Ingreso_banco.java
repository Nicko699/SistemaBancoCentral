
package BancoCentral;

import java.util.Scanner;

//clase ingreso banco
public class Ingreso_banco {
    //atributos
    private String Escribir_Usuario;
    private String Usuario="Nick678993";
    private String nombre_cliente;

    //metodo para ingresar nombre
    public void ingresar_Nombre(){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese su Nombre");
        nombre_cliente=teclado.nextLine();
    
}
//metodo para ingresar usuario
    public void ingresar_Usuario(){
        while(true){
        Scanner teclado=new Scanner(System.in);
        System.out.println("Ingrese su Usuario");
        Escribir_Usuario=teclado.nextLine();
        //si el usuario ingresado es igual al usuario registrado, se permite el acceso
        if(Escribir_Usuario.equalsIgnoreCase(Usuario)){
            break;
        }
        
            System.out.println("Usuario no valido.Ingrese nuevamente");
            
        }}

    public Ingreso_banco() {
    }

    public Ingreso_banco(String Escribir_Usuario, String nombre_cliente) {
        this.Escribir_Usuario = Escribir_Usuario;
        this.nombre_cliente = nombre_cliente;
    }

    public String getEscribir_Usuario() {
        return Escribir_Usuario;
    }

    public void setEscribir_Usuario(String Escribir_Usuario) {
        this.Escribir_Usuario = Escribir_Usuario;
    }

    public String getUsuario    () {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getNombre_cliente() {
        return nombre_cliente;
    }

    public void setNombre_cliente(String nombre_cliente) {
        this.nombre_cliente = nombre_cliente;
    }
    
    
    }
    
    

