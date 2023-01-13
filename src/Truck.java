public class Truck extends Transport<DriverC> {

    public Truck(String brand, String model, double engineVolume, DriverC driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println(" Грузовой  автомобиль марки: " + getBrand() + " НАЧАЛ ДВИЖЕНИЕ ");

    }

    @Override
    public void stopMoving() {
        System.out.println(" Грузовой автомобиль марки: " + getBrand() + " ЗАКОНЧИЛ ДВИЖЕНИЕ ");

    }


    @Override
    public void pitStop() {
        System.out.println(" ПИТ-СТОП у грузовика " + getBrand());

    }

    @Override
    public void bestTimeCycle() {
        System.out.println("  ЛУЧШЕЕ ВРЕМЯ КРУГА у грузовика " + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println(" МАКСИМАЛЬНАЯ СКОРОСТЬ у грузовика" + getBrand());

    }

    @Override
    public String toString() {
        return " ГРУЗОВИК ";
    }

}

