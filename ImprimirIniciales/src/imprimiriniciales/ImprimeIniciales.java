/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package imprimiriniciales;
import java.util.Scanner;
/**
 *
 * @author LENOVO
 */
public class ImprimeIniciales {
    Scanner stdIn = new Scanner(System.in);
    String nombre; // nombre
    String apellido; // apellido
    
    public void Inciales (){
        System.out.print("Introduzca su nombre y primer apellido separados por un espacio: ");
        nombre = stdIn.next();
        apellido = stdIn.next();
        System.out.println("Sus iniciales son " + nombre.charAt(0) + apellido.charAt(0) + ".");
    }
    
    public static void main(String[] args) {
        ImprimeIniciales iniciales = new ImprimeIniciales();
        iniciales.Inciales();
    }
}
