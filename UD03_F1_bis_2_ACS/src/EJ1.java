import java.util.Scanner;
public class EJ1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
//Crea un programa que pide la edad por teclado y nos muestra el mensaje “Eres mayor de edad” solo si lo somos
        System.out.println("Indica tu edad: ");
        int edad = sc.nextInt();

        if (edad > 18) {
            System.out.print("Eres mayor de edad.");
        }
        sc.close();
    }
}
