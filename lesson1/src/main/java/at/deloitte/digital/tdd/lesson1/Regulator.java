package at.deloitte.digital.tdd.lesson1;

public class Regulator {

    public int regulate(int desiredTemperature, int currentTemperature) {
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
