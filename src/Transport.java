public abstract class Transport<T extends Driver> implements Competing {
    private String brand;
    private String model;
    private double engineVolume;
    private T driver;

    public Transport(String brand, String model, double engineVolume, T driver) {
        if (brand == null || brand.isEmpty() || brand.isBlank()) {
            this.brand = "default";
        } else {
            this.brand = brand;
        }
        if (model == null || model.isEmpty() || model.isBlank()) {
            this.model = "default";
        } else {
            this.model = model;
        }
        if (engineVolume <= 0) {
            this.engineVolume = 1.5;
        } else {
            this.engineVolume = engineVolume;
        }
        setDriver(driver);
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public double getEngineVolume() {
        return engineVolume;
    }

    public void setEngineVolume(double engineVolume) {
        this.engineVolume = engineVolume;
    }

    public T getDriver() {
        return driver;
    }

    public void setDriver(T driver) {
        this.driver = driver;
    }


    public abstract void startMoving();

    public abstract void stopMoving();

    public abstract void printType();

    public void printInfo() {
        System.out.println(" водитель" + getDriver().getName() + " управляет автомобилем " + getBrand() + " и будет участвовать в заезде. ");
    }

    @Override
    public String toString() {
        return
                " марка: " + brand +
                        ", модель: " + model +
                        ", объём двигателя: " + engineVolume +
                        ", л.куб. ";

    }
}
