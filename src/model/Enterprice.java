package model;

public class Enterprice{

    private String nit;
    private String name;

    
    public Enterprice(String nit, String name) {
        this.nit = nit;
        this.name = name;
    }


    
    /** 
     * @return nit String
     */
    public String getNit() {
        return nit;
    }


    
    /** 
     * @param newNit
     */
    public void setNit(String newNit) {
        nit = newNit;
    }


    
    /** 
     * @return name String
     */
    public String getName() {
        return name;
    }


    
    /** 
     * @param newName
     */
    public void setName(String newName) {
        name = newName;
    }




}