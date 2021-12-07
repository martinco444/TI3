package model;

public class Server{
    
    private int cacheMemory;
    private int processorsNumber;
    private Processor processorsBrand;
    private int ramMemory;
    private int amountOfDisc;
    private int discCapacity;

    public Server(int cacheMemory, int processorsNumber, Processor processorsBrand, int ramMemory, int amountOfDisc, int discCapacity) {
        this.cacheMemory = cacheMemory;
        this.processorsNumber = processorsNumber;
        this.processorsBrand = processorsBrand;
        this.ramMemory = ramMemory;
        this.amountOfDisc = amountOfDisc;
        this.discCapacity = discCapacity;
    }

    
    /** 
     * @return cacheMemory int
     */
    public int getCacheMemory() {
        return cacheMemory;
    }

    
    /** 
     * @param cacheMemory
     */
    public void setCacheMemory(int cacheMemory) {
        this.cacheMemory = cacheMemory;
    }

    
    /** 
     * @return processorNumber int
     */
    public int getProcessorsNumber() {
        return processorsNumber;
    }

    
    /** 
     * @param processorsNumber
     */
    public void setProcessorsNumber(int processorsNumber) {
        this.processorsNumber = processorsNumber;
    }

    
    /** 
     * @return processorsBrand Processor
     */
    public Processor getProcessorsBrand() {
        return processorsBrand;
    }

    
    /** 
     * @param processorsBrand
     */
    public void setProcessorsBrand(String processorsBrand) {
        this.processorsBrand = Processor.valueOf(processorsBrand);
    }

    
    /** 
     * @return ramMemory int
     */
    public int getRamMemory() {
        return ramMemory;
    }

    
    /** 
     * @param ramMemory
     */
    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    
    /** 
     * @return amountOfDisc int
     */
    public int getAmountOfDisc() {
        return amountOfDisc;
    }

    
    /** 
     * @param amountOfDisc
     */
    public void setAmountOfDisc(int amountOfDisc) {
        this.amountOfDisc = amountOfDisc;
    }

    
    /** 
     * @return discCapacity int
     */
    public int getDiscCapacity() {
        return discCapacity;
    }

    
    /** 
     * @param discCapacity
     */
    public void setDiscCapacity(int discCapacity) {
        this.discCapacity = discCapacity;
    }

    

    

}