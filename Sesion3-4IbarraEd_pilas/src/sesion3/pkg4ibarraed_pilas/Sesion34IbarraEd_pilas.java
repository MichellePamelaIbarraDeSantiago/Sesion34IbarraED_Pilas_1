
package sesion3.pkg4ibarraed_pilas;

import java.util.Stack;//libreria para la declaracion de pilas
import javax.swing.JOptionPane;

public class Sesion34IbarraEd_pilas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Declaracion de pila
        Stack<Integer> pilaIbarra = new Stack<>();
        
        pilaIbarra.push(100);
        pilaIbarra.push(150);
        pilaIbarra.push(230);
        pilaIbarra.push(10);
        pilaIbarra.push(160);
        
        JOptionPane.showMessageDialog(null, "Datos en pila ordenada es: \n"+pilaIbarra);
        
        
    }
    
}
