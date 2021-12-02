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

    public int getCacheMemory() {
        return cacheMemory;
    }

    public void setCacheMemory(int cacheMemory) {
        this.cacheMemory = cacheMemory;
    }

    public int getProcessorsNumber() {
        return processorsNumber;
    }

    public void setProcessorsNumber(int processorsNumber) {
        this.processorsNumber = processorsNumber;
    }

    public Processor getProcessorsBrand() {
        return processorsBrand;
    }

    public void setProcessorsBrand(String processorsBrand) {
        this.processorsBrand = Processor.valueOf(processorsBrand);
    }

    public int getRamMemory() {
        return ramMemory;
    }

    public void setRamMemory(int ramMemory) {
        this.ramMemory = ramMemory;
    }

    public int getAmountOfDisc() {
        return amountOfDisc;
    }

    public void setAmountOfDisc(int amountOfDisc) {
        this.amountOfDisc = amountOfDisc;
    }

    public int getDiscCapacity() {
        return discCapacity;
    }

    public void setDiscCapacity(int discCapacity) {
        this.discCapacity = discCapacity;
    }

    

    

}