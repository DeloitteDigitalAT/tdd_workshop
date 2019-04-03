package at.deloitte.digital.tdd.lesson3;

public class Regulator {

    public int regulate(int desiredTemperature, int currentTemperature) {

        if(desiredTemperature<0) {
            throw new IllegalArgumentException("The desired temperature cannot be >0");
        }
        return Integer.signum(desiredTemperature - currentTemperature);
    }
}
