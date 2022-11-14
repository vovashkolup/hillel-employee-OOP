package vvashkolup;

public class Car {

    private String model;
    private String color;

    private int releaseDate;
    private boolean hasFuel;
    private boolean isBatteryCharged;

    public Car(String model, String color, int releaseDate, boolean hasFuel, boolean isBatteryCharged) {
        this.model = model;
        this.color = color;
        this.releaseDate = releaseDate;
        this.hasFuel = hasFuel;
        this.isBatteryCharged = isBatteryCharged;
    }

    public String getModel() {
        return model;
    }

    public String getColor() {
        return color;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public boolean isHasFuel() {
        return hasFuel;
    }

    public boolean isBatteryCharged() {
        return isBatteryCharged;
    }

    public void start() {
        startCommand();
        if (startFuelSystem() &&
                startElectricity()) {
            System.out.println("\n"+getColor() + " " + getModel() + " engine started");
        }else{
            System.out.println("Cannot start the car");
        }
    }

    private boolean startElectricity() {
        if (isBatteryCharged&&releaseDate>=1980) {
            System.out.println("Car battery charged");
            return true;
        } else {
            System.out.println("Car battery error");
            return false;
        }
    }

    private void startCommand() {
        System.out.println("\nPressing the START button");
    }

    private boolean startFuelSystem() {
        if (hasFuel) {
            System.out.println("Fuel system functioning");
            return true;
        } else {
            System.out.println("Fuel system error");
            return false;
        }
    }
}
