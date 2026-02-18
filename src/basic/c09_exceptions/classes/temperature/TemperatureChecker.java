package basic.c09_exceptions.classes.temperature;

import basic.c09_exceptions.exceptions.TemperatureException;

public class TemperatureChecker {
    public void checkTemperature (double temperature) throws TemperatureException {
        if (temperature < -50 || temperature > 50) {
            throw new TemperatureException("Temperatura fuera de rango de entre -50 y 50 Cº");
        } else {
            System.out.println("Temperatura correcta!");
        }
    }
}
