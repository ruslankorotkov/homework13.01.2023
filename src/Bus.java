public class Bus extends Transport<DriverD> {
    public enum PassengerCapacity {
        EXTRA_SMALL("особо малая (до 10 мест)"),
        SMALL("малая (до 25)"),
        AVERAGE("средняя (40–50)"),
        BIG("большая (60–80)"),
        ESPECIALLY_LARGE("особо большая (100–120 мест)");

        private String places;

        PassengerCapacity(String places) {
            this.places = places;
        }


    }

    private String places;


    public String getPlaces() {
        return places;
    }

    public Bus(String brand, String model, double engineVolume, DriverD driver, String places) {
        super(brand, model, engineVolume, driver);
        if (places == null || places.isEmpty() || places.isBlank()) {
            this.places = " default ";
        } else {
            this.places = places;
        }
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
    public void printType() {
        System.out.println("Данных по транспортному средству недостаточно");
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
        return " АВТОБУС " + super.toString() +
                " вместимость " + places;
    }
}
