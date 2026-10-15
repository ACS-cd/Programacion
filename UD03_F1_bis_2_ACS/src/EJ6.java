import java.util.Scanner;
public class EJ6 {
    public static void main(String[] args) {
/*Crea un programa que pida tres números y los muestre ordenados de menor a mayor.
 */
        Scanner sc = new Scanner(System.in);

        System.out.print("Introduce el primer número: ");
        int num1 = sc.nextInt();
        System.out.print("Introduce el segundo número: ");
        int num2 = sc.nextInt();
        System.out.print("Introduce el tercer número: ");
        int num3 = sc.nextInt();

        int aux;

        if (num1 > num2) {
            aux = num1;
            num1 = num2;
            num2 = aux;
        }

        if (num1 > num3) {
            aux = num1;
            num1 = num3;
            num3 = aux;
        }

        if (num2 > num3) {
            aux = num2;
            num2 = num3;
            num3 = aux;
        }

        System.out.println("Números ordenados de menor a mayor: "
                + num1 + ", " + num2 + ", " + num3);
    }
}
