package model;

// Adapter that will translate the methods from LightCOntrol to the common methods from SmartThermostat.

public class ThermostatAdapter implements LightControl {
    private SmartThermostat thermostat;

    public ThermostatAdapter(SmartThermostat thermostat) {
        this.thermostat = thermostat;
    }

    @Override
    public void turnOn() {
        thermostat.turnHeatingOn();
    }

    @Override
    public void turnOff() {
        thermostat.turnHeatingOff();
    }

    @Override
    public void dim(int level) {
        thermostat.setTemperature(level);
    }
}
