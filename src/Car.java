public class Car extends Transport<DriverB> {


    public Car(String brand, String model, double engineVolume, DriverB driver) {
        super(brand, model, engineVolume, driver);
    }

    @Override
    public void startMoving() {
        System.out.println(" Легковой автомобиль марки: " + getBrand() + " НАЧАЛ ДВИЖЕНИЕ ");

    }

    @Override
    public void stopMoving() {
        System.out.println(" Легковой автомобиль марки: " + getBrand() + " ЗАКОНЧИЛ ДВИЖЕНИЕ ");

    }


    @Override
    public void pitStop() {
        System.out.println(" ПИТ-СТОП у легковой машины " + getBrand());

    }

    @Override
    public void bestTimeCycle() {
        System.out.println("  ЛУЧШЕЕ ВРЕМЯ КРУГА у легковой машины " + getBrand());

    }

    @Override
    public void maxSpeed() {
        System.out.println(" МАКСИМАЛЬНАЯ СКОРОСТЬ у легковой машины " + getBrand());

    }

    @Override
    public String toString() {
        return " ЛЕГКОВОЙ АВТОМОБИЛЬ ";

    }
}




