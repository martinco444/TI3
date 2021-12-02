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
}