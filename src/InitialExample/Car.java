package InitialExample;

import java.util.Date;

public class Car  extends TrasnportationDevice {
  private CarType carType;
  private String model;
  private int  yearOfProduction;

  public Car(int id, String name, int nrWheel, double capacityEngine, double maxSpeed,
             Engine engine, Combustible combustible, CarType carType, String model, int yearOfProduction) {
    super(id, name, nrWheel, capacityEngine, maxSpeed, engine, combustible);
    this.carType = carType;
    this.model = model;
    this.yearOfProduction = yearOfProduction;
  }

  public CarType getCarType() {
    return carType;
  }

  public void setCarType(CarType carType) {
    this.carType = carType;
  }

  public String getModel() {
    return model;
  }

  public void setModel(String model) {
    this.model = model;
  }

  public int getYearOfProduction() {
    return yearOfProduction;
  }

  public void setYearOfProduction(int yearOfProduction) {
    this.yearOfProduction = yearOfProduction;
  }

  @Override
  public String toString() {
    return  "Car{" +'\n'+
            "id=" + getId()+ '\n'+
            "Name='" + getName() + '\'' +'\n'+
            "Model='" + model + '\'' +'\n'+
            "NrWheel=" + getNrWheel() +'\n'+
            "CapacityEngine=" + getCapacityEngine() +'\n'+
            "MaxSpeed=" + getMaxSpeed() +'\n'+
            "Engine=" + engine +'\n'+
            "Combustible=" + combustible +'\n'+
            "CarType=" + carType +'\n'+
            "YearOfProduction=" + yearOfProduction +'\n'+
            '}';
  }
}
