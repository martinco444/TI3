package model;

import java.util.ArrayList;

public class Miniroom{

    

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


    public Miniroom(int column, int hall, int id, double rentValue, boolean window) {
        this.column = column;
        this.hall = hall;
        this.id=id;
        this.rentValue = rentValue;
        this.window = window;
        this.dispo=true;
        this.enterprice=null;
        this.idProject="";
        this.date="";
        this.rack=new ArrayList<>();
    }

    //calculateRent
    //-> Variables
    
    public void cancelRent(){
        this.dispo=true;
        this.rack.clear();
        this.enterprice=null;
        this.idProject="";
    }


    

    public int getColumn() {
        return column;
    }


    public void setColumn(int column) {
        this.column = column;
    }


    public int getHall() {
        return hall;
    }


    public void setHall(int hall) {
        this.hall = hall;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }


    public double getRentValue() {
        return rentValue;
    }


    public void setRentValue(double rentValue) {
        this.rentValue = rentValue;
    }


    public boolean isWindow() {
        return window;
    }


    public void setWindow(boolean window) {
        this.window = window;
    }

    public boolean isDispo() {
        return dispo;
    }

    public void setDispo(boolean dispo) {
        this.dispo = dispo;
    }

    public Enterprice getEnterprice() {
        return enterprice;
    }

    public void setEnterprice(Enterprice enterprice) {
        this.enterprice = enterprice;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }
    
    public ArrayList<Server> getRack() {
        return rack;
    }

    public void setRack(ArrayList<Server> rack) {
        this.rack = rack;
    }

    public String getIdProject() {
        return idProject;
    }

    public void setIdProject(String idProject) {
        this.idProject = idProject;
    }

    @Override
    public String toString() {
        return "Miniroom #"+id
        +"\nColumn:" + column 
        + "\nDispo:" + dispo 
        + "\nHall:" + hall 
        +"\nValue of rent:"+ rentValue 
        + "\nWindow:" + window;
    }

    


    //mostrando el corredor, la ubicación (ventana o no ventana), la columna y el valor del alquiler.


    
    
}