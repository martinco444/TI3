package ui;

import java.util.Scanner;

import model.DatacenterControl;

public class Main {

    private static Scanner sc = new Scanner(System.in);
    private DatacenterControl datacenterControl;


    public Main(){
    this.datacenterControl=new DatacenterControl();
    }

    public static void main(String[] args) {

        System.out.println("******** Starting *********");

        Main ppal = new Main();
        int option = 0;

        do {
            option = ppal.showMenu();
            ppal.choice(option);

        } while (option != 7);
    }

    private int showMenu() {
        int option = 0;
        System.out.println(
                "¿What do you want to do?\n"
                +"(1)Show mini rooms\n"
                +"(2)Rent mini room\n"
                +"(3)Cancel the rent of a mini room\n"
                +"(4)Show a map\n"
                +"(5)Simulate the mini rooms ignition\n"
                +"(6)Simulate the mini room shotdown\n"
                +"(7)bye");

        option = Integer.parseInt(sc.nextLine());
        return option; 
    }

    private void choice(int option) {
        switch (option) {

        case 1:

         showMiniRooms();

        break;

        case 2:

        rentMiniRoom();

         break;

        case 3:

         System.out.println(cancelRent());

         break;

        case 4:    

        System.out.println(showMap());

         break;

         case 5:
         
         simIgnition();

         break;

         case 6:

         simShutdown();

         break;

        case 7:

        System.out.println("Bye");

        break;
        }
    }

    private void simShutdown() {
    }

    private void simIgnition() {
    }

    private String cancelRent() {
        return null;
    }

    private String showMap() {
        return null;
    }

    private void  rentMiniRoom() {
        
    }

    private void showMiniRooms() {
        System.out.println(datacenterControl.showMiniRooms());
        
    }

    /*
     * 2.Alquilar un minicuarto, aquí será importante dejar el registro de la fecha
     * de alquiler, registrar los servidores y calcular el valor del alquiler
     * mensual que una empresa debe pagar. Si el minicuarto se alquila a un proyecto
     * de investigación, la empresa es la universidad Icesi y se debe guardar además
     * el número de registro del proyecto. 3.Cancelar el alquiler para un minicuarto
     * o para todos los minicuartos de una empresa, lo que haría que el minicuarto
     * se encuentre en estado disponible. Recuerde que debe eliminar los servidores
     * asociados al RACK. Antes de proceder a la cancelación deberá desplegar la
     * capacidad de procesamiento (indicando total de capacidad en disco, total de
     * memoria RAM). 4.Mostrar un mapa del datacenter en la que se puedan ver cuáles
     * minicuartos están prendidos y cuáles están apagados. Solo los minicuartos que
     * están alquilados pueden estar prendidos (los otros están apagados por consumo
     * de energía) 5.Simular el prendido de todos los minicuartos (sin importar el
     * estado) para probar los protocolos de apagado. 6.Simular el apagado de los
     * minicuartos de acuerdo a la letra ingresada, después de apagar los cuartos se
     * debe mostrar el mapa del datacenter en donde puedan observarse los cambios.
     */

}
