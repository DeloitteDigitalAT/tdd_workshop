package at.deloitte.digital.tdd.lesson2;

public class Regulator {

    public int regulate(int desiredTemperature, int currentTemperature) {

        if(desiredTemperature<0) {
            throw new IllegalArgumentException("The desired temperature cannot be >0");
        }

        int temperatureDiff = desiredTemperature - currentTemperature;
        if (temperatureDiff == 0) {
            return 0;
        } else if(temperatureDiff > 0) {
            return 1;
        } else {
            return -1;
        }
    }
}
