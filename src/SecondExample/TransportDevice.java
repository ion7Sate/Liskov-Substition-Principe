package SecondExample;

public abstract  class TransportDevice {
    private int id;
    private String name;
    private int nrWheel;
    private TypeOfDevice typeOfDevice;
    private double maxSpeed;

    public TransportDevice(int id,TypeOfDevice typeOfDevice, String name, int nrWheel, double maxSpeed) {
        this.id = id;
        this.typeOfDevice = typeOfDevice;
        this.name = name;
        this.nrWheel = nrWheel;
        this.maxSpeed = maxSpeed;
    }

    public TypeOfDevice getTypeOfDevice() {
        return typeOfDevice;
    }

    public void setTypeOfDevice(TypeOfDevice typeOfDevice) {
        this.typeOfDevice = typeOfDevice;
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

    public double getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(double maxSpeed) {
        this.maxSpeed = maxSpeed;
    }
}
