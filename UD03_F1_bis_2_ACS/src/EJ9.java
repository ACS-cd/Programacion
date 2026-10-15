import java.util.Scanner;
public class EJ9 {
    public static void main(String[] args) {
/*Escribe un programa que lea un número entero e indique si el número se puede expresar como el cuadrado de
dos números enteros. Por ejemplo, el número 9 se puede expresar como el cuadrado de 3; sin embargo, el
número 8 no se puede expresar como el cuadrado de dos números enteros. Para resolver este ejercicio se puede
utilizar el metodo sqrt de la clase Math, que permite calcular la raíz cuadrada de un número.
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Escriba un número entero: ");
        int numero = sc.nextInt();

        if (numero >= 0) {
            int raiz = (int) Math.sqrt(numero); //Math.sqrt() calcula la raíz cuadrada de un número.
            if (raiz*raiz == numero) {
                System.out.println(numero + " es el cuadrado de " + raiz);
            } else {
                System.out.print("El número no es cuadrado de ningún entero.");

            }

        }


    }
}
