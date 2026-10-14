import java.util.Scanner;
public class EJ2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
/*Crea un programa que pide la edad por teclado y nos muestre el mensaje “eres mayor de edad” o el mensaje
“eres menor de edad”
 */
        System.out.print("Indica tu edad: ");
        int edad = sc.nextInt();

        if (edad>18){
            System.out.print("Eres mayor de edad.");
        } else {
            System.out.print("Eres menor de edad.");
        }

        sc.close();
    }
}
