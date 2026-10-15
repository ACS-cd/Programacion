import java.util.Scanner;
public class EJ8 {
    public static void main(String[] args) {
//Crea un programa que lea la temperatura en grados del día e imprima el tipo de clima de acuerdo con esta tabla.

        System.out.print("Introduzca la temperatura: ");
        Scanner sc = new Scanner(System.in);
        double tempt = sc.nextDouble();

        if (tempt <= 10) {
            System.out.print("Clima frío");
        } else if (tempt >10) {
            if (tempt <=20) {
                System.out.print("Clima templado");
            } else if (tempt >20) {
                if (tempt <=30){
                    System.out.print("Clima caluroso");
                } else {
                    System.out.print("Clima tropical");
                }

            }
        }

    }
}
