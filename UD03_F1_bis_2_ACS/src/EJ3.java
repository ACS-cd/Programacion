import java.util.Scanner;
public class EJ3 {
    public static void main(String[] args) {
//Crea un programa que lee 2 números por teclado y muestra el mayor.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        int num2 = sc.nextInt();

        if (num1 > num2){
            System.out.print(num1);
        } else {
            System.out.print(num2);
        }

        sc.close();
    }
}
