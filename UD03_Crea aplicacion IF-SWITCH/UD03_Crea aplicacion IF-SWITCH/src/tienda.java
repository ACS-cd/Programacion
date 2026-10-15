import java.util.Scanner;
public class tienda {
    public static void main(String[] args) {
        /*Aplicación de consola en Java que guíe al cliente en la compra de una
entrada, solicite los datos necesarios, aplique las reglas de tarificación y finalmente imprima un ticket desglosado con el
importe total a pagar
         */
        System.out.print("Tipos de pases: \n1.Pase estándar -- 40.00€\n2.Pase Acuático -- 55.00€\n3.Pase Total Vip -- 80.00€");
        System.out.print("\nIntroduzca el número de pase: ");
        Scanner sc = new Scanner(System.in);
        int numPase = sc.nextInt();
        double precioBase = 0;
        double descuentoEdad = 0;
        double descuentoDia = 0;
        double descuentoFamilia = 0;
        String pase = "0";
        String catEdad = "0";
        String dia = "0";
        String familiaN = "0";

        switch (numPase) { //Selección del pase y error con pase inválido.
            case 1:
                System.out.print("Ha elegido el pase estándar.");
                precioBase = 40.00;
                pase = " estándar";
                break;
            case 2:
                System.out.print("Ha elegido el pase acuático.");
                precioBase = 55.00;
                pase = " acuático";
                break;
            case 3:
                System.out.print("Ha elegido el pase VIP.");
                precioBase = 80.00;
                pase = " VIP";
                break;
            default:
                System.out.println("Error: Número inválido.");
                return;
        }
        System.out.println("\nIntroduzca su edad: ");
        int edad = sc.nextInt();

        if (edad < 4) { //Cálculo de descuento con base en la edad del cliente.
            descuentoEdad = 0;
            catEdad = " bebés.";
        } else if (edad >= 4 && edad <= 12){
            descuentoEdad = precioBase * 0.25;
            catEdad = "infantil.";
        } else if (edad >=13 && edad <= 64) {
            descuentoEdad = precioBase;
            catEdad = "adulto.";
        } else if (edad >= 65 && edad < 120) {
            descuentoEdad = precioBase *0.30;
            catEdad = "Senior";
        } else {
            System.out.println("Error.");
            return;
        }
        System.out.println("Introduce el día de la semana (1=Lunes y 7=Domingo): ");
        int semana = sc.nextInt();
        switch (semana){ //Cálculo de descuento según día al precio anterior.
            case 1:
                descuentoDia = descuentoEdad;
                dia = "Lunes";
                break;
            case 2:
                descuentoDia = descuentoEdad;
                dia = "Martes";
                break;
            case 3:
                descuentoDia = descuentoEdad - 5.00;
                dia = "Miércoles";
                break;
            case 4:
                descuentoDia = descuentoEdad;
                dia = "Jueves";
                break;
            case 5:
                descuentoDia = descuentoEdad;
                dia = "Viernes";
                break;
            case 6:
                descuentoDia = descuentoEdad + (descuentoEdad * 0.10);
                dia = "Sábado";
                break;
            case 7:
                descuentoDia = descuentoEdad + (descuentoEdad * 0.10);
                dia = "Domingo";
                break;
            default:
                System.out.println("Error");
                return;
        }

        System.out.print("\n¿Es titular de carné de familia numerosa?"); //Cálculo de descuento si aplica familia numerosa.
        System.out.print("\n1=Si  2=No");
        int carnet =sc.nextInt();
        if (carnet == 1) {
            descuentoDia *= 0.15;
            familiaN = "si";
        } else if (carnet == 2) {
            descuentoDia =descuentoDia;
            familiaN = "no";
        }
        System.out.println("\nTicket");
        System.out.print("\nTipo de pase: " + pase);
        System.out.print("\nPrecio base: " + precioBase);
        System.out.print("\nCategoría de edad aplicada: " + catEdad);
        System.out.print("\nDía de la semana: " + dia);
        System.out.print("\nFamilia numerosa" + familiaN);
        System.out.print("\nIMPORTE FINAL A PAGAR: " + descuentoDia + " €.");
    }
}