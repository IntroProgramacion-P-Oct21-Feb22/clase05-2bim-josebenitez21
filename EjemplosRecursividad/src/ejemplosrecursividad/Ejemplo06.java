/*
 * Factorial sin recursividad
 * 5! = 5 * 4 * 3 * 2 * 1
 */
package ejemplosrecursividad;

public class Ejemplo06 {

    public static void main(String[] args) {
        
        System.out.printf("%d\n", obtenerSuma(10, 3));
    }

    public static int obtenerSuma(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            if (a == 0) {
                return b;
            } else {
                return 1 + obtenerSuma(a, b - 1);
            }
        }
    }

}
