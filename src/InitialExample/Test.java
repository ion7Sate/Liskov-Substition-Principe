package InitialExample;

public class Test {
    public static void main(String[] args) {
        Car audiA8 = new Car(123,"Audi",4,2992,
                250,Engine.Diesel,Combustible.Diesel,CarType.Sport,"A8 TCI",2008);
        audiA8.starEngine();
        audiA8.calculatesCombustibleConsumptionPer100km(7.9f,86);
        System.out.println(audiA8);


    }
}
