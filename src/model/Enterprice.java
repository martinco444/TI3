package model;

public class Enterprice{

    private String nit;
    private String name;

    
    public Enterprice(String nit, String name) {
        this.nit = nit;
        this.name = name;
    }


    public String getNit() {
        return nit;
    }


    public void setNit(String newNit) {
        nit = newNit;
    }


    public String getName() {
        return name;
    }


    public void setName(String newName) {
        name = newName;
    }




}