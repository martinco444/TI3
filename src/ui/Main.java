package ui;

import java.security.MessageDigest;
import java.util.ArrayList;
import java.util.Scanner;

import model.DatacenterControl;
import model.Processor;
import model.Server;

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

         cancelRent();

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

  

    private String showMap() {
        return null;
    }

    private void  rentMiniRoom() {
        boolean rent=false;

        System.out.println("what id of mini room do you want to rent");
        int id=Integer.parseInt(sc.nextLine());

        System.out.println("is for a project or enterprice. 1 for project, 2 for enterprice");
        int option=Integer.parseInt(sc.nextLine());

        if(option==1){
            System.out.println("what is the id of the project");
            String  idProject=sc.nextLine();
            rent=datacenterControl.rentMiniRoom(id,idProject);
        } else if(option==2){
            System.out.println("what is the name of the enterprice");
            String name=sc.nextLine();
            System.out.println("what is the nit of the enterprice");
            String nit=sc.nextLine();
            rent=datacenterControl.rentMiniRoom(id,name,nit);
        }

        if (rent==true){
            System.out.println("the mini room was rent succesfully");

            System.out.println("how much servers do you want");
            int servers=Integer.parseInt(sc.nextLine());

            ArrayList<Server> rack=new ArrayList<>();
            for (int i = 0; i < servers; i++) {
                System.out.println("what is the brand of the processor, 1 for AMD, 2 for INTEL");
                int brand=Integer.parseInt(sc.nextLine());
                Processor processorsBrand;
                if (brand==1){
                    processorsBrand=Processor.AMD;
                }else{
                    processorsBrand=Processor.INTEL;
                }
                
                System.out.println("insert the cache memory on GB");
                int cacheMemory=Integer.parseInt(sc.nextLine());

                System.out.println("insert the processors number");
                int processorsNumber=Integer.parseInt(sc.nextLine());
                
                System.out.println("insert the ram memory");
                int ramMemory=Integer.parseInt(sc.nextLine());

                System.out.println("what is the amount of disc");
                int amountOfDisc=Integer.parseInt(sc.nextLine());

                System.out.println("insert the capacity of dics");
                int discCapacity=Integer.parseInt(sc.nextLine());
                rack.add(new Server(cacheMemory, processorsNumber, processorsBrand, ramMemory, amountOfDisc, discCapacity));

            }

            System.out.println("the mini rooms was rent");
            
            datacenterControl.searchMiniRoom(id).setRack(rack);

        }else{
            System.out.println("the mini room wasn´t rent");
        }

        
    }

    private void showMiniRooms() {
        System.out.println(datacenterControl.showMiniRooms());
        
    }

    private void cancelRent() {
        System.out.println("¿what do you want to cancel? 1 for a one mini room, 2 for all the mini rooms associate with a enterprice");
        int option=Integer.parseInt(sc.nextLine());

        if(option==1){
            System.out.println("write the id of the mini room");
            int id=Integer.parseInt(sc.nextLine());
            if(datacenterControl.searchMiniRoom(id)!=null){
                //TODO ram 
                datacenterControl.searchMiniRoom(id).cancelRent();

                System.out.println("the rent was canceled");
            }else{
                System.out.println("it cannot be canceled because doesn´t exists a mini room with this id");
            }
            

        } else if (option==2) {
            System.out.println("write the name of the enterprice");
            String name=sc.nextLine();


            System.out.println(datacenterControl.cancelRent(name));
        }
    }

    /*
     *3.Cancelar el alquiler para un minicuarto
     * o para todos los minicuartos de una empresa, lo que haría que el minicuarto
     * se encuentre en estado disponible. Recuerde que debe eliminar los servidores
     * asociados al RACK. Antes de proceder a la cancelación deberá desplegar la
     * capacidad de procesamiento (indicando total de capacidad en disco, total de
     * memoria RAM).
     *  4.Mostrar un mapa del datacenter en la que se puedan ver cuáles
     * minicuartos están prendidos y cuáles están apagados. Solo los minicuartos que
     * están alquilados pueden estar prendidos (los otros están apagados por consumo
     * de energía)
     *  5.Simular el prendido de todos los minicuartos (sin importar el
     * estado) para probar los protocolos de apagado. 
     * 6.Simular el apagado de los
     * minicuartos de acuerdo a la letra ingresada, después de apagar los cuartos se
     * debe mostrar el mapa del datacenter en donde puedan observarse los cambios.
     */

}
