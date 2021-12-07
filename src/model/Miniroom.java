package model;

import java.util.ArrayList;

public class Miniroom {

    private int column;
    private int hall;
    private int id;
    private double rentValue;
    private boolean window;
    private boolean dispo;
    private Enterprice enterprice;
    private String idProject;
    private String date;
    private ArrayList<Server> rack;
    private boolean status;
    private double baseRent = 2000000;

    public Miniroom(int column, int hall, int id, boolean window) {
        this.column = column+1;
        this.hall = hall+1;
        this.id = id;
        this.rentValue = 0;
        this.window = window;
        this.dispo = true;
        this.enterprice = null;
        this.idProject = "";
        this.date = "";
        this.rack = new ArrayList<>();
        this.status = false;

        calculateRent();
    }

    public void calculateRent() {
        int discount = 0;
        int surcharge=0;


        if (this.window==true){
            discount+=baseRent*(0.1);
        }

      
        if (this.hall==7){
            discount+=baseRent*(0.15);
        }
    
        if (this.hall >= 2 && this.hall <=6){
            surcharge+=baseRent*(0.25);
        }


        if (rack.size() < 4 && this.dispo==false){
            surcharge+=baseRent*(0.15);
        }

        this.rentValue=baseRent-discount+surcharge;
    }

    public void cancelRent() {
        this.dispo = true;
        this.rack.clear();
        this.enterprice = null;
        this.idProject = "";
    }

    
    /** 
     * @return String
     */
    public String getStatus() {

        if (this.status == true) {
            return "ON";
        } else {
            return "OFF";
        }
    }

    
    /** 
     * @param status
     */
    public void setStatus(boolean status) {
        this.status = status;
    }

    
    /** 
     * @return column int
     */
    public int getColumn() {
        return column;
    }

    
    /** 
     * @param column
     */
    public void setColumn(int column) {
        this.column = column;
    }

    
    /** 
     * @return hall int
     */
    public int getHall() {
        return hall;
    }

    
    /** 
     * @param hall
     */
    public void setHall(int hall) {
        this.hall = hall;
    }

    
    /** 
     * @return id int
     */
    public int getId() {
        return id;
    }

    
    /** 
     * @param id
     */
    public void setId(int id) {
        this.id = id;
    }

    
    /** 
     * @return rentValue double
     */
    public double getRentValue() {
        return rentValue;
    }

    
    /** 
     * @param rentValue
     */
    public void setRentValue(double rentValue) {
        this.rentValue = rentValue;
    }

    
    /** 
     * @return window boolean
     */
    public boolean isWindow() {
        return window;
    }

    
    /** 
     * @param window
     */
    public void setWindow(boolean window) {
        this.window = window;
    }

    
    /** 
     * @return dispo boolean
     */
    public boolean isDispo() {
        return dispo;
    }

    
    /** 
     * @param dispo
     */
    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    
    /** 
     * @return enterprice Enterprice
     */
    public Enterprice getEnterprice() {
        return enterprice;
    }

    
    /** 
     * @param enterprice
     */
    public void setEnterprice(Enterprice enterprice) {
        this.enterprice = enterprice;
    }

    
    /** 
     * @return date String
     */
    public String getDate() {
        return date;
    }

    
    /** 
     * @param date
     */
    public void setDate(String date) {
        this.date = date;
    }

    
    /** 
     * @return rack ArrayList<Server>
     */
    public ArrayList<Server> getRack() {
        return rack;
    }

    
    /** 
     * @param rack
     */
    public void setRack(ArrayList<Server> rack) {
        calculateRent();
        this.rack = rack;
    }

    
    /** 
     * @return idProject String
     */
    public String getIdProject() {
        return idProject;
    }

    
    /** 
     * @param idProject
     */
    public void setIdProject(String idProject) {
        this.idProject = idProject;
    }

    
    /** 
     * @return String
     */
    @Override
    public String toString() {
        return "Miniroom #" + id
                + "\nColumn:" + column
                + "\nDispo:" + dispo
                + "\nHall:" + hall
                + "\nValue of rent:" + rentValue
                + "\nWindow:" + window;
    }

    // mostrando el corredor, la ubicación (ventana o no ventana), la columna y el
    // valor del alquiler.

}