package at.deloitte.digital.tdd.scratchpad;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.*;

public class Thermometer {

    private Map<String,Integer> temperatures;

    public Thermometer() throws Exception {
        temperatures = loadTemperatures("temperatures.csv");
    }

    public int readTemperature() {
        return temperatures.get(getTime());
    }

    private static Map<String,Integer> loadTemperatures(String fileName) throws IOException {
        Map<String,Integer> temperatures = new HashMap<>();
        ClassLoader classLoader = Thermometer.class.getClassLoader();
        File temperaturesFile = new File(classLoader.getResource(fileName).getFile());
        try (BufferedReader br = new BufferedReader(new FileReader(temperaturesFile))) {
            String line;
            while ((line = br.readLine()) != null) {
                String[] values = line.split(",");
                if(values[0]!="TIME") {
                    temperatures.put(values[0], Integer.valueOf(values[1]));
                }
            }
        }
        return temperatures;
    }

    private String getTime() {
        DateFormat timeFormat = new SimpleDateFormat("HH:mm:ss");
        Date now = new Date();
        return timeFormat.format(now);
    }
}
