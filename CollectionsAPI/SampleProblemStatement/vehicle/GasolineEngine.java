package SampleProblemStatement.vehicle;
// package SampleProblemStatement;
import SampleProblemStatement.engine.Engine;
public class GasolineEngine implements Engine {
    private int HorsePower;
    private FuelType fuelType;

    public GasolineEngine(int HorsePower, FuelType fuelType) {
        this.HorsePower = HorsePower;
        this.fuelType = fuelType;
    }

    public int getHorsePower() {
        return HorsePower;
    }

    public FuelType getFuelType() {
        return fuelType;
    }
}
