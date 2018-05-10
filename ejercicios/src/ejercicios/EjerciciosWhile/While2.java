
package ejercicios.EjerciciosWhile;
//@author Pedroken
import java.util.Locale;
import java.util.Scanner; 
public class While2 {

    
    public static void main(String[] args) {
        
        int n, i=1;
        double altura,promedio=0,suma=0;
            Scanner personas=new Scanner(System.in).useLocale(Locale.US);
            System.out.print("Introduce la cantidad de personas: ");
            n=personas.nextInt();
            
            
        while (i<=n){
            System.out.print("Introduce la altura de cada persona en centimetros: ");
            altura = personas.nextDouble();
            i++;
            suma+=altura;
            promedio=(suma/n);
        }
            System.out.println("La altura media del grupo es de: "+promedio);

    }    
}




/**2.Se ingresan un conjunto de n alturas de personas por teclado. Mostrar la altura
   promedio de las personas. **/