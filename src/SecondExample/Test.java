package SecondExample;

public class Test {
    public static void main(String[] args) {

    TransportDeviceWithEngine carAudiA9 = new TransportDeviceWithEngine(123,TypeOfDevice.Car,"Audi",4,250,
            "A9",2345,Engine.Diesel,Combustible.Diesel,2006);


        System.out.println(carAudiA9);
        carAudiA9.starEngine();
        carAudiA9.calculatesCombustibleConsumptionPer100km(7.6f,125);

        System.out.println("*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*_*");

        TransportDeviceWithoutEngine bicylclete1 = new TransportDeviceWithoutEngine(1,TypeOfDevice.Bicyclette,"RavisoK5",2,90,
                6,1.3f);
        System.out.println(bicylclete1);
        bicylclete1.addNightLights();


    }
}
