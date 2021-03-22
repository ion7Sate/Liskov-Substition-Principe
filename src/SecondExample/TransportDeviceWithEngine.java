package SecondExample;

public class TransportDeviceWithEngine  extends TransportDevice{

    private String model;
    private float capacityEngine;
    private Engine typeEngine;
    private Combustible typeOfCombustible;
    private int yearOfProduction;

    public TransportDeviceWithEngine(int id,TypeOfDevice typeOfDevice, String name, int nrWheel, double maxSpeed, String model,
                                     float capacityEngine, Engine typeEngine, Combustible typeOfCombustible,
                                     int yearOfProduction) {
        super(id,typeOfDevice,name, nrWheel, maxSpeed);

        this.model = model;
        this.capacityEngine = capacityEngine;
        this.typeEngine = typeEngine;
        this.typeOfCombustible = typeOfCombustible;
        this.yearOfProduction = yearOfProduction;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }


    public float getCapacityEngine() {
        return capacityEngine;
    }

    public void setCapacityEngine(float capacityEngine) {
        this.capacityEngine = capacityEngine;
    }

    public Engine getTypeEngine() {
        return typeEngine;
    }


    public void setTypeEngine(Engine typeEngine) {
        this.typeEngine = typeEngine;
    }

    public Combustible getTypeOfCombustible() {
        return typeOfCombustible;
    }

    public void setTypeOfCombustible(Combustible typeOfCombustible) {
        this.typeOfCombustible = typeOfCombustible;
    }

    public int getYearOfProduction() {
        return yearOfProduction;
    }

    public void setYearOfProduction(int yearOfProduction) {
        this.yearOfProduction = yearOfProduction;
    }

    public void starEngine(){
        System.out.println("Your engine is started");
    }

    public float calculatesCombustibleConsumptionPer100km(float combustible,float distance){
        float   consumPer100Km = combustible /distance *100;
        System.out.println("Consum per 100km is " +consumPer100Km);
        return  consumPer100Km;
    }

    @Override
    public String toString() {
        return "TransportDeviceWithEngine{" +'\n'+
                "id=" + getId()+ '\n'+
                "TypeOfDevice='" + getTypeOfDevice() + '\'' +'\n'+
                "Name='" + getName() + '\'' +'\n'+
                "Model='" + model + '\'' +'\n'+
                "CapacityEngine=" + capacityEngine +'\n'+
                "TypeEngine=" + typeEngine +'\n'+
                "TypeOfCombustible=" + typeOfCombustible +'\n'+
                "YearOfProduction=" + yearOfProduction +'\n'+
                '}';
    }


}
