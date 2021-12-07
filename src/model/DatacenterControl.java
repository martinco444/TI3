package model;

public class DatacenterControl {

    private Miniroom[][] miniRooms;

    public DatacenterControl() {
        this.miniRooms = new Miniroom[8][50];

        createMiniRooms();

    }

    // int column, int hall, int id, double rentValue, boolean window

    private void createMiniRooms() {
        int counter = 1;
        for (int i = 0; i < miniRooms.length; i++) {
            for (int j = 0; j < miniRooms[0].length; j++) {
                boolean window = false;

                if (i == 0 || i == miniRooms.length - 1) {
                    window = true;
                } else if (j == 0 || j == miniRooms[0].length - 1) {
                    window = true;
                }

                miniRooms[i][j] = new Miniroom(j, i, counter, window);

                counter++;
            }
        }
    }

    
    /** 
     * @return String
     */
    public String toStringMiniRooms() {
        String message = "";

        for (int i = 0; i < miniRooms.length; i++) {
            for (int j = 0; j < miniRooms[0].length; j++) {

                message += " [" + miniRooms[i][j].isWindow() + "] ";
            }
            message += "\n";
        }
        return message;
    }

    
    /** 
     * @return message String
     */
    public String showMiniRooms() {
        // Doble for para recorrer
        // Verificar si esta disponible
        // SI esta disponible lo agregas al message => toString

        String message = "LIST OF AVAILABLE MINIROOMS:\n";

        for (int i = 0; i < miniRooms.length; i++) {
            for (int j = 0; j < miniRooms[0].length; j++) {
                if (miniRooms[i][j].isDispo()) {

                    message += "---------------------------------------";
                    message += miniRooms[i][j].toString() + "\n";
                }

            }
        }
        return message;
    }

    
    /** 
     * @param id
     * @param name
     * @param nit
     * @return rent boolean
     */
    public boolean rentMiniRoom(int id, String name, String nit) {
        boolean rent = false;
        if (searchMiniRoom(id) != null) {
            Miniroom miniRoom = searchMiniRoom(id);
            miniRoom.setEnterprice(new Enterprice(nit, name));
            miniRoom.setDispo(false);
            rent = true;
            miniRoom.setStatus(true);
        }
        return rent;
    }

    
    /** 
     * @param id
     * @param idProject
     * @return rent boolean
     */
    public boolean rentMiniRoom(int id, String idProject) {

        boolean rent = false;
        if (searchMiniRoom(id) != null) {
            Miniroom miniRoom = searchMiniRoom(id);
            miniRoom.setIdProject(idProject);
            miniRoom.setDispo(false);
            rent = true;
        }
        return rent;
    }

    
    /** 
     * @param id
     * @return miniroom Miniroom
     */
    public Miniroom searchMiniRoom(int id) {

        Miniroom miniRoom = null;
        boolean find = false;

        for (int i = 0; i < miniRooms.length && find == false; i++) {
            for (int j = 0; j < miniRooms[0].length && find == false; j++) {
                if (miniRooms[i][j].getId() == id) {
                    find = true;
                    miniRoom = miniRooms[i][j];
                }
            }
        }

        return miniRoom;
    }

    
    /** 
     * @param name
     * @return message String
     */
    public String cancelRent(String name) {
        String message = "";
        // Miniroom miniRoom=null;

        for (int i = 0; i < miniRooms.length; i++) {
            for (int j = 0; j < miniRooms[0].length; j++) {
                if (miniRooms[i][j].getEnterprice() != null) {
                    if (miniRooms[i][j].getEnterprice().getName().equals(name)) {
                        // TODO RAM
                        miniRooms[i][j].cancelRent();
                    }

                }
            }
        }

        return message;
    }

    
    /** 
     * @return message String
     */
    public String showMap() {

        String message = "";

        for (int i = 0; i < miniRooms.length; i++) {
            for (int j = 0; j < miniRooms[0].length; j++) {

                message += " [" + miniRooms[i][j].getId() + ": " + miniRooms[i][j].getStatus() + "] ";
            }
            message += "\n";
        }
        return message;

    }

    
    /** 
     * @return message String
     */
    public String simulateOn() {
        String message = "SHUT ON ALL MINI ROOMS";

        for (int i = 0; i < miniRooms.length; i++) {
            for (int j = 0; j < miniRooms[0].length; j++) {
                Miniroom miniroom = miniRooms[i][j];
                miniroom.setStatus(true);

            }
        }

        message += showMap();

        for (int i = 0; i < miniRooms.length; i++) {
            for (int j = 0; j < miniRooms[0].length; j++) {
                Miniroom miniroom = miniRooms[i][j];
                if (miniroom.isDispo() == true) {
                    miniroom.setStatus(false);
                }

            }
        }

        return message;

    }

    
    /** 
     * @param letter
     * @param x
     * @return message String
     */
    public String simShutdown(String letter,int x) {
        for (int i = 0; i < miniRooms.length; i++) {
            for (int j = 0; j < miniRooms[0].length; j++) {
                Miniroom miniroom = miniRooms[i][j];
                miniroom.setStatus(true);

            }
        }

        String message = "";
        letter = letter.toUpperCase();

        switch (letter) {
            case "L":

                for (int j = 0; j < miniRooms[0].length; j++) {
                    miniRooms[0][j].setStatus(false);
                }
                for (int i = 0; i < miniRooms.length; i++) {
                    miniRooms[i][0].setStatus(false);
                }

                message += showMap();

                break;
            case "Z":
                /*
                 * for (int j = 0; j < miniRooms[0].length; j++) {
                 * miniRooms[0][j].setStatus(false);
                 * miniRooms[miniRooms[0].length-1][j].setStatus(false);
                 * }
                 * 
                 * for (int i = 0,j=miniRooms[0].length; i < miniRooms.length; i++) {
                 * 
                 * }
                 * 
                 * 
                 * message+=showMap();
                 */
                break;
            case "H":

                for (int i = 0; i < miniRooms.length; i++) {
                    for (int j = 0; j < miniRooms[0].length; j++) {
                        Miniroom miniroom = miniRooms[i][j];

                        if ((i + 1) % 2 != 0) {
                            miniroom.setStatus(false);
                        }

                    }
                }

                message += showMap();

                break;
            case "O":

            for (int i = 0; i < miniRooms.length; i++) {
                for (int j = 0; j < miniRooms[0].length; j++) {
                    Miniroom miniroom = miniRooms[i][j];

                    if (miniroom.isWindow()==true) {
                        miniroom.setStatus(false);
                    }

                }
            }

            message += showMap();

                break;
            case "M":
                for (int i = 0; i < miniRooms.length; i++) {
                    miniRooms[i][x-1].setStatus(false);
                }


                message += showMap();

                break;
            case "P":

            for (int j = 0; j < miniRooms[0].length; j++) {
                miniRooms[x-1][j].setStatus(false);
            }


            message += showMap();

                break;

            default:
                message = "ERROR";
                break;
        }

        return message;
    }

}