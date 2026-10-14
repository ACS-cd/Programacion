import java.util.Scanner;
public class EJ5 {
    public static void main (String[] args) {
// Crea un programa que lea tres números distintos y nos diga cuál es el mayor.
        Scanner sc = new Scanner(System.in);
        System.out.print("Introduzca un número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduzca otro número: ");
        int num2 = sc.nextInt();
        System.out.print("Introduzca un último número: ");
        int num3 = sc.nextInt();

        if (num1 > num2 && num1 > num3) {
                System.out.print(num1 + " es el número mayor.");
            } else if (num2 > num1 && num2 > num3){
            System.out.print(num2 + " es el número mayor.");
        } else {
            System.out.print(num3 + " es el número mayor.");
        }

    sc.close();
    }
}
