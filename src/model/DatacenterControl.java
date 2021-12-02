package model;

public class DatacenterControl{
    
    private  Miniroom[][] miniRooms;

    public DatacenterControl(){
        this.miniRooms=new Miniroom [8][50];

        createMiniRooms();
       
    
    }

    //int column, int hall, int id, double rentValue, boolean window

    private void createMiniRooms() {
        int counter=1;
        for (int i = 0; i < miniRooms.length; i++) {
            for (int j = 0; j < miniRooms[0].length; j++) {
                boolean window=false;

                if(i==0 || i==miniRooms.length-1){
                    window=true;
                } else if (j==0 || j==miniRooms[0].length-1){
                    window=true;
                }
                
                miniRooms[i][j]=new Miniroom(j,i,counter,0,window);

                counter++;
            }
        }
    }

    public String toStringMiniRooms(){
        String message="";

        for (int i = 0; i < miniRooms.length; i++) {
            for (int j = 0; j < miniRooms[0].length; j++){

                message+=" ["+miniRooms[i][j].isWindow()+"] ";
            }
            message+="\n";
        }
        return message;
    }


    public String showMiniRooms(){
        //Doble for para recorrer
        //Verificar si esta disponible
        //SI esta disponible lo agregas al message => toString 

        
        String message="LIST OF AVAILABLE MINIROOMS:\n";

        for (int i = 0; i < miniRooms.length; i++) {
            for (int j = 0; j < miniRooms[0].length; j++){
                if(miniRooms[i][j].isDispo()){

                    message+="---------------------------------------";
                    message+=miniRooms[i][j].toString()+"\n";
                }

            }
        }
        return message;
    }

    public boolean rentMiniRoom(int id, String name, String nit) {
        boolean rent=false;
        if (searchMiniRoom(id)!=null){
            Miniroom miniRoom=searchMiniRoom(id);
            miniRoom.setEnterprice(new Enterprice(nit, name));
            miniRoom.setDispo(false);
            rent=true;

        }
        return rent;
    }

    public boolean rentMiniRoom(int id, String idProject) {

        boolean rent=false;
        if(searchMiniRoom(id)!= null){
            Miniroom miniRoom=searchMiniRoom(id);
            miniRoom.setIdProject(idProject);
            miniRoom.setDispo(false);
            rent=true;
        }
        return rent;
    }


    public Miniroom searchMiniRoom(int id){

        Miniroom miniRoom=null;
        boolean find=false;

        for (int i = 0; i < miniRooms.length && find==false; i++) {
            for (int j = 0; j < miniRooms[0].length && find==false; j++){
                if(miniRooms[i][j].getId()==id){
                    find=true;
                    miniRoom=miniRooms[i][j];
                }
            }
        }

        return miniRoom;
    }

    public String cancelRent(String name) {
        String message="";
        //Miniroom miniRoom=null;
       

        for (int i = 0; i < miniRooms.length ; i++) {
            for (int j = 0; j < miniRooms[0].length ; j++){
                if(miniRooms[i][j].getEnterprice()!=null){
                    if (miniRooms[i][j].getEnterprice().getName().equals(name)){
                        //TODO RAM
                        miniRooms[i][j].cancelRent();
                    }
                 
                }
            }
        }

        return message;
    }


    
}