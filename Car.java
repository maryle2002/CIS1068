public class Car {
    private String make, model;
    private int year;
    private double MPG, milesDriven, fuelCapacity, fuelRemaining;

    public Car(String make, String model, int year, double fuelCapacity, double MPG,
                double milesDriven, double fuelRemaining) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.fuelCapacity = fuelCapacity;
        this.MPG = MPG;
        this.milesDriven = milesDriven;
        this.fuelRemaining = fuelRemaining;
    }

    public void fillTank(double g) {
       if(g + this.fuelRemaining > this.fuelCapacity) {
           this.fuelRemaining = this.fuelRemaining + g;
       }
    }

    public void drive(double m) {
         milesDriven += m ;
         fuelRemaining -= (m/this.MPG);
    }

    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(String.format("Car: %s\n",this.make));
        sb.append(String.format("Model: %s\n",this.model));
        sb.append(String.format("Year: %d\n",this.year));
        sb.append(String.format("Tank Capacity: %.1fg\n", this.fuelCapacity));
        sb.append(String.format("MPG: %.2fm/g\n", this.MPG));
        sb.append(String.format("Miles Driven: %.1fm\n", this.milesDriven));
        sb.append(String.format("Fuel Remaining: %.2fg", this.fuelRemaining));
        return sb.toString();
    }

    public double getFuelRemaining() {
        return this.fuelRemaining;
    }

}
