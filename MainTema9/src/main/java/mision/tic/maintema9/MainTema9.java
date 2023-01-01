/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package mision.tic.maintema9;

/**
 *
 * @author Personal
 */

/*
Crea una clase Persona con las siguientes variables:
La edad
El nombre
El teléfono
Una vez creada la clase, crea una nueva clase Cliente que herede de Persona, esta nueva clase tendrá la variable credito solo para esa clase.
Crea ahora un objeto de la clase Cliente que debe tener como propiedades la edad, el telefono, el nombre y el credito, tienes que darles valor y mostrarlas por pantalla.
Una vez hecho esto, haz lo mismo con la clase Trabajador que herede de Persona, y con una variable salario que solo tenga la clase Trabajador.
*/
public class MainTema9 {

    public static void main(String[] args) {        
        Cliente cliente = new Cliente();
        Trabajador trabajador = new Trabajador();
        
        cliente.nombre = "Juan";
        cliente.edad =  24;
        cliente.telefono = 316169559;
        cliente.credito = 20.5;
        System.out.println("Hola, Soy " + cliente.nombre + ", tengo " + cliente.edad + " años y mi numero de telefono es " + cliente.telefono + " y mi credio es de " + cliente.credito);
    
        trabajador.nombre = "Juan";
        trabajador.edad =  24;
        trabajador.telefono = 316169559;
        trabajador.salario = 10000.5;
        System.out.println("Hola, Soy " + trabajador.nombre + ", tengo " + trabajador.edad + " años y mi numero de telefono es " + trabajador.telefono + " y mi salario es de " + trabajador.salario);
    }
}
class Persona {
    int edad;
    int telefono;
    String nombre;
    
}
class Cliente extends Persona {
     double credito;
}
class Trabajador extends Persona {
      double salario;
}


