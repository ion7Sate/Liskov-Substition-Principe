package InitialExample;

public  abstract class TrasnportationDevice {
    private int id;
    private String name;
    private int nrWheel;
    private double capacityEngine;
    private double maxSpeed;
    Combustible combustible;
    Engine engine;

    public TrasnportationDevice(int id, String name, int nrWheel, double capacityEngine,
                                double maxSpeed, Engine engine , Combustible combustible) {
        this.id = id;
        this.name = name;
        this.nrWheel = nrWheel;
        this.capacityEngine = capacityEngine;
        this.maxSpeed = maxSpeed;
        this.engine = engine;
        this.combustible = combustible;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNrWheel() {
        return nrWheel;
    }

    public void setNrWheel(int nrWheel) {
        this.nrWheel = nrWheel;
    }

    public double getCapacityEngine() {
        return capacityEngine;
    }

    public void setCapacityEngine(double capacityEngine) {
        this.capacityEngine = capacityEngine;
    }

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Combustible getCombustible() {
        return combustible;
    }

    public void setCombustible(Combustible combustible) {
        this.combustible = combustible;
    }

    public void starEngine(){
        System.out.println("Your engine is started");
    }


    public float calculatesCombustibleConsumptionPer100km(float combustible,float distance){
     float   consumPer100Km = combustible /distance *100;
        System.out.println("Consum per 100km is " +consumPer100Km);
     return  consumPer100Km;
    }



}
