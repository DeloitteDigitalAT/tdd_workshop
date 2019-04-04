package at.deloitte.digital.tdd.lesson4;


public class Regulator {

    private Thermometer thermometer;

    public Regulator(Thermometer thermometer) {
        this.thermometer = thermometer;
    }

    public int regulate(int desiredTemperature) {

        if(desiredTemperature<0) {
            throw new IllegalArgumentException
                    ("The desired temperature cannot be >0");
        }
        return Integer.signum(desiredTemperature - thermometer.readTemperature());
    }
}
