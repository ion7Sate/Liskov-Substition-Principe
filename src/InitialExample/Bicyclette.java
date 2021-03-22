package InitialExample;

public class Bicyclette extends TrasnportationDevice{
    private int nrSpeeds;
    private float chainLength;

    public Bicyclette(int id, String name, int nrWheel, double capacityEngine, double maxSpeed, Engine engine,
                      Combustible combustible, int nrSpeeds, float chainLength) {
        super(id, name, nrWheel, capacityEngine, maxSpeed, engine, combustible);
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

    @Override
    public String toString() {
        return "Bicyclette{" +
                "nrSpeeds=" + nrSpeeds +
                ", chainLength=" + chainLength +
                ", combustible=" + combustible +
                ", engine=" + engine +
                '}';
    }
}
