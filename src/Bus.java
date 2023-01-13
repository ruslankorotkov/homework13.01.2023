public class Bus extends Transport<DriverD> {


    public Bus(String brand, String model, double engineVolume, DriverD driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override

    public void startMoving() {
        System.out.println(" Автобус марки: " + getBrand() + " НАЧАЛ ДВИЖЕНИЕ ");
    }

    @Override
    public void stopMoving() {
        System.out.println(" Автобус марки: " + getBrand() + " ЗАКОНЧИЛ ДВИЖЕНИЕ ");
    }

    @Override
    public void pitStop() {
        System.out.println(" ПИТ-СТОП у автобуса " + getBrand());

    }

    @Override
    public void bestTimeCycle() {
        System.out.println("  ЛУЧШЕЕ ВРЕМЯ КРУГА у автобуса " + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println(" МАКСИМАЛЬНАЯ СКОРОСТЬ у автобуса " + getBrand());

    }

    @Override
    public String toString() {
        return " АВТОБУС " + super.toString();
    }

}
