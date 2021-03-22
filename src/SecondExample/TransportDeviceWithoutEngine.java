package SecondExample;

public class TransportDeviceWithoutEngine extends TransportDevice{
    private int nrSpeeds;
    private float chainLength;

    public TransportDeviceWithoutEngine(int id,TypeOfDevice typeOfDevice, String name, int nrWheel, double maxSpeed, int nrSpeeds,
                                        float chainLength) {
        super(id,typeOfDevice, name, nrWheel, maxSpeed);
        this.nrSpeeds = nrSpeeds;
        this.chainLength = chainLength;
    }

    public int getNrSpeeds() {
        return nrSpeeds;
    }

    public void setNrSpeeds(int nrSpeeds) {
        this.nrSpeeds = nrSpeeds;
    }

    public float getChainLength() {
        return chainLength;
    }

    public void setChainLength(float chainLength) {
        this.chainLength = chainLength;
    }

    public void addNightLights(){
        System.out.println("Night lights have been added");
    }

    @Override
    public String toString() {
        return "TransportDeviceWithoutEngine{" +'\n'+
                "id=" + getId()+ '\n'+
                "TypeOfDevice='" + getTypeOfDevice() + '\'' +'\n'+
                "Model ='" + getName() + '\'' +'\n'+
                "Number of Speeds=" + nrSpeeds +'\n'+
                "ChainLength=" + chainLength +'\n'+
                '}';
    }
}
