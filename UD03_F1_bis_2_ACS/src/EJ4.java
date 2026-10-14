import java.util.Scanner;
public class EJ4 {
    public static void main (String[] args) {
/*Crea un programa que lee un número por teclado y me dice si es positivo o negativo; consideraremos el cero
como positivo.
 */
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        int num1 = sc.nextInt();

        if (num1>=0){
            System.out.print(num1 + " es positivo.");
        } else {
            System.out.print(num1 + " es negativo.");
        }
        sc.close();
    }
}
